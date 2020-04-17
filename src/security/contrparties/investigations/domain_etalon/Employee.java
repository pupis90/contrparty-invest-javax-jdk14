package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee",  namespace = "http://spi2.ru/jaxws/datatypes")
public class Employee {
	/**
	 * Табельный номер
	 */
	@XmlElement(name = "PersonnelNumber", required = true)
	public String personnelNumber;


}
