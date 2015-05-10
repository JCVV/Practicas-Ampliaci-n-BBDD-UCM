package p3.queries;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Consulta {
	int numero();
	String enunciado();
	String tipo();
}
