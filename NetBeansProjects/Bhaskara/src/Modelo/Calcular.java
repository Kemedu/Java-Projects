package Modelo;
import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{

    public Calcular(Double vA, Double vB, Double vC)
    {
        super(vA, vB, vC);
    }
    
    @Override
    public void Executar()
    {
        DecimalFormat df = new DecimalFormat("0.##");
        
        this.respostaDel = (this.vB * this.vB) - (4 * vA * vC);
        
        if (this.respostaDel < 0)
        {
            this.res = "<html>O valor do delta é negativo: " + df.format(this.respostaDel) +
                        "<br>Portanto, não existem raízes!</html>";
        }
        
        else
        {
        this.respostax1 = ((-1 * this.vB) + Math.sqrt(this.respostaDel)) / (2 * vA);
        this.respostax2 = ((-1 * this.vB) - Math.sqrt(this.respostaDel)) / (2 * vA);
        
            if (this.respostaDel == 0)
            {
                this.res = "<html>O valor do delta é 0." +
                        "<br>Portanto, só existe uma raiz!</html>";
                this.resx1 = "X1 = -B + √▲ / 2a = " + df.format(this.respostax1);
            }
            else
            {
                this.res = "O valor do delta é: " + df.format(this.respostaDel);
                this.resx1 = "X1 = -B + √▲ / 2a = " + df.format(this.respostax1);
                this.resx2 = "X2 = -B - √▲ / 2a = " + df.format(this.respostax2);
            }
        }
        
    }
}
