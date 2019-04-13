package com.mycompany.app;

import java.io.Serializable;

public class Transition implements Serializable{

  private int transId;
  private String transDescription;
  //private Paragraph transOrigin;
  private Paragraph transDestination;

  public Transition(int transId, String transDescription, Paragraph transDestination){
    this.transId = transId;
    this.transDescription = transDescription;
    //this.transOrigin = transOrigin;
    this.transDestination = transDestination;
  }

  public int getTransId() {
    return transId;
  }

  public void setTransId(int transId) {
    this.transId = transId;
  }

  public String getTransDescription() {
    return transDescription;
  }

  public void setTransDescription(String transDescription) {
    this.transDescription = transDescription;
  }

  /*public Paragraph getTransOrigin() {
    return transOrigin;
  }

  public void setTransOrigin(Paragraph transOrigin) {
    this.transOrigin = transOrigin;
  }*/

  public Paragraph getTransDestination() {
    return transDestination;
  }

  public void setTransDestination(Paragraph transDestination) {
    this.transDestination = transDestination;
  }

}
