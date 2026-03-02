/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.service;

import java.util.Optional;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import racing.fia.f1_news.model.User;
import racing.fia.f1_news.repository.UserRepository;

/**
 *
 * @author motramkg
 */
@Service
@Transactional
public class UserService implements UserDetailsService{
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    UserRepository repo;
    
    @Autowired
    AuthenticationManager authManager;

    // public User checkLogin(User user){
    //     logger.info("Service: Starting check login for username: {}", user.getUsername());
    //     User authUser = new User();
    //     try{
    //         Optional<User> opu = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    //         if(opu.isPresent()){
    //             authUser = opu.get();
    //             logger.info("Service: Welcom back: {}", authUser.getFullname());
                
    //         }
    //         else{
    //             logger.warn("Service: Invalid username or password!");
    //             return null;
    //         }
    //     }catch(Exception e){
    //         logger.info("Service: Fatal error in checking login: {}", e);
    //         throw e;
    //     }
    //     return authUser;
    // }

    public String checkLogin(User user){
        Authentication authentication = authManager
            .authenticate(UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        
        if(authentication.isAuthenticated()){
            logger.info("Service: Welcome back: {}", user.getFullname());
            return "news";
        }
        logger.info("Service: login failed with user: {}", user.getFullname ());
        
    }

    public User register(User user){
        return repo.save(user);
        
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = repo.findByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("User not found with username:" + username);
        }

        return org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
        .password(user.getPassword())
        .roles(user.getRole())
        .build();
    }

    
}
