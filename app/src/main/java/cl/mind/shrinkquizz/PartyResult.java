package cl.mind.shrinkquizz;

/**
 * Created by Gabriel on 02-08-2017.
 */

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }


    public String score() {


        return processing();

    }

    private String processing() {

        String answer = getAnswer();

        if (answer.contains("5")) {

            return "Eres un pollo";


        } else if (answer.contains("10")) {

            return "Dale Campeon";
        } else

            return "Anda a laar";
    }
}
