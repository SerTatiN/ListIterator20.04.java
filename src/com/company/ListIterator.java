package com.company;


import java.util.Iterator;
//import java.util.function.Consumer;

public class ListIterator implements Iterator <NodeGen>{
    private ListGen list;
    private NodeGen tmpNode;
    private int counter;

    public ListIterator(ListGen list) {
        this.list = list;
        this.tmpNode = list.getHead();
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ListGen getList() {
        return list;
    }

    @Override
    public boolean hasNext() {
        return this.counter < this.list.getLength();
    }

    @Override
    public NodeGen next() {
        NodeGen tmp = tmpNode;
        counter++;
        tmpNode = tmpNode.getNextNode();
        return tmp;
    }



}
