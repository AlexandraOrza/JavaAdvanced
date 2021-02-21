package javaadvanced.oop.exceptions.homework;

//Write an application that will read the input and print back value that user provided,
 //       use try-catch statements to parse the input, e.g. I/O:
 //       Input: 10
 //       Output: int -> 10
 //       Input: 10.0
//      Output: double -> 10.0
//        Input: „Hello!”
//        Output: „Hey! That’s not a value! Try once more.”

public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
