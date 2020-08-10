package Model;

public class Conversao extends absPropriedades implements intMetodos
{
    
    public Conversao(Integer num)
    {
        super(num);
        Executar();
    }
     
    public String resposta;

    @Override
    public void Executar()
    {
       resposta = Integer.toBinaryString(this.num);
       this.num = Integer.parseInt(this.resposta);
    }
    
}
