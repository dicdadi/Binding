package dad.binding.dimensiones;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

	public static void main(String[] args) {
		/*
		DoubleProperty a = new SimpleDoubleProperty(4);
		DoubleProperty b = new SimpleDoubleProperty(5);
		DoubleProperty c = new SimpleDoubleProperty();
		c.bind(a.multiply(b));
		//DoubleBinding c = a.multiply(b); Otra forma de hacer la multiplicación de los DoubleProperty
		
		// o seria el valor observable
		// ov el valor antiguo
		// nv el valor nuevo
		c.addListener((o,ov,nv) -> {
			System.out.println("C antes valía " + ov + " y ahora vale " + nv);
		});
		
		System.out.println(c.doubleValue());
		
		b.set(6);
		System.out.println(c.doubleValue());
		a.set(3);
		System.out.println(c.doubleValue());
		*/
		Dimensiones.main(args);
	}

}
