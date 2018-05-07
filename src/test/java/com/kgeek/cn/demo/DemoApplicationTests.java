package com.kgeek.cn.demo;

import com.kgeek.cn.demo.Entity.AppEntity;
import com.kgeek.cn.demo.Repository.AppRepository;
import com.kgeek.cn.demo.config.ConfigCompoment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private ConfigCompoment configCompoment;
    @Autowired
    private AppRepository appRepository;


    @Test
    public void contextLoads() {
        List<AppEntity> apps = appRepository.findAllByAppName("aaaa");
        System.out.println(apps.get(0).getAppName());
    }

}
