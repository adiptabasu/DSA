class NonPrim {
    constructor(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

let arr = [];
let obj1 = new NonPrim(3, "Arka", 25);
let obj2 = new NonPrim(1, "Deb", 25);
let obj3 = new NonPrim(2, "Adipta", 26);
arr.push(obj1);
arr.push(obj2);
arr.push(obj3);
console.log(arr);

arr.sort((prev, curr) => (prev.id - curr.id));
console.log(arr);
arr.sort((prev, curr) => (prev.name <= curr.name ? -1 : 1));
console.log(arr);