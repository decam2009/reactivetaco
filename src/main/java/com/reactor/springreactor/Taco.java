package com.reactor.springreactor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Taco {

  private Long id;
  private String name;

  private List<Ingredient> ingredients;
}
