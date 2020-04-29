package com.linkset.LinksetAPI.dao;

import com.linkset.LinksetAPI.dao.entity.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
}
