class Node {
    constructor() {
        this.dataVal = null;
        this.next = null;
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
}

class SinglyLinkedLinkedList {
    constructor() {
        this.head = null;
    }
    addHead(dataVal) {
        let tempNode = new Node();
        tempNode.setDataVal(dataVal);
        if (this.head == null) {
            this.head = tempNode;
        }
        else {
            tempNode.setNext(this.head);
            this.head = tempNode;
        }
    }
    add(dataVal) {
        let tempNode = new Node();
        tempNode.setDataVal(dataVal);
        if (this.head == null) {
            this.head = tempNode;
        }
        else {
            let tempHead = this.head;
            while (tempHead.getNext()) {
                tempHead = tempHead.getNext();
            }
            tempHead.setNext(tempNode);
        }
    }
    addAtIndex(dataVal, index) {
        let tempNode = new Node();
        tempNode.setDataVal(dataVal);
        if (index == 0) {
            this.addHead(dataVal);
        }
        else {
            let currIndex = 0;
            let tempHead = this.head;
            while (tempHead.getNext() && index != 1) {
                tempHead = tempHead.getNext();
                currIndex++;
                if (currIndex == index - 1) {
                    break;
                }
            }
            tempNode.setNext(tempHead.getNext());
            tempHead.setNext(tempNode);
        }
    }
    updateHead(dataVal) {
        this.head.setDataVal(dataVal);
    }
    updateLast(dataVal) {
        let tempHead = this.head;
        while (tempHead.getNext()) {
            tempHead = tempHead.getNext();
        }
        tempHead.setDataVal(dataVal);
    }
    updateAtIndex(dataVal, index) {
        let tempHead = this.head;
        let currIndex = 0;
        while (tempHead.getNext() && currIndex != index) {
            tempHead = tempHead.getNext();
            currIndex++;
        }
        if (index > currIndex) {
            console.log('Index out of bounds');
        }
        else {
            tempHead.setDataVal(dataVal);
        }
    }
    deleteHead() {
        this.head = this.head.getNext();
    }
    deleteLast() {
        let tempHead = this.head;
        while (tempHead.getNext().getNext()) {
            tempHead = tempHead.getNext();
        }
        tempHead.setNext(null);
    }
    deleteAtIndex(index) {
        if (index == 0) {
            this.deleteHead();
        }
        else {
            let tempHead = this.head;
            let currIndex = 0;
            while (tempHead.getNext().getNext() && index != 1) {
                tempHead = tempHead.getNext();
                currIndex++;
                if (currIndex == index - 1) {
                    break;
                }
            }
            if (index > currIndex && index != 1) {
                console.log("Out of Bounds");
            }
            else {
                tempHead.setNext(tempHead.getNext().getNext());
            }
        }
    }
    size() {
        let size = 0;
        if (this.head != null) {
            let tempHead = this.head;
            while (tempHead.getNext()) {
                tempHead = tempHead.getNext();
                size++;
            }
            size++;
        }
        return size;
    }
    reverseIterative() {
        let currNode = this.head;
        let prevNode = null;
        while (currNode != null) {
            let tempNode = currNode.getNext();
            currNode.setNext(prevNode);
            prevNode = currNode;
            currNode = tempNode;
        }
        this.head = prevNode;
    }
    reverseRecersive() {
        this.head = this.recursiveReverseCall(this.head);
    }
    recursiveReverseCall(head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        let newHead = this.recursiveReverseCall(head.getNext());
        let nextHead = head.getNext();
        nextHead.setNext(head);
        head.setNext(null);
        return newHead;
    }
    printAllValues() {
        let values = "";
        let tempHead = this.head;
        while (tempHead.getNext()) {
            values += tempHead.dataVal + " , ";
            tempHead = tempHead.getNext();
        }
        values += tempHead.dataVal;
        console.log(values);
    }
}

let sLL = new SinglyLinkedLinkedList();
let node = new Node();
sLL.addHead(10);
sLL.add(20);
sLL.add(30);
sLL.add(40);
sLL.addAtIndex(100, 4)
sLL.printAllValues();
sLL.updateHead(1.1)
sLL.updateAtIndex(3.3, 2)
sLL.updateLast(5.5);
sLL.printAllValues();
sLL.deleteHead();
sLL.deleteLast();
sLL.deleteAtIndex(1)
sLL.printAllValues();
console.log(sLL.size());
sLL.reverseIterative();
sLL.printAllValues();
sLL.reverseRecersive();
sLL.printAllValues();