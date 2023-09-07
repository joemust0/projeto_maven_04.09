package br.eteczl.persistencia;

import java.util.ArrayList;

import br.eteczl.model.carro;

public interface ICarroDAO {
    public void Salvar(carro c);
    public void Alterar(carro c, Integer id);
    public void Deletar(Integer id);
    public void Buscar(Integer id);
    public ArrayList<carro> Listar();
}
