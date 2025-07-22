package com.practise.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Feedbacks {

    @Id
    private int id;
    private String UserName;
    private String email;
    private String Comments;
    private int rating;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getComments() {
        return Comments;
    }
    public void setComments(String comments) {
        Comments = comments;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Feedbacks [id=" + id + ", UserName=" + UserName + ", email=" + email + ", Comments=" + Comments
                + ", rating=" + rating + "]";
    }   
    
}
