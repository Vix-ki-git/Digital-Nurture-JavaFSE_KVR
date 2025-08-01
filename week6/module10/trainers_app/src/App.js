import './App.css';
import React from 'react';
import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import TrainerList from './TrainerList';
import TrainersDetails from './TrainerDetail';
import trainersMock from './TrainersMock';

import Home from './Home';

function App() {
  return (
   <div>
    <Router>
      <div>
      <h1>My Academy Trainers App</h1>
        <nav>
          <ul>
            <li><Link to="/home">Home</Link></li>
            <li><Link to="/trainers">Trainers</Link></li>
          </ul>
        </nav>


        <Routes>
          <Route path="/home" element={<Home/>}/>
          <Route path="/trainers" element={<TrainerList trainers={trainersMock}/>}/>
          <Route path="/trainers/:id" element={<TrainersDetails trainers={trainersMock}/>}/>
          
          <Route path="*" element={<h2>Path Not Found</h2>}/>
        </Routes>
      </div>
    </Router>
   </div>
  );
}

export default App;
