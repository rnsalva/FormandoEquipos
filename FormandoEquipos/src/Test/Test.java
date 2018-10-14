package Test;

import static org.junit.Assert.*;

import io.Formar;

public class Test {

	@org.junit.Test
	public void testEjemplo() {
		Formar fr = new Formar(new String[]{"abafj", "abcac", "abcad", "abade", "abaej", "abcee "}, 5);
		assertArrayEquals(new String[]{"32","abca"},fr.resolver());
	}

	public void testSolo1(){
		Formar fr = new Formar(new String[]{"abafj"},5);
		assertArrayEquals(new String[]{"0",""},fr.resolver());
	}
	
	public void testSolo2(){
		Formar fr = new Formar(new String[]{"abafj","aaaaa"},5);
		assertArrayEquals(new String[]{"2","a"},fr.resolver());
	}
	
	public void testNingunoIgual(){
		Formar fr = new Formar(new String[]{"aaaaa","bbbbb", "ccccc", "ddddd"},5);
		assertArrayEquals(new String[]{"25","aaaaa"},fr.resolver());
	}
	
	public void testTenerEnCuentaAlUltimo(){
		Formar fr = new Formar(new String[]{"aaaaa","bbbbb", "ccccc", "ddddd", "aaaae"},5);
		assertArrayEquals(new String[]{"32","aaaa"},fr.resolver());
	}
}
