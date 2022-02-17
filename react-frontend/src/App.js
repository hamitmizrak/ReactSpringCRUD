import React from "react";
import "./App.css";//router
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";//router

import ListEmployeeComponent from "./components/ListEmployeeComponent";//ListComponent
import HeaderComponent from "./components/HeaderComponent";//HeaderComponent
import FooterComponent from "./components/FooterComponent";//Footer
import CreateEmployeeComponent from "./components/CreateEmployeeComponent";
import ViewEmployeeComponent from "./components/ViewEmployeeComponent";

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />
        <div className="container">
          <Switch>
            <Route path="/" exact component={ListEmployeeComponent}></Route>
            <Route path="/employees" component={ListEmployeeComponent}></Route>
            <Route path="/add-employee/:id" component={CreateEmployeeComponent}></Route>
            <Route path="/view-employee/:id" component={ViewEmployeeComponent}></Route>
            {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */}
          </Switch>
        </div>
        <FooterComponent />
      </Router>
    </div>
  );
}

export default App;
