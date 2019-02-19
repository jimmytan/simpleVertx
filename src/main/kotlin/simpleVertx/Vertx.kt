package simpleVertx

import io.netty.channel.EventLoopGroup
import simpleVertx.core.context.Context
import simpleVertx.core.http.HttpServer

interface Vertx {
  fun createHttpServer(): HttpServer

}