package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CotizadorView {

    public static Target cotizador = Target.the("cotizador").located(By.xpath(("//android.widget.TextView[@text=\"Cotizador\"]")));
    public static Target renovacion = Target.the("renovacion").located(By.xpath(("//android.widget.TextView[@text=\"¿es una renovación Intercompañía y/o CNCA?\"]")));


    public static Target sucursal = Target.the("sucursal").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[1]"));
    public static Target sucursalElemento = Target.the("sucursalElemento").located(By.xpath("//android.widget.EditText[@resource-id=\"com.consubanco.ecsb:id/selectorAgreementGroups\"]"));


    public static Target grupoConvenio = Target.the("grupoConvenio").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[2]"));
    public static Target grupoConvenioElemento = Target.the("grupoConvenioElemento").located(By.xpath("//android.widget.EditText[@resource-id=\"com.consubanco.ecsb:id/selectorAgreements\"]"));

    public static Target convenio = Target.the("convenio").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[3]"));
    public static Target convenioElemento = Target.the("convenioElemento").located(By.xpath("//android.view.ViewGroup[@resource-id=\"com.consubanco.ecsb:id/toolbar\"]"));

    public static Target noRenovacion = Target.the("noRenovacion").located(By.id("com.consubanco.ecsb:id/buttonNo"));
    public static Target comoCotizar = Target.the("comoCotizar").located(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[4]"));
    public static Target comoCotizarElemento = Target.the("comoCotizarElemento").located(By.xpath("//android.widget.TextView[@text=\"¿es una renovación Intercompañía y/o CNCA?\"]"));
    public static Target monto = Target.the("monto").located(By.id("com.consubanco.ecsb:id/editTextAmountLoan"));
    public static Target cotizarButton = Target.the("cotizarButton").located(By.id("com.consubanco.ecsb:id/btnNext"));

    public static Target resultados = Target.the("resultados").located(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.consubanco.ecsb:id/constraintLayoutCard\"])[1]"));









}
