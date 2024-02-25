import React, { useState, useEffect } from 'react';
import axios from 'axios';

const GetOneRecord= () => {
  const [record, setRecord] = useState(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    // Replace 'your-api-endpoint' with the actual endpoint of your REST API
     // Assuming you want to fetch record with ID 1

    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:9001/get/275');
        setRecord(response.data);
      } catch (error) {
        setError(error.message);
      }
    };

    fetchData();
  }, []); // Empty dependency array to ensure the effect runs only once when the component mounts

  if (error) {
    return <div>Error: {error}</div>;
  }

  if (!record) {
    return <div>Loading...</div>;
  }

  return (
    <div>
        <h2>GET ONE EMPLOYEE RECORD</h2>
      <h2>Record Details</h2>
      <p>ID: {record.empId}</p>
      <p>NAME: {record.empName}</p>
      <p>SALARY: {record.salary}</p>
       <p>TA: {record.ta}</p>
       <p>DA: {record.da}</p>
       <p>HRA: {record.hra}</p>
       <p>PF: {record.pf}</p>
       <p>GROSSSAL: {record.grosssal}</p>
       <p>NETSAL: {record.netsal}</p>
      
      {/* Display other properties of the record */}
    </div>
  );
};

export default GetOneRecord;