package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target CONTRASENA = Target.the("Contraseña de usuario")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Confirmar la contraseña de usuario")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_01 = Target.the("Checkbox 01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_02 = Target.the("Checkbox 02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_03 = Target.the("Checkbox 03")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_FINAL = Target.the("Boton para finalizar el resgistro")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
    public static final Target MENSAJE_BIENVENIDA = Target.the("Mensaje de bienvenida")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));
}
