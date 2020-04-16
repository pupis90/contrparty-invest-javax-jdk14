package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header",  namespace = "http://spi2.ru/jaxws/datatypes")
public class Header {

	@XmlElement(required = true)
	protected long requestid;
	@XmlElement(required = true)
	protected String externalsystem;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	public javax.xml.datatype.XMLGregorianCalendar requestdate;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	public javax.xml.datatype.XMLGregorianCalendar senddate;

}
