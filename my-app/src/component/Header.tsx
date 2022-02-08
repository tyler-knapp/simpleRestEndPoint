import * as React from "react";
import '../index.css'

//props are a way to pass data to component from parent. Static data.
function Header(props){
    return (
        <h1 className="primary-header">{props.text}</h1>
    );
}

export default Header;