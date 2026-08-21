package com.example.doces.Repositories;

import com.example.doces.Entities.Doce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoceRepository  extends JpaRepository<Doce, Long> {

    }


