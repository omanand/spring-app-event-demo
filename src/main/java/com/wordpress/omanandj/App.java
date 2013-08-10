package com.wordpress.omanandj;

import com.wordpress.omanandj.config.AppConfiguration;
import com.wordpress.omanandj.event.IAppEventPublisher;
import com.wordpress.omanandj.event.NewAppEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * App Event Demo
 *
 */
public class App
{
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        IAppEventPublisher eventPublisher = context.getBean(IAppEventPublisher.class);

        LOG.info("Hello World for App Event using Spring");
        for(int i = 0; i < 100; ++i) {
        eventPublisher.publish(new NewAppEvent("Publishing a new App" + i));
        }
    }
}
