package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.HomeView;

public class LoggedQuestions implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return HomeView.hola.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new LoggedQuestions();
    }
}
