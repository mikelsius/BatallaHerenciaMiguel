/**
 *
 */
package net.miguel;

import java.awt.Color;

import acm.program.GraphicsProgram;

/**
 * @author mikel
 *
 */
public class Principal extends GraphicsProgram {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * num soldats de cada exercit.
     */
    private static final int NUMSOLDATS = 25;
    private static final int POSICIOINICIAL = 10;
    /**
     *
     */
    public void run() {
        setSize(1200, 600);
        this.setBackground(Color.cyan);;
        CampDeBatalla campBatalla = new CampDeBatalla(this);

        Exercit exercit = creaExercit("Kennys", NUMSOLDATS,"SoldatKenny.png","SoldatKennyCoix.png");
        campBatalla.afegirExercit(exercit, POSICIOINICIAL, getWidth());

        exercit = creaExercit("Cartmans", NUMSOLDATS,"SoldatCartman.jpg","SoldatCartmanCoix.jpg");
        campBatalla.afegirExercit(exercit,getWidth(),POSICIOINICIAL);

        campBatalla.batalla();


    }
    public final Exercit creaExercit(final String nom,
            final int numSoldats, final String imatge, final String imatge2) {

        Exercit x = new Exercit(nom);

        for (int i = 0; i < numSoldats; i++) {
            Soldat soldadet = new Soldat(imatge);
            x.allistarSoldat(soldadet);
        }
        //proba de herencia.
        Soldat soldadet1 = new SoldatCoix(imatge2);
        x.allistarSoldat(soldadet1);
        return x;
    }
}
