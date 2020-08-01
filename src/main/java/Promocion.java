public class Promocion implements Estado{
    int valorDePromocion;

    public int calcularPrecio(int precioPrenda) {
        return precioPrenda - valorDePromocion;
    }
}
