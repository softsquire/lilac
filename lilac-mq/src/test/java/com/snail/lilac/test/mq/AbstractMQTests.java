package com.snail.lilac.test.mq;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring profile:test development production
 * 
 * @author Andy
 * @since 2016-01-02
 */
@ActiveProfiles("development")
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-mq.xml" })
public abstract class AbstractMQTests extends AbstractJUnit4SpringContextTests {

}
