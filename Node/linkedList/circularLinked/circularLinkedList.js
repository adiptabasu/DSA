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

class CircularLinkedList {
    constructor() {
        this.head = null;
    }
    addToHead(dataVal) {
        let tempHead = new Node();
        tempHead.setDataVal(dataVal);
        if (this.head == null) {
            this.head = tempHead;
            tempHead.setNext(this.head);
        }
        else {
            tempHead.setNext(this.head);
            this.head = tempHead;
            let tempNode = this.head.getNext();
            while (tempNode.getNext() != this.head.getNext()) {
                tempNode = temp.getNext();
            }
            tempNode.setNext(this.head);
        }
    }
    addToLast(dataVal) {
        let tempNode = new Node();
        tempNode.setDataVal(dataVal);
        if (this.head == null) {
            this.addToHead(dataVal);
        }
        else {
            let tempHead = this.head;
            while (tempHead.getNext() != this.head) {
                tempHead = tempHead.getNext();
            }
            tempNode.setNext(this.head);
            tempHead.setNext(tempNode);
        }
    }
    printAllValues() {
        let outData = "";
        let tempHead = this.head;
        if (this.head == null) {
            outData = 'Head is empty';
        }
        else {
            while (tempHead.getNext() != this.head) {
                outData += tempHead.getDataVal() + " , ";
                tempHead = tempHead.getNext();
            }
            outData += tempHead.getDataVal();
            console.log(outData)
        }
    }
}

function Main() {
    let cLL = new CircularLinkedList();
    cLL.addToHead(10);
    cLL.addToHead(20);
    cLL.addToLast(30);
    cLL.printAllValues();
}

Main();