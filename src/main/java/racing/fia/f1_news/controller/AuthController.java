/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import racing.fia.f1_news.model.User;
import racing.fia.f1_news.model.service.UserService;

/**
 *
 * @author mottramkg
 */
@Controller
public class AuthController {
    @Autowired
    UserService service;
    
    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }
    
    @RequestMapping("checkLogin")
    public String checkLoginReturnPage(@RequestParam("username, password") String un, String pw, Model model){
        User user = new User();
        user.setUsername(un);
        user.setPassword(pw);
        User u = service.checkLogin(user);
        if(u == null){
            return "login";
        }else{
            model.addAttribute("fullname", u.getFullname());
            model.addAttribute("role", u.getRole());
            if(model.getAttribute("role") == "admin"){
                return "manage";
            }else{
                return "news";
            }
        }
    }
}
