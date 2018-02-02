package kafeihu.zk.server.netty.handler.factory;

import io.netty.channel.ChannelHandler;

public interface ChannelHandlerFactory {

    ChannelHandler newHandler() throws Exception;
}
