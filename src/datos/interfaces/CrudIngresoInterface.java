
package datos.interfaces;

import java.util.List;

public interface CrudIngresoInterface<T,D> {
    public List<T> listar(String texto, int totalPorPagina, int numPagina);
    public List<D> listarDetalle(int id);
    public boolean insertar(T obj);
    public boolean anular(int id);
    public int total();
    public boolean existe(String texto1, String texto2);
}
