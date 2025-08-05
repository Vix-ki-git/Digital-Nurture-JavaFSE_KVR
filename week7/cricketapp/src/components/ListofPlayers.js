import React from 'react';

function ListofPlayers({players}) {
    return (
        <div>
            <p><strong>List of Players: </strong></p>
            {
                players.map(
                    (player, index ) => (
                        <li key={index}>Mr.{player.name}<span> {player.score}</span></li>
                    )
                )
            }
            
        </div>
        
    );
    
}

export default ListofPlayers;