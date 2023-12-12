// odd numbers

/*console.log("it print odd numbers that are less than 15");
console.log("method A-- by rajveer");
for(let i=1; 2*i-1<=15; i++){
    console.log(2*i-1);
}

console.log("method B-- by mam");
for (let i=1; i<=15; i=i+2){
    console.log(i);
}*/

//even numbers

/*console.log("it print even numbers that are less than 10");
console.log("method A");
for(let i=2; i<=10; i=i+2){
    console.log(i);
}
console.log("method B");
for(let i=1; 2*i<=10; i++){
    console.log(2*i);
}
console.log("it print 10 even numbers");
 for(let i=1; i<=10; i++){
    console.log(i*2);
}*/

// multiplication table of 5

/*let n = parseInt(prompt("enter number of table"));
console.log("method A");
for(let i=n; i<=n*10; i=i+n){
    console.log(i);
}
console.log("method B");
for(let i=1; i<=10; i++){
    console.log(i*n);
}*/

// nested loop of for

/*for(let i=1; i<=3; i++){
    console.log(`outer loop ${i}`);
    for(let j=1; j<=3; j++){
        console.log(j);
    }
}*/

// while loop

/*let i=1;
while(i<=5){
    console.log(i);
    i++;
}
let j=0;
while(j<=20){
    console.log(j);
    j++; // j=j+2; => for even or odd numbers
}
*/

// guess the favourite movie

/*const favouriteM = avatar;
let guessM = prompt("guess the favourite movie");
while(guessM != favouriteM){
    if(guessM != quit){
        console.log("you quit the game");
    }
    guessM = prompt("wrong guess, please try again");
}
if(guessM == favouriteM){
    console.log("you guess the movie name correct");
}*/

// break keyword

/*for(let i=1; i<=3; i++){
    if(i==3){
        console.log('BREAK is used')
        break;
    }
    console.log(i);
}*/

// loop in arrays

/*let fruits = ['mango','apple','banana','litchi','orange'];
for(let i=0; i<fruits.length; i++){
    console.log(i,fruits[i]);
}
console.log("in the reverse method");
for(let i=fruits.length-1; i>=0; i--){
    console.log(i,fruits[i]);
}*/

// nested arrays

/*let heroes = [['ironman', 'spiderman', 'thor'], ['superman', 'wonder-woman'], ['flash']];
for (let i = 0; i < heroes.length; i++) {
    console.log(`list : ${i}, ${heroes[i]}, ${heroes[i].length}`);
    for (let j = 0; j < heroes[i].length; j++) {
        console.log( `j=${j}, ${heroes[i][j]}` );
    }
}*/

// for of loops

/*let fruits = ['mango','apple','banana','litchi','orange'];
for(fruit of fruits){
    console.log(fruit);
}
for(char of "apnacollege"){
    console.log(char);
}
let heroes = [['ironman', 'spiderman', 'thor'], ['superman', 'wonder-woman'], ['flash']];
for(list of heroes){
    for (hero of list) {
        console.log(hero);
    }
}*/

// to do app

/*let todo = [];
let req = prompt("please enter your choice");
while (true) {
    if (req == quit) {
        console.log('quitting app');
        break;
    }
    if (req == list) {
        console.log("------------");
        for (let i = 0; i <= todo.length; i++) {
            console.log( i, todo[i] );
        }
        console.log("------------");
    }else if(req == "add"){
        let task = prompt('please eneter the task you want to add');
        todo.push(task);
        console.log("task added")
    }
    else if(req == "delete"){
        let idx = prompt('please eneter the task you want to remove');
        todo.splice(idx, 1);
        console.log("task removed")
    }
    else{
        console.log('wrong request')
    }
    let req = prompt("please enter your choice");
}*/

// ASSIGNMENT questions
// Qs1.

/*let arr = [1,2,3,4,5,6,2,3];
let num = 2;
for(let i = 0; i < arr.length; i++){
    if(arr[i] == num){
        arr.splice(i,1);
    }
}
console.log(arr);*/

//Qs2.

/*let number= 45646;
let ans = 0;

console.log("solution by me");

console.log("method-A");
for (let i=1; number!== 0; i++){
    if(number%10 != 0){
        ans++;
    }
    number = number-number%10;
    number = number/10;
}
console.log(ans);

console.log("method-B");
for (let i=1; number!== 0; i++){
    number = number-number%10;
    number = number/10;
    ans++;
}
console.log(ans);

console.log("solution by mam");
let number1 = 287152 ;
let count = 0;
let copy = number1 ;
while( copy > 0 ){
    count++;
    copy = Math.floor(copy/10);
}
console.log(count);*/

// Qs3.

/*let number2 = 287152;
let copy2 = number2;
let sum = 0;
while(copy2 > 0){
    let lastdigit = Math.floor(copy2%10);
    sum = sum + lastdigit;
    copy2 = copy2/10;
}
console.log(sum);*/

// Qs4.

/*let number = 0;
let factorial = 1;
for (let i = number; i>=1; i--){
    factorial = factorial*i;
}
console.log(`factorial of ${number} is : ${factorial}`);*/

// Qs5.

/*let arr = [2,5,10,4674,672,7,916,9];
let largest = 0;
for ( let i=0; i<arr.length; i++){
    if (arr[i]>largest){
        largest = arr[i];
    }
}
console.log(largest);*/