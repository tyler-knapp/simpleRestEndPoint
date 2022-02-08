import * as React from "react";
import {Button, TextField} from '@material-ui/core';

function Form(){
    return(
        <div className="primary-form">
            <Button color="primary" variant="contained">PRESS ME</Button>
            <TextField id="name" label="Name" variant="outlined" />
            <TextField id="username" label="Username" variant="outlined" />
            <TextField id="password" label="Password" variant="outlined" />
        </div>
    )
}

export default Form;


