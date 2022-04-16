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
    
    public static String path_have;
    public static String path_have_THB;
     public static String path_have_USD;
      public static String path_have_YEN;

    public static String path_RATE;
    public static String path_RATE_USD;
    public static String path_RATE_YEN;

    
    setting() {
    this.path_user = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/User.txt";
    path_have = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/money_have/";
    path_have_THB = path_have+"THB.txt";
    path_have_USD = path_have+"USD.txt";
    path_have_YEN = path_have+"YEN.txt";
    path_RATE = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/RATE_EX";
    path_RATE_USD = path_RATE+"USD.txt";
    path_RATE_YEN = path_RATE+"YEN.txt";
    this.height = 400;
 }

  public String getPath() {
     return this.path_user;
  }

  public int getHeight() {
     return this.height;
  }
  public String getUser() {
     System.out.println("Read."+user_login);
     return user_login;
  }
    public String SetUser(String x_in) {
     this.user_login = x_in;
            System.out.println("Save."+user_login);

     return user_login;
  }
}
