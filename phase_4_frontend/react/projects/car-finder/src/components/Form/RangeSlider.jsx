/**
 * RangeSlider Component
 *
 * Currently implemented as a placeholder.
 * Intentionally left without rc-slider to keep dependencies lean.
 * Can be upgraded later to use `rc-slider` or a custom slider implementation.
 */

import { useState } from "react";
import Slider from "rc-slider";
import "rc-slider/assets/index.css";

const RangeSlider = ({
  min = 25,
  max = 1500,
  step = 25,
  defaultValue = [min, max],
  label,
  onChange,
}) => {
  const [range, setRange] = useState(defaultValue);

  const handleSliderChange = (val) => {
    setRange(val);
    onChange && onChange(val);
  };

  const handleMinInput = (e) => {
    const newMin = Math.min(Number(e.target.value), range[1] - step);
    const newRange = [newMin, range[1]];
    setRange(newRange);
    onChange && onChange(newRange);
  };

  const handleMaxInput = (e) => {
    const newMax = Math.max(Number(e.target.value), range[0] + step);
    const newRange = [range[0], newMax];
    setRange(newRange);
    onChange && onChange(newRange);
  };

  return (
    <div style={{ marginBottom: "2rem" }}>
      <label>{label}</label>
      <Slider
        range
        min={min}
        max={max}
        step={step}
        pushable={25}
        value={range}
        onChange={handleSliderChange}
        style={{ margin: "1rem 0" }}
      />
      <span>Min</span>
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
          value={range[0]}
          onChange={handleMinInput}
          style={{ paddingLeft: "20px" }}
        />
      </div>
      <span>Max</span>
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
          value={range[1]}
          onChange={handleMaxInput}
          style={{ paddingLeft: "20px" }} // push text so it doesn’t overlap the £
        />
      </div>
    </div>
  );
};

export default RangeSlider;
