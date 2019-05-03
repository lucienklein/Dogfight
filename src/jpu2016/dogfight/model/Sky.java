package jpu2016.dogfight.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Sky implements IArea {
    private Dimension dimension;
    private Image image;

    public Sky(Dimension dimension) {
        this.dimension = dimension;
        image = new Image() {

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
    public Dimension getDimension() {
        return this.dimension;
    }

    @Override
    public Image getImage() {
        return this.image;
    }
}