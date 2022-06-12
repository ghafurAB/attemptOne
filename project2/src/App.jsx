import Navbar from './components/Navbar';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Create from './components/Create';
import Home from './components/Home';
import Sorted from './components/Sorted';



function App() {
  return (

      <Router>
        <div className="App">
          <Navbar />
          <div className="content">
            <Switch>
              <Route exact path="/">
                <Home />
              </ Route>
              <Route exact path="/create">
                <Create />
              </ Route>
              <Route exact path="/sorted">
                <Sorted />
              </ Route>
            </Switch>
          </div>
        </div>
      </Router>
    
    
  );
}

export default App;
