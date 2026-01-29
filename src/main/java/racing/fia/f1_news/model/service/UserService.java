/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.model.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import racing.fia.f1_news.model.User;
import racing.fia.f1_news.model.repository.UserRepository;

/**
 *
 * @author motramkg
 */
@Service
@Transactional
public class UserService {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    UserRepository repo;
    
    public boolean checkLogin(User user){
        logger.info("Starting check login for username: {}", user.getUsername());
        try{
            Optional<User> opu = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            if(opu.isPresent()){
                User loggedUser = opu.get();
                logger.info("Welcom back: {}", loggedUser.getFullname());
            }
            else{
                logger.warn("Invalid username or password!");
            }
        }catch(Exception e){
            logger.info("Fatal error in checking login: {}", e);
            throw e;
        }
        return true;
    }
}
