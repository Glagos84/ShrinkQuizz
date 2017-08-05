package cl.mind.shrinkquizz;

/**
 * Created by Gabriel on 05-08-2017.
 */

public class MatchAnswer {

    private int userAg;
    private int coupleAg;

    public MatchAnswer(int userAg, int coupleAg) {
        this.userAg = userAg;
        this.coupleAg = coupleAg;
    }

    public int getUserAg() {
        return userAg;
    }

    public int getCoupleAg() {
        return coupleAg;
    }
}
