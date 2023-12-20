// const arr = [1, 2, 3, 4, 5, 6, 7];

// let finalValue = arr.reduce((result, element) => {
//   console.log(result);
//   return result + element;
// });
// console.log(finalValue);

// const arr2 = [
//   1, 2, 345, 45, 4, 788, 2, 1, 33, 8, 7, 99, 5, 4, 454, 8, 7, 545, 4, 78, 5, 21,
//   2, 87, 85, 4, 578, 7, 415, 45, 74, 84, 54, 5, 7487, 4, 5, 6, 7,
// ];
// let ans = arr2.reduce((max, element) => {
//   if (max < element) {
//     return element;
//   } else {
//     return max;
//   }
// });
// console.log(ans);

// const arr3 = [10, 20, 30, 40, 50, 60, 70];
// let ans2 = arr3.every((element) => element % 10 == 0);
// console.log(ans2);

// function getMin(arr) {
//   let ans3 = arr4.reduce((min, element) => {
//     if (min < element) {
//       return min;
//     } else {
//       return element;
//     }
//   });
//   return ans3;
// }
// const arr4 = [45, 55, 55, 45, 45, 85, 263, 87, -35];
// console.log(getMin(arr4));

// function sum(a, b = 0) {
//   return a + b;
// }

// const arr5 = [1, 2, 3, 4, 5, 6, 7];

// const data = {
//   name: " rajveer rawat ",
//   email: "rajveer@email.com",
// };
// const datacopy = {
//   ...data,
//   id: 124,
// };

// const arr6 = [1, 2, 3, 4, 5, 6, 7];
// function min(...args) {
//   let ans = args.reduce((min, element) => {
//     if (min < element) {
//       return min;
//     } else {
//       return element;
//     }
//   });
//   return ans;
// }
// console.log(min(1, 2, 3, 4, 5, 6, 7));

// function winners(...args) {
//   let [winner, runnerup, ...others] = args;
//   console.log(winner);
//   console.log(runnerup);
//   console.log(others);
//   return winner;
// }

// console.log(winners("rajveer", "sunil", "karan", "dheerendra", "punit"));

// const info = {
//   name: "rajveer",
//   id: 45,
//   city: "gwalior",
//   country: "india",
// };

// let { fullname, country } = info;
// let { name: naam = " no name", country: nationality } = info;

// ASSIGNMENT QUESTIONS --------------------------------------------------------------------------------
// Qs1. -------------------------------------------------------------

let nums = [
  1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
];

// MY SOLUTION ------------------------
// let square = (nums) => {
//   for (const element of nums) {
//     console.log(element * element);
//   }
// };
// let sum = (nums) => {
//   for (const element of nums) {
//     let sum = 0;
//     sum = sum + element;
//   }
//   return sum;
// };
// let avg = sum(nums) / nums.length;

// MAM SOLUTION -----------------------
let square = nums.map((num) => num ** 2);
console.log(square);
let sum = nums.reduce((sum, num) => sum + num);
console.log(sum);
let average = sum / nums.length;
console.log(average);

// Qs2. -------------------------------------------------------------

let new5 = nums.map((num) => num + 5);
console.log(new5);

// Qs3. -------------------------------------------------------------
let names = ["adam", "bob", "catlyn", "donald", "eve"];
console.log(names.map((element) => element.toUpperCase()));

// Qs4. -------------------------------------------------------------
// MY SOLUTION ------------------------
let doubleAndReturnArgs = (arr, ...args) => {
  let ans = arr.concat(args.map((num) => num * 2));
  return ans;
};
console.log(doubleAndReturnArgs([1, 2, 3, 4, 5], 6, 7, 8, 9, 10, 11, 12));

// MAM SOLUTION -----------------------
let doubleAndReturnArgs1 = (arr, ...args) => [
  ...arr,
  ...args.map((n) => n * 2),
];
console.log(doubleAndReturnArgs([1, 2, 3], 8, 9, 10));

// Qs5. -------------------------------------------------------------
const obj1 = {
    name: "rajveer",
    class: 12
}
const obj2 = {
    name: "raja",
    class: 13
}
let mergeObjects = (obj1, obj2) => {
    let ans = {...obj1,...obj2};
}
// practice again --------------------------------------------------------------------------------------
