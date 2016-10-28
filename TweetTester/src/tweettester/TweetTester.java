/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @Kyle Smith
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String tweet;
        tweet = scan.nextLine();

        if (tweet.length() > 140)
        {
            System.out.print("Error charracter count is too long!");
        }
        else
        {
            System.out.print(tweet.length());
        }
    }


    
}
