package org.xfs.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.xfs.core.business.index.model.Person;

import com.alibaba.fastjson.JSON;

/**
 * http请求工具包
 * 
 * @project: web
 * @author:神风逐胜
 * @corporation:福建分享网络科技有限公司
 * @datetime:2016年2月17日
 */
public class HttpConnection {
    @SuppressWarnings("unused")
    private URL url;
    @SuppressWarnings("unused")
    private String charset;

    public HttpConnection(URL url) {
        this.url = url;
    }

    public HttpConnection(URL url, String charset) {
        this.url = url;
        this.charset = charset;
    }

    public static class A {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static void toJson() {
        // BdArea area=new BdArea();
        // area.setAreaCode("1");
        // area.setAreaName("测试");
        //
        // BdArea area2=new BdArea();
        // area2.setAreaCode("2");
        // area2.setAreaName("测试");
        // BdArea area3=new BdArea();
        // area3.setAreaCode("3");
        // area3.setAreaName("测试");
        // List<BdArea>list=new ArrayList<>();
        // list.add(area);
        // list.add(area2);
        //
        // list.add(area3);
        // Json json=new Json();
        // json.setSuccess(true);
        // json.setMsg("成功");
        // A a=new A();
        // a.setList(list);
        // a.setName("ccc");
        // json.setObj(a);
        // Grid grid=new Grid();
        // grid.setRows(list);
        // grid.setTotal(3L);
        // System.out.println(JSON.toJSON(grid));

    }

    public static void main(String[] args) throws Exception {
        new Thread(() -> System.out.println("Hello world !")).start();
        // String url = "http://139.196.87.12:9084/interfaces/logisticsn/platRouteInfo.shtml";
        String url = "http://192.168.0.193:8080/jlt-interfaces/interfaces/logisticsn/platRouteInfo.shtml";
        String method = "POST";
        Integer verification = 0;
        String contentType = "application/json;charset=UTF-8";
        String charset = "UTF-8";
        Person p = new Person();
        p.setName("阿三");
        p.setAddr("软二");
        p.setAge(30);
        p.setMobile("1112");
        String content = FileManager.readAsString("d:\\data.txt");

        List<PlatRouteInfoBO> list = JSON.parseArray(content, PlatRouteInfoBO.class);
        int splitSize = 10;
        if (list != null) {
            if (list.size() > 100) {
                for (int i = 0, size = list.size(); i < size; i += splitSize) {
                    if (i + splitSize < size) {
                        System.out.println(i + "to" + (i + splitSize));

                        send(JSON.toJSONString(list.subList(i, (i + splitSize))));

                    } else {
                        System.out.println(i + "to" + (size));

                        send(JSON.toJSONString(list.subList(i, size)));
                    }
                }
                // System.out.println("response:" + doSend(url, content, method, verification, contentType, charset));

            }
        }
        // String content = JSON.toJSONString(p);
        System.out.println("request:" + list.size());
        // System.out.println("response:" + doSend(url, content, method, verification, contentType, charset));
        // System.out.println("response:" + doJsonPost(url, content));
        // toJson();

    }

    public static void send(String content) {
        // String url = "http://139.196.87.12:9084/interfaces/logisticsn/platRouteInfo.shtml";
        String url = "http://192.168.0.193:8080/jlt-interfaces/interfaces/logisticsn/platRouteInfo.shtml";
        String method = "POST";
        Integer verification = 0;
        String contentType = "application/json;charset=UTF-8";
        String charset = "UTF-8";
        System.out.println("response:" + doSend(url, content, method, verification, contentType, charset));

    }

    @SuppressWarnings({})
    public static String doSend(String url, String content, String method, Integer verification, String contentType, String charset) {
        StringBuffer buf = new StringBuffer();
        HttpURLConnection conn = null;
        OutputStream out = null;
        BufferedReader in = null;
        try {
            // conn.setConnectTimeout(GlobalContant.HTTP_CONNECTTIMEOUT);
            // conn.setReadTimeout(GlobalContant.HTTP_READTIMEOUT);

            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(18000);

            byte[] b = content.getBytes("UTF-8");
            if (verification == 1) {// 需要校验
                String userName = "admin";
                String password = "admin";
                String input = userName + ":" + password; // 用户名以及登录密码
                if (input != null && input.trim().length() > 0) {
                    @SuppressWarnings("restriction")
                    String encoding = new sun.misc.BASE64Encoder().encode(input.getBytes());
                    conn.setRequestProperty("Authorization", "Basic   " + encoding); // 设置用户名，用户密码
                }

            } else if (verification == 2) {
                conn.setRequestProperty("X-Auth", "jiexiang@sh.com:123456");
            }
            conn.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");

            conn.setRequestProperty("Content-Type", contentType);
            conn.setRequestProperty("Content-Length", String.valueOf(b.length));
            conn.setRequestMethod(method);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            out = conn.getOutputStream();
            out.write(b);
            out.flush();
            out.close();

            InputStreamReader isr = null;
            if (charset != null) {
                isr = new InputStreamReader(conn.getInputStream(), charset);
                // System.out.println("response encoding is:"+isr.getEncoding());
            } else {
                isr = new InputStreamReader(conn.getInputStream(), "UTF-8");
            }
            in = new BufferedReader(isr);
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                buf.append(inputLine);
            }

        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }

        return buf.toString();
    }


    public static String httpRequest(String url, String content) {
        HttpURLConnection connection = null;
        PrintWriter out = null;
        StringBuffer buf = new StringBuffer();

        try {

            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            out = new PrintWriter(connection.getOutputStream());
            out.print(content);
            out.flush();
            out.close();
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = bufReader.readLine()) != null) {
                // System.out.println(line);
                buf.append(line);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
        return buf.toString();
    }

    // 发送JSON字符串 如果成功则返回成功标识。
    public static String doJsonPost(String urlPath, String Json) {
        // HttpClient 6.0被抛弃了
        String result = "";
        BufferedReader reader = null;
        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            // 设置文件类型:
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            // 设置接收类型否则返回415错误
            // conn.setRequestProperty("accept","*/*")此处为暴力方法设置接受所有类型，以此来防范返回415;
            conn.setRequestProperty("accept", "application/json");
            // 往服务器里面发送数据
            if (Json != null && !"".equals(Json)) {
                byte[] writebytes = Json.getBytes();
                // 设置文件长度
                conn.setRequestProperty("Content-Length", String.valueOf(writebytes.length));
                OutputStream outwritestream = conn.getOutputStream();
                outwritestream.write(Json.getBytes());
                outwritestream.flush();
                outwritestream.close();
                System.out.println("doJsonPost: conn" + conn.getResponseCode());
            }
            if (conn.getResponseCode() == 200) {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                result = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
