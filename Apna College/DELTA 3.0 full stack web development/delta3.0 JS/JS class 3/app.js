let str = "     he     llo          ";
let strNew = str.trim();
console.log(strNew);

// practic question
// Qs1
let msg ="help";
let newMsg = msg.trim().toUpperCase();
console.log(newMsg);

// Qs2
let name = "ApnaCollege";
console.log(name.slice(4,9));
console.log(name.indexOf("na"));
console.log(name.replace("Apna","our"));

// Qs3
let newName = name.slice(4).replace("l","t");
console.log(newName);
console.log(newName.replace("l","t"));

let array = ["rajveeer", "rawat", "gwalior", "19"];

// practice Question
let months = ["january", "july", "march", "august"];

// months.shift();
// let shifted =months.shift();
// months.unshift("june");
// months.unshift(shifted);
// console.log(months);
// months.splice(3,1);

// practice question 
months.splice(0,2,"july","june");
console.log(months);

let lang = ['c', 'c++', 'html', 'javascript', 'python', 'java', 'c#', 'sql'];
console.log(lang.reverse().indexOf('javascript'));


// practice question 
let array3 = [["X",null,"O"],[null,"X",null],["O",null,"X"]];
array3[0][1]="O";

// ASSIGNMENT QUESTIONS

let arraya = [7,9,0,-2,5,4,5,6,21,5,3,];
let n=3;

// Qs1.
console.log(arraya.slice(0,n));

// Qs2.
console.log(arraya.slice(arraya.length-n));

// Qs3.
// let strs ="Jai Shree RAM";
// let strs ="";
let strs = prompt("enter a string");
if(strs.length==0){
    console.log("blank array");
}
else{
    console.log("not a blank array");
}

// Qs4.
let index = 3;
if(strs[index]===strs.toLowerCase()[index]){
    console.log("lowercase at index",index);
}
else{
    console.log("uppercase at index",index);
}

// Qs5.
console.log("Original String =",strs);
console.log("String without spaces =",strs.trim());

// Qs6.
let arra = ["hello",'a',23,64,99,-6];
let checkItem = 64;
if(arra.indexOf(checkItem)== -1){
    console.log("the elelment is appear in the array")
}
else{
    console.log("the element is not appear in the array")
}
console.log(arra.includes("64"));
// strs.includes("raj");