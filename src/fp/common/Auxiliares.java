package fp.common;

import java.time.LocalDate;

public class Auxiliares {
    public static LocalDate fecha(Integer año, Integer mes, Integer día){
        return LocalDate.of(año,mes,día);

    }
}
