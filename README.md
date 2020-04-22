# jetty-ws-interface-wrapper

Simple hack to use jetty websocket client from jython.

As the jetty websocket client uses an annotated POJO as the message handler, it is not easy to use it from jython, creating annotations is very clumsy on jython classes.

It uses jetty-websocket-api 9.0.3 for compatibility with legacy codebase.

All classes and interfaces are in `io.r2.jettywswrapper` package.

## Basic usage

The `WebSocketWrapper` class wraps a `WebSocketInterface` into an annotated class.

It supports only text messages and 

That's it, this is a just patch for a legacy jython code, so it's not nice.

## Advanced usage

Just in case, maybe needed in the future, the `WebSocketWrapperAdv` class wraps a `WebSocketInterfaceAdv`, exposing all events and binary messages as well.