import * as React from 'react';

function CurrentDate(){
    const [date, setDate] =React.useState("");

    let getDate = () => {
        setDate(new Date().toDateString());
    }

    return(
        <div>
            {date}
            <button onClick={getDate}>Get The Date</button>
        </div>
    )
}

export default CurrentDate;