package cl.mind.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 05-08-2017.
 */

public class LuckyAnswer {

    private boolean userUI;
    private boolean luckyDay;

    public LuckyAnswer(boolean userUI) {
        this.userUI = userUI;
        luckyDay = new LuckyDate().getDate();
    }

    public boolean isUserUI() {
        return userUI;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate {


        private boolean getDate() {

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));

            if (day % 2 == 0) {

                return true;

            } else {

                return false;

            }


        }


    }
}
