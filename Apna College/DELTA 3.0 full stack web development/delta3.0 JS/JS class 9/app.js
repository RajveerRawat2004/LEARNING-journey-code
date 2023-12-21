// let newImg = document.getElementsByClassName("oldImg");

// for (let i = 0; i < newImg.length; i++) {
//   newImg[i].src = "assets/creation_1.png";
//   console.log(`you have changed img of index ${i}`);
// }

// practice Question -------------------------------------------------------------
// // Qs- A --------------------
// let body = document.querySelector('body');
// let para = document.createElement('p');
// para.innerText = "Hey i am red!";
// para.classList.add('redColor');
// body.append(para);

// // Qs- B --------------------
// let heading = document.createElement('h3');
// heading.innerText = "I'm blue h3!";
// heading.classList.add('blueColor');
// body.append(heading);

// // Qs- C --------------------
// let div = document.createElement('div');
// div.classList.add('borderblack', 'bgpink', 'padding15');
// body.prepend(div);

// let heading2 = document.createElement('h1');
// heading2.innerText = "I'm in a div";
// div.append(heading2);

// let para2 = document.createElement('p');
// para2.innerText = "ME TOO!";
// div.append(para2);

// ASSIGNMENT QUESTIONS -------------------------------------------------------
// Qs- 1 --------------------
let input = document.createElement('input');
let button = document.createElement('button');
let body = document.querySelector('body');

button.innerText = " click ME!";
body.append(input);
body.append(button);

// Qs- 2 --------------------
input.setAttribute('placeholder', 'USERNAME');
button.setAttribute('id', 'btn');

// Qs- 3 --------------------
let btn = document.querySelector('#btn');
btn.classList.add("bgblueAndColorwhite");

// Qs- 4 --------------------
let h1 = document.createElement('h1');
h1.innerHTML = "DOM practice";
h1.classList.add("underlineAndPurplecolor");
document.querySelector('body').append(h1);

// Qs- 5 --------------------
let p = document.createElement('p');
p.innerHTML = `Apna College <b> Delta </b> Practice`;
document.querySelector('body').append(p);
