package com.mydomain.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

  private Message msg;

  public HtmlEncodedMessage(Message msg) {
    this.msg = msg;
  }

  @Override
  public String getContent() {
    return StringEscapeUtils.escapeHtml4(msg.getContent());
  }


}
