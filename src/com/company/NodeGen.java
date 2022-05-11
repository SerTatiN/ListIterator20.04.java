package com.company;

    public class NodeGen <E>{
        private E value;
        private NodeGen nextNode;

        public NodeGen() {
        this.value = null;
        this.nextNode = null;
        }
        public NodeGen(E value) {
            this.value = value;
            this.nextNode = null;
        }
        public NodeGen(E value, NodeGen nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public NodeGen getNextNode() {
            return nextNode;
        }

        public void setNextNode(NodeGen nextNode) {
            this.nextNode = nextNode;
        }

}


