package com.ganzib.domian;

import com.ganzib.ExpApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by GanZiB on 16/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ExpApplication.class)
@WebAppConfiguration
public class HostPropertiesTest {

    @Autowired
    private HostProperties hostProperties;

    @Test
    public void getHello() throws Exception{
        Assert.assertEquals(hostProperties.getHost(), "GanZiB");
        Assert.assertEquals(hostProperties.getTitle(), "Spring Boot");
    }

}