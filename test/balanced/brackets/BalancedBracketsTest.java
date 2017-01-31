package balanced.brackets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalancedBracketsTest {

	BalancedBrackets bb;

	@Before
	public void setup() {
		bb = new BalancedBrackets();
	}

	@Test
	public void testBalancedBracket() {
		String bracket = "[[[[]]]]";
		String bracket2 = "{[()]}";
		String bracket3 = "{{[[(())]]}}";

		Assert.assertEquals("YES", bb.isBalanced(bracket));
		Assert.assertEquals("YES", bb.isBalanced(bracket2));
		Assert.assertEquals("YES", bb.isBalanced(bracket3));
	}

	@Test
	public void testUnbalancedString() {
		String unbalanced = "{[(])}";
		Assert.assertEquals("NO", bb.isBalanced(unbalanced));
	}

	@Test
	public void testEmptyString() {
		Assert.assertEquals("YES", bb.isBalanced(""));
	}
	
	@Test
	public void testBrokenCase(){
		Assert.assertEquals("NO", bb.isBalanced("[{"));
	}

	@Test
	public void missingTest(){
		String[] strings = { "()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}",
		"{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[",
		"[)](][[([]))[)",
		"]}]){[{{){",
		"{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){[",
		"()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})",
		"){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{",
		"[(})])}{}}]{({[]]]))]})]",
		"[{",
		"{}([{()[]{{}}}])({})",
		"{({}{[({({})([[]])}({}))({})]})}",
		"()[]",
		"{)[])}]){){]}[(({[)[{{[((]{()[]}][([(]}{](])()(}{(]}{})[)))[](){({)][}()((",
		"[][(([{}])){}]{}[()]{([[{[()]({}[])()()}[{}][]]])}",
		"(}]}",
		"(([{()}]))[({[{}{}[]]{}})]{((){}{()}){{}}}{}{{[{[][]([])}[()({}())()({[]}{{[[]]([])}})()]]}}",
		"[(([){[](}){){]]}{}([](([[)}[)})[(()[]){})}}]][({[}])}{(({}}{{{{])({]]}[[{{(}}][{)([)]}}",
		"()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]",
		"({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[",
		")}(()[])(}]{{{}[)([})]()}()]}(][}{){}}})}({](){([()({{(){{",
		"}([]]][[){}}[[)}[(}(}]{(}[{}][{}](}]}))]{][[}(({(]}[]{[{){{(}}[){[][{[]{[}}[)]}}]{}}(}",
		"{[()]}",
		"{[(])}",
		"{{[[(())]]}}"
		};
		
		String[] template = {"YES","NO","NO","NO","NO","NO","NO","NO","NO","YES","YES","YES","NO","YES","NO","YES","NO","YES","NO","NO","NO","YES","NO","YES"};
		String[] result = new String[strings.length];
		int i =0;
		for (String string : strings) {
			result[i] = bb.isBalanced(string);
			i++;
		}
		
		Assert.assertArrayEquals(result, template);
	
	}
}
