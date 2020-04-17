package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyRus",  namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"fullName","shortName", "inn", "kpp",
																								"ogrn", "okpo","bic", "asvNsiCode","sparkid" })
public class CompanyRus {

/**Полное наименование*/
	@XmlElement(required = false)
	public String fullName;

/**Краткое наименование*/
	@XmlElement(required = false)
	public String shortName;

	@XmlElement(required = true)
	public String inn;

	@XmlElement(required = true)
	public String okpo;

	@XmlElement(required = true)
	public String bic;

	@XmlElement
	public String kpp;

	@XmlElement
	public String ogrn;

	@XmlElement(name = "asv_nsi_code")
	public String asvNsiCode;

	@XmlElement
	public String sparkid;






}
