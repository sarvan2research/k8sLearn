package com.sarvan.learn.k8s.to;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Appproperties construct
 */
@ConfigurationProperties(prefix="app")
@Getter
@Setter
public class AppProperties {
    private String version;
    private String title;
}
