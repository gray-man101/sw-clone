package com.example.swclone.repository;

import com.example.swclone.entity.Ln;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LnRepository extends CrudRepository<Ln, Long> {
}
