package net.miguel;

import acm.graphics.GImage;

public class SoldatCoix extends Soldat {



    public SoldatCoix(String im) {
        super(im);

    }
    public int moure(int direccio){
        if (direccio == 1 && (getGImage().getX() + VELOCITAT) > 1150 || direccio == -1 && (getGImage().getX() - VELOCITAT) < 10){
            if (direccio ==1){
                this.getGImage().setLocation(1150,this.getGImage().getY());
            }else{
                this.getGImage().setLocation(10,this.getGImage().getY());
            }
            return 0;
        }else{
            // this.imatge.setLocation(direccio * rnd.nextInt(VELOCITAT-5) + this.imatge.getX(),this.imatge.getY());
            this.getGImage().move(direccio * rnd.nextInt(VELOCITAT-5), 0);
            return 1;
        }
    }
}
