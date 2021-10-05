package com.sprintrr.controller;

import com.sprintrr.domain.Team;
import com.sprintrr.service.TeamService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
@AllArgsConstructor
public class TeamController {

  private final TeamService service;

  @GetMapping
  public List<Team> getTeams() {
    return service.getTeams();
  }

  @PostMapping
  public void createTeam() {
    service.createTeam();
  }
}
