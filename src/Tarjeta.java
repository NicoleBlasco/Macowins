import java.util.List;

public class Tarjeta implements MetodoPago{
    int coeficiente;
    int cantidadCuotas;

    public int recargo(List<Prenda> prendas){
        return (cantidadCuotas * coeficiente) + prendas.stream().mapToInt(prenda -> (int)(prenda.precio() * 0.01)).sum();
    }

}
