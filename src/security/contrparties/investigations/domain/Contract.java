package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

/**  Контракт в КИС  */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract",  namespace = "http://spi2.ru/jaxws/datatypes",
propOrder = {"contractId","docDate","cardDate","userConractId","siburOrg","registrationNumber","registrationDate",
		"counterpartyInfo","contractUrl","procedureNumber", "subject","subCategory","kind","ddKind","vvAmount","transactionAmount","totalAmount",
		"framework","advancePaymentType","advancePaymentAmount","postponement","vzKind","safeList","isDefault","urgent","approvalStage","version",
         "receiveDate", "completeonDate","visa","note","be","contractPersons"})
public class Contract {

	/** Идентификатор Договора - Системный Ид – присваивается системой, уникальный в рамках всего репозитория */
	@XmlElement(name = "contract_id",  required = true)
	@XmlSchemaType(name = "string")
	public String contractId;

	/** Дата документа в КИС */
	@XmlElement(name = "doc_date", required = true)
	@XmlSchemaType(name = "date")
	public javax.xml.datatype.XMLGregorianCalendar docDate;

	/**Дата создания РК в КИС*/
	@XmlElement(name = "card_date", required = true)
	@XmlSchemaType(name = "date")
	public javax.xml.datatype.XMLGregorianCalendar 	cardDate;

	/**	Идентификатор договора, отображаемый для пользователя. Уникален в рамках вида документа + Организация */
	@XmlElement(name = "user_conract_id")
	public String userConractId;

	/** URI контракта в КИС */
//	@XmlSchemaType(name = "anyURI")
//	public java.net.URI contractUri;

	// Организация Сибур - Справочник
	@XmlElement(name = "sibur_org")
	public Dictionary  siburOrg;

	/**Регистрационный номер договора (как на самом договоре) */
	@XmlElement(name = "reg_num", required = true)
	public String registrationNumber;

	/** Дата регистрации договора */
	@XmlElement(name = "reg_date", required = true)
	@XmlSchemaType(name = "date")
	public javax.xml.datatype.XMLGregorianCalendar registrationDate;

	/** Информация о Контрагенте, для которого требуется Заключение СБ - {Российская компания | ИП
	 * | ФЛ - Резидент | Иностранная компания
	 *  Передается только АСВ НСИ код контрагента
	 */
	@XmlElement(name="counterparty_info",required = true)
	//public Counterparty counterparty;
	public CounterpartyInfo counterpartyInfo;

	/** Ссылка на договор в КИС	*/
	@XmlElement(name="contract_url")
	public String contractUrl;

	/** Номер КП  - уникальный номер тендерной процедуры, на основании которой заключается Договор */
	@XmlElement(name ="procedure_number", required = false)
	public String procedureNumber;


	/** Предмет договора*/
	@XmlElement(name ="subject", required = false)
	public String subject;

	/** Подтип договоора, напр. Договор */
	@XmlElement(name ="sub_category", required = false)
	public Dictionary subCategory;

	/** Вид договора, напр. Дополнительное соглашение, Договорное письмо */
	@XmlElement(name ="kind", required = false)
	public Dictionary kind;

	/** Вид ДД, напр. Покупка (закупка) внутренний рынок, но часто дублирует Вид договора*/
	@XmlElement(name ="kind_dd", required = false)
	public Dictionary ddKind;

	/** Сумма в ВВ */
	@XmlElement(name ="amount_vv", required = false)
	public BigDecimal vvAmount; // Сумма в ВВ

	/** Сумма сделки в рублях */
	@XmlElement(name ="amount_transaction", required = false)
	public BigDecimal transactionAmount; // Сумма сделки

	/** Сумма общая в рублях */
	@XmlElement(name ="amount_total", required = false)
	public BigDecimal totalAmount; // Сумма общая

	/** Рамочный? Является ли рамочным (да, нет) */
	@XmlElement(name ="framework", required = false)
	public boolean framework; //

	/** Аванисирование договора*/
	@XmlElement(name ="advance_payment_type", required = false)
	public Dictionary advancePaymentType;

	/** Сумма аванса в рублях */
	@XmlElement(name ="advance_payment_amount", required = false)
	public BigDecimal advancePaymentAmount;

	/** Отсрочка ? Наличие отсрочки (да, нет) */
	@XmlElement(name ="postponement", required = false)
	public boolean postponement;

	/** Вид вз. */
	@XmlElement(name ="kind_vz", required = false)
	public Dictionary vzKind;

	/** Входит в Safe-лист ?*/
	@XmlElement(name ="safe_list", required = false)
	public boolean safeList;

	/** Стандартный  ? , напр. Не стандартный*/
	@XmlElement(name ="is_default", required = false)
	public String isDefault;

	/** Срочный , напр. СРОЧНЫЙ*/
	@XmlElement(name ="urgent", required = false)
	public String urgent;

	/** Cтатус */
	@XmlElement(name ="approval_stage", required = false)
	public Dictionary approvalStage;

	/** Версия, напр. 001.003.001.000 	 */
	@XmlElement(name ="version", required = false)
	public String version;

	/**Дата и время получения */
	@XmlElement(name ="receive_date", required = false)
	@XmlSchemaType(name = "dateTime")
	public javax.xml.datatype.XMLGregorianCalendar receiveDate;

	/** Дата и время завершения */
	@XmlElement(name ="completeon_date", required = false)
	@XmlSchemaType(name = "dateTime")
	public javax.xml.datatype.XMLGregorianCalendar completeonDate;

	/** Ранее проставленная Виза - для исторических данных */
	@XmlElement(name ="visa", required = false)
	public Dictionary visa;

	/** Замечания */
	@XmlElement(name ="note", required = false)
	public String note;

	/** Бизнес единица */
	@XmlElement(name ="be", required = false)
	public Dictionary be; // БЕ - бизнес единица


	/** Сотрудники, связанные с Договором на ролях: ИНИЦ, ОЛД, ЛУП, АВТ, ЛСД ...*/
	@XmlElement(name ="person_list", required = false)
	public	List<ContractPerson> contractPersons;


}
