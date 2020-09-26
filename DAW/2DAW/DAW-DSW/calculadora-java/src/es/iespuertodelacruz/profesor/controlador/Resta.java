package es.iespuertodelacruz.profesor.controlador;

public class Resta extends Operacion{
    
    Double resta;
    
    public Resta(double n1, double n2) {
        super(n1, n2, '-');
        resta = n1 - n2;
        this.setResultado(resta);
    }
}
