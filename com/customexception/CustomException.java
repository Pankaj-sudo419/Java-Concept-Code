package com.customexception;

public class CustomException extends Exception {
    public CustomException(String message){
        super(message);
    }
}

class InvalidAgeException extends  Exception{
    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}

class Example{
   public static int test(int a , int b) throws CustomException ,InvalidAgeException{

       if(b == 0){
           throw new CustomException("denominator can't be zero");
       } else{
           if(a <= 18){
               throw  new InvalidAgeException("Invalid age for voting");
           }
       }
       int sum = a + b;

       return  sum;
   }

    public static void main(String[] args) throws CustomException ,InvalidAgeException{
        Example example = new Example();
        System.out.println(example.test(100,5));
    }
}
