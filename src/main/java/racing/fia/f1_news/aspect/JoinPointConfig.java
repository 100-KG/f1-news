/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author motramkg
 */
public class JoinPointConfig {
    
    @Pointcut("execution")
    public void loginPointcut(){}
}
