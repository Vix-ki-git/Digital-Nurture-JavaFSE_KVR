import React, {useState} from 'react';

function CurrencyConverter() {
    const [amount, setAmount] = useState('');
    const [currency, setCurrency] = useState('Euro');

    const handleSubmit = (e) => {
        e.preventDefault();
        if(currency == 'Euro') {
            var rupee_to_euro = parseFloat(amount) * 101;
            alert(`Converting to Euro Amount is ${rupee_to_euro}`);
        }
    }
    return(
        <div>
            <h2 style={{color: "green"}}>Currency Converter!!!</h2>
            
            <form onSubmit={handleSubmit}>
                <label>Amount: </label>
                <input
                type="number"
                value={amount}
                onChange={(e) => setAmount(e.target.value)} />
                <br /><br />

                <label>Currency: </label>
                <input type="text" value={currency} onChange={(e) => setCurrency(e.target.value)}/>
                <br /><br />

                <button type="submit">Submit</button>
            </form>
        </div>
    );
}

export default CurrencyConverter;