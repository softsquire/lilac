package com.snail.lilac.test.mq;

import java.net.URI;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.snail.lilac.core.util.DateUtils;
import com.snail.lilac.core.util.JSONUtils;
import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.security.UserInfo;

/**
 * @author Andy
 * @since 2016-01-02
 */
public class JmsTemplateTest extends AbstractMQTests {

    protected static final Logger log             = LoggerFactory.getLogger(JmsTemplateTest.class);

    public static final String    OPEN_WIRE_URI   = "tcp://localhost:61616";

    public static final String    TEST_QUEUE_NAME = "queue/test";

    @Test
    public void testJmsTemplateSend() {
        try {
            JmsTemplate jmsTemplate = new JmsTemplate();
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                                                                                new URI(
                                                                                        OPEN_WIRE_URI));
            jmsTemplate.setConnectionFactory(connectionFactory);

            jmsTemplate.send(TEST_QUEUE_NAME, new MessageCreator() {

                @Override
                public Message createMessage(Session paramSession) throws JMSException {
                    UserInfo userInfo = new UserInfo();
                    userInfo.setInstanceId("ADMIN");
                    userInfo.setCreatedTime(DateUtils.getCurrentDate());
                    String userInfoJson = JSONUtils.nonEmptyMapper().toJson(userInfo);
                    TextMessage textMessage = paramSession.createTextMessage(userInfoJson);

                    log.info("queueName:{},send msg:{}", TEST_QUEUE_NAME, textMessage.getText());

                    return textMessage;
                }
            });

        } catch (Exception e) {
            log.error("testJdbcTemplateJms", e);
        }
    }

    @Test
    public void testJmsTemplateReceive() {
        try {
            JmsTemplate jmsTemplate = new JmsTemplate();
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                                                                                new URI(
                                                                                        OPEN_WIRE_URI));
            jmsTemplate.setConnectionFactory(connectionFactory);

            TextMessage textMessage = (TextMessage) jmsTemplate.receive(TEST_QUEUE_NAME);
            String text = textMessage.getText();
            log.info("queueName:{},receive msg:{}", TEST_QUEUE_NAME, text);
        } catch (Exception e) {
            log.error("testJdbcTemplateJms", e);
        }
    }
}
