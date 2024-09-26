package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.CotizadorView;
import starter.utils.Scroll;


public class CompletarCotizador implements Task {

   @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
                Click.on(CotizadorView.noRenovacion),
                Click.on(CotizadorView.comoCotizar),
                Click.on(CotizadorView.comoCotizarElemento),
                SendKeys.of("5000").into(CotizadorView.monto)
       );
       Scroll.untilFindElementByTextContains("0", "Cotizar");
        actor.attemptsTo(
                Click.on(CotizadorView.cotizarButton)
        );
    }
}
