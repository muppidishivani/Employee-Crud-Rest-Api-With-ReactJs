import { useRef,useState } from "react";
import axios from "axios";
const UpdateEx=()=>{
    const[res,setRes]=useState([]);
    const ref1=useRef(null);
    const ref2=useRef(null);
    const ref3=useRef(null);
    
    const Post_data=()=>{
     PostEx();
    }
    const PostEx=async()=>
    {
        const res= await axios.put("http://localhost:9001/update/260",{"empNo":ref1.current.value,"empName":ref2.current.value,"salary":ref3.current.value});
        const {data}=res;
        setRes(data);
    }
   return(
    <>
    <h2>UPDATE EMPLOYEE DATA HERE</h2>
    Employee No:<input type="text" ref={ref1}></input><br></br>
    Employee Name:<input type="text" ref={ref2}></input><br></br>
     salary:<input type="number" ref={ref3}></input><br></br>
     <button onClick={Post_data}>Post</button>
     <p>{JSON.stringify(res)}</p>
    </>
   )
}
export default UpdateEx;