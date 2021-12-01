package com.cafe.order;
import com.cafe.menu.*;

public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage beverage, int quantity){  //생성자
        this.beverage=beverage;
        this.quantity=quantity;
    }
    public String toString(){
        String msg="[ name="+beverage.getName()+", Price="+beverage.getCost()+", size="+beverage.getSize_str()+", quantity="+quantity+" ]";
        return msg;
    }
}
