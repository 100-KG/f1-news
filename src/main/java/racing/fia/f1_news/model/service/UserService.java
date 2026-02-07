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
    
    public User checkLogin(User user){
        logger.info("Service: Starting check login for username: {}", user.getUsername());
        User authUser = new User();
        try{
            Optional<User> opu = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            if(opu.isPresent()){
                authUser = opu.get();
                logger.info("Service: Welcom back: {}", authUser.getFullname());
                
            }
            else{
                logger.warn("Service: Invalid username or password!");
                return null;
            }
        }catch(Exception e){
            logger.info("Service: Fatal error in checking login: {}", e);
            throw e;
        }
        return authUser;
    }
}
