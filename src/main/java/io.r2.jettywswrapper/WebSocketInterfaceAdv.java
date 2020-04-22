package io.r2.jettywswrapper;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.extensions.Frame;

/**
 * Interface to be wrapped in WebSocketWrapperAdv.
 * All annotated methods are routed to these methods.
 */
public interface WebSocketInterfaceAdv {

    void onWebSocketConnect(Session session);

    void onWebSocketMessage(Session session, String text);

    void onWebSocketBinaryMessage(Session session, byte buf[], int offset, int length);

    void onWebSocketClose(Session session, int statusCode, String reason);

    void onWebSocketError(Session session, Throwable error);

    void onWebSocketFrame(Session session, Frame frame);

}
