package jpu2016.dogfight.controller;

public abstract class UserOrder implements IUserOrder{

    public UserOrder(int player, Order order){

    }

    @Override
    public Order getOrder() {
        return null;
    }

    @Override
    public int getPlayer() {
        return 0;
    }
}
