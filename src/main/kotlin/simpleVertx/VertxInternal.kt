package simpleVertx

import io.netty.channel.EventLoopGroup
import simpleVertx.core.context.Context

interface VertxInternal : Vertx{
  val eventLoopGroup: EventLoopGroup

  val acceptorEventLoopGroup: EventLoopGroup

  fun getOrCreateContext(): Context

}