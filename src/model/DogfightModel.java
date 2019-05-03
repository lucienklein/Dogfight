package model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel implements IDogfightModel {
    private Sky sky;

    public DogfightModel() {
        sky = new Sky(dimension);
    }

    @Override
    public IArea getArea() {
        return null;
    }

    @Override
    public void buildArea(Dimension dimension) {

    }

    @Override
    public void addMobile(IMobile Mobile) {

    }

    @Override
    public void removeMobile(IMobile Mobile) {

    }

    @Override
    public ArrayList<IMobile> getMobiles() {
        return null;
    }

    @Override
    public IMobile getMobileByPlayer(int player) {
        return null;
    }

    @Override
    public void setMobilesHavesMoved() {

    }

}