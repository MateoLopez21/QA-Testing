package practica.stepDefinition;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import practica.tasks.add_Task;
import practica.tasks.login_Task;
import practica.userInterface.add_POM;
import practica.userInterface.login_POM;

public class add_Steps extends base{
	private login_POM login;
	private add_POM add;
	
	@Before
	public void setUp() {
		Mateo.can(BrowseTheWeb.with(driver));
	}
	
	@Given("^Un usuario que está en el apartado recruitment$")
    public void un_usuario_que_est_en_el_apartado_recruitment() throws Throwable {
        Mateo.wasAbleTo(Open.browserOn(login));
        Mateo.attemptsTo(login_Task.Using("Admin", "admin123"));
    }

    @When("^El usuario ingresa crendenciales validas$")
    public void el_usuario_ingresa_crendenciales_validas() throws Throwable {
        Mateo.attemptsTo(add_Task.Using("Mateo", "López", "mateo@admin.com"));
    }

    @Then("^La pagina muestra el usuario en la lista de candidatos$")
    public void la_pagina_muestra_el_usuario_en_la_lista_de_candidatos() throws Throwable {
    	Mateo.attemptsTo(WaitUntil.the(add_POM.LBL_UsersCounter, isVisible()).forNoMoreThan(10).seconds());
    	Mateo.attemptsTo(Ensure.that(add_POM.LBL_UsersCounter).text().isNotEqualTo(add_Task.texto));
    }
}
