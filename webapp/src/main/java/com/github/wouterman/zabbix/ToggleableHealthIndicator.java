package com.github.wouterman.zabbix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * {@link HealthIndicator} that can be toggled by calling {@link #toggleHealth()}.
 */
@Slf4j
public class ToggleableHealthIndicator implements HealthIndicator {

  private boolean healthy;

  /**
   * Toggles the health of this {@link HealthIndicator}.
   */
  public void toggleHealth() {
    log.info("Toggling health to {}", !healthy );
    healthy = !healthy;
  }

  @Override
  public Health health() {
    Health.Builder status = Health.down();
    if(healthy) {
      status = Health.up();
    }
    return status.build();
  }

}
