import * as React from "react";

type HeaderProps = {
    text: string;
}

//props are a way to pass data to component from parent. Static data.
function Header(props : HeaderProps){
    return (
        //can also inline style 
        //ex) <h1 style={{fontSize: "100px"}} className="primary-header">{props.text}</h1>
        //For inline style everything that is hyphenated in normal .css files is instead camelCase
        <h1 className="primary-header">{props.text}</h1>
    );
}

export default Header;