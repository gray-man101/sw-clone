package com.example.swclone.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.swclone.entity.Pm;
import com.example.swclone.repository.PmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PmQuery implements GraphQLQueryResolver {

    @Autowired
    private PmRepository pmRepository;

    public Iterable<Pm> getPms() {
        return pmRepository.findAll();
    }

}
