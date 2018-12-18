package simpleVertx.core.context

import io.netty.channel.EventLoop
import io.netty.channel.EventLoopGroup

interface ContextInternal : Context {

  fun getNettyEventLoop(): EventLoop
}