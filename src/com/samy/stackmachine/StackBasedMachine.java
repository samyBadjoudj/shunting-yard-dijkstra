package com.samy.stackmachine;

import java.util.Queue;

/**
 * User: Samy Badjoudj
 * Date: 15/06/14
 */
public interface StackBasedMachine {

    public  int compute(Queue<String> queue);
    public  int compute(String queue);
}
