import com.employee.model.Address;
import com.employee.model.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.employee.controller.EmployeeDetails.*;

public class EmployeeDetailsTest {
    List<Employee> employees;

    @Before
    public void firstTestCase() throws IOException {
        employees = convertObjectToJson();
    }

    @Test
    public void convertObjectToJsonTest() {
        Assert.assertEquals( 16, employees.size() );
    }

    @Test
    public void getEmployeesByTheirPostcodeTest() {
        Assert.assertEquals( 7, getEmployeesListByTheirPostcode( employees ).size() );
    }

    @Test
    public void getEmployeesMapByTheirPostCodesTest(){
        Assert.assertEquals( 3,getEmployeesMapByTheirPostCodes(employees).keySet().size() );
    }

    @Test
    public void getEmployeesByTheirAgeTest(){
        Assert.assertEquals( 7,getEmployeesByTheirAge(employees).size() );
    }

    @Test
    public void getEmployeeIdsTest(){
        Assert.assertEquals( 5,getEmployeeId(employees).size() );
    }
}
