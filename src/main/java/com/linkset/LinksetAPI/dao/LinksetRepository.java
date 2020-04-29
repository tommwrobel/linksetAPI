package com.linkset.LinksetAPI.dao;

import com.linkset.LinksetAPI.dao.entity.Linkset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksetRepository extends CrudRepository<Linkset, Long> {
}
