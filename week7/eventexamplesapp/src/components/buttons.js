import React, {useState} from 'react';

function Buttons() {
    const [count, setCount] = useState(0);

    const increment = () => {
        setCount(prev => prev+1);
        alert("Hello!");
    };

    const decrement = () => {
        setCount(prev => prev-1);
        alert("Hello!");
    }
    const welcome = () => {
        alert("Welcome");
    }

    const clickMe = () => {
        alert("I was clicked.")
    }
    return(
        <div>
            <p>Count: {count}</p>
            <button onClick={increment}>Increment</button>
            <br />
            <button onClick={decrement}>Decrement</button>
            <br />
            <button onClick={welcome}>Say Welcome</button>
            <br />
            <button onClick={clickMe}>Click on me</button>
        </div>
    );
}

export default Buttons;