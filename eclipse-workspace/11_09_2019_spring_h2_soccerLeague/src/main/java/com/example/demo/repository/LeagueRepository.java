package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Integer> {
//public List<League> findAllByOrderBytitleAsc();
}