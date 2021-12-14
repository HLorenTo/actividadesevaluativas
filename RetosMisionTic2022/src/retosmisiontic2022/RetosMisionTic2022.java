package retosmisiontic2022;

import java.util.Scanner;

public class RetosMisionTic2022 {
    public static float calcularPorcentajeBono(int anios,float bono) {
        float porcentaje = 0;
        bono = 500000;
        Scanner cant = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de años");
        anios = cant.nextInt();
        if (anios >= 10){
            porcentaje = 0.30f;
        }else if (anios >=5 && anios <10){
            porcentaje = 0.20f;
        }else if (anios >=3 && anios <5){
            porcentaje = 0.10f;
        }else if (anios < 3){
            porcentaje = 0.05f;
        }else{
            System.out.println("Cantidad de años erronea");
        }
        return porcentaje*bono;
    }
}
