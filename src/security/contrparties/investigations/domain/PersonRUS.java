package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonRUS",  namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"firstName", "secondName", "lastName", "inn", "socialSecurityNumber", "birthDate",
									   "birthPlace", "passport","asvNsiCode"})
public class PersonRUS   {

	@XmlElement
	public String firstName;

	@XmlElement
	public String secondName;

	@XmlElement
	public String lastName;

	@XmlElement(name = "inn", required = true)
	public String inn;

	@XmlElement
	public String socialSecurityNumber;

	@XmlSchemaType(name = "date")
	public XMLGregorianCalendar birthDate;

	@XmlElement
	public String birthPlace;

	@XmlElement
	public Passport passport;

	@XmlElement(name = "asv_nsi_code")
	public String asvNsiCode;


}
