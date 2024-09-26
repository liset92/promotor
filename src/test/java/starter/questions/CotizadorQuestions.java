package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.CotizadorView;

public class CotizadorQuestions implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return CotizadorView.cotizador.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new CotizadorQuestions();
    }
}
