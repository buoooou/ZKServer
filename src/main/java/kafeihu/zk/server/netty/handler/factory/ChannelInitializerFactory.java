package kafeihu.zk.server.netty.handler.factory;

public interface ChannelInitializerFactory {
    void addChannelHandlerFactory(ChannelHandlerFactory handlerFactory) throws Exception;
}
