package com.samy.shuntingyard;

import com.samy.stackmachine.DefaultStackBasedMachine;
import com.samy.stackmachine.StackBasedMachine;

/**
 * User: Samy Badjoudj
 * Date: 14/06/14
 */
public class Launcher {

    public static void main(String args[]) {

        ShuntingYard shuntingYard = new DefaultShuntingYard();
        StackBasedMachine stackBasedMachine = new DefaultStackBasedMachine();

        System.out.println("----INFIX TO POSTFIX----");
        System.out.println("A) ( 252 + 433 ) + 92 * 2  ---> " +shuntingYard.getPostFixNotation("( 252 + 433 ) + 92 * 2"));
        System.out.println("B) ( 0 - 1 ) * 4 * 5 ---> " +shuntingYard.getPostFixNotation("( 0 - 1 ) * 4 * 5"));
        System.out.println("");
        System.out.println("----STACK BASED MACHINE----");
        System.out.println("Computation of A) " + stackBasedMachine.compute(shuntingYard.getPostFixNotation("( 0 - 1 ) * 4 * 5")));
        System.out.println("Computation of B) " + stackBasedMachine.compute(shuntingYard.getPostFixNotation("( 252 + 433 ) + 92 * 2")));



    }

}
