package model;

public class Plane {
    private final int SPEED = 20;
    private final int WIDTH = 100;
    private final int HEIGHT = 30;

    private int player;

    public Plane(int player, Direction direction, Position position, String image) {

    }

    public boolean isPlayer(int player) {
        return false;
    }

    public boolean hit() {
        return false;
    }
}