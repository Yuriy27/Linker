package com.github.yuriy27.repository;

import com.github.yuriy27.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {

    @Query("SELECT l FROM Link l WHERE l.key = :key")
    Link findByKey(@Param("key") String key);

}
