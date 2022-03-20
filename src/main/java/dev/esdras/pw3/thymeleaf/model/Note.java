package dev.esdras.pw3.thymeleaf.model;

import java.time.LocalDateTime;

public class Note {

    private String content;
    private LocalDateTime dateTime;
    private Category category;

    public Note(String content, LocalDateTime dateTime, Category category) {
        this.content = content;
        this.dateTime = dateTime;
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Note{" +
                "content='" + content + '\'' +
                ", dateTime=" + dateTime +
                ", category=" + category +
                '}';
    }
}
