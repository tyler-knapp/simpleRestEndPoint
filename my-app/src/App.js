
import './App.css';
import {Button, TextField} from '@material-ui/core';
import Header from './component/NavBar';

function App() {
  return (
    <div className="App">
        <Button color="primary" variant="contained">PRESS ME</Button>
        <TextField id="name" label="Name" variant="outlined" />
        <TextField id="username" label="Username" variant="outlined" />
        <TextField id="password" label="Password" variant="outlined" />
    
    </div>
  );
}

export default App;
