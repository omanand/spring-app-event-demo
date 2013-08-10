package com.wordpress.omanandj.config;

import com.wordpress.omanandj.event.AppEventListener;
import com.wordpress.omanandj.event.AppEventPublisher;
import com.wordpress.omanandj.event.IAppEventPublisher;
import com.wordpress.omanandj.event.NewAppEvent;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ojha
 * Date: 29/07/13
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan("com.wordpress.omanandj")
public class AppConfiguration {

}
