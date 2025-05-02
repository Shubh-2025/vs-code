// Date is an object in javascript.
// Time is calculated in js since 1970.
//------------------------------------------------------------
// sunday monday tuesday wednesday thursday friday saturday --
//    0      1      2        3        4       5       6     --
//------------------------------------------------------------
//===============================================================================================================
// JAN[0] , FEB[1] , MAR[2] , APR[3] , MAY[4] , JUN[5] , JUL[6] , AUG[7] , SEP[8] , OCT[9] , NOV[10] , DEC[11] ==
//===============================================================================================================

   let myDate = new Date();
// let myDate = new Date("2023-01-14");(YYYY-MM-DD)
// let myDate = new Date("01-14-2023");(MM-DD-YYYY)
   let specificDate = new Date(2025,1,2);
// console.log(specificDate.toDateString());
// console.log(specificDate.getDay()); 
// console.log(specificDate.getUTCFullYear());
// console.log(myDate);                                         // 2025-01-31T13:05:57.829Z
// console.log(`toDateString: ${myDate.toDateString()}`);       // Fri Jan 31 2025
// console.log(`toString: ${myDate.toString()}`);               // Fri Jan 31 2025 18:35:57 GMT+0530 (India Standard Time)
// console.log(`toLocalestring: ${myDate.toLocaleString()}`);   // 31/1/2025, 6:35:57 pm


//TIMESTAMPS

let currentTime = Date.now(); // miliseconds
console.log(currentTime);
let currTimeInSeconds = Math.floor(currentTime/1000); // "seconds" conversion
console.log(currTimeInSeconds);
let currTimeInMinutes = Math.floor(currTimeInSeconds/60); // "minutes conversion"
console.log(currTimeInMinutes);
