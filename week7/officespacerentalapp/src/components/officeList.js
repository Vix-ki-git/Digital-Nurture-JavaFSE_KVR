import React from 'react';

function OfficeList({offices}) {
    return (
        <div>
            <h1>Office Space, at Affordable Range</h1>
            {
                offices.map((office, index) => {
                   const color = office.Rent <= 60000 ? "textRed" : "textGreen";
                   return (
                    <div key={index}>
                            <img src={office.img} width="25%" height="25%" alt="Office Space" />
                            <h1>Name: {office.Name}</h1>
                            <h3 className={color}>Rent: Rs. {office.Rent}</h3>
                            <h3>Address: {office.Address}</h3>
                    </div>
                   );
                })
            }
        </div>
    );
}

export default OfficeList;