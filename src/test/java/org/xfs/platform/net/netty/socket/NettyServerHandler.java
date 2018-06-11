package org.xfs.platform.net.netty.socket;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xfs.platform.net.netty.socket.model.RequestInfoVO;

@ChannelHandler.Sharable
public class NettyServerHandler extends SimpleChannelInboundHandler<RequestInfoVO> {
    private static final Logger logger= LoggerFactory.getLogger(NettyServerHandler.class);

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, RequestInfoVO requestInfoVO) throws Exception {
        System.out.println("receive message:"+requestInfoVO);
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {

    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {

    }


    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {

    }
}
