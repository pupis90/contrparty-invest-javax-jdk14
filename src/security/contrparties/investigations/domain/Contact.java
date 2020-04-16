package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Представитель Контрагента на этапах регистрации, начала и окончания конкурсной процедуры
 * Для Договора не заполняется
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"fio","firstName", "secondName", "lastName", "inn", "post","phone","email","language"})

public class Contact {

	/**ФИО*/
	@XmlElement
	public String fio;
	/** Имя */
	@XmlElement
	public String firstName;

	/** Отчество */
	@XmlElement
	public String secondName;

	/** Фамилия */
	@XmlElement
	public String lastName;

	/** ИНН */
	@XmlElement
	public String inn;


	/**Должность*/
	@XmlElement
	public String post;

	/** Телефон */
	@XmlElement
	public String phone;

	/** Адрес электроннной почты */
	@XmlElement
	public String email;

	/** Язык */
	@XmlElement
	public String language;


}
