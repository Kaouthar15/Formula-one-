import cars.Piste;
import cars.Voiture;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Piste piste = new Piste("Formula one",500,380);
        piste.setLayout(new GridLayout(4,1));

        Voiture [] voitures = new Voiture[4];
        Thread [] thVoitures = new Thread[4];

        voitures[0] = new Voiture(Color.RED,"Kaouthar",0,360);
        voitures[1] = new Voiture(Color.BLUE,"Houda",0,360);
        voitures[2] = new Voiture(Color.BLACK,"Simo",0,360);
        voitures[3] = new Voiture(Color.ORANGE,"Adam",0,360);

        for(int i = 0;i < 4; i++){
            thVoitures[i] = new Thread(voitures[i]);
            piste.add(voitures[i]);
        }
        piste.validate();
        for (int i = 0;i < 4; i++){
            thVoitures[i].start();
        }
    }
}