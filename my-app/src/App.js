"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
require("./App.css");
var React = require("react");
var core_1 = require("@material-ui/core");
// import Header from './component/Header';
function App() {
    return (React.createElement("div", { className: "App" },
        React.createElement(core_1.Button, { color: "primary", variant: "contained" }, "PRESS ME"),
        React.createElement(core_1.TextField, { id: "name", label: "Name", variant: "outlined" }),
        React.createElement(core_1.TextField, { id: "username", label: "Username", variant: "outlined" }),
        React.createElement(core_1.TextField, { id: "password", label: "Password", variant: "outlined" })));
}
exports.default = App;
