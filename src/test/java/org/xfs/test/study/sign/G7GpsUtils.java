package org.xfs.test.study.sign;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;



/**
 * 
 * @版权：SINOSERVICES 版权所有 (c) 2016
 * @author:Jacky
 * @version Revision 1.0.0
 * @email:Jacky.Chen@sinoservices.com
 * @see:
 * @创建日期：2016-5-17
 * @功能说明：G7接口调用相关工具类
 * @begin
 * @修改记录:
 * @修改后版本 修改人 修改内容
 * @2016-5-17 Jacky 创建
 * @end
 */

public class G7GpsUtils {
    private static Logger logger = Logger.getLogger(G7GpsUtils.class);

    // G7接口签名算法
    public static String g7UnionSign(String secret, String appKey, String method, String data) {
        StringBuffer sb = new StringBuffer();
        sb.append(secret);
        sb.append("app_key");
        sb.append(appKey);
        sb.append("data");
        sb.append(data);
        sb.append("method");
        sb.append(method);
        sb.append("timestamp");
        sb.append("2017-09-01 15:29:24");
        // sb.append(G7GpsUtils.getDateTime());
        sb.append(secret);
        // logger.info("\n-----------待加密数据:\n"+sb.toString());
        String md5 = G7GpsUtils.md5Encode(sb.toString());
        System.out.println("待加密数据:" + sb.toString());
        // 签名打印
        System.out.println("本次签名：" + md5);
        // end
        return md5;
    }

    // MD5加密32位算法
    public static String md5Encode(String inStr) {
        // inStr = "123";
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] byteArray = inStr.getBytes("UTF-8");
            byte[] md5Bytes = md5.digest(byteArray);
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
            return hexValue.toString().toUpperCase();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
    }


    // 获取当前时间 年月日时分秒
    public static String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    public static String decodeUnicode(String theString) {

        char aChar;

        int len = theString.length();

        StringBuffer outBuffer = new StringBuffer(len);

        for (int x = 0; x < len;) {

            aChar = theString.charAt(x++);

            if (aChar == '\\') {

                aChar = theString.charAt(x++);

                if (aChar == 'u') {

                    // Read the xxxx

                    int value = 0;

                    for (int i = 0; i < 4; i++) {

                        aChar = theString.charAt(x++);

                        switch (aChar) {

                            case '0':

                            case '1':

                            case '2':

                            case '3':

                            case '4':

                            case '5':

                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                        }

                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't')
                        aChar = '\t';
                    else if (aChar == 'r')
                        aChar = '\r';

                    else if (aChar == 'n')

                        aChar = '\n';

                    else if (aChar == 'f')

                        aChar = '\f';

                    outBuffer.append(aChar);

                }

            } else

                outBuffer.append(aChar);

        }

        return outBuffer.toString();

    }

    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
