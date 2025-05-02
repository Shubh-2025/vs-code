let fs = require("fs");

console.log("this is start");
// fs.writeFileSync("./file1.txt","I'm learning backend","utf-8");
console.log("this is middle");
// const data = fs.readFileSync("./file.txt","utf-8");
// console.log(data);
console.log("this is end");

fs.readFile("./file.txt","utf-8",(error,data)=>{
    if(error) console.log("an error has occured");
    else{
    console.log(data);
    }
});
fs.appendFile("./file1.txt","\nthis is asynchronous programming",(error)=>{
    if(error)console.error("an error has occured",error);
})
fs.rm("./file1.txt",(error)=>{
    if(error)console.log("error");
    else console.log("file deleted");
})



