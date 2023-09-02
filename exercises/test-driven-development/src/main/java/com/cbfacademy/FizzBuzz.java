package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<Integer> num = List.of(-1,-2,-3,-4,-5,16,17,18,19,20,21,22,33,46,75);
        System.out.println(new FizzBuzz().fizzBuzz(num));
    }
    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method 
        //  write a java program that creates a list with numbers from 1 to 15 and returns them such that
        //  - if the ${element} is a multiple of 3, it adds “Fizz” to the list
        //  - if the ${element} is a multiple of 5, it adds “Buzz” to the list
        //  - if the ${element} is a multiple of 15, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        String s = "";
        String s2 = "Invalid entry";
        List<String> anotherList = new ArrayList<>();

           for (Integer number : numbers) {

               if (number <= 0 || number >= 15) {
                    anotherList.add(s2);
               } else {
                   if (number % 15== 0) {
                       s = "FizzBuzz";
                       anotherList.add(s);
                   } else if (number % 5 == 0) {
                       s = "Buzz";
                       anotherList.add(s);

                   } else if (number % 3 == 0) {
                       s = "Fizz";
                       anotherList.add(s);

                   } else {
                       int x = number;
                       s = String.valueOf(x);
                       anotherList.add(s);
                   }

               }
               //System.out.println(anotherList);

           }
        return anotherList;
    }
    
    
    public String get(int number){
        //  Create a class `FizzBuzz` with a `get` method that takes a number and returns a string, but such that:
        // - for multiples of 3, it returns `“Fizz”` instead of the number
        // - for multiples of 5, it returns `“Buzz”` instead of the number
        // - for multiples of 15, it returns `“FizzBuzz”` instead of the number
        // - the string representation of the number otherwise
        String s = "";
        if (number % 15 == 0) {
            s = "FizzBuzz";
            return s;
        } else if (number % 5 == 0) {
            s = "Buzz";
            return s;

        } else if (number % 3 == 0) {
            s = "Fizz";
            return s;

        } else {
            s = String.valueOf(number);
            return s;
        }
    }


    public String getName() {
        return "FizzBuzz ";
    }

}


