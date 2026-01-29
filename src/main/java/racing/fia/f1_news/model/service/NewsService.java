/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.model.service;

import racing.fia.f1_news.model.News;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import racing.fia.f1_news.model.repository.NewsRepository;

/**
 *
 * @author mottramkg
 */
@Service
@Transactional
public class NewsService {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    NewsRepository newsrepo;
    
    public void insertNews(News news){
        logger.info("Starting to insert news to database: {}", news.getTitle());
        try{
            newsrepo.save(news);
            logger.info("News  successfully with id: {}", news.getId());
        }catch(Exception e){
            logger.error("Fatal error in inserting news to database: ", e);
            throw e;
        }
    }
    
    public void removeNews(News news){
        logger.info("Starting to remove news from database: {}", news.getTitle());
        try{
            newsrepo.delete(news);
            logger.info("News removed successful");
        }catch(Exception e){
            logger.error("Fatal error in removing news: {}", news.getTitle());
        }
    }
    
    public void updateNews(News news){
        logger.info("Starting to update news to database: {}", news.getTitle());
        try{
            newsrepo.save(news);
            logger.info("News updated successfully with id: {}", news.getId());
        }catch(Exception e){
            logger.error("Fatal error in inserting news to database: ", e);
            throw e;
        }
    }
    
    public List<News> searchNewsByTitle(String keyword){
        if(keyword == null || keyword.trim().isEmpty()){
            return newsrepo.findAll();
        }
        return newsrepo.findByTitleContainingIgnoreCase(keyword);
    }
}
