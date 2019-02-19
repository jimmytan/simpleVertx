package simpleVertx.core.http

import simpleVertx.VertxInternal
import simpleVertx.core.Handler

class HttpServerImpl(vertxInternal: VertxInternal) : HttpServer {
  var requestHandler: Handler<HttpServerRequest>? = null
  override fun requestHandler(httpRequestHandler: Handler<HttpServerRequest>): HttpServer {
    requestHandler = httpRequestHandler
    return this
  }

  override fun listen(port: Int): HttpServer {

    return this
  }
}