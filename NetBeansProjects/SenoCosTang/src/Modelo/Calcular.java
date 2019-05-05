package Modelo;
import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{

    public Calcular(Double n1)
    {
        super(n1);
    }
    
    @Override
    public void Executar()
    {
        DecimalFormat df = new DecimalFormat("0.##");
        
        this.seno = Math.sin(Math.toRadians(n1));
        this.cosseno = Math.cos(Math.toRadians(n1));
        this.tangente = Math.tan(Math.toRadians(n1));
        
        this.resposta = "<html>Seno =" + df.format(this.seno) +
                        "<br>Cosseno =" + df.format(this.cosseno) +
                        "<br>Tangente =" + df.format(this.tangente) + "</html>";
    }
}
