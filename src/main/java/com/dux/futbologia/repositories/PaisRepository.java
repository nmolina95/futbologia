package com.dux.futbologia.repositories;

import com.dux.futbologia.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PaisRepository extends JpaRepository<Pais, Integer> {
}
