/*
 * generated by Xtext 2.28.0
 */
package fr.imta.semafor.ui.tests;

import com.google.inject.Injector;
import fr.imta.semafor.fogDsl.ui.internal.FogDslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FogDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FogDslActivator.getInstance().getInjector("fr.imta.semafor.FogDsl");
	}

}
