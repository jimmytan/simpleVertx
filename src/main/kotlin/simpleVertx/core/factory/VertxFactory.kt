package simpleVertx.core.factory

import simpleVertx.Vertx
import simpleVertx.core.context.Context

interface VertxFactory {
    fun vertx() : Vertx
    fun context(): Context

    
}
