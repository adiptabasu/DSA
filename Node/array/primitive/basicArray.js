let arr = [1, 2, 3, 4, 5, 6, 7, 8];

arr[8] = 9;
arr.push(11);
arr.pop();
arr.push(10);

console.log(arr);

console.log(arr.map(elem => elem * elem));

console.log(arr.filter(elem => elem % 2 == 0));

console.log(arr.reduce((adder, elem) => (adder += elem), 0));