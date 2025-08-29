package one.digitalinnovation.gof;

import one.digitalinnovation.gof.decorator.TurboDecorator;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
	public static void main(String[] args) {

		System.out.println("\n--- Testes com Decorator ---");


		Comportamento normal = new ComportamentoNormal();
		System.out.println("Robô com comportamento normal:");
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();

		System.out.println("\nAgora, decorando o comportamento normal com Turbo:");
		Comportamento normalComTurbo = new TurboDecorator(normal);
		robo.setComportamento(normalComTurbo);
		robo.mover();

		System.out.println("\nDecorando o comportamento agressivo com Turbo:");
		Comportamento agressivoComTurbo = new TurboDecorator(new ComportamentoAgressivo());
		robo.setComportamento(agressivoComTurbo);
		robo.mover();

		System.out.println("---------------------------------");
	}
}