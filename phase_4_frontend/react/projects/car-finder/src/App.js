import { useState } from "react";
import "./index.css";
import Form from "./components/Form/Form";
import Results from "./components/Results";
import bmwdmpu from "./images/bmw 300x600.jpg";

const App = () => {
  return (
    <>
      <h1>Car Finder</h1>
      <div className="app">
        <div style={{ width: "30%" }}>
          <h3>Form</h3>
          <Form />
        </div>
        <div style={{ width: "70%" }}>
          <h3>Results</h3>
          <Results />
        </div>
      </div>
    </>
  );
};

export default App;
