package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.CotizadorView;

public class ResultadosQuestions implements Question {

    @Override
    public String answeredBy(Actor actor) {

        return CotizadorView.resultados.resolveFor(actor).getText();
    }

    public static Question<String> value() {

        return new ResultadosQuestions();
    }
}
