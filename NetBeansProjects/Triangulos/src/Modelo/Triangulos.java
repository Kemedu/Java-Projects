package Modelo;

public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        Verificar();
    }
    
    
    public void Verificar()
    {
        setMensagem("");
        Validacao validacao = new Validacao(getLado1(), getLado2(), getLado3());
        if (validacao.getMensagem() == (""))
        {
            
        }
    }
}
