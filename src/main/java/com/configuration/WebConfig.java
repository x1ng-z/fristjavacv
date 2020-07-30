package com.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/26 16:00
 */
@Configurable
@ComponentScan(basePackages ="com.controller")
public class WebConfig {
}
