package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String A, String B, String C)
    {
        super(A, B, C);
    }
    
    
    @Override
    public void Executar()
    {
       this.mensagem = "";
        try
        {
            this.vA = Double.parseDouble(A);
            this.vB = Double.parseDouble(B);
            this.vC = Double.parseDouble(C);
        }
        catch (Exception e)
        {
            this.mensagem = "Número Inválido";
        }
    }
}
