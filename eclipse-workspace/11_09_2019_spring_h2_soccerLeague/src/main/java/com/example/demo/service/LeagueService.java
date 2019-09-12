package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.League;
import com.example.demo.repository.LeagueRepository;

@Service
public class LeagueService {
	private LeagueRepository leagueRepository;

	public LeagueService(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}

	public List<League> getLeagues() {
		List<League> leagues = new ArrayList<League>();
		for (League l : leagueRepository.findAll()) {
			leagues.add(l);
		}
		return leagues;
	}

	public League getbyId(int id) {
		return leagueRepository.findById(id).get();
	}

	public void saveLeague(League league) {
		leagueRepository.save(league);
	}

	public void updateLeague(League league) {
		
		leagueRepository.save(league);
		
	}

	public void deleteLeague(int id) {
		leagueRepository.deleteById(id);
	}
}