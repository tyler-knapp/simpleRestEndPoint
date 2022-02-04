"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var React = require("react");
var ReactDOM = require("react-dom");
var App_1 = require("./App");
ReactDOM.render(React.createElement("div", null,
    React.createElement(App_1.default, null),
    React.createElement("h1", null, "This is PHILO DELIGHT"),
    React.createElement("p", null, "This is a paragraph"),
    React.createElement("a", { href: "www.google.com" }, "Click Me")), document.querySelector("#root"));
