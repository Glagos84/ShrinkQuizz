package cl.mind.shrinkquizz;

/**
 * Created by Gabriel on 05-08-2017.
 */

public class LuckyResult extends LuckyAnswer{


    public LuckyResult(boolean userUI) {
        super(userUI);
    }

    private String userInput(){

        if (isUserUI()){

            return "Esa es la Actitud";

        }else {

            return "Anímate";

        }


    }

    private String getLuckyDay(){

        if (isLuckyDay()){


            return "Y es tú día de Suerte!";

        }else {


            return "Vendras Tiempos Mejores :)";

        }

    }

    public String answer(){

        return userInput() +" - "+ getLuckyDay();

    }
}
