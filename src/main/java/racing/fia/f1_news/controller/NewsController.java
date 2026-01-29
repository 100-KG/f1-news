/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import racing.fia.f1_news.model.News;
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
    public String showNewsPage(){
        return "news";
    }
    
//    @RequestMapping(value = "/processNewsForm")
//    public String processSearchNews(@RequestParam("searchInput") String newsTitle, Model model){
//        News news = service.getNewsByTitle(newsTitle);
//        model.addAttribute("title", news.getTitle().toUpperCase());
//        model.addAttribute("description", news.getDescription());
//        model.addAttribute("content", news.getContent());
//        model.addAttribute("dayCreated", news.getDayCreated());
//        model.addAttribute("author", news.getAuthor());
//        return "news-detail";
//    }
    @RequestMapping(value = "/searchNews")
    public String search(@RequestParam("1231") String hehe){
        return "hehe";
    }
}
