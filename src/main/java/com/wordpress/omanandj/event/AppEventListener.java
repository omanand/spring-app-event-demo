package com.wordpress.omanandj.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.Log4jLoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ojha
 * Date: 09/08/13
 * Time: 10:48 PM
 */
@Component
public class AppEventListener implements ApplicationListener<NewAppEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(AppEventListener.class);

    @Override
    public void onApplicationEvent(NewAppEvent event) {
        LOG.info("Event Occured {} " , event);
    }
}
