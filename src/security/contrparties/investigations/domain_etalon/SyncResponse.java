package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncResponse", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"resultCode", "resultMessage"})
public class SyncResponse {

	//Код результата, ошибки
	@XmlElement
	public String resultCode;

	//Сообщение
	@XmlElement(required = true)
	public String resultMessage;


	/**
	 * Gets the value of the resultCode property.
	 *
	 */
	public String getResultCode() {
		return resultCode;
	}

	/**
	 * Sets the value of the resultCode property.
	 *
	 */
	public void setResultCode(String value) {
		this.resultCode = value;
	}

	/**
	 * Gets the value of the resultMessage property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * Sets the value of the resultMessage property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setResultMessage(String value) {
		this.resultMessage = value;
	}


}
