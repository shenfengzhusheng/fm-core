package org.xfs.platform.net.netty.socket.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.xfs.platform.net.netty.socket.MessageDecoder;
import org.xfs.platform.net.netty.socket.MessageEncoder;
import org.xfs.platform.net.netty.socket.model.RequestInfoVO;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class NettyClientBootstrap {
    private int port;
    private String host;
    private SocketChannel socketChannel;

    public static void main(String[]args)throws Exception{
       new  NettyClientBootstrap(10000,"127.0.0.1");
    }
    public NettyClientBootstrap(int port, String host) throws Exception {
        this.host = host;
        this.port = port;
        start();
    }
    private void start() throws Exception {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
        bootstrap.option(ChannelOption.TCP_NODELAY, true);
        bootstrap.group(eventLoopGroup);
        bootstrap.remoteAddress(this.host, this.port);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new MessageDecoder(), new MessageEncoder(), new NettyClientHandler());
            }
        });
        ChannelFuture future = bootstrap.connect(this.host, this.port).sync();
        if (future.isSuccess()) {
            System.out.println("connect server  success|");
            while(true){
                socketChannel = (SocketChannel) future.channel();
                RequestInfoVO request=new RequestInfoVO();
                request.setBody("测试数据"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                request.setVersion(new Byte("88"));
                request.setType(new Byte("5"));
                request.setRequestId(UUID.randomUUID().toString().replaceAll("-", ""));
                request.setClientId(new Random().nextInt(80000));
                request.setSequence(4156);
                socketChannel.writeAndFlush(request);
                TimeUnit.SECONDS.sleep(new Random().nextInt(5));
            }
        }
    }
    public int getPort() {
        return this.port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    public SocketChannel getSocketChannel() {
        return socketChannel;
    }
    public void setSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
}