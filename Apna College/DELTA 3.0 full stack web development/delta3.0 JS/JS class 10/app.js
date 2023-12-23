// let btn = document.querySelector('button');
// console.dir(btn);
// btn.onclick = function(){
//     console.log("button clicked");
// };
// btn.onclick = function (){
//     alert("button was clicked");
// };

// ----------------------------------------------------------------------------

// let buttons = document.querySelectorAll('button');

// for (button of buttons) {
//   button.addEventListener ("click", hello);
//   button.addEventListener ("click", names);
// }

// function hello (){
//   alert("hello!");
// }
// function names (){
//   alert("rajveer rawat!");
// }

// ACTIVITY -------------------------------------------------------------------

// let btn = document.querySelector("button");
// btn.addEventListener("click", function () {
//   let h3 = document.querySelector("h3");
//   let randomColor = getRandomColor();
//   h3.innerText = randomColor ;
//   h3.style.backgroundColor = randomColor;

//   let div = document.querySelector('div');
//   div.style.backgroundColor = randomColor;

//   console.log("color Updated");
// });

// function getRandomColor() {
//   let red = Math.floor(Math.random() * 256);
//   let green = Math.floor(Math.random() * 256);
//   let blue = Math.floor(Math.random() * 256);

//   let color = `rgb(${red}, ${green}, ${blue})`;
//   return color ;
// }

// addEventListener for Elements except buttons -----------
// let p = document.querySelector('p');
// p.addEventListener("click", function(){
//   console.log("para clicked");
// });

// let box = document.querySelector('.box');
// box.addEventListener("mouseenter", function(){
//   console.log("mouse inside div.box");
// });

// this in Event listner ----------------------------------
// let btn = document.querySelector('button');

// let p = document.querySelector('p');
// let h1 = document.querySelector('h1');
// let h3 = document.querySelector('h3');

// function changeColor (){
//   console.dir(this.innerText);
//   this.style.color = "green";
//   this.style.backgroundColor = "black";
// }

// btn.addEventListener("click", changeColor);
// p.addEventListener("click", changeColor);
// h1.addEventListener("click", changeColor);
// h3.addEventListener("click", changeColor);

// btn.onmouseenter = changeColor;

// KeyboardEvent ------------------------------------------
// let btn = document.querySelector("button");
// // POinter event ---------
// btn.addEventListener("click", function (event) {
//   console.log(event);
//   console.log("single");
// });
// // MOuse event -----------
// btn.addEventListener("dblclick", function (event) {
//   console.log(event);
//   console.log("double");
// });

// KEyboard event -----------
let input = document.querySelector("input");
// // EVENT - "keydown"---------
// input.addEventListener("keydown", function (event) {
//   console.dir(event);
//   console.log(event.key);
//   console.log(event.code);
//   console.log("key was pressed");
// });
// // EVENT - "keyup"--------
// input.addEventListener("keyup", function (event) {
//   console.log(event.key);
//   console.log(event.code);
//   console.log("key was released");
// });
// UP / DOWN / RIGHT / LEFT -
// input.addEventListener("keydown", function (event) {
//     console.log("code = ", event.code);
//     if (event.code == "ArrowUp") {
//       console.log("character moves forward");
//     } else if (event.code == "ArrowDown") {
//       console.log("character moves backward");
//     } else if (event.code == "ArrowLeft") {
//       console.log("character moves left");
//     } else if (event.code == "ArrowRight") {
//       console.log("character moves right");
//     }
//   });

// FORM EVENT ---------------
// let form = document.querySelector('form');
// form.addEventListener('submit', function(e){
//   // console.log("form has submitted");
//   e.preventDefault();
//   alert("form submitted");
// });

// extracting form data -----
let form = document.querySelector("form");
form.addEventListener("submit", function (e) {
  e.preventDefault();

  // let inp = document.querySelector('input');
  // let pass = document.querySelector('#pass');

  // console.log(this.elements[0].value);  // this => form
  // console.log(this.elements[1].value);

  // console.dir(form);

  // alert(`HI ${this.elements[0].value} !, your password is set to ${this.elements[1].value}`);
});

// more events --------------
// let user = document.querySelector('#user');
// user.addEventListener('change', function(){
//   console.log('change event');
//   console.log(`final value = ${this.value}`);
// });
// user.addEventListener('input', function(){
//   console.log('input event');
//   console.log(`final value = ${this.value}`);
// });

let text = document.querySelector("#text");
let para = document.querySelector("p");

text.addEventListener("input", function () {
  console.log(text.value);
  para.innerText = text.value;
});
kkkf