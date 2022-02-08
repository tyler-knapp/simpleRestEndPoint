import * as React from "react";
import * as ReactDOM from "react-dom";
import App from './App';
import Header from './component/header';

ReactDOM.render(
    <div>
  
        <Header/>
        <h1>This is PHILO DELIGHT!!!</h1>
        <p>This is a paragraph 123</p>
        <a href="www.google.com">Click Me</a>
        <App/>
    </div>, 
  document.querySelector("#root")
)
