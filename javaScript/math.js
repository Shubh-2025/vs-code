let value = -300;
let val = Math.abs(value);
let fraction = 10.05;
let roundedValue = Math.round(fraction);

// console.table([val,roundedValue]);

let ceilingValue = Math.ceil(fraction); // (10.05)=>(11)
let floorvalue = Math.floor(fraction);  // (10.05)=>(10)

// console.table([ceilingValue,floorvalue]);

let TwoSquare = Math.pow(2,2);
// console.log(`two's square = ${TwoSquare}`);

let a = 36 
let square = Math.sqrt(a);
// console.log(square);

let nums = [10,11,12,13,14]
// console.log(`maximum = ${Math.max(...nums)}`);
// console.log(`minimum = ${Math.min(...nums)}`);


let max=15
let min=10
console.log(Math.floor(Math.random(max-min)*(max-min+1))+min);
