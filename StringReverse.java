import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class StringReverse { //this is setting up a class

    static void ReserveString(){
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

    static void ReserveIntArray(){ //I want to see if I can reserve an array
        int[] name = {1,2,3,4,5}; //creating an integer array

        System.out.println(Arrays.toString(name)); //printing the array

        for(int i = 0; i < name.length / 2; i++){ //for loop to do a reversal
            int j = name[i]; //storing the array in int j
            name[i] = name[name.length - i -1]; 
            name[name.length - i - 1] = j;
        }
        System.out.println(Arrays.toString(name));
        System.out.println();
    }

    static void ReserveStringArray(){
        System.out.print("Enter a word: ");
        Scanner one = new Scanner(System.in);
        String input = one.nextLine();

        char[] charWords = input.toCharArray(); //here we are turning the user input into a char array
        System.out.print("Reverse word: ");
        
        for (int i = charWords.length -1; i >= 0; i--){ //this is how we reserve the char array. so we get the total length of the string (charWords.length), then we did i-- so the count goes down 1 until it reaches index 0 which is the first letter of the string
            System.out.print(charWords[i]);
        }
    }

public static void main(String[] args){ 
    ReserveString();
    ReserveIntArray();
    ReserveStringArray();
}
}

