package model;

public class Dimension {
    private int width;
    private int heigth;

    public void Dimension(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public void Dimension(Dimension dimension) {
        this.width = dimension.width;
        this.heigth = dimension.heigth;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the heigth
     */
    public int getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}