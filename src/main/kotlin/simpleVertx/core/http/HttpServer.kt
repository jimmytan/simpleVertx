package simpleVertx.core.http

import simpleVertx.core.Handler

interface HttpServer {

  fun requestHandler(httpRequestHandler: Handler<HttpServerRequest>): HttpServer

  fun listen(port: Int): HttpServer
}