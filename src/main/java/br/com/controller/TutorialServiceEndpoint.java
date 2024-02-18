package br.com.controller;

import br.com.ws.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class TutorialServiceEndpoint {
    private static final String NAMESPACE_URI = "http://www.wstutorial.com/ws/TutorialService";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateTutorialRequest" )
    @ResponsePayload
    public UpdateTutorialResponse updateTutorial(@RequestPayload UpdateTutorialRequest request)throws Exception  {
        ObjectFactory factory = new ObjectFactory();
        StatusCode code = factory.createStatusCode();
        UpdateTutorialResponse response = factory.createUpdateTutorialResponse();
        code.setCode(200);
        response.setStatusCode(code);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteTutorialRequest" )
    @ResponsePayload
    public DeleteTutorialResponse deleteTutorial(@RequestPayload DeleteTutorialRequest request)throws Exception  {
        System.out.println("-->deleteTutorial<--");
        ObjectFactory factory = new ObjectFactory();
        DeleteTutorialResponse response = factory.createDeleteTutorialResponse();
        StatusCode code = factory.createStatusCode();
        code.setCode(204);
        response.setStatusCode(code);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTutorialsx" )
    @ResponsePayload
    public GetTutorialsResponse getTutorials(@RequestPayload GetTutorialsx request)throws Exception  {
        ObjectFactory factory = new ObjectFactory();
        GetTutorialsResponse response = factory.createGetTutorialsResponse();

        List<TutorialType> tutorials = getTutorials();

        response.getTutorials().addAll(tutorials);
        return response;
    }

    private List<TutorialType> getTutorials() {
        List<TutorialType> tutorials= new ArrayList<TutorialType>();
        TutorialType tut1 = new TutorialType();
        tut1.setAuthor("John Doe");
        tut1.setId(15l);
        tut1.setName("Web Service with spring boot");

        TutorialType tut2 = new TutorialType();
        tut2.setAuthor("John Doe");
        tut2.setId(152);
        tut2.setName("Web Service with spring boot");

        tutorials.add(tut1);
        tutorials.add(tut2);
        return tutorials;
    }

}
