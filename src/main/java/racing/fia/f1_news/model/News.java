/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing.fia.f1_news.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author mottramkg
 */
@Component
@Entity
@Table(name="news_tbl")
public class News {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String content;
    private Date dayCreated;
    private String author;

    public News() {
        
    }
    
    public News(String title, String description, String content, Date dayCreated, String author) {
        super();
        this.title = title;
        this.description = description;
        this.content = content;
        this.dayCreated = dayCreated;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDayCreated() {
        return dayCreated;
    }

    public void setDayCreated(Date dayCreated) {
        this.dayCreated = dayCreated;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
