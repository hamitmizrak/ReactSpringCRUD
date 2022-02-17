import React from "react";
import "./App.css";//router
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";//router

import HeaderComponent from "./components/HeaderComponent";//HeaderComponent
import FooterComponent from "./components/FooterComponent";//FooterComponent

import ListEmployeeComponent from "./components/ListEmployeeComponent";//ListComponent
import CreateEmployeeComponent from "./components/CreateEmployeeComponent";//CreateComponent
import ViewEmployeeComponent from "./components/ViewEmployeeComponent";//ViewComponent

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />  //HEADER
        <div className="container">
          <Switch>
            <Route path="/" exact component={ListEmployeeComponent}></Route>/* listCompoent  */
            <Route path="/employees" component={ListEmployeeComponent}></Route>/* listCompoent */
            <Route path="/add-employee/:id" component={CreateEmployeeComponent}></Route>/* CreateComponent */
            <Route path="/view-employee/:id" component={ViewEmployeeComponent}></Route>/* ViewComponent */
          </Switch>
        </div>
        <FooterComponent /> //HEADER
      </Router>
    </div>
  );
}

export default App;
