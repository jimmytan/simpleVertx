package simpleVertx.core

import io.netty.channel.EventLoopGroup
import io.netty.channel.nio.NioEventLoopGroup
import simpleVertx.VertxInternal
import simpleVertx.core.context.Context
import simpleVertx.core.http.HttpServer

class VertxImpl : VertxInternal {
  override val acceptorEventLoopGroup: EventLoopGroup
    get() {
      val eventLoopGroup = NioEventLoopGroup(1)
      eventLoopGroup.setIoRatio(100)
      return eventLoopGroup
    }
  override val eventLoopGroup: EventLoopGroup
    get() {
      val eventLoopGroup = NioEventLoopGroup(20)
      eventLoopGroup.setIoRatio(50)
      return eventLoopGroup
    }

  override fun createHttpServer(): HttpServer {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getOrCreateContext(): Context {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }


}

