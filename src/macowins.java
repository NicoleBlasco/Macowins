import java.util.ArrayList;
import java.util.List;

public class Macowins {
    List<Venta> ventas = new ArrayList<Venta>();

    int gananciasDeUn(int dia){
        return ventas.stream().filter(venta -> venta.esDel(dia)).mapToInt(venta->venta.ganancia()).sum();
    }
    

}


