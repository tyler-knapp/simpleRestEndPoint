
import './App.css';
import {Button, TextField} from '@material-ui/core';

function App() {
  return (
    <div className="App">
      <Button color="primary" variant="contained">PRESS ME</Button>
      <TextField id="name" label="Name" variant="outlined" />
    </div>
  );
}

export default App;
