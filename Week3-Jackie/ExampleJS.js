// JavaScript source code

// alert("Roll Tide");

var a = 10;
var b, c, d, e, f, g, h, i;

// Loosely typed.
b = "10";
c = true;
d = {};
e = null;
//f=;
g = (0 / 0);
h = []; // Arrays in JS are dynamic
i = function () { };

// Little Fun Practice - Ignore:
//alert(document.getElementById("welcome").innerHTML);
//document.getElementById("welcome").style.fontSize = "40px";

function incrementA() {
    a += 1;
    return a;
}

// Open Console in browser and type: increment(A). 
// Result is 11 because a = 10; -> a = a + 1; -> 11

// For best practice, use semi-colon.



/* TYPE COERCION */
// ==  performs type coercion
// === does not perform type coercion

console.log("hi");

console.log("5 == 5");
console.log(5 == 5); // true

console.log("5 === 5");
console.log(5 == 5); // true

console.log("5 == \"5\"");
console.log(5 == "5"); // true ... because type coercion

console.log("5 === \"5\"");
console.log(5 === "5"); // false

console.log(false == 1); // false
console.log(false == 0); // true ... because type coercion

console.log(false === 0); // false

console.log(true === 100000); // false

console.log(false === "false"); // false

console.log(false === ""); // false

console.log(false == "0"); // true ... because type coercion
console.log(false === "0"); // false


console.log(7 + 7 + 7); // 21

console.log('7' + 7 + 7); // 777  .... Everything after quotes becomes concatenated like a string.
console.log(7 + '7' + 7); // 777
console.log(7 + 7 + '7'); //147


var person = { name: "fred", age: 87 }; // this is an object
// Same thing: -> var person = { "name": "fred", "age": 87 }; // this is an object

console.log(person.name); // fred

// An object has properties and methods
// Properties have values

person.gender = "undefined";

console.log(person.gender); // undefined
console.log("person.gender type is " + typeof person.gender); // string
console.log("person.age type is " + typeof person.age); // number


function Person(name, age) {
    this.name = name;
    this.age = age;
}

var Jackie = new Person("Jackie", 500);

console.log(Jackie); // Person {name: "Jackie", age: 500}

function MakePerson(name, age) {
    var p = { "name": name, "age": age };
    return p;
}

var mp = MakePerson("Jackie", 500);

console.log(mp); // {name: "Jackie", age: 500}
console.log("mp.age: " + mp.age); // 500

// Ctrl + K + C to comment out code
// Ctrl + K + U to uncomment out code


// ARRAYS

var arr = [10, 20, 30]; 
console.log(arr); // (3) [10, 20, 30] ... only 3 elements

arr[9] = 5;  
console.log(arr); // When we define 9th index, then it changes to -> (10) [10, 20, 30, empty x 6, 5] 
                 // There will 6 empty slots.

console.log(arr[9]); // 5



x = 5; 
console.log("x: " + x); // Output: x: 5
console.log("y: " + y); // Output: y: undefined
var x; 
var y;
y = 7;

/*
 * 
 * Variables x and y will be hoisted to the top.
 * x has been initialized at the top.
 * If we print out x, we will get a value of 5.
 * But if we print out y, we will get a value of undefined,
 *  since y was not initialized before hand.
 * /

