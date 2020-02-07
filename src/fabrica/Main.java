package fabrica;

public class Main 
{
    public static void main(String[] args)
    {
        Pedido pedido = new Pedido();
        pedido.pedirProducto();
        
        //if(pedido.getP1().iguales(pedido.getP2() ) && pedido.getP1().iguales(pedido.getP3() ) );
        pedido.mostrarPedido();
    }
}
