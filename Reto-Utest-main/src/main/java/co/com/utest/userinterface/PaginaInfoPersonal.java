package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {

    public static final Target NOMBRE = Target.the("Nombre de usuario")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Apellido de usuario")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email de usuario")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("Mes nacimiento de usuario")
            .located(By.id("birthMonth"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia nacimiento de usuario")
            .located(By.id("birthDay"));
    public static final Target ANO_NACIMIENTO = Target.the("Año nacimiento de usuario")
            .located(By.id("birthYear"));
    public static final Target BOTON_DIRECCION = Target.the("Boton para ir a seccion de Direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));


}
