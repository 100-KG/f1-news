/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package racing.fia.f1_news.model.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import racing.fia.f1_news.model.News;
/**
 *
 * @author mottramkg
 */
public interface NewsRepository extends  JpaRepository<News, Integer> {
    
    List<News> findByTitleContainingIgnoreCase(String keyword);
}
