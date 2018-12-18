package simpleVertx

import io.netty.channel.EventLoopGroup

interface VertxInternal : Vertx{
  fun getEventLoopGroup(): EventLoopGroup

  fun getAcceptorEventLoopGroup(): EventLoopGroup

}