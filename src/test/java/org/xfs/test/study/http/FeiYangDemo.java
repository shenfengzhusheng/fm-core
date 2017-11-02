package org.xfs.test.study.http;

import java.security.MessageDigest;

import org.xfs.core.util.FileManager;
import org.xfs.core.util.HttpConnection;

public class FeiYangDemo {
    private static String SEND_ORDER_URL = "http://weijie56.cn:50009/fyhdtest/ifs/orderFinancial_clientAddOrder_resultAction.action";
    private static String key = "8B38C71AD950C2B103798B4DC14738D5";

    public static void main(String[] args) throws Exception {
        // System.out.println(FileManager.toString("E:\\EDI\\feiyang\\order.txt", "GBK"));
        sendOrder();// 发送订单
        // String casContent = MD5Encoder(FileManager.readAsString("e:\\EDI\\feiyang\\order.txt") + key, "UTF-8");
        // System.out.println(casContent);
    }

    /**
     * 发送订单
     * 
     * @throws Exception
     */
    public static void sendOrder() throws Exception {
        StringBuilder content = new StringBuilder();
        String json = FileManager.toString("e:\\EDI\\feiyang\\order.txt", "GBK");

        content.append("param=").append(json).append("&").append("sign=").append(MD5Encoder(json + key, "UTF-8"));

        StringBuilder buf = new StringBuilder();
        String method = "POST";
        Integer verification = 0;
        String contentType = "application/x-www-form-urlencoded";
        String charset = "UTF-8";
        System.out.println("response:"
                + HttpConnection.doSend(SEND_ORDER_URL, content.toString(), method, verification, contentType, charset));

    }

    public static String MD5Encoder(String s, String charset) {
        try {
            byte[] btInput = s.getBytes(charset);
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < md.length; i++) {
                int val = ((int) md[i]) & 0xff;
                if (val < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(val));
            }
            return sb.toString().toUpperCase();
        } catch (Exception e) {
            return null;
        }
    }
}
