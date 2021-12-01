package com.cafe.menu;
public class Blended extends Beverage{
    private int baseAmount;
    public Blended(String name) {
        super(name, 6300, 1);
    }

    @Override
    public boolean setSize(String size) {
        if(size.equals("GRANDE")) {
            super.setSize(size);
            return true;
        }
        return false;
    }
}
