package org.xfs.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.xfs.core.business.index.model.Person;



public class HttpRequestUtil {
    // private String url;
    // private String charset;
    //
    private static int CONNECTTIMEOUT = 6 * 1000;
    private static int READTIMEOUT = 3 * 1000;

    public static String doSend(String url, Object obj, String token) {
        return doSend(url, obj, token, "UTF-8");
    }

    public static String doSend(String url, Object obj, String token, String charset) {
        return doSend(url, obj, "POST", token, charset);
    }

    public static String doSend(String url, Object obj, String method, String token, String charset) {
        return doSend(url, obj, method, "application/json;charset=UTF-8", token, charset);
    }

    public static String doSend(String url, Object obj, String method, String contentType, String token, String charset) {
        return doSend(url, obj, method, 0, contentType, token, charset);
    }

    @SuppressWarnings("unchecked")
    public static String doSend(String url, Object obj, String method, Integer verification, String contentType, String token,
            String charset) {
        StringBuffer buf = new StringBuffer();
        HttpURLConnection conn = null;
        OutputStream out = null;
        BufferedReader in = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setConnectTimeout(CONNECTTIMEOUT);
            conn.setReadTimeout(READTIMEOUT);
            conn.setRequestMethod(method);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            if (verification == 1) {// 需要校验
                String userName = "user";
                String password = "password";
                String input = userName + ":" + password; // 用户名以及登录密码
                if (input != null && input.trim().length() > 0) {
                    String encoding = new sun.misc.BASE64Encoder().encode(input.getBytes());
                    conn.setRequestProperty("Authorization", "Basic   " + encoding); // 设置用户名，用户密码
                    conn.setRequestProperty("Content-Type", contentType);
                }
            }

            conn.setRequestProperty("Content-Type", contentType);

            // oss token校验
            if (token != null) {
                conn.setRequestProperty("Authorization", token);
            }
            if (obj != null) {
                Map<String, Object> requestParam = null;
                if (obj instanceof Map) {
                    requestParam = (Map<String, Object>) obj;
                } else {
                    requestParam = BeanUtils.objectToMap(obj);

                }
                String content = prepareParam(requestParam, charset);
                // System.out.println("content:"+content);
                out = conn.getOutputStream();
                out.write(content.getBytes(charset));
                out.close();
            }

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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return buf.toString();
    }


    @SuppressWarnings("unchecked")
    public static String doSend(String url, String content, String method, Integer verification, String contentType, String charset) {
        StringBuffer buf = new StringBuffer();
        HttpURLConnection conn = null;
        OutputStream out = null;
        BufferedReader in = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setConnectTimeout(CONNECTTIMEOUT);
            conn.setReadTimeout(READTIMEOUT);
            conn.setRequestMethod(method);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            if (verification == 1) {// 需要校验
                String userName = "user";
                String password = "password";
                String input = userName + ":" + password; // 用户名以及登录密码
                if (input != null && input.trim().length() > 0) {
                    String encoding = new sun.misc.BASE64Encoder().encode(input.getBytes());
                    conn.setRequestProperty("Authorization", "Basic   " + encoding); // 设置用户名，用户密码
                }
            }
            if (contentType != null && !"".equals(contentType)) {
                conn.setRequestProperty("Content-Type", contentType);
            } else {
                conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");

            }
            // System.out.println("content:"+content);
            out = conn.getOutputStream();
            out.write(content.getBytes(charset));
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return buf.toString();
    }



    public static String doSend(String url, Map<String, Object> obj, String token) {
        return doSend(url, obj, token, "UTF-8");
    }

    public static String doSend(String url, Map<String, Object> obj, String token, String charset) {
        return doSend(url, obj, "POST", token, charset);
    }

    public static String doSend(String url, Map<String, Object> obj, String method, String token, String charset) {
        return doSend(url, obj, method, "html/text", token, charset);
    }

    public static String doSend(String url, Map<String, Object> obj, String method, String contentType, String token, String charset) {
        return doSend(url, obj, method, 0, contentType, token, charset);
    }

    public static String doSend(String url, Map<String, Object> requestParam, String method, Integer verification, String contentType,
            String token, String charset) {
        StringBuffer buf = new StringBuffer();
        HttpURLConnection conn = null;
        OutputStream out = null;
        BufferedReader in = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setConnectTimeout(CONNECTTIMEOUT);
            conn.setReadTimeout(READTIMEOUT);
            conn.setRequestMethod(method);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            if (verification == 1) {// 需要校验
                String userName = "user";
                String password = "password";
                String input = userName + ":" + password; // 用户名以及登录密码
                if (input != null && input.trim().length() > 0) {
                    String encoding = new sun.misc.BASE64Encoder().encode(input.getBytes());
                    conn.setRequestProperty("Authorization", "Basic   " + encoding); // 设置用户名，用户密码
                    conn.setRequestProperty("Content-Type", contentType);
                }
            }
            // oss token校验
            if (token != null) {
                conn.setRequestProperty("Authorization", token);
            }
            if (requestParam != null && !requestParam.isEmpty()) {
                String content = prepareParam(requestParam, charset);
                // System.out.println(content);
                out = conn.getOutputStream();
                out.write(content.getBytes(charset));
                out.close();
            }

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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return buf.toString();
    }

    /**
     * 组装请求内容
     * 
     * @param param
     * @param chareset
     * @return
     */
    public static String prepareParam(Map<String, Object> param, String chareset) {
        StringBuffer buf = new StringBuffer("");
        if (!param.isEmpty()) {
            for (String key : param.keySet()) {
                String value = param.get(key) != null ? param.get(key).toString() : "";
                try {
                    if (buf.length() > 0) {
                        buf.append("&");
                    }
                    buf.append(key).append("=").append(URLEncoder.encode(value, chareset));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer("");
        Person p = new Person();
        p.setName("阿三");
        p.setAddr("软二");
        p.setAge(30);
        System.out.println(doSend("http://127.0.0.1:8083/api", p, null));
        System.out.println(buf.length());
    }
}
