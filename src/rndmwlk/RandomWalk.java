package rndmwlk;

import java.util.Random;

public class RandomWalk {

    private int x;
    private int y;
    private int maxSteps;
    private int stepsCount;
    private int lim;
    private int maxDistance;

    public RandomWalk(int maxSteps, int lim) {
        this.maxSteps = maxSteps;
        this.lim = lim;

        this.x = 0;
        this.y = 0;
        this.stepsCount = 0;
        this.maxDistance = 0;

    }

    public RandomWalk(int x, int y, int maxSteps, int lim) {
        this.x = x;
        this.y = y;
        this.maxSteps = maxSteps;
        this.lim = lim;
        this.stepsCount = 0;
        this.maxDistance = 0;
    }

    public void takeStep() {
        int tal;
        Random ran = new Random();
        tal = ran.nextInt(4) + 1;

        switch (tal) {
            case 1:
                this.y--;
                this.stepsCount++;
                this.maxDistance = max(this.maxDistance,this.y);
                break;

            case 2:
                this.stepsCount++;
                this.x--;
                this.maxDistance = max(this.maxDistance,this.x);
                break;

            case 3:
                this.stepsCount++;
                this.y++;
                this.maxDistance = max(this.maxDistance,this.y);
                break;
            case 4:
                this.stepsCount++;
                this.x++;
                this.maxDistance = max(this.maxDistance, this.x);
                break;
            default:
                System.out.println("fejl");

                break;

        }

    }

    private int max(int num1, int num2) {
        int num;
        if (Math.abs(num1) > Math.abs(num2)) {
            num = num1;
        } else {
            num = num2;
        }

        return Math.abs(num);
    }

    public void walk() {
        while (moreSteps() != false && inBounds() != false) {
            takeStep();
        }
    }

    public boolean moreSteps() {
        boolean bool = true;

        if (this.stepsCount >= this.maxSteps) {
            bool = false;
        }

        return bool;
    }

    public boolean inBounds() {
        boolean bool = true;
        if (this.x > this.lim || this.y > this.lim || this.x < -this.lim || this.y < -this.lim) {
            bool = false;
        }

        return bool;
    }

    @Override
    public String toString() {
        return "position: " + x + "," + y + ". Step Count = " + stepsCount + '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMaxSteps() {
        return maxSteps;
    }

    public void setMaxSteps(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

}