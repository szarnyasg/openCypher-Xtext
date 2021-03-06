package io.codekontor.opencypher.xtext.tests

import org.junit.Test
import io.codekontor.opencypher.xtext.openCypher.Cypher
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Collections
import io.codekontor.opencypher.xtext.openCypher.ReturnItems
import io.codekontor.opencypher.xtext.openCypher.ReturnItem
import java.util.List
import io.codekontor.opencypher.xtext.openCypher.FunctionInvocation
import static com.google.common.base.Preconditions.checkNotNull
import junit.framework.Assert

class Backtick_Test extends AbstractCypherTest {

	@Test
	def void backtick_1() {
		test('''
			MATCH (`person_a`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`person_a`)-[:KNOWS]->(`person_c`)
			RETURN `person_a`, `person_c`
		''');
	}

	@Test
	def void backtick_2() {
		test('''
			MATCH (`person_a`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`person_a`)-[:KNOWS]->(`person_c`)
			RETURN person_a, person_c
		''');
	}

	@Test
	def void backtick_3() {
		test('''
			MATCH (`person a`:Person {test:'Jim'})-[:KNOWS]->(`person b`)-[:KNOWS]->(`person c`),
			(`person a`)-[:KNOWS]->(`person c`)
			RETURN `person a`, `person c`
		''');
	}
	
	@Test
	def void backtick_4() {
		test('''
			MATCH (`with space`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`with space`)-[:KNOWS]->(`person_c`)
			RETURN `with space`, `person_c`
		''');
	}
	
	@Test
	def void backtick_5() {
		test('''
			MATCH (`with german umlaut �`:Person {test:'Jim'})-[:KNOWS]->(`person_b`)-[:KNOWS]->(`person_c`),
			(`with german umlaut �`)-[:KNOWS]->(`person_c`)
			RETURN `with german umlaut �`, `person_c`
		''');
	}
}
