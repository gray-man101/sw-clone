package com.example.swclone.repository;

import com.example.swclone.entity.Ln;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LnRepository extends JpaRepository<Ln, Long> {
}
