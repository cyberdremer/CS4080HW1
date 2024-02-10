package com.cs4080.hw1.question3.course;

public class Textbook {
    private String authorName;
    private String title;
    private String publisher;

    public Textbook(){
        authorName = null;
        title = null;
        publisher = null;
    }

    public Textbook(String authorName, String title, String publisher){
        this.authorName = authorName;
        this.title = title;
        this.publisher = publisher;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
