//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.12.10 às 03:47:12 PM GFT 
//


package br.com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wstutorial.ws.tutorialservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TutorialFault_QNAME = new QName("http://www.wstutorial.com/ws/TutorialService", "tutorialFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wstutorial.ws.tutorialservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateTutorialRequest }
     * 
     */
    public UpdateTutorialRequest createUpdateTutorialRequest() {
        return new UpdateTutorialRequest();
    }

    /**
     * Create an instance of {@link TutorialType }
     * 
     */
    public TutorialType createTutorialType() {
        return new TutorialType();
    }

    /**
     * Create an instance of {@link UpdateTutorialResponse }
     * 
     */
    public UpdateTutorialResponse createUpdateTutorialResponse() {
        return new UpdateTutorialResponse();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link DeleteTutorialRequest }
     * 
     */
    public DeleteTutorialRequest createDeleteTutorialRequest() {
        return new DeleteTutorialRequest();
    }

    /**
     * Create an instance of {@link DeleteTutorialResponse }
     * 
     */
    public DeleteTutorialResponse createDeleteTutorialResponse() {
        return new DeleteTutorialResponse();
    }

    /**
     * Create an instance of {@link GetTutorialsx }
     * 
     */
    public GetTutorialsx createGetTutorialsx() {
        return new GetTutorialsx();
    }

    /**
     * Create an instance of {@link GetTutorialsResponse }
     * 
     */
    public GetTutorialsResponse createGetTutorialsResponse() {
        return new GetTutorialsResponse();
    }

    /**
     * Create an instance of {@link TutorialTypes }
     * 
     */
    public TutorialTypes createTutorialTypes() {
        return new TutorialTypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wstutorial.com/ws/TutorialService", name = "tutorialFault")
    public JAXBElement<String> createTutorialFault(String value) {
        return new JAXBElement<String>(_TutorialFault_QNAME, String.class, null, value);
    }

}