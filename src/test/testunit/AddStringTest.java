package testunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringTest {
    AddString addString = new AddString();
    @Test
    void add() {
        assertEquals(addString.add("가나다","가나다"),"가나다가나다");
    }
}