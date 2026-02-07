/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
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

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/auth/checkLogin")
    public String checkLoginReturnPage(@RequestParam("username") String un, @RequestParam("password") String pw,
            HttpSession session, Model model) {

        User user = new User();
        user.setUsername(un);
        user.setPassword(pw);

        User authUser = service.checkLogin(user);

        if (authUser == null) {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        } else {
            session.setAttribute("loggedUser", authUser);
            return "redirect:/news";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        ;
        return "redirect:/login";
    }
}
