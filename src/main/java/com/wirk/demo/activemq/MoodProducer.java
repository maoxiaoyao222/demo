package com.wirk.demo.activemq;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

@Service
public class MoodProducer {

  @Resource private JmsMessagingTemplate jmsMessagingTemplate;

  public void sendMessage(Destination destination, String message) {
    jmsMessagingTemplate.convertAndSend(destination, message);
  }
}
