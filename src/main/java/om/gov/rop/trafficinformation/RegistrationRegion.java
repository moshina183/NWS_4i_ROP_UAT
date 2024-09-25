
package om.gov.rop.trafficinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationRegion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="registrationRegion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="FOR"/&gt;
 *     &lt;whiteSpace value="preserve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "registrationRegion")
@XmlEnum
public enum RegistrationRegion {

    LOC,
    FOR;

    public String value() {
        return name();
    }

    public static RegistrationRegion fromValue(String v) {
        return valueOf(v);
    }

}
