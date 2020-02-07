package fabrica;
import java.util.*;

public class Pedido 
{
    //private Producto p1;
    //private Producto p2;
    //private Producto p3;
    private Producto productos[];
    
    Pedido()
    {
        productos=new Producto[3];
        for(int i=0;i<productos.length;i++){
            productos[i]=new Producto();
        }
        //p1 = new Producto();
        //p2 = new Producto();
        //p3 = new Producto();
    }
    
    public Producto getProducto(int numProducto){
        return productos[numProducto];
    }
    /*
    Producto getP1()
    {
        return p1;
    }
    
    Producto getP2()
    {
        return p2;
    }
    
    Producto getP3()
    {
        return p3;
    }*/
    
    public void pedirProducto(int num_p)
    {
        
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=0;i<productos.length;i++){
            productos[i].setNombre(Producto.pedirNombre());
            productos[i].setPrecio(Producto.pedirPrecio());
        }
        /*switch(num_p)
        {
            case 1:
                p1.setNombre(Producto.pedirNombre());
                p1.setPrecio(Producto.pedirPrecio());
                break;
            case 2:
                p2.setNombre(Producto.pedirNombre());
                p2.setPrecio(Producto.pedirPrecio());
                break;
            case 3: 
                p3.setNombre(Producto.pedirNombre());
                p3.setPrecio(Producto.pedirPrecio());
                break;
            default:
                System.out.println("Número inválido");
                break;
        }*/
    }
    
    public double total()
    {
        return productos[1].getPrecio() + productos[2].getPrecio() + productos[3].getPrecio();
    }
    
    public void mostrarPedido()
    {
        for(int i=0;i<productos.length;i++){
            productos[i].resumen();
        }
        
        
        System.out.println(total());
    }
}
