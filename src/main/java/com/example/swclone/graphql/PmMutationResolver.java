package com.example.swclone.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.swclone.dto.NewPmDTO;
import com.example.swclone.entity.Pm;
import com.example.swclone.repository.LnRepository;
import com.example.swclone.repository.PmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PmMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private LnRepository lnRepository;
    @Autowired
    private PmRepository pmRepository;

    public Pm createPm(NewPmDTO newPmDTO) {
        Pm pm = new Pm();
        pm.setAmount(newPmDTO.getAmount());
        pm.setLn(lnRepository.getOne(newPmDTO.getLnId()));
        pmRepository.save(pm);
        return pm;
    }

}
