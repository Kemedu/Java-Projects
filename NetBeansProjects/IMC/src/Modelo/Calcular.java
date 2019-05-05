package Modelo;
import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{

    public Calcular(Double alt, Double pes)
    {
        super(alt, pes);
    }
    
    @Override
    public void Executar()
    {
        DecimalFormat df = new DecimalFormat("0.##");
        
        this.mensagem = "";
        
        this.alt2 = (this.alt * this.alt);
        this.res = this.pes / this.alt2;
        
        if (this.res < 17)
        {
           this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Muito abaixo do peso";
           
        }
        
        if (this.res > 17 && this.res < 18.49)
        {
            this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Abaixo do peso";
        }
        
        if (this.res > 18.50 && this.res < 24.99)
        {
            this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Peso normal";
        }
        
        if (this.res > 25 && this.res < 29.99)
        {
            this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Acima do peso";
        }
        
        if (this.res > 30 && this.res < 34.99)
        {
            this.resposta = this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Obesidade I";
        }
        
        if (this.res > 35 && this.res < 39.99)
        {
            this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Obesidade II (Severa)";
        }
        
        if (this.res > 40)
        {
            this.resposta = "<html>Seu IMC é :" + df.format(this.res) +
                            "<br>Obesidade III (Mórbida)";
        }
    }
    
}
