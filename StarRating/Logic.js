let stars = document.querySelectorAll(".stars");
let message = document.querySelector("input[type='text']");
let j=1; //flag to keep index 
stars.forEach((star)=>{
    star.addEventListener("click",(c)=>{
        // console.log(c.target.id);
        for(k=1;k<=j;k++){ //reseting
            document.getElementById(`${String(k)}`).src = "./assets/Star.png";
        }
        for(i=1;i<=Number(c.target.id);i++){ //setting
            document.getElementById(`${String(i)}`).src = "./assets/GoldStar.png";
        }
        j=Number(c.target.id);
        message.value = `You've rated us ${j} stars`;
    });
});