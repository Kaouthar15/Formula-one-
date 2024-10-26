package cars;

import java.awt.*;

public class Voiture extends Canvas implements Runnable {

    private Color couleur;
    private String pilote;
    private int vitesse;
    private int position;
    private int arrivee;
    private int depart;

    public Voiture(Color couleur, String pilote, int depart, int arrivee){
        this.couleur = couleur;
        this.pilote = pilote;
        this.arrivee = arrivee;
        this.depart = depart;
        vitesse = (int)Math.floor(Math.random()*100);
        setSize(120,50);
    }
    public void avancer(int dx){
        position += dx;
        repaint();
    }
    public void paint(Graphics g){
        g.setColor(couleur);
        g.fillRoundRect(position,10,120,30,10,10);
        g.fillOval(position+10,32,30,30);
        g.fillOval(position+75,32,30,30);
        g.setColor(Color.white);
        g.drawString(pilote,position+10,30);
    }
    @Override
    public void run() {
        while(position <= arrivee){
            avancer(1);
            try{
                Thread.sleep(vitesse);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
