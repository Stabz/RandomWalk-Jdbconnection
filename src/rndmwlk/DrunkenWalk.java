/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rndmwlk;

import java.util.Scanner;


public class DrunkenWalk {
    public static void main(String[] args) {
    
        
        Scanner scan = new Scanner(System.in);
        System.out.println("how many drunks are on the platform?!");
        int drunk = scan.nextInt();
        System.out.println("how many steps do you think they are capable of taking?!");
        int maxSteps = scan.nextInt();
        System.out.println("what is the lenght of the dock from the center?!");
        int lim = scan.nextInt();
        int counter = 0;
        
        for (int i = 0; i < drunk; i++) {
            
            RandomWalk ran = new RandomWalk(maxSteps, lim);
            
            ran.walk();
            if(ran.getStepsCount()<ran.getMaxSteps()){
                counter ++;
            }
            
            
        }
        System.out.println("out of "+drunk+ " drunks "+counter+" fell in the water"); 
    
    }
    
}