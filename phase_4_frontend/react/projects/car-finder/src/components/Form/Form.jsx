import { useState } from "react";
import MaxSlider from "./MaxSlider";
import OptionalInput from "./OptionalInput";

const Form = () => {
  const [formData, setFormData] = useState({
    insurance: 0,
    fuel: 0,
    finance: 0,
    parking: 0,
    breakdown: 0,
    carWash: 0,
    servicing: 0,
    emergency: 0,
  });

  const totalPCM = Object.values(formData).reduce(
    (sum, val) => sum + Number(val || 0),
    0
  );

  const buildSubmission = () => ({
    ...formData,
    totalPCM,
  });

  const formHandler = (e) => {
    e.preventDefault();
    const submittedData = buildSubmission();
    console.log("Submitted:", submittedData);
  };

  const updateField = (field) => (val) => {
    setFormData((prev) => ({ ...prev, [field]: val }));
  };

  return (
    <section>
      <form onSubmit={formHandler}>
        <MaxSlider
          id="finance"
          label="Finance Budget"
          value={formData.finance}
          onValueChange={updateField("finance")}
        />
        <MaxSlider
          id="insurance"
          label="Insurance Budget"
          value={formData.insurance}
          onValueChange={updateField("insurance")}
        />
        <MaxSlider
          id="fuel"
          label="Fuel Budget"
          value={formData.fuel}
          onValueChange={updateField("fuel")}
          max={500}
        />

        <p>
          Optional but will help you better plan all the costs that come with
          your car
        </p>

        <OptionalInput
          id="parking"
          label="Parking Permit (£PCM)"
          value={formData.parking}
          onValueChange={updateField("parking")}
        />

        <OptionalInput
          id="breakdown"
          label="Breakdown Cover (£PCM)"
          value={formData.breakdown}
          onValueChange={updateField("breakdown")}
        />

        <OptionalInput
          id="carWash"
          label="Car Wash (£PCM)"
          value={formData.carWash}
          onValueChange={updateField("carWash")}
        />

        <OptionalInput
          id="servicing"
          label="Servicing (£PCM)"
          value={formData.servicing}
          onValueChange={updateField("servicing")}
        />

        <OptionalInput
          id="emergency"
          label="Emergency Repairs (£PCM)"
          value={formData.emergency}
          onValueChange={updateField("emergency")}
        />

        <button type="submit">Submit</button>
      </form>
      <p>Total PCM: £{totalPCM} per month</p>
    </section>
  );
};

export default Form;
