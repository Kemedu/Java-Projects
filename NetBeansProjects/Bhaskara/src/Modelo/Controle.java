package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String A, String B, String C)
    {
        super(A, B, C);
    }

    
    @Override
    public void Executar()
    {
        absPropriedades validacao = new Validacao(A, B, C);
        this.mensagem = validacao.mensagem;
        
        if (this.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular(validacao.vA, validacao.vB, validacao.vC);
            this.res = calcular.res;
            this.resx1 = calcular.resx1;
            this.resx2 = calcular.resx2;
        }
    }
    
}
