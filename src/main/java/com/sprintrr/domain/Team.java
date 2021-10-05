package com.sprintrr.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("teams")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Team {

  @Id
  private String id;

  private String name;
  private List<TeamMember> members;
}
