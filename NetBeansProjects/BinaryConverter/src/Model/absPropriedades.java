package Model;

public class absPropriedades
{
    protected String numero;
    protected Integer num;

    public absPropriedades(String numero)
    {
        this.numero = numero;
    }    

    public absPropriedades(Integer num)
    {
        this.num = num;
    }

    public Integer getNum()
    {
        return num;
    }

}
