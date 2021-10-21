package com.sarvan.learn.k8s.to;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * About App infomation
 */
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@JsonPropertyOrder({"version","app","hostName"})
public class AppInfo {

    private String version;
    private String app;
    private String hostName;
}
