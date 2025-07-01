export function App() {
  let css = {backgroundColor:"skyblue",
    textAlign:"center"
  };
  
  function click(){
    let name = document.querySelector("input[type=text]");
    let email = document.querySelector("input[type=email]");
  
    console.table({name:name.value,email:email.value});
    name.value=email.value="";
  }

  return (
    <>
     <div className="h-screen w-full flex flex-col items-center justify-center" style={css}>
        <h1 className="text-3xl text-cyan-700 " >REGISTER</h1><br />
        <input type="text" placeholder='Enter your name' className=" rounded m-2 p-2 center justify-center" style={{backgroundColor:"white"}}/>
        <input type="email" placeholder='Enter email' className=" rounded m-2 p-2 justify-center" style={{backgroundColor:"white"}}/>
        <button onClick={click} className='rounded p-2 m-2 border-2 w-20 bg-amber-200 text-black cursor-pointer'>click</button>
      </div>
    </>
  )
}

