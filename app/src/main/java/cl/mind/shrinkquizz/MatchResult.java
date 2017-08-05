package cl.mind.shrinkquizz;

/**
 * Created by Gabriel on 05-08-2017.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int userAg, int coupleAg) {
        super(userAg, coupleAg);
    }

    private String getAgedBetween(){

        if (getCoupleAg()  - 5 > getUserAg()){

          return "ESTAS CON ALGUIEN MAYOR";


        }else {

            return "ESTAS CON DE TU EDAD";

        }
    }

    public String answer(){


        return getAgedBetween();

    }
}
