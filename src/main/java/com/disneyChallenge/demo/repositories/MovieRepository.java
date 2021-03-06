package com.disneyChallenge.demo.repositories;

import com.disneyChallenge.demo.models.Movie;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByTitle(String title);
    List<Movie> findByTitle(String title, Sort sort);
    List<Movie> findByGid(Long g_id);
    List<Movie> findByGid(Long g_id, Sort sort);

}
