import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class T {private M m;
 @BeforeEach void i() throws Exception { m = new M();}  @Test void tA() {m.a("B", "C", 15);assertEquals(1, m.aList.size());assertEquals("B", m.aList.get(0).n);assertEquals(15, m.aList.get(0).y);}
 @Test void tS() {H h = new H("B", 0, 15);m.aList.add(h);m.s(h, 40);assertEquals(40, h.x);}
 @Test void tP() { m.a("J", "H", 20);m.a("B", "C", 30);m.a("J", "S", 50);m.s(m.aList.get(0), 45);m.s(m.aList.get(1), 45);m.s(m.aList.get(2), 45);ArrayList<Double> p = m.p();
 assertEquals(950.0, p.get(0));assertEquals(1350.0, p.get(1));assertEquals(2000.0, p.get(2));m.s(m.aList.get(0), 20);
 m.s(m.aList.get(1), 35);m.s(m.aList.get(2), 0);
ArrayList<Double> p2 = m.p();
assertEquals(400.0, p2.get(0)); assertEquals(1050.0, p2.get(1));assertEquals(2000.0, p2.get(2));}}