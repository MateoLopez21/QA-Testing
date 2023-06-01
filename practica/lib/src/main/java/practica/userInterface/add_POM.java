package practica.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
public class add_POM extends PageObject {
	
	public static Target BTN_Recruitment = Target.the("Este botón nos redirigirá al apartado de Recruitment").locatedBy("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]/span[1]");
	public static Target BTN_Add = Target.the("Este botón nospremitirá agregar un nuevo usuario").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
	public static Target BTN_Save = Target.the("Este botón os permite guarddar la información para crear el usuario").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/button[2]");
	public static Target TXT_FirstName = Target.the("Input para ingresar el primer nombre").locatedBy("//input[@name = 'firstName']");
	public static Target TXT_LastName = Target.the("Input para ingresar el apellido").locatedBy("//input[@name = 'lastName']");
	public static Target TXT_Email = Target.the("Input para ingresar el Email").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
	public static Target BTN_Candidates = Target.the("Refresca la lista y redirecciona").locatedBy("//a[contains(text(),'Candidates')]");
	public static Target LBL_UsersCounter = Target.the("El label que se encarga de contar a los usuarios").locatedBy("//div[2]/div[1]/span[1]");
}
