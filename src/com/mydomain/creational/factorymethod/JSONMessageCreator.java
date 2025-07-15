package com.mydomain.creational.factorymethod;

import com.mydomain.creational.factorymethod.message.JSONMessage;
import com.mydomain.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
