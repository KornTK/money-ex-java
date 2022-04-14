/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6330611030;

/**
 *
 * @author pokde
 */
public class setting {
     private String path_user;
     
    private int height;
    
    setting() {
    this.path_user = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/User.txt";
    
    this.height = 400;
 }

  public String getPath() {
     return this.path_user;
  }

  public int getHeight() {
     return this.height;
  }
}
