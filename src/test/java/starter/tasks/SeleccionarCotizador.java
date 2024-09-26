package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.CotizadorView;

public class SeleccionarCotizador implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CotizadorView.sucursal),
                Click.on(CotizadorView.sucursalElemento),
                Click.on(CotizadorView.grupoConvenio),
                Click.on(CotizadorView.grupoConvenioElemento),
                Click.on(CotizadorView.convenio),
                Click.on(CotizadorView.convenioElemento)

        );
    }
}
