package cl.awakelab.gestionclinica.service;

import java.util.List;

public interface ICrudGenerico<T> {
    List<T> listar();
    T buscarPorId(int id);
    T crear(T t);
    T atualizar(T t);
    void remover(int id);
}
