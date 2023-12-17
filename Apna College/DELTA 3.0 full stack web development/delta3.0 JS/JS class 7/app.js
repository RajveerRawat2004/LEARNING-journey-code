// this keyword ------------------------------------------------------------------------------
let student = {
    name : "shradha",
    age : 23,
    eng : 95,
    math: 93,
    phy : 97,
    getAvg (){
        console.log(this);
        let average = (this.eng + this.phy + this.math)/3;
        console.log(`${this.name} got avg marks = ${average}`);
    }
}

// try and catch -----------------------------------------------------------------------------
console.log("hello");
console.log("hello");
try {
    console.log(a,b ,c ,d ,e);
}
catch (e) {
    console.log("there is an error that is");
    console.log(e);
}
console.log("hello2");
console.log("hello2");

// arrow functions----------------------------------------------------------------------------


// practice questions -----------
// PQs1.
// let square = (n) => (n * n);
let square = n => n * n;
console.log(square(5));

// PQs2.
let id = setInterval(() => {
    console.log("hello world");
}, 2000);

setTimeout ( () => {
    clearInterval(id);
    console.log("clear interval ran");
}, 10000);

// ASSIGNMENT QUESTIONS-----------------------------------------------------------------------
