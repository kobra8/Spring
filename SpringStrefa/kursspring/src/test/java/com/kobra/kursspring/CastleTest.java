package com.kobra.kursspring;

import com.kobra.kursspring.domain.Castle;
import com.kobra.kursspring.domain.Knight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    @Test
    public void castlrToStringMessage() {
        Knight knight = new Knight();
        Castle castle = new Castle(knight);
        String except = "Znajduje się tu zamek o nazwie \"East Watch\" którego mieszkańcem jest: Rycerz o imieniu Lancelot( 29 ) i ma zadanie Uratuj księżniczkę";
        assertEquals(except, castle.toString());
    }
}
