package com.hashidefense.game.model;

/**
 * Created by Florian on 13.11.2016.
 */
public abstract class Movable implements Paintable{
    private Direction direction;
    private double currentX;
    private double currentY;
    private double currentSpeed;

    public Movable(Direction direction, int currentX, int currentY, double currentSpeed) {
        this.direction = direction;
        this.currentX = currentX;
        this.currentY = currentY;
        this.currentSpeed = currentSpeed;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getPosX() {
        return (int) currentX;
    }

    public int getPosY() {
        return (int) currentY;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void changeSpeed(double difference){
        currentSpeed = Math.max(0, currentSpeed + difference);
    }

    public void move(){
        switch (direction){
            case UP:
                currentY += currentSpeed;
                break;
            case DOWN:
                currentY -= currentSpeed;
                break;
            case LEFT:
                currentX -= currentSpeed;
                break;
            case RIGHT:
                currentX += currentSpeed;
                break;
        }
    }
}
