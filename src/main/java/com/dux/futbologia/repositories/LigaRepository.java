package com.dux.futbologia.repositories;

import com.dux.futbologia.entity.Liga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LigaRepository extends JpaRepository<Liga, Integer> {
}
