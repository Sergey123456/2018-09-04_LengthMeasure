package telran.measure;

public enum LengthUnit {
	MM(1f),CM(10f),IN(25.4f),FT(304.8f),M(1000f);
	private float value;
	private LengthUnit(float value){
		this.value=value;
	}
	public float getValue(){
		return value;
	}
	public float between(Length l1, Length l2){
		Length newL1 = l1.convert(this);
		Length newL2 = l2.convert(this);
		
		return newL2.getNumber() - newL1.getNumber();
	}
	
}
