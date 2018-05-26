package org.xfs.test.study.io.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MapAndPropertiesDemo {

	public static void main(String[] args) {
		Map<String,String>map=System.getenv();
		for(String key:map.keySet()) {
			System.out.printf("key is[%s], value is:[%s]",key,map.get(key));
			System.out.println("");
		}
		//System.out.println();
	}
	
	public static void properties2Map() {
//		InputStream inputStream=MapAndPropertiesDemo.class.getResourceAsStream("/config/properties/dev/shiro.properties");
//		System.out.println("input"+inputStream);
//
//		Properties prop=new Properties();
//		try {
//			prop.load(inputStream);
//			Set set=prop.entrySet();
//			for(Object entry:set) {
//				Map.Entry<String,String> map=(Map.Entry<String,String>)entry;
//	            System.out.printf("%s = %s%n", map.getKey(), map.getValue());
//
//				//System.out.println();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
