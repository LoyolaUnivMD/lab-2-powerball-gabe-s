// Programmers: Gabriel S
// Course:  CS 212
// Due Date:
// Lab Assignment: Lab 2
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person
// importing java tools
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/** Program showing some array uses. */
public class Lotterytickets {
    public static void main(String[] args) {
         long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        
         // Program output
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        // Get user name input 
        System.out.print("What's your name? ");

        String customerName = input.nextLine();

    
        // Creates 6 set of numbers on 10 lines 
        int data[] = new int[6];
        int data2[] = new int[6];
        int data3[] = new int[6];
        int data4[] = new int[6];
        int data5[] = new int[6];
        int data6[] = new int[6];
        int data7[] = new int[6];
        int data8[] = new int[6];
        int data9[] = new int[6];
        int data10[] = new int[6];
        Random rand = new Random();
         // 
        // a pseudorandom number generator
        
        // fill the data array with pseudorandom numbers from 0 to 99, inclusive
        for (int i = 0; i < data.length; i++)
            data[i] = rand.nextInt(100);
            for (int l = 0; l < data.length; l++)
                data2[l] = rand.nextInt(100);
                for (int e = 0; e < data.length; e++)
                    data3[e] = rand.nextInt(100);
                    for (int r = 0; r < data.length; r++)
                        data4[r] = rand.nextInt(100);
                        for (int t = 0; t < data.length; t++)
                            data5[t] = rand.nextInt(100);
                            for (int a = 0; a < data.length; a++)
                                data6[a] = rand.nextInt(100);
                                for (int w = 0; w < data.length; w++)
                                    data7[w] = rand.nextInt(100);
                                    for (int q = 0; q < data.length; q++)
                                        data8[q] = rand.nextInt(100);
                                        for (int s = 0; s < data.length; s++)
                                            data9[s] = rand.nextInt(100);
                                            for (int f = 0; f < data.length; f++)
                                                data10[f] = rand.nextInt(100);
                
                    
                    
             // the next pseudorandom number
        //int[] orig = Arrays.copyOf(data, data.length);  // make a copy of the data array
        
        
        System.out.println("Your lottery numbers are");
       
        //System.out.println("orig = " + Arrays.toString(orig));
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));
        System.out.println(Arrays.toString(data3));
        System.out.println(Arrays.toString(data4));
        System.out.println(Arrays.toString(data5));
        System.out.println( Arrays.toString(data6));
        System.out.println(Arrays.toString(data7));
        System.out.println(Arrays.toString(data8));
        System.out.println(Arrays.toString(data9));
        System.out.println(Arrays.toString(data10));
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot");
        System.out.println("$"+ prize);
        
       
       
    }
}
