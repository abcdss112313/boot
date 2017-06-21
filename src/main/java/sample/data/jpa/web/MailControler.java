package sample.data.jpa.web;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sample.data.jpa.config.RestTemplateConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by windsorl on 2017/6/21.
 */

@RequestMapping("/callmail")
@RestController
@EnableAutoConfiguration
@Import(value = {RestTemplateConfig.class})
public class MailControler {
    @Value("${email.service}")
    private String mailservice;

    @Autowired
    private RestTemplate template;

    @RequestMapping("/approve")
    public String sendMail(HttpServletResponse rsp, HttpServletRequest request) {
        JSONObject postData = new JSONObject();
        postData.put("from", "forevermother@126.com");
        postData.put("password", "Liyangzhou115");
        postData.put("to", "forevermother@126.com");
        postData.put("password", "Liyangzhou115");
        postData.put("subject", "ceshi");
        postData.put("content", "just a test");
        JSONObject json = template.postForEntity(mailservice, postData, JSONObject.class).getBody();
        System.out.println(json.toJSONString());//调用返回信息
        return json.toJSONString();
        }
   }

