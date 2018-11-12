/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.basic.calculator;

/**
 *
 * @author Dejan
 */
public class Numbers {

    public double calculate(double numbrer1, double number2, String operator) {

        switch (operator) {
            case "+":
                return  (numbrer1 + number2);
            case "-":
                return  (numbrer1 - number2);
            case "*":
                return numbrer1 * number2;
            case "/":
                if(numbrer1 == 0) 
                    return 0;
                return numbrer1 / number2;
            default:
                return 0;
        }
        
       
    }
}
