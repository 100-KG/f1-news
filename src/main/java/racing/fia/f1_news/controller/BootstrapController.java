/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mottramkg
 */
@Controller
public class BootstrapController {
    
    @RequestMapping(value = "/test")
    public String text(){
        return "bootstrap-ref";
    }
}
