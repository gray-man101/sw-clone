package com.example.swclone.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.swclone.entity.Ln;
import com.example.swclone.repository.LnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LnQuery implements GraphQLQueryResolver {

    @Autowired
    private LnRepository lnRepository;

    public Iterable<Ln> getLs() {
        return lnRepository.findAll();
    }

}
