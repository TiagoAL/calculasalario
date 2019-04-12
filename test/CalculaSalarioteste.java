import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import calculasalario.CalculaSalario;


public class CalculaSalarioteste{
    
    private CalculaSalario c;
    @Before
    public void inicializa(){
        c = new CalculaSalario();
    }
    @Test 
    public void testaCalcula1() {
	c.setCargo("desenvolvedor");
	c.setSalario(3000);
        assertEquals(2400,c.calcula());
    }
    @Test 
    public void testaCalcula2() {
	c.setCargo("desenvolvedor");
	c.setSalario(2500);
        assertEquals(2250,c.calcula());
    }
    @Test 
    public void testaCalcula3() {
	c.setCargo("dba");
	c.setSalario(2000);
        assertEquals(1500,c.calcula());
    }
    @Test
    public void testaCalcula4(){
        c.setCargo("dba");
        c.setSalario(1500);
        assertEquals(1275,c.calcula());
    }
    @Test
    public void testaCalcula5(){
        c.setCargo("testador");
        c.setSalario(2300);
        assertEquals(1725,c.calcula());
    }
    @Test
    public void testaCalcula6(){
        c.setCargo("testador");
        c.setSalario(1900);
        assertEquals(1615,c.calcula());
    }
    @Test
    public void testaCalcula7(){
        c.setCargo("gerente");
        c.setSalario(5000);
        assertEquals(3500,c.calcula());
    }
    @Test
    public void testaCalcula8(){
        c.setCargo("gerente");
        c.setSalario(4000);
        assertEquals(3200,c.calcula());
    }
}
        
	

