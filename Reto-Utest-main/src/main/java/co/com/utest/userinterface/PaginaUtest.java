package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")

public class PaginaUtest extends PageObject {

    public static final Target JOIN = Target.the("Boton para iniciar proceso de registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
