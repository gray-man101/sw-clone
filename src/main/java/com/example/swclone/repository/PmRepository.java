package com.example.swclone.repository;

import com.example.swclone.entity.Pm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmRepository extends JpaRepository<Pm, Long> {
}
