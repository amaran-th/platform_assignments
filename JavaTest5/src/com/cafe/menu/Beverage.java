package com.cafe.menu;
public abstract class Beverage {
    public static final int TALL=0;
    public static final int GRANDE=1;
    public static final int VENTI=2;

    String name; int basePrice; int size;
    public Beverage(String name, int basePrice,int size ){
        this.name=name;
        this.basePrice=basePrice;
        this.size=size;
    }
    public boolean setSize(String size) {
        if ("TALL".equals(size)){
            this.size=0;
            return true;
        }
        else if ("GRANDE".equals(size)) {
            this.size = 1;
            return true;
        }else if ("VENTI".equals(size)){
            this.size=2;
            return true;
        }
        return false;
    }
    public String getName(){return name;}
    public int getCost(){return basePrice+500*size;}
    public String getSize_str(){
        if(size==0) return "TALL";
        if(size==1) return "GRANDE";
        if(size==2) return "VENTI";
        return "";
    }
    public int getSize(String s){
        if(s.equals("TALL")) return 0;
        if(s.equals("GRANDE")) return 1;
        if(s.equals("VENTI")) return 2;
        return -1;
    }


}
