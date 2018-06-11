package org.xfs.platform.net.netty.demo.server;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.UUID;

import org.xfs.platform.net.netty.demo.model.LoginMsg;

public class NettyObjectSocketClient {

	public static void main(String[] args) {
		LoginMsg msg=new LoginMsg();
		msg.setClientId(UUID.randomUUID().toString());
		msg.setUserName("刘金财");
		msg.setPassword("123456");
		objectSerializable(msg);
	}
	public void startClient() {
		
	}
	
	public static void objectSerializable(Object object) {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\object.txt"));
			out.writeObject(object);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
