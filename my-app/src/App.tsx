import * as React from 'react';
import {Button, TextField} from '@material-ui/core';
import Header from './component/header';
import './App.css'

function App() {
  return (
    <div className="App">
      <h1>Hey There</h1>
      <Header text="What DO YOU KNow ABout The WORLDS??????????"/>
      <Button color="primary" variant="contained">PRESS ME</Button>
      <TextField id="name" label="Name" variant="outlined" />
      <TextField id="username" label="Username" variant="outlined" />
      <TextField id="password" label="Password" variant="outlined" />
    </div>
  );
}

export default App;
