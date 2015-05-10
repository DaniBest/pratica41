package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 */
public class Elipse {
    
    private double eixoX;
    private double eixoY;

    public Elipse() {
        eixoX = eixoY = 0;
    }
    
    public Elipse(double semiX, double semiY) {
        eixoX = 2*semiX;
        eixoY = 2*semiY;
    }

    public double getEixoX() {
        return eixoX;
    }

    public double getEixoY() {
        return eixoY;
    }
    
    public double getArea() {
        return (Math.PI) * (eixoX/2) * (eixoY/2);
    }
    
    public double getPerimetro() {
        return (Math.PI) * (3 * ((eixoX/2)+(eixoY/2)) - Math.sqrt((3*(eixoX/2)+(eixoY/2))*((eixoX/2)+3*(eixoY/2))));
    }
    
}
