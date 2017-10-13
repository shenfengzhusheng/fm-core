package org.xfs.core.util.encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MD5Util {
    private static final String slat = "@123feng8876...^&00935===3===*==$";
    private static final Logger logger = LoggerFactory.getLogger(MD5Util.class);

    public static void main(String[] args) {
        String s = "4435967777777777777777778";
        String encodeContent = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(encodeContent);// [B@15db9742
        System.out.println("decode:" + decode(s));
        System.out.println("encode:" + encode(decode(s)));

        System.out.println(new String(Base64.getDecoder().decode(encodeContent.getBytes())));


        System.out.println(md5(s));
        // c4ca4238a0b923820dcc509a6f75849b
        // 8e07ed8cd9429fb607281e2fc1554f11
    }

    /**
     * md5加密
     * 
     * @param str
     * @return
     */
    public static String md5(String str) {
        try {
            String content = str + slat;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(content.getBytes());
            byte[] byteDigest = md.digest();
            int i;
            StringBuilder buf = new StringBuilder();
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            // 32位加密
            return buf.toString();
            // 16位的加密
            // return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            logger.error("密码加密失败：{}", e);
            return null;
        }
    }


    /**
     * 编码
     * 
     * @param bstr
     * @return String
     */
    public static String decode(String key) {
        return Base64.getEncoder().encodeToString(key.getBytes());
    }


    /**
     * 编码
     * 
     * @param bstr
     * @return String
     */
    public static String encode(String key) {
        return new String(Base64.getDecoder().decode(key));
    }

}
