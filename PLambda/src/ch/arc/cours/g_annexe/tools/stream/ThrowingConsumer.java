
package ch.arc.cours.g_annexe.tools.stream;

@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception>
	{

	void accept(T t) throws E;
	}
