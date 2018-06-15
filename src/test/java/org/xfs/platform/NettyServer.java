package org.xfs.platform;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class NettyServer {
    private static int port=55555;
    private static Map<String,Socket> clients=new HashMap<String,Socket>();

	public static void main(String[]args)throws Exception{
		//
		//startServer();
	}
	public static void startServer()throws Exception{
		//ServerSocket server=new ServerSocket(port);
        System.out.print("Hello Netty\r\n");  
       // NettyCommandServer commandServer =new NettyCommandServer();
	}
}
