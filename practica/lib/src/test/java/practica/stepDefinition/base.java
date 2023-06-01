package practica.stepDefinition;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class base {

	//Creamos e instanciamos el actor //
		public static Actor Mateo = Actor.named("Mateo");
		
		
		@Managed(uniqueSession = true)
		public static WebDriver driver;
}
