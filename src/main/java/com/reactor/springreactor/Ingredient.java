package com.reactor.springreactor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor (force = true, access = AccessLevel.PROTECTED)
public class Ingredient {

  private final String id;
  private final String name;
  private final Type type;

  public enum Type {WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE};

}
