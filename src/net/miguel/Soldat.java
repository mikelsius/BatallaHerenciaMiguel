/**
 *.
 */
package net.miguel;

import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

/**
 * @author mikel
 *
 */
public class Soldat {

    /**
     * GImage de soldat.
     */
    private GImage imatge;
    /**
     * velocitat del soldat.
     */
    private int velocitat = 10;
    /**
     * Random.
     */
    private Random rnd;
    /**
     * num de vides.
     */
    private int vides = 1;
    /**
     * quantitat de força.
     */
    private int força = 1;
    /**
     *
     * @param im imatge del soldat.
     */
    public Soldat(final String im) {
        imatge = new GImage(im);
        rnd = new Random();

    }
    /**
     *
     * @return imatge de soldat.
     */
    public final GImage getGImage() {
        return imatge;
    }
    /**
     *
     * @param i posicio inicial.
     * @param j posicio final.
     */
    public final void posiciona(final int i, final int j) {
        imatge.setLocation(i, j);
    }
    /**
     *
     * @param desti on vull arribar
     * @param direccio a moure el soldat.
     * @return si es mou o no.
     */
    public final int moure(final int desti, final int direccio) {
        if (direccio == 1 && (imatge.getX() + velocitat + imatge.getWidth())
                > desti || direccio == -1 && (imatge.getX()
                        - velocitat) < desti) {
            if (direccio == 1) {
                imatge.setLocation(desti
                        - imatge.getWidth(), imatge.getY());
            } else {
                imatge.setLocation(desti, imatge.getY());
            }
            return 0;
        } else {
            imatge.setLocation(direccio * rnd.nextInt(velocitat)
                    + imatge.getX(), imatge.getY());
            return 1;
        }
    }
    /**
     *
     * @return el cuadrat que ocupa.
     */
    public final GRectangle getBounds() {
        return imatge.getBounds();
    }
    /**
     *
     * @return la velocitat del soldat.
     */
    public final int getVelocitat() {
        return velocitat;
    }
    /**
     *
     * @param velo nova velocitat del soldat.
     */
    public final void setVelocitat(final int velo) {
        velocitat = velo;
    }
    /**
     *
     * @param vidas novas vides del soldat.
     */
    public final void setVides(final int vidas) {
        vides = vidas;
    }
    /**
     *
     * @return les vides del soldat.
     */
    public final int getVides() {
        return vides;
    }
    /**
     *
     * @param Força nova que tindra el soldat.
     */
    public final void setForça(final int Força) {
        força = Força;
    }
    /**
     *
     * @return la força del soldat.
     */
    public final int getForça() {
        return força;
    }
    /**
     *
     * @return si es mort o no.
     */
    public final boolean esMort() {
        if (getVides() <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
