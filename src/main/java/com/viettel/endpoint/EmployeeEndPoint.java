package com.viettel.endpoint;

import com.tranchien.altek.*;
import com.viettel.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndPoint {

    private static final String NAMESPACE_URL = "http://altek.tranchien.com";
    @Autowired
    private EmployeeService employeeService;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "GetEmployeeByIdRequest")
    @ResponsePayload
    public GetEmployeeResponse getEmployeeById(@RequestPayload GetEmployeeByIdRequest request)
    {
        GetEmployeeResponse response = new GetEmployeeResponse();
        EmployeeInfo info = new EmployeeInfo();
        info.setName("Trần Hữu Chiến");
        response.setEmployeeInfo(info);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "GetMessageById")
    @ResponsePayload
    public GetMessageResponse getMessage(@RequestPayload GetMessageById request)
    {
        GetMessageResponse response = new GetMessageResponse();
        response.setMessage("Trần Hữu Chiến");
        return response;
    }
}
