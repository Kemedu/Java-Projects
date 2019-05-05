package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
    }
    
    @Override
    public void Executar()
    {
       this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(numero);
            if (n1 > 360)
            {
                this.mensagem = "Valor maior que 360";
            }
            if (n1 < 0)
            {
                this.mensagem = "Valor menor que 0";
            }
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
    }
    
}
