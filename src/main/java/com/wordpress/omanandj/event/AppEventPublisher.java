package com.wordpress.omanandj.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ojha
 * Date: 10/08/13
 * Time: 8:33 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AppEventPublisher implements ApplicationEventPublisherAware, IAppEventPublisher {

    private ApplicationEventPublisher publisher;

    private static final Logger LOG = LoggerFactory.getLogger(AppEventPublisher.class);

    @Override
    @Autowired
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher =applicationEventPublisher;
    }

    public void publish(ApplicationEvent event) {
        LOG.info("publishing event {}", event);
        publisher.publishEvent(event);
    }
}
