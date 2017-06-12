package a2dam.fila1.grupo.proyecto_trimestre_2_cafeteria.Bd;

/**
 * Created by Gand on 31/01/17.
 */

public class VistaPedido {
    int id;
    private String nombre,nproducto,complementos;
    private String hora,email;
    private float precioTotal;
    private int estado,num_pedido;

    public VistaPedido(String nombre, String hora, float precioTotal, int estado, int id,String nproducto,String complementos,int num_pedido,String email) {
        this.nombre = nombre;
        this.hora = hora;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.id=id;
        this.nproducto=nproducto;
        this.complementos=complementos;
        this.num_pedido=num_pedido;
        this.email=email;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getHora() {
        return hora;
    }
    public float getPrecioTotal() {
        return precioTotal;
    }
    public int getEstado() {
        return estado;
    }
    public String getStringProducto() {
        return nproducto;
    }
    public String getComplementos() {
        return complementos;
    }
    public String getEmail() {return email;}
    public int getNum_pedido() {
        return num_pedido;
    }
}
