import { useRef,useState } from "react";
import axios from "axios";
const App=()=>{
    const[res,setRes]=useState([]);
    const ref1=useRef(null);
    const ref2=useRef(null);
    const ref3=useRef(null);
    
    const Post_data=()=>{
     PostEx()                        ;
    }
    const PostEx=async()=>
    {
        const res= await axios.post("http://localhost:9001/save",{"empNo":ref1.current.value,"empName":ref2.current.value,"salary":ref3.current.value});
        const {data}=res;
        setRes(data);
       
    }
   return(
    <>
    <h2 className="h1">INSERT EMPLOYEE DATA HERE</h2>
    Employee No:<input type="text" ref={ref1}></input><br></br>
    Employee Name:<input type="text" ref={ref2}></input><br></br>
     salary:<input type="text" ref={ref3}></input><br></br>
     <button onClick={Post_data}>Post</button>
     <p>{JSON.stringify(res)}</p>
    </>
   )
}
export default  App;