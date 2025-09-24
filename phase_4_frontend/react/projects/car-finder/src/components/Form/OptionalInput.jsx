const OptionalInput = ({
  id,
  label,
  value,
  onValueChange,
  min = 0,
  max = 1000,
  step = 1,
  defaultValue = 10,
}) => {
  const handleCheckboxChange = (e) => {
    if (e.target.checked) {
      onValueChange(value > 0 ? value : defaultValue);
    } else {
      onValueChange(0);
    }
  };

  const handleInputChange = (e) => {
    onValueChange(Number(e.target.value));
  };

  const isActive = value > 0;

  return (
    <div style={{ marginBottom: "1rem" }}>
      <label>
        <input
          type="checkbox"
          checked={isActive}
          onChange={handleCheckboxChange}
        />
        {label}
      </label>

      <input
        type="number"
        min={min}
        max={max}
        step={step}
        value={value}
        disabled={!isActive}
        onChange={handleInputChange}
        style={{ marginLeft: "1rem", width: "100px" }}
      />
    </div>
  );
};

export default OptionalInput;
