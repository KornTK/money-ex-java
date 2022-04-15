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
    public static String user_login;

    
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
  public String getUser() {
     System.out.println("open."+user_login);
     return user_login;
  }
    public String SetUser(String x_in) {
     this.user_login = x_in;
            System.out.println("Save."+user_login);

     return user_login;
  }
}
