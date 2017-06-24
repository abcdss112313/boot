package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sample.data.jpa.domain.Synn_users;
import sample.data.jpa.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by windsorl on 2017/6/20.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/logincheck")
    public void checkLogin(Synn_users users, HttpServletResponse rsp,HttpServletRequest request) throws IOException {
        Synn_users user = loginService.findByname(users.getAccount(),users.getPasswd());
        if(user!=null){
             int id  = user.getUserid();

             rsp.sendRedirect("/apply/all/"+id);
        }
    }

}
