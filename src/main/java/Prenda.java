/*
Los requerimientos son:
    1) Saber el precio de venta de una prenda y sus tipos
    2) Saber las ganancias de un determinado día
*/
public class Prenda {
    int valorNeto;
    int precioPropio;
    Estado estado;
    Tipo tipo;

    int precio(){
        return estado.calcularPrecio(precioPropio);
    }

    int ganancia(){
        return precioPropio - valorNeto;
    }
}




