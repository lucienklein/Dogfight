package model;

import java.awt.Color;

public class Mobile implements IMobile {

    private int speed;

    public Mobile(Direction direction, Position position, int speed, String image) {

    }

    @Override
    public Direction getDirection() {
        return null;
    }

    @Override
    public void setDirection(Direction direction) {

    }

    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public Dimension getDimension() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public void move() {

    }

    @Override
    public void placeInArea(Area area) {

    }

    @Override
    public boolean isPlayer(int player) {
        return false;
    }

    @Override
    public void setDogfightModel(DogfightModel dogfightModel) {

    }

    public DogfightModel getDogfightModel() {
        return this.dogfightModel;
    }

    @Override
    public boolean hit() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }

    public Color getColor() {
        return null;
    }

    public void moveUp() {

    }

    public void moveRight() {

    }

    public void moveDown() {

    }

    public void moveLeft() {

    }
}