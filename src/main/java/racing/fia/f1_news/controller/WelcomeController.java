package racing.fia.f1_news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mottramkg
 */
@Controller
public class WelcomeController {
    
    @GetMapping(value = "/")
    public String welcome(){
        return "welcome";
    }
}
