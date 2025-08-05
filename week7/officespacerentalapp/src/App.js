import './App.css';
import OfficeList from './components/officeList';
function App() {
  const offices = [
    { Name: 'DBS', Rent: 50000, Address: 'Chennai', img: 'https://www.livemint.com/lm-img/img/2023/04/11/1600x900/2-0-629752197-dbs1-0_1680256821591_1681229388956_1681229388956.jpg' },
    { Name: 'Cogizant', Rent: 65000, Address: 'Hyderabad', img: 'https://placementdrive.in/wp-content/uploads/2024/08/Cognizant-nnn.jpg' },
  ];
  return (
    <div className="App">
      <OfficeList offices={offices}/>
    </div>
  );
}

export default App;
