package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankDetail",  namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"country", "bic",
																									"swift", "checkingAccount", "accountCurrency", "bankName",
																									"correspondentAccount", "bankAddress"})
public class BankDetail {

	/** Страна */
	@XmlElement(required = true)
	public String country;
	/** БИК */
	@XmlElement(required = true)
	public String  bic;

	/** SWIFT */
	@XmlElement(required = true)
	public String swift;

	/** Счет */
	@XmlElement(required = true)
	public String checkingAccount;

	/** Валюта счета */
	@XmlElement(required = true)
	public String accountCurrency;

	/** Наименование банка */
	public String bankName;

	/** Корр. Счет */
	public String  correspondentAccount;

	/** Адрес банка */
	public String bankAddress;

}
