package com.myblog.intern.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "post_time")
    private Date date;
    @Column(name = "details")
    private String details;
    @Column(name = "active")
    private Integer active;
    @Column(name = "images")
    private String images;

    public Post() {
    }

    public Post(Integer userId, Date date, String details, Integer active, String images) {
        this.userId = userId;
        this.date = date;
        this.details = details;
        this.active = active;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", date=" + date +
                ", details='" + details + '\'' +
                ", active=" + active +
                ", images='" + images + '\'' +
                '}';
    }
}
