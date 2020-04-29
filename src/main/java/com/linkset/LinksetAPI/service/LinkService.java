package com.linkset.LinksetAPI.service;

import com.linkset.LinksetAPI.dao.LinkRepository;
import com.linkset.LinksetAPI.dao.entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.linkset.LinksetAPI.model.LabelColor.GREEN;
import static com.linkset.LinksetAPI.model.LabelColor.RED;

@Service
public class LinkService {

    private LinkRepository linkRepository;

    @Autowired
    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Iterable<Link> findAll() {
        return linkRepository.findAll();
    }

    public Optional<Link> findById(Long id) {
        return linkRepository.findById(id);
    }

    public Link save(Link link) {
        return this.linkRepository.save(link);
    }

    public Iterable<Link>  saveAll(List<Link> links) {
        return this.linkRepository.saveAll(links);
    }

    public void delete(Long id) {
        this.linkRepository.deleteById(id);
    }
}
