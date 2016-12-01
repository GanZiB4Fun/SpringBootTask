package com.ganzib.domian;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by GanZiB on 16/12/1.
 */
@Component
public class HostProperties {

    @Value("${com.ganzib.host}")
    private String host;

    @Value("${com.ganzib.title}")
    private String title;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
