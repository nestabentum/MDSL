/**
 * generated by Xtext 2.10.0
 */
package org.xtext.mdsl;

import org.xtext.mdsl.MDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MDSLStandaloneSetup extends MDSLStandaloneSetupGenerated {
  public static void doSetup() {
    MDSLStandaloneSetup _mDSLStandaloneSetup = new MDSLStandaloneSetup();
    _mDSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}