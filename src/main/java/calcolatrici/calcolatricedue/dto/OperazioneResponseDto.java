
package calcolatrici.calcolatricedue.dto;

/**
 *
 * @author alber
 */
public class OperazioneResponseDto {
    double risultato;

    public OperazioneResponseDto() {
    }

    public OperazioneResponseDto(double risultato) {
        this.risultato = risultato;
    }

    public double getRisultato() {
        return risultato;
    }

    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }

    @Override
    public String toString() {
        return "OperazioneResponseDto{" + "risultato=" + risultato + '}';
    }
    
    
    
}
