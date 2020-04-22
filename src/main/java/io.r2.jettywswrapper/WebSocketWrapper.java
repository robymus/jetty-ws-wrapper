package io.r2.jettywswrapper;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.*;

/**
 * Basic wrapper for text based websocket connections.
 * Only connect, message and close events are wrapped.
 */
@WebSocket(maxMessageSize = 128*1024)
public class WebSocketWrapper {

    private final WebSocketInterface delegate;

    public WebSocketWrapper(WebSocketInterface delegate) {
        this.delegate = delegate;
    }

    @OnWebSocketConnect
    public void onWebSocketConnect(Session session) {
        delegate.onWebSocketConnect(session);
    }

    @OnWebSocketMessage
    public void onWebSocketMessage(Session session, String text) {
        delegate.onWebSocketMessage(session, text);
    }

    @OnWebSocketClose
    public void onWebSocketClose(Session session, int statusCode, String reason) {
        delegate.onWebSocketClose(session, statusCode, reason);
    }

}
