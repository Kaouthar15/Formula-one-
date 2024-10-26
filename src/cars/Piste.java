package cars;

import javax.swing.*;

public class Piste extends JFrame {

    public Piste(String titre,int largeur, int hauteur){
        super("Formula one");
        setSize(largeur,hauteur);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
