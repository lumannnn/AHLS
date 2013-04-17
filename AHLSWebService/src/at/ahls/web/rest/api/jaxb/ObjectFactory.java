//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 04:34:43 PM MESZ 
//


package at.ahls.web.rest.api.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.ahls.web.rest.api.jaxb package. 
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

    private final static QName _LightsData_QNAME = new QName("http://www.ahls.at/AHLS_WebService", "lights-data");
    private final static QName _User_QNAME = new QName("http://www.ahls.at/AHLS_WebService", "user");
    private final static QName _Activity_QNAME = new QName("http://www.ahls.at/AHLS_WebService", "activity");
    private final static QName _LightData_QNAME = new QName("http://www.ahls.at/AHLS_WebService", "light-data");
    private final static QName _Activities_QNAME = new QName("http://www.ahls.at/AHLS_WebService", "activities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.ahls.web.rest.api.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActivityDto }
     * 
     */
    public ActivityDto createActivityDto() {
        return new ActivityDto();
    }

    /**
     * Create an instance of {@link ActivitiesDto }
     * 
     */
    public ActivitiesDto createActivitiesDto() {
        return new ActivitiesDto();
    }

    /**
     * Create an instance of {@link LightDataDto }
     * 
     */
    public LightDataDto createLightDataDto() {
        return new LightDataDto();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link LightsDataDto }
     * 
     */
    public LightsDataDto createLightsDataDto() {
        return new LightsDataDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightsDataDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ahls.at/AHLS_WebService", name = "lights-data")
    public JAXBElement<LightsDataDto> createLightsData(LightsDataDto value) {
        return new JAXBElement<LightsDataDto>(_LightsData_QNAME, LightsDataDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ahls.at/AHLS_WebService", name = "user")
    public JAXBElement<UserDto> createUser(UserDto value) {
        return new JAXBElement<UserDto>(_User_QNAME, UserDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ahls.at/AHLS_WebService", name = "activity")
    public JAXBElement<ActivityDto> createActivity(ActivityDto value) {
        return new JAXBElement<ActivityDto>(_Activity_QNAME, ActivityDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LightDataDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ahls.at/AHLS_WebService", name = "light-data")
    public JAXBElement<LightDataDto> createLightData(LightDataDto value) {
        return new JAXBElement<LightDataDto>(_LightData_QNAME, LightDataDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivitiesDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ahls.at/AHLS_WebService", name = "activities")
    public JAXBElement<ActivitiesDto> createActivities(ActivitiesDto value) {
        return new JAXBElement<ActivitiesDto>(_Activities_QNAME, ActivitiesDto.class, null, value);
    }

}
