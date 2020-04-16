package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Passport", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"series", "number"})
public class Passport {

	@XmlElement(required = true)
	protected String series;

	@XmlElement(required = true)
	protected String number;

	/**
	 * Gets the value of the series property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * Sets the value of the series property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setSeries(String value) {
		this.series = value;
	}

	/**
	 * Gets the value of the number property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the value of the number property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setNumber(String value) {
		this.number = value;
	}

}
