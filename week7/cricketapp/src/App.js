import ScoreBelow70 from './components/ScoreBelow70';
import ListofPlayers from './components/ListofPlayers';
import { EvenPlayers, ListofIndianPlayers, OddPlayers } from './components/oddEven';
import './App.css';

function App() {

  const players = [
      { name: 'Sachin', score: 95 },
      { name: 'Virat', score: 80 },
      { name: 'Rahul', score: 65 },
      { name: 'Rohit', score: 88 },
      { name: 'Dhoni', score: 90 },
      { name: 'Pant', score: 55 },
      { name: 'Ashwin', score: 60 },
      { name: 'Bumrah', score: 85 },
      { name: 'Jadeja', score: 75 },
      { name: 'Shami', score: 45 },
      { name: 'Surya', score: 99 },
    ];

  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];
  
  var flag = true;

  if(flag == true) {
    return(
      <div>
        <ListofPlayers players={players} />
        <hr/>
        <ScoreBelow70 players={players} />
      </div>
    );
  }
  else {
    return(
      <div>
        <div>
          <h1>Indian Team</h1>
          <h2>Odd Players</h2>
          {OddPlayers(IndianPlayers)}
          <hr/>
          <h2>Even Players</h2>
          {EvenPlayers(IndianPlayers)}
        </div>
        <div>
          <h3>List of Indian Players Merged: </h3>
          <ListofIndianPlayers players={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;
