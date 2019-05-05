package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String numero)
    {
        super(numero);
    }
    
    @Override
    public void Executar()
    {
        absPropriedades validacao = new Validacao(numero);
        this.mensagem = validacao.mensagem;
        if (this.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular(validacao.n1);
            this.resposta = calcular.toString();
        }
    }
    
}
