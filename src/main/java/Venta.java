import java.util.ArrayList;
import java.util.List;

public class Venta {
    int fecha;
    MetodoPago metodoPago;
    List<Prenda> prendas = new ArrayList<>();

    boolean esDel(int dia){
        return fecha == dia;
    }

    int ganancia(){
        return this.gananciaDePrendas() + this.recargos();
    }

    int gananciaDePrendas(){
        return prendas.stream().mapToInt(prenda->prenda.ganancia()).sum();
    }

    int recargos(){
       return metodoPago.recargo(prendas);
    }
}


