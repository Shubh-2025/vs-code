import { useState } from "react"
function Practice (){
    let [counter , setCounter] = useState(0);

    let Increase =()=>{
        setCounter(counter+1);
    }
    let Decrease=()=>{
        setCounter(counter-1);
    }
    return (
        <>
            <h1>Counter : {counter} </h1>
            <button onClick={Increase}>increase</button>
            <button onClick={Decrease}>decrease</button> 
        </>
    )
}
export default Practice