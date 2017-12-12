package a_Zadania.a_Interfejsy_funkcyjne;

public class NumberFilter implements FilterInterface<Integer>{

	@Override
	public boolean check(Integer v) {
		return v<20;
	}



}
