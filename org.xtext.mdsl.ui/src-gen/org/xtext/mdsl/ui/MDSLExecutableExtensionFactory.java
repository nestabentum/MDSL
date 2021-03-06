/*
 * generated by Xtext 2.10.0
 */
package org.xtext.mdsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.mdsl.ui.internal.MdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MdslActivator.getInstance().getInjector(MdslActivator.ORG_XTEXT_MDSL_MDSL);
	}
	
}
