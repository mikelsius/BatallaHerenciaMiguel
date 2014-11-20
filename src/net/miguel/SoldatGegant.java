/**
 *
 */
package net.miguel;
/**
 * @author Mikel
 *
 */
public class SoldatGegant extends Soldat {
    /**
     * numero deu.
     */
    private final int deu = 10;
    /**
     * numero cinc.
     */
    private final int set = 7;
    /**
     * constructor.
     * @param im imatge d'aquest soldat.
     */
    public SoldatGegant(final String im) {
        super(im);
        setVelocitat(set);
        setVides(deu);
    }
}
