/*
 * generated by Xtext 2.10.0
 */
package org.xtext.mdsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mdsl.parser.antlr.internal.InternalMDSLParser;
import org.xtext.mdsl.services.MDSLGrammarAccess;

public class MDSLParser extends AbstractAntlrParser {

	@Inject
	private MDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMDSLParser createParser(XtextTokenStream stream) {
		return new InternalMDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}