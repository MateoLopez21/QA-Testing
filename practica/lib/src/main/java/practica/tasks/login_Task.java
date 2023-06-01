package practica.tasks;

import practica.userInterface.login_POM;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class login_Task implements Task{

	
	// Definimos variables que se van a encargar de almacenar el nombre de usuario y contraseña
	// que le enviemos.
	
	private String username;
	private String password;
	
	
	
	// Constructor de la clase //
	
	private login_Task(String username, String password) {
		
		this.username = username;
		this.password = password;

	}
	
	// Método estatico sirve para crear una instancia de la clase //
	public static login_Task Using(String username, String password) {
		
		return new login_Task(username, password);
		
	}

	
	
	 
	// ----------------------------------------------- //
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		// Escribir nuestras acciones //
		
		actor.attemptsTo(
				
				// ¿Que va intentar hacer el actor?
				Enter.theValue(username).into(login_POM.TXT_Username),
				Enter.theValue(password).into(login_POM.TXT_Password),
				Click.on(login_POM.BTN_Login)
				);

	}
	
	
}
