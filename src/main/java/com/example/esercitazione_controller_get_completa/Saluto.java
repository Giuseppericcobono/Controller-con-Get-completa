package com.example.esercitazione_controller_get_completa;

public class Saluto {

    public String nome;
    public String provincia;
    public String saluto;

    public Saluto(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

}
