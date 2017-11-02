package org.xfs.test.study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.util.StopWatch;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class TestDemo {

    public static void main(String[] args) throws Exception {
        StopWatch sw = new StopWatch();
        sw.start("耗时测试");
        System.out.println(Test.doSomething());
        sw.stop();
        sw.start("休眠");
        Thread.sleep(3000);
        sw.stop();

        System.out.println(sw.prettyPrint());
    }

    public static void doSome() {
        String now = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        System.out.println("today is :" + now.substring(0, 8));
        // TODO Auto-generated method stub
        // String str = "{\"status\":\"Success\",\"message\":\"SH15YDD20170705000793\",\"data\":\"\"}";
        String str =
                "[{\"gpsTime\":\"2017-07-06 09:45:12\",\"hum\":\"\",\"interfaceType\":\"JY\",\"lat\":\"31.08455\",\"lon\":\"121.504133\",\"placename\":\"上海市闵行区浦江镇浦星公路\",\"point\":\"\",\"speed\":\"0\",\"status\":0,\"temp1\":\"-19.5\",\"temp2\":\"12.5\",\"temp3\":\"\",\"temp4\":\"\",\"vehicleId\":\"11601\",\"vehicleNo\":\"沪D82375\"}]";
        //
        if (str.startsWith("[{")) {
            JSONArray arry = JSONObject.parseArray(str);
            System.out.println(arry);

        } else {
            JSONObject json = JSONObject.parseObject(str);
            System.out.println(json);
        }

        // String status = json.getString("status");
        // if (status != null && "Error".equals(status)) {
        // System.out.println("失败！");
        // } else if (status != null && "Sucess".equals(status)) {
        // System.out.println("成功！");
        // } else {
        // System.out.println("失败！");
        //
        // }
    }

    static class Test {
        public static String doSomething() {
            try {
                Thread.sleep(3000);
                return "yes:" + UUID.randomUUID().toString();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return "no:" + UUID.randomUUID().toString();

        }
    }
}
