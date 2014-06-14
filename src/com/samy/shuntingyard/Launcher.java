package com.samy.shuntingyard;

/**
 * User: Samy Badjoudj
 * Date: 14/06/14
 */
public class Launcher {

    public static void main(String args[]) {

        ShuntingYard shuntingYard = new DefaultShuntingYard();
        System.out.println(shuntingYard.getPostFixNotation("( 252 + 433 ) + 92 * 2"));
        System.out.println(shuntingYard.getPostFixNotation("( 0 - 1 ) * 4 * 5"));
        System.out.println(shuntingYard.getPostFixNotation("( x - 3 ) * y / d"));
        System.out.println(shuntingYard.getPostFixNotation("( a + b * c ) / ( a + d * c - e )"));
    }

}
