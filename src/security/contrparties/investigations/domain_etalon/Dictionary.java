package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dictionary",  namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"code","description"})
public class Dictionary {
	@XmlElement(required = true)
	public String code; //2.1.	Код уникален  ответ Богаткина (КИС)
	public String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

