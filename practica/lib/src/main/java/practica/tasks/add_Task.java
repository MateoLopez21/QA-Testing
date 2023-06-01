package practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import practica.userInterface.add_POM;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class add_Task implements Task{
	
	public static String texto;
	
	private String firstName;
	private String lastName;
	private String email;
	
	private add_Task(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public static add_Task Using(String username, String password, String email) {
		return new add_Task(username, password, email);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				WaitUntil.the(add_POM.BTN_Recruitment, isVisible()).forNoMoreThan(5).seconds(),
				Click.on(add_POM.BTN_Recruitment)
				);
		
		texto = actor.asksFor(Text.of(add_POM.LBL_UsersCounter));
				
		actor.attemptsTo(
				WaitUntil.the(add_POM.BTN_Add, isVisible()).forNoMoreThan(5).seconds(),
				Click.on(add_POM.BTN_Add),
				
				WaitUntil.the(add_POM.TXT_FirstName, isVisible()).forNoMoreThan(5).seconds(),
				Enter.theValue(firstName).into(add_POM.TXT_FirstName),
				Enter.theValue(lastName).into(add_POM.TXT_LastName),
				Enter.theValue(email).into(add_POM.TXT_Email),
				
				Scroll.to(add_POM.BTN_Save),
				Click.on(add_POM.BTN_Save),
				
				WaitUntil.the(add_POM.BTN_Candidates, isVisible()).forNoMoreThan(5).seconds(),
				Click.on(add_POM.BTN_Candidates),
				
				Scroll.to(add_POM.LBL_UsersCounter)
				);
		
	}

}
