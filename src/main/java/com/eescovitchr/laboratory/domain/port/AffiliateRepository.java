package com.eescovitchr.laboratory.domain.port;

import com.eescovitchr.laboratory.domain.model.Affiliate;

import java.util.List;

public interface AffiliateRepository {

    Affiliate save(Affiliate affiliate);
    Affiliate findById(Integer id);
    List<Affiliate> findAll();
    void delete(Integer id);
    boolean existsById(Integer id);

}