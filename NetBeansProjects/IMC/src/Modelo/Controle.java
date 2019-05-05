package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String altura, String peso)
    {
        super(altura, peso);
    }
    
    @Override
    public void Executar()
    {
        
        absPropriedades validacao = new Validacao(altura, peso);
        this.mensagem = validacao.mensagem;
        if (this.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular(validacao.alt, validacao.pes);
            this.resposta = calcular.resposta;
        }
    }
}
