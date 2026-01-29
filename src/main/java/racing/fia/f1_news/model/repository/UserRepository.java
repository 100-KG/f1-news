/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package racing.fia.f1_news.model.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import racing.fia.f1_news.model.User;

/**
 *
 * @author motramkg
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    
    // Spring generates: SELECT * FROM users WHERE username = ? AND password = ?
    Optional<User>findByUsernameAndPassword (String username, String password);
}
