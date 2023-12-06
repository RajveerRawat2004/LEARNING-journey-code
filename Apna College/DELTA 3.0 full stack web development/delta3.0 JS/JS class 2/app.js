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

