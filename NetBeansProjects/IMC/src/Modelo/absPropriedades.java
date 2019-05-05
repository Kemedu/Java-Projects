package Modelo;

public abstract class absPropriedades implements intMetodos
{
    public String mensagem;
    public String resposta;
    public String altura;
    public String peso;
    public Double alt;
    public Double pes;
    public Double res;
    public Double alt2;

    public absPropriedades(Double alt, Double pes)
    {
        this.alt = alt;
        this.pes = pes;
        Executar();
    }

    public absPropriedades(String altura, String peso)
    {
        this.altura = altura;
        this.peso = peso;
        Executar();
    }

    

    @Override
    public String toString()
    {
        return this.resposta;
    }
    
    @Override
    public void Executar()
    {
        
    }
    
}
