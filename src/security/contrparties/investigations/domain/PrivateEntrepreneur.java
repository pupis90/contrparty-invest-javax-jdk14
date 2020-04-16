package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Индивидуальный предприниматель
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateEntrepreneur",  namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"inn", "ogrnip", "fio", "okpo","asvNsiCode","sparkid"})
public class PrivateEntrepreneur  {


	@XmlElement(name = "inn", required = true)
	public String inn;

	@XmlElement(name = "ogrnip", required = true)
	public String ogrnip;

	@XmlElement(name = "fio", required = false)
	public String fio;

	@XmlElement
	public String okpo;

	@XmlElement(name = "asv_nsi_code")
	public String asvNsiCode;

	@XmlElement
	public String sparkid;

}
