package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


@XmlType(name = "Offer",  namespace = "http://spi2.ru/jaxws/datatypes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Offer {

	/** Cумма предложения с НДС*/

	@XmlElement(namespace = "http://spi2.ru/jaxws/datatypes")
	public BigDecimal offertaAmmount;

	@XmlElement(namespace = "http://spi2.ru/jaxws/datatypes")
	public BigDecimal sap_srm_id;



}
