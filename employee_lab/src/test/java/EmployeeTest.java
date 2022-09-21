import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;
    Director director;


    @Before
    public void setUp(){
        manager = new Manager("Stev", "QQ123456C", 50000, "Admin");
        director = new Director("Bob", "C654321QQ", 80000, 100000);

    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(60000, manager.getSalary(), 0.0);
    }


    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(50500, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeName(){
        manager.setName("Billy");
        assertEquals("Billy", manager.getName());
    }

    @Test
    public void cannotTakeNullToChangeName(){
        manager.setName("");
        assertEquals("Stev", manager.getName());
    }
}
