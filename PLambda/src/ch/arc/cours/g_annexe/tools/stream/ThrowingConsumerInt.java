
package ch.arc.cours.g_annexe.tools.stream;

@FunctionalInterface
public interface ThrowingConsumerInt<E extends Exception>
	{

	void accept(int i) throws E;
	}
