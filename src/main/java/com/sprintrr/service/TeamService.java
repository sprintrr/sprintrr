package com.sprintrr.service;

import com.sprintrr.domain.Team;
import com.sprintrr.repository.TeamRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamService {

  private final TeamRepository teamRepository;

  public List<Team> getTeams() {
    return (List<Team>) teamRepository.findAll();
  }

  public void createTeam() {
    teamRepository.save(Team.builder()
        .name("TeamSprintrr")
        .build());
  }
}
