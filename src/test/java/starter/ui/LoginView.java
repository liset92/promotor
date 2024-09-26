package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target username  = Target.the("username").located(By.xpath("//android.widget.EditText[@resource-id=\"com.consubanco.ecsb:id/editTextUser\"]"));
    public static Target password  = Target.the("password").located(By.xpath("//android.widget.EditText[@resource-id=\"com.consubanco.ecsb:id/editTextPass\"]"));
    public static Target login  = Target.the("login button").located(By.xpath("//android.widget.Button[@resource-id=\"com.consubanco.ecsb:id/btnLogin\"]"));

}
