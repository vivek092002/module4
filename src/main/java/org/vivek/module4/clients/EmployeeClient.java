package org.vivek.module4.clients;

import org.vivek.module4.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeClient {

    List<EmployeeDTO> getAllEmployees();

}
