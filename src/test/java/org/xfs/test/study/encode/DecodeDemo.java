package org.xfs.test.study.encode;

import java.net.URLDecoder;

public class DecodeDemo {

    public static void main(String[] args) {
        String s = "%E6%B2%AADBE633,%E6%B2%AABMZ232";
        String result = URLDecoder.decode(s);
        System.out.println("result:" + result);


    }
}
