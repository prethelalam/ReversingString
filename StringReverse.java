import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class StringReverse { //this is setting up a class

    static void ReverseString(){
        String ntexts = "";
        char c;

        System.out.print("Enter a word: ");
        Scanner one = new Scanner(System.in);
        String input = one.nextLine();

        for (int i = 0; i < input.length(); i++){ //you need the for loop in order to carry out the program
            c = input.charAt(i); //so here we are extracting each character using the for loop
            ntexts = c + ntexts; //here we are add a character in front of the existing string
        }
        System.out.println("reversed word: " + ntexts);
        System.out.println();
    }

    static void ReverseIntArray(){ //I want to see if I can reverse an array
        int[] numbers = {1,2,3,4,5}; //creating an integer array

        System.out.println(Arrays.toString(numbers)); //printing the array

        for(int i = 0; i < numbers.length / 2; i++){ //for loop to do a reversal
            int j = numbers[i]; //storing the array in int j
            numbers[i] = numbers[numbers.length - i -1]; 
            numbers[numbers.length - i - 1] = j;
        }
        System.out.println(Arrays.toString(numbers)); //this is how to print a string array
        System.out.println();
    }

    static void ReverseStringArray(){
        System.out.print("Enter a word: ");
        Scanner one = new Scanner(System.in);
        String input = one.nextLine();

        char[] charWords = input.toCharArray(); //here we are turning the user input into a char array
        System.out.print("Reverse word: ");
        
        for (int i = charWords.length -1; i >= 0; i--){ //this is how we reverse the char array. so we get the total length of the string (charWords.length), then we did i-- so the count goes down 1 until it reaches index 0 which is the first letter of the string
            System.out.print(charWords[i]);
        }
    }

public static void main(String[] args){ 
    ReverseString();
    ReverseIntArray();
    ReverseStringArray();
}
}

