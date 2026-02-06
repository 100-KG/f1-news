/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import racing.fia.f1_news.model.News;
import racing.fia.f1_news.model.User;
import racing.fia.f1_news.model.service.NewsService;

/**
 *
 * @author mottramkg
 */
@Controller
public class NewsController {
    
    @Autowired
    NewsService service;
    
    @RequestMapping(value = "/news")
    public String showNewsPage(HttpSession session, Model model){
        User user = (User) session.getAttribute("loggedUser");

        model.addAttribute("fullname", user.getFullname());
        model.addAttribute("role", user.getRole());

        return "news";
    }
    
    @RequestMapping(value = "/news/search")
    public String search(@RequestParam("1231") String hehe){
        return "hehe";
    }
    
    @RequestMapping(value = "/news/add")
    public String add(@ModelAttribute("news") News news){
        service.insertNews(news);
        return "news";
    }
}
