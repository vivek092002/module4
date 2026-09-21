package org.vivek.module4.clients.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.vivek.module4.clients.EmployeeClient;
import org.vivek.module4.dto.EmployeeDTO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeClientImpl implements EmployeeClient {

    private final RestClient restClient;

    @Override
    public List<EmployeeDTO> getAllEmployees() {

        try {
            List<EmployeeDTO> employeeDTOList = restClient.get()
                    .uri("employees")
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });
            return employeeDTOList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
