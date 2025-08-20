import './App.css';
import React, {useState} from 'react';


function LoginButton(props) {
  return(
    <button onClick={props.onClick} >
      Login
    </button>
  );
}

function LogoutButton(props) {
  return(
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if(isLoggedIn) {
    return <UserGreeting/>
  } else {
    return <GuestGreeting/>
  }
}

function UserGreeting() {
  return(
    <div>
      <h1><strong>Welcome back</strong></h1>
        
    </div>
    
  );
}

function GuestGreeting() {
  return(
    <div>
      <h1><strong>Please sign up.</strong></h1>
      
    </div>
    
  );
  }

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const loginClick = () => setIsLoggedIn(true);
  const logoutClick = () => setIsLoggedIn(false);
  return (
    <div className="App">
      <Greeting isLoggedIn={isLoggedIn}/>
      {
        isLoggedIn ? (
          <LogoutButton onClick={logoutClick}/>
        ) : (
          <LoginButton onClick={loginClick}/>
        )
      }
    </div>
  );
}

export default App;
