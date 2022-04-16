/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6330611030;

import javax.swing.JOptionPane;
import static project6330611030.setting.user_login;

/**
 *
 * @author pokde
 */
  public abstract class get_data2 extends setting implements get_data{     //Abstraction class & inheritance 

     
     @Override
     public String User_logout() {
                  System.out.println(user_login+" is logout");
         user_login = null;
          JOptionPane.showMessageDialog(null, "ออกจากระบบเรียบร้อยแล้ว.", "Dee-Money", 1);
         login backmain = new login();
         backmain.setVisible(true);
     return "Log out successfully";
  }
     @Override
      public String getPath_Log() {
         System.out.println("System-Path-in :"+path_Log);

     return path_Log;
  }
  }

class Call_quee extends get_data2{       
    //for obj call
}


// exit zone        Polymorphism                

class warn {

    String name;
    public warn () {
        System.out.print("Bye See u next time!");
    }

    public warn (String name) {
        this.name = name;

    }

    public void exit_warn () {
    String name = setting.user_login;
        if (name != null){
        System.out.print("Bye " + name + ",");}
    }

}

class exit_boy extends warn {


    public exit_boy (String name, int coderun) {
        super(name);
    }

    @Override
    public void exit_warn () {
        super.exit_warn();
                System.exit(0);

    }

}
class exit_boy_no_user extends warn {


    public exit_boy_no_user () {
             super();

    }

    @Override
    public void exit_warn () {
        super.exit_warn();
                System.exit(0);

    }

}
