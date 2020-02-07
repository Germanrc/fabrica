package fabrica;

public class Main 
{
    public static void main(String[] args)
    {
        Pedido pedido = new Pedido();
        pedido.pedirProducto();
        
        if(pedido.getProducto(0).iguales(pedido.getProducto(1) ) && pedido.getProducto(1).iguales(pedido.getProducto(2)) );
        pedido.mostrarPedido();
    }
}
