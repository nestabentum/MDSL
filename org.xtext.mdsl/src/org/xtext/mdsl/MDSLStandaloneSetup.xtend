/*
 * generated by Xtext 2.10.0
 */
package org.xtext.mdsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MDSLStandaloneSetup extends MDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new MDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
