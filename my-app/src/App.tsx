import * as React from 'react';
import CurrentDate from './component/current-date';
import Form from './component/form';
import Header from './component/header';
import NavBar from './component/NavBar';

function App() {
  return (
    <div className="App">
      <NavBar/>
      <Header text="Tell Me something I wanna know"/>
      <CurrentDate/>
      <Form/>
      
    </div>
  );
}

export default App;
