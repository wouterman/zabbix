package com.github.wouterman.zabbix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZabbixDemoAppApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ZabbixDemoAppApplication.class, args);
  }

  @Bean
  public ToggleableHealthIndicator serviceHealthIndicator() {
    return new ToggleableHealthIndicator();
  }

  @Bean
  public ToggleableHealthIndicator ldapHealthIndicator() {
    return new ToggleableHealthIndicator();
  }

}
