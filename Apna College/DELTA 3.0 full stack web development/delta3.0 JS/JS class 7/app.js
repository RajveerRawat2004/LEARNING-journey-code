// // this keyword ------------------------------------------------------------------------------
// let student = {
//     name : "shradha",
//     age : 23,
//     eng : 95,
//     math: 93,
//     phy : 97,
//     getAvg (){
//         console.log(this);
//         let average = (this.eng + this.phy + this.math)/3;
//         console.log(`${this.name} got avg marks = ${average}`);
//     }
// }

// // try and catch -----------------------------------------------------------------------------
// console.log("hello");
// console.log("hello");
// try {
//     console.log(a,b ,c ,d ,e);
// }
// catch (e) {
//     console.log("there is an error that is");
//     console.log(e);
// }
// console.log("hello2");
// console.log("hello2");

// // arrow functions----------------------------------------------------------------------------


// // practice questions -----------
// // PQs1.
// // let square = (n) => (n * n);
// let square = n => n * n;
// console.log(square(5));

// // PQs2.
// let id = setInterval(() => {
//     console.log("hello world");
// }, 2000);

// setTimeout ( () => {
//     clearInterval(id);
//     console.log("clear interval ran");
// }, 10000);

// // ASSIGNMENT QUESTIONS-----------------------------------------------------------------------
// // Qs1.

// const array = [1,2,3,4,5,6];
// const arrayAverage = (arr) => {
//     let total = 0;
//     for (let i=0; i<arr.length; i++ ){
//         total += arr[i];
//     }
//     let average = total/arr.length;
//     return average;
// }

// console.log(arrayAverage(array));

// // Qs2.

// let isEven = (n) => {
//     if ( n%2 == 0 ){
//         return "even";
//     }else {
//         return "not a even";
//     }
// };

// console.log(isEven(46));

// const isEven2 = n => n%2 == 0 ;
// console.log(isEven2(46));

const object = {
    message : 'Hello,World!',
    logMessage(){
        console.log(this.message);
    }
};

// code A
setTimeout ( object.logMessage, 1000 );
// code B
setTimeout ( object.logMessage(), 1000 );

// Qs3. only understandable
// Qs4. only understandable