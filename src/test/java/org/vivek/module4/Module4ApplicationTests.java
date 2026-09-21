package org.vivek.module4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.vivek.module4.clients.EmployeeClient;
import org.vivek.module4.dto.EmployeeDTO;

import java.util.List;

@SpringBootTest
class Module4ApplicationTests {

    @Autowired
    private EmployeeClient employeeClient;

    @Test
    void getAllEmployees(){
        List<EmployeeDTO> employeeDTOList = employeeClient.getAllEmployees();
        System.out.println(employeeDTOList);
    }

}
