package com.wordpress.omanandj.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created with IntelliJ IDEA.
 * User: ojha
 * Date: 09/08/13
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class NewAppEvent extends ApplicationEvent{


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public NewAppEvent(Object source) {
        super(source);
    }
}
