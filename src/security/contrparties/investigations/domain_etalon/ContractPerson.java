package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractPerson", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"role", "employee", "function" })
public class ContractPerson {


	public Dictionary role;

	@XmlElement(required = true)
	public Employee  employee;

	public Dictionary function;

}
