package com.mm.websocket.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler{
	
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("Connection Established!");
	}
	
	public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("Received message: " + message.getPayload());
		session.sendMessage(new TextMessage("Hello from server"));
	}
	
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("Connection closed!");
    }
}