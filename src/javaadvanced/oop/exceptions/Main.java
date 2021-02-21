package javaadvanced.oop.exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            int[] array = {5,7};
            int index = 3;
            printArrayElement(array,index);

        }catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic exception " + arithmeticException.getMessage());
        }catch (MyException myException){
            System.out.println("My exception was thrown");
        }finally {
                System.out.println("This will be printed no matter what the value is");
            }
        }

        public static void printArrayElement(int[] array, int index) throws MyException {
          if(index < 0 || index >= array.length){
              throw new MyException("Incorrect index value ");
          }
          System.out.println(array[index]);
    }
}


