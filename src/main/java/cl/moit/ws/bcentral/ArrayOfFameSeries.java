//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 07:00:05 PM CLT 
//


package cl.moit.ws.bcentral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFameSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFameSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fameSeries" type="{http://web.service.sdmx.sdms.sungard.com/}fameSeries" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFameSeries", propOrder = {
    "fameSeries"
})
public class ArrayOfFameSeries {

    @XmlElement(namespace = "http://bancocentral.org/", nillable = true)
    protected List<FameSeries> fameSeries;

    /**
     * Gets the value of the fameSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fameSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFameSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FameSeries }
     * 
     * 
     */
    public List<FameSeries> getFameSeries() {
        if (fameSeries == null) {
            fameSeries = new ArrayList<FameSeries>();
        }
        return this.fameSeries;
    }

}