class Node {
    constructor() {
        this.dataVal = null;
        this.next = null;
        this.prev = null;
    }
    getDataVal() {
        return this.dataVal;
    }
    setDataVal(dataVal) {
        this.dataVal = dataVal;
    }
    getNext() {
        return this.next;
    }
    setNext(next) {
        this.next = next;
    }
    getPrev() {
        return this.prev;
    }
    setPrev(prev) {
        this.prev = prev;
    }
}

class DoublyLinkedLinkedList {
    constructor() {
        this.head = null;
    }
    addToHead(dataVal) {
        let tempHead = new Node();
        tempHead.setDataVal(dataVal);
        if (this.head == null) {
            this.head = tempHead;
        }
        else {
            tempHead.setNext(this.head);
            this.head.setPrev(tempHead);
            this.head = tempHead;
        }
    }
    add(dataVal) {
        if (this.head == null) {
            this.addToHead(dataVal);
        }
        else {
            let tailNode = this.head;
            while (tailNode.getNext() != null) {
                tailNode = tailNode.getNext();
            }
            let tempNode = new Node();
            tempNode.setDataVal(dataVal);
            tailNode.setNext(tempNode);
            tempNode.setPrev(tailNode);
        }
    }
    printAllValues() {
        if (this.head == null) {
            console.log('Head is empty');
        }
        else {
            let dataVal = "";
            let tempNode = this.head;
            while (tempNode.getNext() != null) {
                dataVal += tempNode.getDataVal() + " -> ";
                tempNode = tempNode.getNext();
            }
            dataVal += tempNode.getDataVal();
            console.log(dataVal);
        }
    }
}

let Main = () => {
    let dLL = new DoublyLinkedLinkedList();
    dLL.addToHead(20);
    dLL.addToHead(10);
    dLL.printAllValues();
    dLL.add(30);
    dLL.add(40);
    dLL.printAllValues();
}

Main();