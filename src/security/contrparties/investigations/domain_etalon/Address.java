package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address",  namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"addrType","mailBox", "country","city", "postalCode", "street", "house","room"})
public class Address {

	@XmlElement (required = true)
    public AddressTypes addrType;
	@XmlElement
	public	String mailBox;
	@XmlElement(required = true)
	public	String country;
	@XmlElement(required = true)
	public	String city;
	@XmlElement(required = true)
	public	String postalCode;
	@XmlElement(required = true)
	public	String street;
	@XmlElement(required = true)
	public	String house;
	@XmlElement
	public	String room;


}
