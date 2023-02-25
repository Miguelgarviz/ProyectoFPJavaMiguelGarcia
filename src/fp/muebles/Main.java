package fp.muebles;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Muebles sofa = new Muebles();
        String sofa_ship = getShipmode();
        System.out.println(sofa_ship);
    }

    public String getShipmode(){
        return this.shipmode;
    }
}
