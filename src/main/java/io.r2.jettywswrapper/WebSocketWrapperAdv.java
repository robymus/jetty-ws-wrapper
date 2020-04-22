package io.r2.jettywswrapper;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.*;
import org.eclipse.jetty.websocket.api.extensions.Frame;


/**
 * Advanced wrapper for websocket connections.
 * All events are wrapped, also text + binary messages.
 */
@WebSocket(maxMessageSize = 128*1024)
public class WebSocketWrapperAdv {

    private final WebSocketInterfaceAdv delegate;

    public WebSocketWrapperAdv(WebSocketInterfaceAdv delegate) {
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

    @OnWebSocketMessage
    public void onWebSocketMessage(Session session, byte[] buf, int offset, int length) {
        delegate.onWebSocketBinaryMessage(session, buf, offset, length);
    }

    @OnWebSocketClose
    public void onWebSocketClose(Session session, int statusCode, String reason) {
        delegate.onWebSocketClose(session, statusCode, reason);
    }

    @OnWebSocketError
    public void onWebSocketError(Session session, Throwable error) {
        delegate.onWebSocketError(session, error);
    }

    @OnWebSocketFrame
    public void onWebSocketFrame(Session session, Frame frame) {
        delegate.onWebSocketFrame(session, frame);
    }

}
