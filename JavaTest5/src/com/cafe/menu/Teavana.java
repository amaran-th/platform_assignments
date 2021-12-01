package com.cafe.menu;
public class Teavana extends Beverage{
    private int amount;

    public Teavana(String name){
        super(name, 4100, 0);
    }
    @Override
    public boolean setSize(String size) {
        if (!size.equals("GRANDE")) {
            super.setSize(size);
            return true;
        }
        return false;
    }
}
