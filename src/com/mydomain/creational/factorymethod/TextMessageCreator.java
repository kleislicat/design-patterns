package com.mydomain.creational.factorymethod;

import com.mydomain.creational.factorymethod.message.Message;
import com.mydomain.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
