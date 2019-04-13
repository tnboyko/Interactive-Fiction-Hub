package com.mycompany.app;

import java.io.Serializable;
import java.util.ArrayList;

public class Paragraph implements Serializable {

  private int id;
  private String name;
  private String description;
  private ArrayList<Transition> transitions;

  public Paragraph(int id, String name, String description, ArrayList<Transition> transitions){
    this.id = id;
    this.name = name;
    this.description = description;
    this.transitions = transitions;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Transition> getTransitions() {
    return transitions;
  }

  public void setTransitions(ArrayList<Transition> transitions) {
    this.transitions = transitions;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
