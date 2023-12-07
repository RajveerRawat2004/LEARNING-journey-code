// console.log
console.log("hello javaScript world")
let a = "rajveer";
let b = "rawat";

// template literals
console.log(`my name is ${a+b} |`);
let c = 5;
let d = 10;

// arithmetic operators
console.log(c+d);
console.log(c-d);
console.log(c*d);
console.log(c/d);
console.log(c%d);
console.log(c*d);

// unary operators
console.log(c++);
console.log(++c);

// Assignment operators
c=45;
c*=0.5;
c/=5;

// comparison operators
console.log(c<18);
console.log(c>18);
console.log(c>=18);
console.log(c<=18);
console.log(c==b);
console.log(c!=b);

console.log(5=="5");
console.log(5==="5");

// none numbers comparison
// console.log(r<R);

// if Exercise
let light;
light="green";
if(light=="red"){
    console.log("Wait! signal is red");
}
if(light=="yellow"){
    console.log("ready to go");
}
if(light=="green"){
    console.log("you can go");
}

// else if
let light1;
light1="green";
if(light1=="red"){
    console.log("Wait! signal is red");
}
else if(light1=="yellow"){
    console.log("ready to go");
}
else if(light1=="green"){
    console.log("you can go");
}

// else 
let light2;
light2="black";
if(light2=="red"){
    console.log("Wait! signal is red");
}
else if(light2=="yellow"){
    console.log("ready to go");
}
else if(light2=="green"){
    console.log("you can go");
}
else{
    console.log("light is off");
}

// else if and else Exercise
let size;
size="L";
if(size==="XL"){
    console.log("your popcorn price is 250");
}
else if(size==="L"){
    console.log("your popcorn price is 200");
}
else if(size==="M"){
    console.log("your popcorn price is 100");
}
else if(size==="S"){
    console.log("your popcorn price is 50");
}
else{
    console.log("your popcorn is free");
}

// nested if else
let marks ;
marks = 3;
if(marks>=33){
    console.log("you are passed");
    if(marks>=90){
        console.log("your grade is A+")
    }else if(marks>=80){
        console.log("your grade is A")
    }else if(marks>=70){
        console.log("your grade is B+")
    }else if(marks>=60){
        console.log("your grade is B")
    }else{
        console.log("your grade is c")
    }
}else{
    console.log("you are not qualify\n better luck next time!")
}

// Exerciese logical operator
let x;
x="apna college";
if (x[0]==="a" && x.length>3){
    console.log("Good")
}else{
    console.log("not good")
}

// Exercise switch statement
let day;
day = 1;
switch(day){
    case 1 : console.log("monday");
    break;
    case 2 : console.log("tuesday");
    break;
    case 3 : console.log("wednesday");
    break;
    case 4 : console.log("thursday");
    break;
    case 5 : console.log("friday");
    break;
    case 6 : console.log("saturday");
    break;
    case 7 : console.log("sunday");
    break;
    default: console.log("this is not a day number");
}

// alerts & prompts
// alert("this site use some cookies");
// let first = prompt("what is your first name :");
// let last = prompt("what is your last name :");
// let fullName = "welcome " + first +" " + last + " !";
// alert(fullName);
// console.error("your code has an error");
// console.warn("check your code WARNING !");

// ASSIGNMENT QUESTIONS
// QUESTION 1
let num;
num = 458;
if(num%10===0){
    console.log("Good 👍");
}else{
    console.log("bad 👎");
}

// QUESTION 2
// let userName = prompt("Enter your user name :");
// let age = prompt("what is your age :");
// alert(`${userName} is ${age} year old.`);

// QUESTION 3
let yearQuarter;
yearQuarter = 2;
switch(yearQuarter){
    case 1 : console.log("Months in Quarter 1 : January, February, March"); break;
    case 2 : console.log("Months in Quarter 2 : April, May, June"); break;
    case 3 : console.log("Months in Quarter 3 : July, August, September"); break;
    case 4 : console.log("Months in Quarter 4 : October, November, December"); break;
    default : console.log("there is only 4 Quarter in a year");
}

// QUESTION 4
let str = "jrlkjdlkf";
if(str[0]==="A" || str[0]==="a" && str.length>5){
    console.log("golden string");
}else{
    console.log("not a golden string");
}

// QUESTION 5
// let largestNum = 1 ;
// if(largestNum.length <= 3){
//       console.log(largestNum);
//        largestNum++;
//     if(largestNum[0]===9 && largestNum[1]===9 && largestNum[2]===9){
//    }
// }



// QUESTION 6
let num1 = 343;
let num2 = 34593480975987;
if(num1[num1.length-1]===num2[num2.length-1]){
    console.log("last digit of numbers is same");
}else{
    console.log("last digit of numbers is not same");
}