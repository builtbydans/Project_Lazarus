import React from "react";
import { mockData } from "../mockData";

const Results = () => {
  return (
    <div>
      {mockData.map(
        ({ car, averageInsurance, financePrice, fuelCosts, index }) => {
          const totalPCM =
            parseInt(averageInsurance) +
            parseInt(financePrice.pcp) +
            parseInt(fuelCosts);
          return (
            <div>
              <p>car: {car}</p>
              <p>insurance: {averageInsurance}</p>
              <p>finance (pcp): {financePrice.pcp}</p>
              <p>finance (hp): {financePrice.hp}</p>
              <p>fuel: {fuelCosts}</p>
              <h3>Total: £{totalPCM} per month</h3>
              <hr />
            </div>
          );
        }
      )}
    </div>
  );
};

export default Results;
