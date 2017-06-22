package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import sample.data.jpa.SampleWebJspApplication;

import sample.data.jpa.domain.Synn_users;
import sample.data.jpa.domain.Synnapply;
import sample.data.jpa.service.LoginService;
import sample.data.jpa.service.SynnapplyService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by windsorl on 2017/6/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleWebJspApplication.class)
@ActiveProfiles("test")
@WebAppConfiguration
public class ServiceApplicationTests {
    @Autowired
    private LoginService loginService;
    @Autowired
    private SynnapplyService synnapplyService;


    @Test
    public void checkcheckLogin(){
        loginService.findByname("hello","kkk");
    }


    @Test
    public void checkinsert() {
        Synnapply synn_apply_new = new Synnapply();
        synn_apply_new.setApply_type(1);
        synn_apply_new.setApplydate(new Date());
        synn_apply_new.setApprove_user_id(1);
       synnapplyService.save(synn_apply_new);
    }

    @Test
    public void query(){
        List<Synnapply> list  = synnapplyService.findByUserid(1);
    }
    @Test
    public void delete(){
        int i  = synnapplyService.deleteByApplyid(2);
    }
    @Test
    public void saveuser(){
        Synn_users user = new Synn_users();
        user.setAccount("forevermoether");
        user.setEmails("forevermoether@126.com");
        user.setPasswd("Liyangzhou115");
        user.setRoleid(1);
        user.setUsername("test");
        loginService.save(user);

    }

    @Test
    public void testupdate(){
        Synnapply synn_apply_new = new Synnapply();
        synn_apply_new.setApplyid(3);
        synn_apply_new.setApply_type(2);
        synn_apply_new.setApplydate(new Date());
        synn_apply_new.setApprove_user_id(2);
        synnapplyService.saveOrUpdate(synn_apply_new);
    }
}
