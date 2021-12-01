package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE=10;
    private Object[] data;
    private int size=0;

    public GenericList(){
        data=new Object[DEFAULT_SIZE];
        size=0;
    }
    public GenericList(int size){
        data=new Object[size];
        this.size=0;
    }
    public void add(T newbi){
        data[size]=newbi;
        size++;
    }
    public void clear(){
        size=0;
    }
    public int size(){
        return size;
    }
    public T get(int i){
        return (T)data[i];
    }


}
