
package calcolatrici.calcolatricedue.dto;

/**
 *
 * @author alber
 */
public class OperazioneRequestDto {
   double operatore1;
   double operatore2;

    public OperazioneRequestDto() {
    }

   
   
    public OperazioneRequestDto(double operatore1, double operatore2) {
        this.operatore1 = operatore1;
        this.operatore2 = operatore2;
    }

    public double getOperatore1() {
        return operatore1;
    }

    public void setOperatore1(double operatore1) {
        this.operatore1 = operatore1;
    }

    public double getOperatore2() {
        return operatore2;
    }

    public void setOperatore2(double operatore2) {
        this.operatore2 = operatore2;
    }

    @Override
    public String toString() {
        return "OperazioneRequestDto{" + "operatore1=" + operatore1 + ", operatore2=" + operatore2 + '}';
    }
   
    

}
