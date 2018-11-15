package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError1() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numbertowords1() {
		Assert.assertEquals( "Error", " one", numberWords.toWords( 1 ) ) ;
	}
	
	@Test
	public void numbertowords2() {
		Assert.assertEquals( "Error", " two", numberWords.toWords( 2 ) ) ;
	}
	
	@Test
	public void numbertowords3() {
		Assert.assertEquals( "Error", " nine", numberWords.toWords( 9 ) ) ;
	}
	
	@Test
	public void numbertowords4() {
		Assert.assertEquals( "Error", " twenty  one", numberWords.toWords( 21 ) ) ;
	}
	
	@Test
	public void numbertowords5() {
		Assert.assertEquals( "Error", " ninety  nine", numberWords.toWords( 99 ) ) ;
	}
	
	@Test
	public void numbertowords6() {
		Assert.assertEquals( "Error", "one hundred", numberWords.toWords( 100 ) ) ;
	}
	
	@Test
	public void numbertowords7() {
		Assert.assertEquals( "Error", "nine hundred ninety nine", numberWords.toWords( 999 ) ) ;
	}
	
//	@Test
//	public void numbertowords6() {
//		Assert.assertEquals( "Error", " one  fifty  five", numberWords.toWords( 155 ) ) ;
//	}
}