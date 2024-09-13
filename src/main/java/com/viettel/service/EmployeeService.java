package com.viettel.service;

import com.viettel.entity.Employee;
import com.viettel.repository.EmployeeRepository;
//import com.tranchien.altek.EmployeeInfo;
//import com.tranchien.altek.GetEmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

//    public GetEmployeeResponse getEmployeeById(Long id)
//    {
//        GetEmployeeResponse response = new GetEmployeeResponse();
//        EmployeeInfo info = new EmployeeInfo();
//        Employee employee = employeeRepository.findById(id).get();
//        info.setEmployeeId(employee.getId());
//        info.setName(employee.getName());
//        info.setDepartment(employee.getDepartment());
//        info.setAddress(employee.getAddress());
//        info.setPhone(employee.getPhone());
//        response.setEmployeeInfo(info);
//        return response;
//    }

}
