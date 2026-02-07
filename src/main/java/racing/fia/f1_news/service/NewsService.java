/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.service;

import racing.fia.f1_news.model.News;
import racing.fia.f1_news.repository.NewsRepository;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        logger.info("Service: Starting to insert news to database: {}", news.getTitle());
        try{
            newsrepo.save(news);
            logger.info("Service: News  successfully with id: {}", news.getId());
        }catch(Exception e){
            logger.error("Service: Fatal error in inserting news to database: ", e);
            throw e;
        }
    }
    
    public void removeNews(News news){
        logger.info("Service: Starting to remove news from database: {}", news.getTitle());
        try{
            newsrepo.delete(news);
            logger.info("Service: News removed successful");
        }catch(Exception e){
            logger.error("Service: Fatal error in removing news: {}", news.getTitle());
        }
    }
    
    public void updateNews(News news){
        logger.info("Service: Starting to update news to database: {}", news.getTitle());
        try{
            newsrepo.save(news);
            logger.info("Service: News updated successfully with id: {}", news.getId());
        }catch(Exception e){
            logger.error("Service: Fatal error in inserting news to database: ", e);
            throw e;
        }
    }
    
    public List<News> searchNewsByTitle(String keyword){
        logger.info("Service: Starting to search news by keywords from title: {}", keyword);
        if(keyword == null || keyword.trim().isEmpty()){
            logger.info("Service: Failed because keywords are null or empty");
            return newsrepo.findAll();
        }
        logger.info("Service: Success");
        return newsrepo.findByTitleContainingIgnoreCase(keyword);
    }
}
