/**
 *.
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
    private static final int NUMSOLDATS = 20;
    /**
     * posicio inicial.
     */
    private static final int POSICIOINICIAL = 0;
    /**
     * Amplada de la pantalla.
     */
    private static final int AMPLADAPANTALLA = 1200;
    /**
     * Alçada de la pantalla.
     */
    private static final int ALÇADAPANTALLA = 600;
    /**
     * comença el programa.
     */
    public final void run() {
        setSize(AMPLADAPANTALLA, ALÇADAPANTALLA);
        setBackground(Color.CYAN);
        CampDeBatalla campBatalla = new CampDeBatalla(this);

        String[] llistaSoldats1 = {"SoldatKenny.png", "SoldatKennyAngel.png",
                "SoldatKennyZombie.png", "SoldatKennyGegant.png"};
        String[] llistaSoldats2 = {"SoldatCartman.png",
                "SoldatCartmanDimoni.png", "SoldatCartmanZombie.png",
                "SoldatCartmanGegant.png"};
        Exercit exercit = creaExercit("Kennys", NUMSOLDATS, llistaSoldats1);
        campBatalla.afegirExercit(exercit, POSICIOINICIAL, getWidth());

        exercit = creaExercit("Cartmans", NUMSOLDATS, llistaSoldats2);
        campBatalla.afegirExercit(exercit, getWidth(), POSICIOINICIAL);

        campBatalla.batalla();


    }
    /**
     *
     * @param nom del exercit
     * @param numSoldats numero de soldats
     * @param imatges array de imatges dels soldats
     * @return exercit senser.
     */
    public final Exercit creaExercit(final String nom,
            final int numSoldats, final String[] imatges) {

        Exercit x = new Exercit(nom);

        for (int i = 0; i < numSoldats; i++) {
            Soldat soldadet = new Soldat(imatges[0]);
            x.allistarSoldat(soldadet);
        }
        for (int i = 0; i < 2; i++) { //2 de cada tipus.
            Soldat soldatEspecial = new SoldatEspecial(imatges[1]);
            x.allistarSoldat(soldatEspecial);
            Soldat soldatGegant = new SoldatGegant(imatges[3]);
            x.allistarSoldat(soldatGegant);
            Soldat soldatZombie = new SoldatZombie(imatges[2]);
            x.allistarSoldat(soldatZombie);
        }
        return x;
    }
    /**
     *
     * @return amplada.
     */
    public final int getAmplada() {
        return AMPLADAPANTALLA;
    }
    /**
     *
     * @return posicio inicial.
     */
    public final int getPosInicial() {
        return POSICIOINICIAL;
    }
}
