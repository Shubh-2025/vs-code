let button = document.querySelector(".arrow")
let form = document.querySelector("form");
let email = document.querySelector("#mail");
let password = document.querySelector("#password");
let data = JSON.parse(localStorage.getItem("entry"));
let chechbox = document.querySelector(`input[type="checkbox"]`)

email.addEventListener("input",(e)=>{
    if( e.target.value && password.value)
    {
     button.disabled  = false;
     button.style.cursor = "pointer";
     button.style.backgroundColor = "darkOrange";
    }
    if( !e.target.value)
        {
         button.disabled  = true;
         button.style.cursor = "not-allowed";
         button.style.backgroundColor = "white";
        }
});
password.addEventListener("input",(e)=>{
    if( e.target.value && email.value)
    {
     button.disabled  = false;
     button.style.cursor = "pointer";
     button.style.backgroundColor ="darkOrange";
    }
    if( !e.target.value)
        {
         button.disabled  = true;
         button.style.cursor = "not-allowed";
         button.style.backgroundColor = "white";
        }
});
button.addEventListener("click",()=>{
    if(email.value.includes("@") && chechbox.checked === true){
    data = {...data,[email.value]:password.value}; // a is the key field
    localStorage.setItem("entry",JSON.stringify(data));
    }
    else{
        alert("Email should contain '@' or Mark the Confirmation !!");
    }
});