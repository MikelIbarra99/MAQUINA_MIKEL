package com.maquina;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMaquina {
	
	private Maquina me;

	@Before
	public void setUp() throws Exception {
		
		
		me = new Maquina(100);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testVenderSinStok() {
		
		Refresco[]  r = {new Refresco("cola",2), new Refresco("cola",2), new Refresco("cola",2), };
		
		double espero = -1.0;
		double compro = 4;
		
		me.vender(100, 0);
		me.vender(100, 1);
		me.vender(100, 2);
		me.vender(100, 3);
		
		if(espero != compro)
				fail("Error. Debe devolver -1");
	}
	//creo que tiene que dar fallo
	

}
