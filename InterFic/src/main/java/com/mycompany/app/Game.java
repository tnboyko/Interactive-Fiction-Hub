package com.mycompany.app;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {

  private int id;
  private String name;
  private String author;
  private ArrayList<String> genres;
  private ArrayList<Paragraph> paragraphs;
  private String description;

  public Game(int id, String name, String author, ArrayList<String> genres, ArrayList<Paragraph> paragraphs, String description) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.genres = genres;
    this.paragraphs = paragraphs;
    this.description = description;
  }

  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getAuthor(){
    return author;
  }

  public void setAuthor(String author){
    this.author = author;
  }

  public String getDescription(){
    return description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public ArrayList<String> getGenres(){
    return genres;
  }

  public void setGenres(ArrayList<String> genres){
    this.genres = genres;
  }

  public ArrayList<Paragraph> getParagraphs(){
    return paragraphs;
  }

  public void setParagraphs(ArrayList<Paragraph> paragraphs){
    this.paragraphs = paragraphs;
  }

}
