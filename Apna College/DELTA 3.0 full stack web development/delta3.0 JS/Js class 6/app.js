function hello (){
    console.log("hello");
}

hello();

function printName(){
    console.log("Rajveer Rawat");
    console.log("web development");
}

printName();

function print1to5 () {
    for(let i=1; i<=5; i++){
        console.log(i);
    }
}

print1to5();

function isAdult () {
    let age = 18;
    if (age >= 18){
        console.log("adult");
    }
    else{
        console.log("not adult");
    }
}

isAdult();

// practice question 1 -----------------------------------------------------------------
function printPoem (){
    console.log("------   Twinkle Twinkle little star  -------");
    console.log("------   How i wonder what you are    -------");
    console.log("------   Up above the world so high   -------");
    console.log("------   Like a diamond in the sky    -------");
}

printPoem();

// practice question 2 -----------------------------------------------------------------
function rollDice () {
    let result = Math.floor(Math.random() * 6) + 1;
    console.log(result);
}

rollDice();

function printName2 (name){
    console.log(name);
}

printName2 ("rajveer");
printName2 ("rajveer rawat");

function printInfo (name, age){
    console.log(`${name} is ${age} years old.`);
}

printInfo("rajveer rawat", 19);

// practice question 3 -----------------------------------------------------------------
function calcAverage (a, b, c){
    let average = (a + b + c)/3;
    console.log(average);
}

calcAverage(3,4,5);

// practice question 4 ------------------------------------------------------------------
function table (n){
    for (let i=n; i<=n*10; i+=n){
        console.log(i);
    }
}

table(5);

// practice question 5 ------------------------------------------------------------------
function getSum (n){
    let sum = 0;
    for (let i=1; i<=n ; i++){
        sum += i;
    }
    return n;
}

getSum(5);

// practice question 6 ------------------------------------------------------------------
function concatinate (arr){
    let ans ="";
    for (varOfArr  of arr) {
        ans += varOfArr+" ";
    }
    // for (let i=0 ; i<arr.length; i++){
    //     ans += arr[i]+" ";
    // }
    return ans+"!";
}

console.log(concatinate(["ram", "ji", "ki", "jai", "bolo"]));

// function expressions ------------------------------------------------------------------
const sum = function (a, b) {
    return a+b;
}

console.log (sum(3,4));

// high order functions ------------------------------------------------------------------
let greet = function (){
    console.log("hello");
}

greet();

function multipleGreet (func, count){
    for (let i = 1; i < count; i++) {
       func();
    }
}

// multipleGreet(greet, 300);

// return a function ----------------------------------------------------------------------
let odd = function (n){
    console.log(!(n%2 == 0));
}

let even = function (n){
    console.log(n%2 == 0);
}

let request = "even";
function oddOrEvenFactory (request){
    if (request == "odd" ){
        // console.log(odd);
        let odd = function (n){
            console.log(!(n%2 == 0));
        }        
        return odd ;
    }
    else if ( request == "even"){
        let even = function (n){
            console.log(n%2 == 0);
        }
        return even ;
    }
    else {
        console.log ("wrong request");
    }
}

// methods --------------------------------------------------------------------------------
// syntax A
const math = {
    num : 55 ,
    add : function (a, b) {
        return a + b;
    },
    sub : function (a, b) {
        return a - b;
    },
    mul : function (a, b) {
        return a * b;
    }
};

// syntax B
const math1 = {
    add(a,b){
        return a+b;
    },
    sub(a,b){
        return a-b;
    },
    mul(a,b){
        return a*b;
    }
};

// ASSIGNMENT QUESTIONS -------------------------------------------------------------------
// Qs1.

// let arr = [454,454,545,45,45,4,54,54,5,5465,654,654,5,45,4,654,65,46,54,5,4,65,44,54,465,461,321,5,798,132,16,518,79,8,32,34,98,745,1,.21,987,413,232,74,9];
// let num = 50;
// function largeNumbers (arr, num){
//     for (let i=0; i<arr.length; i++) {
//         if (arr[i] > num){
//             console.log(arr[i]);
//         }
//     }
// }

// console.log(largeNumbers(arr, num));

// Qs2.
let str = "abcdabcdefgggh";
function getUnique (string){
    let ans ="";
    for (let i=0; i<string.length; i++){
        if (ans.indexOf(string[i]) == -1){
        // if (!ans.includes(string[i])){
            ans += string[i];
        }
    }
    console.log(ans);
}
getUnique(str);

// Qs3.
let country = ["Australia","Germany","UnitedStatesofAmerica"];
function largest (country){
    let ans = "";
    for (let i=0; i<country.length; i++){
        if(country[i].length > ans.length){
            ans = country[i];
        }
    }
    console.log(ans);
}
largest(country);

// Mam's solution
let country1 = ["Australia","Germany","UnitedStatesofAmerica"];
function largest1 (country){
    let ansIdx = 0;
    for (let i=0; i<country1.length; i++){
        ansLength = country[ansIdx].length;
        let curLength = country[i].length;
        if(curLength > ansLength){
            ansIdx = i;
        }
    }
    console.log(country1[ansIdx]);
}
largest1(country1);

// Qs4.
let str1 = "apnacollege";
function countVowels (str1){
    let count = 0;
    for(let i=0; i<str1.length; i++){
        if(
            str1.charAt(i)=="a" ||
            str1.charAt(i)=="e" ||
            str1.charAt(i)=="i" ||
            str1.charAt(i)=="o" ||
            str1.charAt(i)=="u"
        ){
            count++;
        }
    }
    return count;
}
console.log(countVowels(str1));

// Qs5.
function genrateRandom (start, end){
    let diff = end-start;
    let ans = Math.floor(Math.random() * diff) + start;
    return ans;
}
console.log(genrateRandom(40, 45));