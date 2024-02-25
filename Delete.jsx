import axios from "axios";
import { useEffect, useRef, useState } from "react";
const DeleteData=()=>{
    const [num,setNum]=useState(null);
    const ref1=useRef(null);
    const deleteData=async ()=>{
        const res=await axios.delete("http://localhost:9001/delete/261");
        const {status}=res;
        setNum(status);
    }
    const delete_data=()=>{
        deleteData();
    }
    return(
        <>
        <h2>DELETE EMPLOYEE RECORDS HERE</h2>
        <input type="text" ref={ref1}></input> <br></br><br></br>
          <button onClick={delete_data}>DeleteRecord</button>
                   <h1>{num}</h1>
               </>
           )
       }
       export default DeleteData; 