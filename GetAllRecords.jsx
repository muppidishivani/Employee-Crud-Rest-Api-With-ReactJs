import {useEffect,useState} from "react"
import axios from "axios"
const GetData=()=>{
const [arr,setArr]=useState([]);
const getData=async ()=>{
const res=await axios.get("http://localhost:9001/getAll");
const {data}=res;
setArr(data);

}
useEffect(()=>{
  getData();
},[]);
return(
  <>
  <h2>GET ALL EMPLOYEE RECORDS HERE</h2>
<div className="container mt-5">
<table className="table table-success table-bordered table-striped table-hover">
<thead>
<tr>
  <th>EMPLOYEE NO</th>
  <th>EMPLOYEE NAME</th>
  <th>SALARY</th>
  <th>TA</th>
  <th>DA</th>
  <th>HRA</th>
  <th>PF</th>
  <th>GROSS SALARY</th>
  <th>NET SALARY</th>
  
  
</tr>
</thead>
<tbody>
  {
    arr.map((element,index)=>{
      return(
<tr key={index}>
<td>{element.empNo}</td>
<td>{element.empName}</td>
<td>{element.salary}</td>
<td>{element.ta}</td>
<td>{element.da}</td>
<td>{element.hra}</td>
<td>{element.pf}</td>
<td>{element.grosssal}</td>
<td>{element.netsal}</td>

</tr>


      )
    })
  }
</tbody>
<tfoot></tfoot>
</table>
</div>
  </>
)
}
export default GetData;