package model;

public class Missile {
    private final int SPEED = 4;
    private final int WIDTH = 30;
    private final int HEIGHT = 10;
    private final int MAX_DISTANCE_TRAVELED = 1400;
    private final String IMAGE = "missile";
    private int distanceTraveled = 0;

    public Missile(Direction direction, Dimension dimension) {

    }

    public int getWidthWithADirection(Direction direction) {
        return 0;
    }

    public int getHeightWithADirection(Direction direction) {
        return 0;
    }

    public void move() {

    }

    public boolean isWeapon() {
        return false;
    }
}