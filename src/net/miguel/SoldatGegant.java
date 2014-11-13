/**
 * 
 */
package net.miguel;

/**
 * @author Mikel
 *
 */
public class SoldatGegant extends Soldat {
	
	public static final int VELOCITAT = 5;
	
	public SoldatGegant(String im) {
		super(im);
	}
	//setVelocitat(5);
    /**
    *
    * @param desti on vull arribar
    * @param direccio a moure el soldat.
    * @return si es mou o no.
    */
   public int moure(final int desti, final int direccio) {
       if (direccio == 1 && (getGImage().getX() + VELOCITAT + getGImage().getWidth())
               > desti || direccio == -1 && (getGImage().getX()
                       - VELOCITAT) < desti) {
           if (direccio == 1) {
        	   getGImage().setLocation(desti
                       - getGImage().getWidth(), getGImage().getY());
           } else {
        	   getGImage().setLocation(desti, getGImage().getY());
           }
           return 0;
       } else {
    	   getGImage().setLocation(direccio * rnd.nextInt(VELOCITAT)
                   + getGImage().getX(), getGImage().getY());
           return 1;
       }
   }
	
}
