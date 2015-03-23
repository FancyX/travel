package com.travel.websocket;

import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

public class SystemWebSocketHandler implements WebSocketHandler {

	private static final Logger logger = LoggerFactory
			.getLogger(SystemWebSocketHandler.class);

	private static final ArrayList<WebSocketSession> users = new ArrayList<WebSocketSession>();

	@Autowired
	private WebSocketService webSocketService;

	// onopen 消息
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		logger.debug("connect to the websocket success......");
		users.add(session);
		String userName = (String) session.getAttributes().get("li");
		if (userName != null) {
			// 查询未读消息
			int count = webSocketService.getUnReadNews((String) session
					.getAttributes().get("li"));

			session.sendMessage(new TextMessage(count + ""));
		}
	}

	// onmessage 消息
	public void handleMessage(WebSocketSession session,
			WebSocketMessage<?> message) throws Exception {

		// sendMessageToUsers();
	}

	// onerror 消息
	public void handleTransportError(WebSocketSession session,
			Throwable exception) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		logger.debug("websocket connection closed......");
		users.remove(session);
	}

	// onclose 消息
	public void afterConnectionClosed(WebSocketSession session,
			CloseStatus closeStatus) throws Exception {
		logger.debug("websocket connection closed......");
		users.remove(session);
	}

	public boolean supportsPartialMessages() {
		return false;
	}

	/**
	 * 给所有在线用户发送消息
	 * 
	 * @param message
	 */
	public void sendMessageToUsers(TextMessage message) {
		for (WebSocketSession user : users) {
			try {
				if (user.isOpen()) {
					user.sendMessage(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 给某个用户发送消息
	 * 
	 * @param userName
	 * @param message
	 */
	public void sendMessageToUser(String userName, TextMessage message) {
		for (WebSocketSession user : users) {
			if (user.getAttributes().get("li").equals(userName)) {
				try {
					if (user.isOpen()) {
						user.sendMessage(message);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
}