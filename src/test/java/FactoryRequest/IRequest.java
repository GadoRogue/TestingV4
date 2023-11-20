package FactoryRequest;

import io.restassured.response.Response;

import javax.print.attribute.standard.RequestingUserName;

public interface IRequest {


    Response send(RequestInfo requestInfo);
}
