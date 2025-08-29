
package one.digitalinnovation.gof.decorator;

import one.digitalinnovation.gof.strategy.Comportamento;

public abstract class ComportamentoDecorator implements Comportamento {

    protected Comportamento comportamentoDecorado;

    public ComportamentoDecorator(Comportamento comportamentoDecorado) {
        this.comportamentoDecorado = comportamentoDecorado;
    }

    @Override
    public void mover() {
        comportamentoDecorado.mover();
    }
}