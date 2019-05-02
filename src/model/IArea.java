package model;

public interface IArea {
    default String getDimension() {
        return this.Dimension;
    }
}