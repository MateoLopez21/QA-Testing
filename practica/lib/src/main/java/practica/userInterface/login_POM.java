package practica.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

public class login_POM extends PageObject{
	
	// Vamos a colocar todos los elementos que necesitemos de Login //
	
	public static Target TXT_Username = Target.the("El input para introducir el usuario").located(By.xpath("//input[@name='username']"));
	public static Target TXT_Password = Target.the("El input para introducir la pass").located(By.name("password"));
	public static Target BTN_Login = Target.the("El boton para loguearse en el sistema").located(By.xpath("//button"));

	
	
	// Home Page - Button Dashboard //
	
	//h6[1]
	
	public static Target LBL_DashboardTitle = Target.the("El texto que indica que estamos en el dashboard").locatedBy("//h6[1]");
	
	
}
