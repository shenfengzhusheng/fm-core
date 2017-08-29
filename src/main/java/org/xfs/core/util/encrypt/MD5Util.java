package org.xfs.core.util.encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.util.Base64Utils;
import org.xfs.core.util.string.StringUtil;

import sun.misc.BASE64Decoder;

@SuppressWarnings("restriction")
public class MD5Util {
    private static final String slat = "@123feng8876...^&00935";

    public static void main(String[] args) {
        String s = "443596";
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
            StringBuffer buf = new StringBuffer("");
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
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 编码
     * 
     * @param bstr
     * @return String
     */
    public static String encode(byte[] bstr) {

        return new sun.misc.BASE64Encoder().encode(bstr);
    }


    public static String decode(String s) {
        if (StringUtil.isEmpty(s))
            return "";
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = Base64Utils.decodeFromString(s);
            return new String(b);
        } catch (Exception e) {
            return "";
        }
    }
}
