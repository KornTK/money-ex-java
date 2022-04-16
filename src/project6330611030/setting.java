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
    public static String path_Log;

    
    public static String path_have;
    public static String path_have_THB;
     public static String path_have_USD;
      public static String path_have_YEN;

    public static String path_RATE;
    public static String path_RATE_THB_USD;
    public static String path_RATE_THB_YEN;
    public static String path_RATE_USD_THB;
    public static String path_RATE_USD_YEN;
    public static String path_RATE_YEN_THB;
    public static String path_RATE_YEN_USD;

    
    setting() {
    this.path_user = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/User.txt";
    
    path_Log = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/Log.txt";

    path_have = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/money_have/";
    path_have_THB = path_have+"THB.txt";
    path_have_USD = path_have+"USD.txt";
    path_have_YEN = path_have+"YEN.txt";
    
    path_RATE = "D:/Progarmming/NonP1/Project6330611030/Project6330611030/money-ex-java/src/RATE_EX";
    
    path_RATE_THB_USD = path_RATE+"THB-USD.txt";
    path_RATE_THB_YEN = path_RATE+"THB-YEN.txt";
    
    path_RATE_USD_THB = path_RATE+"USD-THB.txt";
    path_RATE_USD_YEN = path_RATE+"USD-YEB.txt";
    
    path_RATE_YEN_THB = path_RATE+"YEN-THB.txt";
    path_RATE_YEN_USD = path_RATE+"YEN-USD.txt";

    this.height = 400;
 }

  public String getPath() {
      
     return this.path_user;
  }
    public String getUser() {
      
     return this.user_login;
  }



    public String SetUser(String x_in) {
     this.user_login = x_in;
     call_get show_in_consol = new call_get(this.user_login);

     return user_login;
  }


}
class call_get extends setting {           //Inheritance 
    public call_get (){
        
    }
    public call_get (String name){
        System.out.println(user_login+" is login");

    }
}

