package com.linkset.LinksetAPI.controller;

import com.linkset.LinksetAPI.dao.entity.Link;
import com.linkset.LinksetAPI.dao.entity.Linkset;
import com.linkset.LinksetAPI.service.LinkService;
import com.linkset.LinksetAPI.service.LinksetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.linkset.LinksetAPI.model.LabelColor.RED;

@RestController
@RequestMapping("api/linkset")
public class LinksetController {

    @Autowired
    LinksetService linksetService;
    @Autowired
    LinkService linkService;

    @GetMapping("/all")
    public Iterable<Linkset> getAll() {
        return linksetService.findAll();
    }

    @GetMapping("/{index}")
    public Optional<Linkset> getById(@PathVariable("index") Long id) {
        return linksetService.findById(id);
    }

    @PostMapping
    public Linkset add(@RequestBody Linkset linkset) {
        linkService.saveAll(linkset.getLinks());
        return linksetService.save(linkset);
    }

    @PutMapping
    public Linkset update(@RequestBody Linkset linkset) {
        return linksetService.save(linkset);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        linksetService.delete(id);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {

        List<Link> links1 = new ArrayList<>();
        List<Link> links2 = new ArrayList<>();

        links1.add(new Link(1L, "www.onet.pl", "Ugent", RED));
        links1.add(new Link(2L, "www.jpg.pl", "Ugent", RED));
        links1.add(new Link(3L, "www.wp.pl", "Ugent", RED));

        links2.add(new Link(4L, "www.onet.pl", "Ugent", RED));
        links2.add(new Link(5L, "www.jpg.pl", "Ugent", RED));
        links2.add(new Link(6L, "www.wp.pl", "Ugent", RED));

        Linkset linkset1 = new Linkset(1L, "Pierwszy linkset", "Tomek", LocalDate.now());
        linkset1.setLinks(links1);
        Linkset linkset2 = new Linkset(2L, "Drugi linkset", "Adrian", LocalDate.now());
        linkset2.setLinks(links2);

        linkService.saveAll(links1);
        linkService.saveAll(links2);
        linksetService.save(linkset1);
        linksetService.save(linkset2);
    }
}
