const MaxSlider = ({
  id,
  label,
  value,
  onValueChange,
  min = 0,
  max = 1500,
  step = 25,
}) => {
  const handleSliderChange = (e) => {
    onValueChange(Number(e.target.value));
  };

  const handleInputChange = (e) => {
    const num = Number(e.target.value);
    if (!isNaN(num)) {
      onValueChange(num);
    }
  };

  return (
    <div style={{ marginBottom: "1rem" }}>
      <label htmlFor={id}>
        {label} - £{value} per month
      </label>

      <input
        type="range"
        id={id}
        name={id}
        min={min}
        max={max}
        step={step}
        value={value}
        onChange={handleSliderChange}
        style={{ display: "block", width: "100%", margin: "0.5rem 0" }}
      />

      <div style={{ position: "relative", display: "inline-block" }}>
        <span
          style={{
            position: "absolute",
            left: "8px",
            top: "50%",
            transform: "translateY(-50%)",
            pointerEvents: "none",
          }}
        >
          £
        </span>
        <input
          type="number"
          id={`${id}-number`}
          value={value}
          min={min}
          max={max}
          step={step}
          onChange={handleInputChange}
          style={{ paddingLeft: "20px", width: "100px" }}
        />
      </div>
    </div>
  );
};

export default MaxSlider;
