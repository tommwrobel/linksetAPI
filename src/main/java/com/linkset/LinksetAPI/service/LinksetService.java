package com.linkset.LinksetAPI.service;

import com.linkset.LinksetAPI.dao.LinkRepository;
import com.linkset.LinksetAPI.dao.LinksetRepository;
import com.linkset.LinksetAPI.dao.entity.Linkset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LinksetService {

    private LinksetRepository linksetRepository;

    @Autowired
    public LinksetService(LinksetRepository linksetRepository) {
        this.linksetRepository = linksetRepository;
    }

    public Iterable<Linkset> findAll() {
        return linksetRepository.findAll();
    }

    public Optional<Linkset> findById(Long id) {
        return linksetRepository.findById(id);
    }

    public Linkset save(Linkset linkset) {
        return this.linksetRepository.save(linkset);
    }

    public void delete(Long id) {
        this.linksetRepository.deleteById(id);
    }
}
