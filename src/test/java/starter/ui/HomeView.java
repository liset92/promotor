package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target solicitudLink = Target.the("solicitud link").located(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.consubanco.ecsb:id/btnNewRequest\"]"));
    public static Target hola = Target.the("hola text").located(By.xpath("//android.widget.TextView[@resource-id=\"com.consubanco.ecsb:id/textViewHello\"]"));

}
