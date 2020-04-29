package com.linkset.LinksetAPI.dao.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Linkset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;
    private String author;
    private LocalDate creationDate;

    @OneToMany
    @JoinColumn(name="linksetId")
    private List<Link> links;

    Linkset() {
    }

    public Linkset(Long id, String name, String author, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.creationDate = creationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}
