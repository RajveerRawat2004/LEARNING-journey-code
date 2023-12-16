let student = {
    name: "shradha",
    age: 23,
    marks: 94.4
};

let student2 = ["shradha", 23, 94.4];

let item = {
    price:400,
    discount:200,
    colors:["red","green"]
};

let twitterpost = {
    username: "@rajveerrawatNDA",
    content: "today is a beautiful day",
    likes: 45,
    Comment: 23,
    share: 23
};

let obj = {
    1 : 'a',
    2 : 'b',
    null : 'c',
    undefined : 'd'
};

const classInfo = {
    aman : {
        marks : 90,
        rollNO : 234839
    },
    sradha : {
        marks : 92,
        rollNO : 234838
    },
    aman : {
        marks : 85,
        rollNO : 234837
    },
}

const classInfo2 = [
    {
        name: "rajveer",
        city: "gwalior"
    },
    {
        name: "kapil",
        city: "gwalior"
    },
    {
        name: "raja",
        city: "gwalior"
    }
];

// console.log("generate random between 1 to 100");
// let random = Math.floor(Math.random()*100)+1 ;
// console.log(random);

// console.log("generate random between 1 to 5");
// let random2 = Math.floor(Math.random()*5)+1 ;
// console.log(random2);

// console.log("generate random between 50 to 70");
// let random3 = Math.floor(Math.random()*5)+51 ;
// console.log(random3);

// GUESSING THE NUMBER GAME --------------------------------------------------------------------------

// let max = prompt("enter the max number")
// const random4 = Math.floor(Math.random() * max) + 1;
// let guess = prompt("guess the  number");

// while(true){
//     if (guess == "quit"){
//         console.log("you quit the game");
//         break;
//     }
//     if(guess == random4){
//         console.log("CONGRATS! you guess the correct number that was ",guess);
//         break;
//     }else if (guess < random4){
//         guess = prompt("HINT! : your guess was too small. please try again")
//     }
//     else {
//         guess = prompt("HINT! : your guess was too large. please try again")
//     }

//     // else {
//     //     guess = prompt("your guess was wrong. please try again")
//     // }
// }

// ASSIGNMENT QUESTIONS --------------------------------------------------------------------------
// Qs1.

// let play = prompt("enter play to play the dice");

// while(true){
//     if (play == "quit"){
//         alert("you quit the game");
//         break;
//     }
//     if (play == "play"){
//         let result = Math.floor(Math.random() * 6) + 1 ;
//         play = prompt("the dice result is "+ result+"-- enter play to play the dice again", result);
//     }
//     else{
//         break;
//     }
// }

// Qs2.

const car = {
    name: "ferrari",
    model: "roma",
    color: "gray"
};
console.log(car.name);
console.log(car["name"]);

// Qs3.

const person = {
    name: "rajveer",
    age: 19,
    city: "gwalior"
}
person.city = "New York";
person.country = "india";
person.country = "United States";
console.log(person);