package br.eteczl;

import java.util.ArrayList;

import br.eteczl.model.automo;
import br.eteczl.model.carro;
import br.eteczl.model.caminhao;

public class App 
{
    private ArrayList<automo> automoveis = new ArrayList<automo>();
    public static void main( String[] args )
    {
        App app = new App();
        automo carrAuto = new carro();
        
        app.automoveis.add(new carro());
        app.automoveis.add(new caminhao());
    }
}
