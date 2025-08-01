import React from 'react';
import {  useParams } from 'react-router-dom';

function TrainersDetails({trainers}) {
    const {id} = useParams();
    const trainer = trainers.find(t => t.trainerId === id);

    return (
        <div>
            <h1>Trainers Details</h1>
            <h2>{trainer.name} ({trainer.technology}) </h2>
            <p> {trainer.email}</p>
            <p>{trainer.phone}</p>
            
            {trainer.skills.map(skill => {
               return (
                <ul>
                <li>{skill}</li>
                </ul>
               ); 
            })}
        </div>
    );
}

export default TrainersDetails;