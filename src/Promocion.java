public class Promocion implements Tipo{
    int valorDePromocion;

    public int calcularPrecio(int precioPrenda) {
        return precioPrenda - valorDePromocion;
    }
}
