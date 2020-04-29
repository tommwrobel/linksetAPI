package com.linkset.LinksetAPI.dao.entity;

import com.linkset.LinksetAPI.model.LabelColor;

import javax.persistence.*;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String label;
    private LabelColor labelColor;

    Link() {
    }

    public Link(Long id, String url, String label, LabelColor labelColor) {
        this.id = id;
        this.url = url;
        this.label = label;
        this.labelColor = labelColor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LabelColor getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(LabelColor labelColor) {
        this.labelColor = labelColor;
    }
}
