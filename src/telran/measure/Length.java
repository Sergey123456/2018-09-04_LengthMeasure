package telran.measure;

public class Length {
	private float number;
	private LengthUnit unit;
	public Length(float number, LengthUnit unit) {
		this.number = number;
		this.unit = unit;
	}
	public float getNumber() {
		return number;
	}
	public void setNumber(float number) {
		this.number = number;
	}
	public LengthUnit getUnit() {
		return unit;
	}
	public void setUnit(LengthUnit unit) {
		this.unit = unit;
	}
	@Override
	public String toString(){
		return ""+(int)number+unit;
	}
	public Length plus(Length length) {
		return new Length(this.number + convert(unit).number, this.unit);
	}
	public Length minus(Length length) {
		return new Length(this.number - convert(unit).number, this.unit);
	}
	public Length convert(LengthUnit otherUnit) {
		return new Length(this.unit.getValue() * this.getNumber() 
				/ otherUnit.getValue(), otherUnit);
	}
	@Override
	public boolean equals(Object obj){
		Length length=(Length)obj;
		return Float.compare(number, length.number)==0 && unit==length.unit;
	}
}
