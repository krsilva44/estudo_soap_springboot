//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.12.10 às 03:47:12 PM GFT 
//


package br.com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tutorialType" type="{http://www.wstutorial.com/ws/TutorialService}TutorialType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tutorialType"
})
@XmlRootElement(name = "updateTutorialRequest")
public class UpdateTutorialRequest {

    @XmlElement(required = true)
    protected TutorialType tutorialType;

    /**
     * Obtém o valor da propriedade tutorialType.
     * 
     * @return
     *     possible object is
     *     {@link TutorialType }
     *     
     */
    public TutorialType getTutorialType() {
        return tutorialType;
    }

    /**
     * Define o valor da propriedade tutorialType.
     * 
     * @param value
     *     allowed object is
     *     {@link TutorialType }
     *     
     */
    public void setTutorialType(TutorialType value) {
        this.tutorialType = value;
    }

}
