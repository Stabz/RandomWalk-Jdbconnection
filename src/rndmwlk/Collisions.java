/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rndmwlk;

public class Collisions {

    public static void main(String[] args) {
        int lim = 2000000;
        int maxSteps = 100000;
        int counter = 0;
        RandomWalk part1 = new RandomWalk(-3, 0, maxSteps, lim);
        RandomWalk part2 = new RandomWalk(3, 0, maxSteps, lim);

        while (part1.getStepsCount() - 1 < maxSteps) {
            part1.takeStep();
            part2.takeStep();
            if(samePosition(part1, part2)){
                counter++;
            }
//            if (part1.getX() == part2.getX() && part2.getY() == part1.getY()) {
//                counter++;
//            }

        }
        System.out.println("particles have collided "+counter+" times");

    }
    
    
    public static boolean samePosition (RandomWalk part1, RandomWalk part2){
        boolean bool = false;
        
        if (part1.getX() == part2.getX() && part2.getY() == part1.getY()) {
            bool = true;
            
        }
        
        return bool;
    }

}