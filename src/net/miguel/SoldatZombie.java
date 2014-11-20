/**
 *
 */
package net.miguel;

/**
 * @author Mikel
 *
 */
public class SoldatZombie extends Soldat {
    /**
     * numero deu.
     */
    private final int vuit = 8;
    /**
     * Constructor.
     * @param im imatge del soldat.
     */
    public SoldatZombie(final String im) {
        super(im);
        setVides(2);
        setForça(2);
        setVelocitat(vuit);
    }
}
