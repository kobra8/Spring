package com.kobra.kursspring;

import com.kobra.kursspring.domain.Castle;
import com.kobra.kursspring.domain.Knight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KursspringApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	Castle castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCastle() {
		String except = "Znajduje się tu zamek o nazwie \"East Watch\" którego mieszkańcem jest: Rycerz o imieniu Lancelot( 29 ) i ma zadanie Uratuj księżniczkę";
		assertEquals(except, castle.toString());
	}
}
