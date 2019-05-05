package Modelo;

public abstract class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String A;
    protected String B;
    protected String C;
    protected Double vA;
    protected Double vB;
    protected Double vC;
    protected Double respostaDel;;
    protected Double respostax1;
    protected Double respostax2;
    protected String res;
    public String resx1;
    public String resx2;

    public absPropriedades(String A, String B, String C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        Executar();
    }

    public absPropriedades(Double vA, Double vB, Double vC)
    {
        this.vA = vA;
        this.vB = vB;
        this.vC = vC;
        Executar();
    }
    

    @Override
    public String toString()
    {
        return this.res;
    }
    
    @Override
    public void Executar()
    {
        
    }
    
    
}
