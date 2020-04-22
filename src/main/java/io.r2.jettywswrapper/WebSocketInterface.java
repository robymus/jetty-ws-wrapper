package io.r2.jettywswrapper;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.extensions.Frame;

/**
 * Interface to be wrapped in WebSocketWrapper.
 * All annotated methods are routed to these methods.
 */
public interface WebSocketInterface {

    void onWebSocketConnect(Session session);

    void onWebSocketMessage(Session session, String text);

    void onWebSocketClose(Session session, int statusCode, String reason);

}
