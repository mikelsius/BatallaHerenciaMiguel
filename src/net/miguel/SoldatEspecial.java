/**
 *
 */
package net.miguel;
/**
 * @author Mikel
 *
 */
public class SoldatEspecial extends Soldat {
    /**
     * numero deu.
     */
    private final int cinc = 5;
    /**
     * constructor.
     * @param im imatge d'aquest soldat.
     */
    public SoldatEspecial(final String im) {
        super(im);
        setVides(cinc);
        setForça(cinc);
    }
}
