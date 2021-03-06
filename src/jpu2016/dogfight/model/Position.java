package jpu2016.dogfight.model;

public class Position {
    private double x;
    private double y;
    private double maxX;
    private double maxY;

    public Position(double x, double y, double maxX, double maxY) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
        this.maxX = position.maxX;
        this.maxY = position.maxY;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the maxX
     */
    public double getMaxX() {
        return maxX;
    }

    /**
     * @param maxX the maxX to set
     */
    protected void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    /**
     * @return the maxY
     */
    public double getMaxY() {
        return maxY;
    }

    /**
     * @param maxY the maxY to set
     */
    protected void setMaxY(double maxY) {
        this.maxY = maxY;
    }

}