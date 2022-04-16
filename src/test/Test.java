/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pokde
 */
public class Test {
     public static void main (String[] args) {

        warn person2 = new exit_boy("Mateo", 1981);

        person2.exit_warn();

    }  

}

class warn {

    String name;

    public warn (String name) {
        this.name = name;
    }

    public void exit_warn () {
        System.out.print("Bye " + name + ",");
    }

}

class exit_boy extends warn {


    public exit_boy (String name, int coderun) {
        super(name);
    }

    @Override
    public void exit_warn () {
        super.exit_warn();
        System.out.println("Clse the progarm");
    }

}

