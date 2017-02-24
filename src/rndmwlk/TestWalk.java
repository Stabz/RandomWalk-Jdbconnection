/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rndmwlk;

import java.util.Scanner;

public class TestWalk {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("hvor vil du starte x afslut med enter, derefter y:");
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        System.out.println("max antal skridt:");
        int max = Integer.parseInt(scan.nextLine());
        System.out.println("grænsen af firkanten:");
        int lim = Integer.parseInt(scan.nextLine());

        RandomWalk ran1 = new RandomWalk(10, 5);

        RandomWalk ran2 = new RandomWalk(x, y, max, lim);

        System.out.println(ran1);
        System.out.println(ran2);

        for (int i = 0; i < 5; i++) {
            ran2.takeStep();
            System.out.println("max distance from origin walk2: "+ran2.getMaxDistance());
            ran1.takeStep();
            System.out.println("max distance from origin walk1 : "+ran1.getMaxDistance());
        }
        
        System.out.println(ran1);
        System.out.println(ran2);
        
        
        RandomWalk ran3 = new RandomWalk(200,10);
      ran3.walk();
        System.out.println(ran3);
      
    }

}