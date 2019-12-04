package com.example.swclone.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.swclone.dto.NewLnDTO;
import com.example.swclone.entity.Ln;
import com.example.swclone.repository.LnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class LnMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private LnRepository lnRepository;

    public Ln createLn(NewLnDTO newLnDTO) {
        Ln ln = new Ln();
        ln.setDbName(newLnDTO.getDbName());
        ln.setAmount(newLnDTO.getAmount());
        ln.setDbName(newLnDTO.getDbName());
        ln.setStatus(newLnDTO.getStatus());
        lnRepository.save(ln);
        return ln;
    }

    public Ln updateLn(Long id, String status) {
        Ln ln = lnRepository.getOne(id);
        ln.setStatus(status);
        return lnRepository.save(ln);
    }

}
