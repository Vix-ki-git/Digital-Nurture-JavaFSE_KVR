import React from 'react';

export function OddPlayers([first,, third,, fifth]) {
    return (
        <div>
            <ul>
                <li>First: {first}</li>
                <li>Third: {third}</li>
                <li>Fifth: {fifth}</li>

            </ul>
        </div>
    );
}

export function ListofIndianPlayers({players}) {
    return(
        <div>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>Mr.{player}</li>
                ))}
            </ul>
        </div>
    );
}

export function EvenPlayers([, second,,fourth,,sixth ]) {
    return (
        <div>
            <ul>
                <li>Second: {second}</li>
                <li>Fourth: {fourth}</li>
                <li>Sixth: {sixth}</li>
            </ul>
        </div>
    );
}