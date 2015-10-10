package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik  extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        int i = 0;
        int ii = 0;
        Foor foor = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.PAREM, primaryStage);
        Foor foor3 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);
        while (i == 0) {

            foor.vahetaPunast();
            foor.paus(2.0);
            foor.vahetaPunast();
            foor.paus(0.5);
            foor.vahetaPunast();
            foor.paus(0.5);
            foor.vahetaPunast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(2.0);
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(2.0);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(2.0);
            foor.vahetaKollast();
            foor.paus(0.5);

        }        while (ii == 0) {

            foor3.vahetaPunast();
            foor3.paus(2.0);
            foor3.vahetaPunast();
            foor3.paus(0.5);
            foor3.vahetaPunast();
            foor3.paus(0.5);
            foor3.vahetaPunast();
            foor3.paus(0.5);
            foor3.vahetaKollast();
            foor3.paus(2.0);
            foor3.vahetaKollast();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(2.0);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaKollast();
            foor3.paus(2.0);
            foor3.vahetaKollast();
            foor3.paus(0.5);

        }
    }
}
