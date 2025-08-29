package one.digitalinnovation.gof.decorator;

import one.digitalinnovation.gof.strategy.Comportamento;

public class TurboDecorator extends ComportamentoDecorator {

    public TurboDecorator(Comportamento comportamentoDecorado) {
        super(comportamentoDecorado);
    }

    @Override
    public void mover() {
        super.mover();
        adicionarTurbo();
    }

    private void adicionarTurbo() {
        System.out.println("Ativado");
    }
}