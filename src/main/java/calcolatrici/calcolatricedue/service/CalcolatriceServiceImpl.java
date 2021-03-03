
package calcolatrici.calcolatricedue.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author alber
 */
@Service
public class CalcolatriceServiceImpl implements CalcolatriceService {

    @Override
    public double somma(double op1s, double op2s) {
        return op1s + op2s;
    }

    @Override
    public double sottrai(double op1, double op2) {
        return op1-op2;
    }

    @Override
    public double molt(double op1, double op2) {
       return op1*op2;
    }

    @Override
    public double div(double op1, double op2) {
       return op1/op2;
    }

    @Override
    public double module(double op1, double op2) {
        return op1%op2;
    }
    
    
}
