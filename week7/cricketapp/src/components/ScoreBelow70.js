import React from 'react';

function ScoreBelow70({players}) {
    const playersBelow70 = players.filter(player => player.score <= 70);

    return (
        <div>
            <p><strong>List of Players Below 70 Score: </strong></p>
            <ul>
                {
                    playersBelow70.map((player, index) => (
                        <li key={index}>Mr.{player.name}<span>{player.score}</span></li>
                    ))
                }
            </ul>
            
        </div>
        
    );
}

export default ScoreBelow70;