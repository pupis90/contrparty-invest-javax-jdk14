package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Иностранная компания
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyForeign", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"regNum", "regDate",
																								"issuingAuthority", "fullName", "shortName", "nativeName",
																									"nativeShortName","country", "phoneNumber", "email", "site","asvNsiCode","addresses" })
public class CompanyForeign {

	@XmlElement(required = true)
	public	String regNum;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	public javax.xml.datatype.XMLGregorianCalendar regDate;
	/** Регистрирующий орган */
	@XmlElement(required = true)
	public	String issuingAuthority;
	@XmlElement(required = true)
	public	String fullName;
	@XmlElement(required = true)
	public	String shortName;
	@XmlElement(required = true)
	public	String nativeName;
	@XmlElement
	public	String nativeShortName;
	@XmlElement(required = true)
	public String country;
	@XmlElement(required = true)
	public	String phoneNumber;
	@XmlElement(required = true)
	public	String email;
	@XmlElement(required = true)
	public	String site;
	@XmlElement(name = "asv_nsi_code")
	public String asvNsiCode;

	/** Адреса компании */
	@XmlElement(required = true)
	public List<Address> addresses;


}
