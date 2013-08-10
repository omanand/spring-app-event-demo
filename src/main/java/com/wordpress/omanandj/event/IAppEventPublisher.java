package com.wordpress.omanandj.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created with IntelliJ IDEA.
 * User: ojha
 * Date: 10/08/13
 * Time: 8:44 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IAppEventPublisher {
    public void publish(ApplicationEvent event);
}
