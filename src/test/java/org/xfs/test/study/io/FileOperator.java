package org.xfs.test.study.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileOperator {

	public static void main(String[] args) {
		copyFile("E:\\tools\\dev\\apache-activemq-5.15.3-bin.tar.gz");
	}
	
	public static void copyFile(String filePath) {
			File file=new File(filePath);
			System.out.println(file.getName());
			
			FileOutputStream writer=null;
			InputStream input=null;
			try {
				input=new FileInputStream(file);
				File out=new File("d:"+File.separator+file.getName());
				writer=new FileOutputStream(out);
				byte[]bytes=new byte[1024];
		        int len;        
		        while((len=input.read(bytes))>0) {
		        	writer.write(bytes, 0, len);
		        }
		        
				//writer.write(input.read(b));
			//	while((bytes=input.read(b)))
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(input!=null) {
					try {
						input.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(writer!=null) {
					try {
						writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}

}
