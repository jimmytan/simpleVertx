package simpleVertx.core

import io.netty.channel.EventLoopGroup
import simpleVertx.VertxInternal
import simpleVertx.core.context.Context
import simpleVertx.core.http.HttpServer

class VertxImpl : VertxInternal {
  override fun getAcceptorEventLoopGroup(): EventLoopGroup {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun createHttpServer(): HttpServer {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getOrCreateContext(): Context {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getEventLoopGroup(): EventLoopGroup {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}

