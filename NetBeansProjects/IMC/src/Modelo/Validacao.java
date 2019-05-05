package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String altura, String peso)
    {
        super(altura, peso);
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.alt = Double.parseDouble(altura);
            this.pes = Double.parseDouble(peso);
        }
        catch (Exception e)
        {
            this.mensagem = "Valor inválido";
        }
    }
    
}
