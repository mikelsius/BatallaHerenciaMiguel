package net.miguel;

import acm.graphics.GImage;

public class SoldatCoix extends Soldat {



    public SoldatCoix(String im) {
        super(im);
    }
    /**
    *
    * @param desti on vull arribar
    * @param direccio a moure el soldat.
    * @return si es mou o no.
    */
   public final int moure(final int desti, final int direccio) {
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
    	   //getGImage().setLocation(direccio * rnd.nextInt(VELOCITAT)
           //        + getGImage().getX(), getGImage().getY());
    	   this.getGImage().move(direccio * rnd.nextInt(VELOCITAT-5), 0);
           return 1;
       }
   }
}
