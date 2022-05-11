package com.company;

public class ListGen <E>{
    private NodeGen head;
    private int length;

    public ListGen() {
        this.head = null;
        this.length = 0;
    }

    public ListGen (NodeGen head) {
        this.head = head;
        this.length = 1;
    }
    public ListGen (E[] arr) {
        this.head = new NodeGen(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            push(arr[i]);
        }
        this.length = arr.length;
    }
    public NodeGen getHead() {
        return head;
    }

    public void setHead(NodeGen head) {
        this.head = head;
    }
    public void printList(){
        NodeGen nodeTmp = this.head;
        while (nodeTmp != null) {
            System.out.print(nodeTmp.getValue() + " ");
            nodeTmp = nodeTmp.getNextNode();
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }

    public void push(E value) {
        NodeGen nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode (new NodeGen(value));
        this.length++;
    }
    public void push(E value, int index) {
        if (index == 0) {
            this.pushHead(value);
        } else {
            NodeGen nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            NodeGen newNode = new NodeGen(value, nodeTmp.getNextNode());
            nodeTmp.setNextNode(newNode);
        }
        this.length++;
    }

    private void pushHead(E value) {
        NodeGen newNode = new NodeGen(value, this.head);
        this.head = newNode;
        this.length++;
    }
    public void pop(){
        NodeGen nodeTmp = this.head;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(null);
        this.length--;
    }
    public void pop(int index) {
        if (index == 0) {
            popHead();
        } else {
            NodeGen nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode().getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmp.setNextNode(nodeTmp.getNextNode().getNextNode());
        }
        this.length--;
    }

    private void popHead() {
        NodeGen nodeTmp = this.head;
        this.head = this.head.getNextNode();
    }

}



