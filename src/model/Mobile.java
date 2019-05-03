package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Mobile implements IMobile {

    private int speed;
    private Direction direction;
    private Position position;
    private Image image;
    private Dimension dimension;

    public Mobile(Dimension dimension) {

    }

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.direction = direction;
        this.position = position;
        this.speed = speed;
        this.image = new Image() {

            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }
        };

    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public Dimension getDimension() {
        return this.dimension;
    }

    @Override
    public int getWidth() {
        return this.dimension.getWidth();
    }

    @Override
    public int getHeight() {
        return this.dimension.getHeigth();
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public Image getImage() {
        return this.image;
    }

    @Override
    public void move() {

    }

    @Override
    public void placeInArea(IArea area) {

    }

    @Override
    public boolean isPlayer(int player) {
        return false;
    }

    @Override
    public void setDogfightModel(DogfightModel dogfightModel) {

    }

    public DogfightModel getDogfightModel() {
        return null;
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
        this.direction = Direction.UP;
    }

    public void moveRight() {
        this.direction = Direction.RIGHT;
    }

    public void moveDown() {
        this.direction = Direction.DOWN;
    }

    public void moveLeft() {
        this.direction = Direction.LEFT;
    }
}