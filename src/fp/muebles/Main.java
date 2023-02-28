package fp.muebles;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        int[][] matriz = new int[3][3];
        int y = 1;
        for(int i=0; i<3;i++) {
            for (int x = 0; x < 3; x++) {
                matriz[i][x] = y;
                y++;
                System.out.println(matriz[i][x]);
            }
        }
    }

}
