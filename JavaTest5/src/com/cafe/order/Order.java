package com.cafe.order;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items=new ArrayList<OrderItem>();

    void add(final OrderItem item){
        items.add(item);
    }
    int cost(){
        int sum=0;
        for(int i=0;i< items.size();i++){
            sum+=items.get(i).beverage.getCost()*items.get(i).quantity;
        }
        return sum;
    }
    boolean setSize(String name, String size){
        int s=-1;
        if(size.equals("TALL")) s=0;
        if(size.equals("GRANDE")) s=1;
        if(size.equals("VENTI")) s=2;
        for(int i=0;i<items.size();i++){
            if(items.get(i).beverage.getName().equals(name)){
                return items.get(i).beverage.setSize(size);
            }
        }
        return false;
    }

    void print(){
        for(int i=0;i< items.size();i++){
            System.out.println(items.get(i));
        }
        System.out.printf("Total: %,d%n", this.cost());
    }
}
