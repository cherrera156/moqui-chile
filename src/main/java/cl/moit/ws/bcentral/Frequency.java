//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 07:00:05 PM CLT 
//


package cl.moit.ws.bcentral;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="frequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="SEMIANNUAL"/>
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="QUARTERLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="ANNUAL"/>
 *     &lt;enumeration value="DAILY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "frequency", namespace = "http://web.service.sdmx.sdms.sungard.com/")
@XmlEnum
public enum Frequency {

    UNDEFINED,
    SEMIANNUAL,
    WEEKLY,
    QUARTERLY,
    MONTHLY,
    ANNUAL,
    DAILY;

    public String value() {
        return name();
    }

    public static Frequency fromValue(String v) {
        return valueOf(v);
    }

}
