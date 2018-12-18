package simpleVertx

import simpleVertx.core.context.Context
import simpleVertx.core.http.HttpServer

interface Vertx {
  fun createHttpServer(): HttpServer

  fun getOrCreateContext(): Context
}