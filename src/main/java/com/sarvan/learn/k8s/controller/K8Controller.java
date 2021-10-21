package com.sarvan.learn.k8s.controller;

import com.sarvan.learn.k8s.to.AppInfo;
import com.sarvan.learn.k8s.to.AppProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Map;


/**
 * Endpoint to get status of application host name
 *
 * @author saravanakumarR
 */
@RestController
@Slf4j
public class K8Controller {

    private AppProperties appProperties;

    /**
     * @return
     */
    @GetMapping({"", "/api/info"})
    public AppInfo apiInfo() {
        log.info("Request for apiInfo at : {}", LocalDateTime.now());
        return new AppInfo(appProperties.getVersion(),appProperties.getTitle(),getHostname());
    }

    /**
     * @return
     */
    @GetMapping("/api/terminate")
    public String terminate()
    {
        log.info("Request for terminate at : {}", LocalDateTime.now());
        System.exit(1); //give the developer a medal for writing this line in a web app
        return "I'll be BACK";
    }

    /**
     * @return
     */
    private String getHostname() {
        String hostName = "Unknown";
        try {
            InetAddress inet = InetAddress.getLocalHost();
            hostName = inet.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }
}
