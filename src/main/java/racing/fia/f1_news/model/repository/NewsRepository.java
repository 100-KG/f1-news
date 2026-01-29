/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.model.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import racing.fia.f1_news.model.News;

/**
 *
 * @author mottramkg
 */
@Repository
public class NewsRepository {
    @PersistenceContext
    EntityManager entityManager;
    
    public News insertNews(News news){
        return entityManager.merge(news);
    }
}
