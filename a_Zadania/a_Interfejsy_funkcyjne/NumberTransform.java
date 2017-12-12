package a_Zadania.a_Interfejsy_funkcyjne;

public class NumberTransform implements Transform<Integer, Integer>{

	@Override
	public Integer transform(Integer s) {
		return s - 1;
	}
	
	

}
