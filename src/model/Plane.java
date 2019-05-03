package model;

import java.awt.Dimension;

public class Plane extends Mobile {
    private final static int SPEED = 20;
    private final static int WIDTH = 100;
    private final static int HEIGHT = 30;
    public final static Dimension dimension = new Dimension(WIDTH, HEIGHT);

    private int player;

    public Plane(final int player, final Direction direction, final Position position, final String image) {
        super(direction, position, dimension, SPEED, image);
        this.player = player;
    }

    public boolean isPlayer(int player) {
        if (this.player > 1) {
            return false;
        }

        else {
            return true;
        }

    }

    public boolean hit() {
        return false;
    }
}