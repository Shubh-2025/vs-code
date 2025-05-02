let express = require("express");
let cors = require("cors");

let app = express();
app.use(cors());

let jokes = [
    "Why don't scientists trust atoms? Because they make up everything!",
    "I told my computer I needed a break, and it said 'No problem — I'll go to sleep.'",
    "Why did the scarecrow win an award? Because he was outstanding in his field!",
    "Why do Java developers wear glasses? Because they can't C#.",
    "Parallel lines have so much in common… it’s a shame they’ll never meet.",
    "What do you call fake spaghetti? An impasta!",
    "Why did the math book look sad? Because it had too many problems.",
    "What do you get when you cross a snowman with a vampire? Frostbite!",
    "Why can't you trust stairs? They're always up to something.",
    "I asked the gym instructor if he could teach me to do the splits. He replied, 'How flexible are you?' I said, 'I can’t make it on Tuesdays.'",
    "Why did the bicycle fall over? Because it was two-tired!",
    "What do you call cheese that isn't yours? Nacho cheese.",
    "Why don’t programmers like nature? It has too many bugs.",
    "I would tell you a construction joke… but I’m still working on it.",
    "Why did the cookie go to the hospital? Because it felt crummy.",
    "Why can't your nose be 12 inches long? Because then it would be a foot!",
    "Why did the computer go to therapy? It had a hard drive.",
    "Why did the chicken join a band? Because it had the drumsticks!",
    "Why don’t skeletons fight each other? They don’t have the guts.",
    "I'm reading a book on anti-gravity — it's impossible to put down!"
];

app.get("/jokes",(request,response)=>{
    let r = Math.floor(Math.random()*20);
    response.send(jokes[r]);
});
app.listen(5000,()=>{
    console.log("App is running on port 5000");
});