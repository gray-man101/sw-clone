package com.example.swclone.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.swclone.dto.NewLnDTO;
import com.example.swclone.entity.Ln;
import com.example.swclone.repository.LnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LnMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private LnRepository lnRepository;

    public Ln createLn(NewLnDTO newLnDTO) {
        Ln ln = new Ln();
        ln.setDbName(newLnDTO.getDbName());
        ln.setAmount(newLnDTO.getAmount());
        ln.setDbName(newLnDTO.getDbName());
        lnRepository.save(ln);
        return ln;
    }

}
