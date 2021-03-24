package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String link;
    private double size;

    public Main() {
    }

    public Main(String link, double size) {
        this.id = id;
        this.link = link;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public double getSize() {
        return size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSize(double size) {
        this.size = size;
    }

}
