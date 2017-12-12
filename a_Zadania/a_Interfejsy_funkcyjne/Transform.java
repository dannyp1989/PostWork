package a_Zadania.a_Interfejsy_funkcyjne;

@FunctionalInterface
public interface Transform<T, S> {

	T transform(S s);
	
}
