package com.github.wouterman.zabbix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toggle")
public class HealthIndicatorController {

  private final ToggleableHealthIndicator serviceHealthIndicator;
  private final ToggleableHealthIndicator ldapHealthIndicator;


  public HealthIndicatorController(
      ToggleableHealthIndicator serviceHealthIndicator,
      ToggleableHealthIndicator ldapHealthIndicator) {
    this.serviceHealthIndicator = serviceHealthIndicator;
    this.ldapHealthIndicator = ldapHealthIndicator;
  }

  @GetMapping("/service")
  public void toggleServiceHealth() {
    serviceHealthIndicator.toggleHealth();
  }

  @GetMapping("/ldap")
  public void toggleLdapHealth() {
    ldapHealthIndicator.toggleHealth();
  }
}
