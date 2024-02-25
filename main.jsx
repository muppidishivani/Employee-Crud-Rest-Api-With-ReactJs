import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'
import DeleteExp from './Delete.jsx'
import GetOneRecord from './GetOne.jsx'
import GetData from './GetAllRecords.jsx'
import UpdateEx from './UpdateData.jsx'
import PostRecord from './BankData.jsx'
import App1 from './App1.jsx'
import Deposit from './Deposit.jsx'
import Withdraw from './Withdraw.jsx'
import Transfer from './Transfer'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
<Transfer />
    <Withdraw />
   <Deposit />
  <App1 />
  </React.StrictMode>,
)
