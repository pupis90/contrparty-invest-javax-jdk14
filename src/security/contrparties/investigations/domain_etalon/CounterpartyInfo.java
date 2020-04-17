package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyInfo",  namespace = "http://spi2.ru/jaxws/datatypes")
public class CounterpartyInfo {

	/** Код компании в АСВ НСИ*/
	@XmlElement(required = true)
	public String asvnsicode ;

}
