package simpleVertx.core

@FunctionalInterface
interface Handler<E> {

  fun handle(event: E)
}