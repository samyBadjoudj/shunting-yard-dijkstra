package com.samy.shuntingyard;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Samy Badjoudj
 * Date: 14/06/14
 */
public class Operators
{
    private enum Operator{

        ADDITION(1), SUBTRACTION(1), MULTIPLICATION(5), DIVISION(5);
        final int priority;
        Operator(int p) { priority = p; }

    }

    private static Map<String, Operator> allOperators = new HashMap<String, Operator>() {{
        put("+", Operator.ADDITION);
        put("-", Operator.SUBTRACTION);
        put("*", Operator.MULTIPLICATION);
        put("/", Operator.DIVISION);
    }};


    public static boolean isOperator(String operator){
        return allOperators.containsKey(operator);
    }

    public static boolean isRightOperatorPrior(String operator, String otherOperator){
        return  isOperator(otherOperator) && allOperators.get(operator).priority <= allOperators.get(otherOperator).priority;
    }


}




