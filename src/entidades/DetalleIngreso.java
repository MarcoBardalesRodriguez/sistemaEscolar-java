
package entidades;

public class DetalleIngreso {
    private int id;
    private int ingresoId;
    private int articuloId;
    private String articuloCodigo;
    private String articuloNombre;
    private int cantidad;
    private double precio;
    private double sutTotal;

    public DetalleIngreso() {
    }

    public DetalleIngreso(int id, int ingresoId, int articuloId, String articuloCodigo, String articuloNombre, int cantidad, double precio, double sutTotal) {
        this.id = id;
        this.ingresoId = ingresoId;
        this.articuloId = articuloId;
        this.articuloCodigo = articuloCodigo;
        this.articuloNombre = articuloNombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.sutTotal = sutTotal;
    }

    public DetalleIngreso(int articuloId, int cantidad, double precio) {
        this.articuloId = articuloId;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIngresoId() {
        return ingresoId;
    }

    public void setIngresoId(int ingresoId) {
        this.ingresoId = ingresoId;
    }

    public int getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    public String getArticuloCodigo() {
        return articuloCodigo;
    }

    public void setArticuloCodigo(String articuloCodigo) {
        this.articuloCodigo = articuloCodigo;
    }

    public String getArticuloNombre() {
        return articuloNombre;
    }

    public void setArticuloNombre(String articuloNombre) {
        this.articuloNombre = articuloNombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSutTotal() {
        return sutTotal;
    }

    public void setSutTotal(double sutTotal) {
        this.sutTotal = sutTotal;
    }
}
