package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty", namespace = "http://spi2.ru/jaxws/datatypes",
		propOrder = {"isNew", "needAtributeUpdate", "isResident", "isEntrepreneur", "companyRus", "flPrivateEntrepreneur",
				"companyForeign", "bankDetails", "contacts", "confirmLocation", "confirmAbility"})
public class Counterparty {

	/**
	 * Признак того, что сообщение о новом зарегистрировавшемся участнике
	 * Если false значит это обновления. Атрибуты лица будут обновлены, если признак needAtributeUpdate = true
	 * Остальные элементы, если они не пустые, будут считаться заменой предыдущим
	 */
	@XmlElement(required = true)
	public boolean isNew;

	/**
	 * Нужен, когда isNew == false Признак обновления атрибутов компании, требующихся к учету в системе
	 */
	@XmlElement(required = true)
	public boolean needAtributeUpdate;


	/**
	 * Признак резидента
	 */
	@XmlElement(required = true)
	public boolean isResident;


	/**
	 * Признак ИП
	 */
	@XmlElement(required = true)
	public boolean isEntrepreneur;


	/** Либо Компрания - контрагнет - резидент	 */
	@XmlElement
	public CompanyRus companyRus;

	/** Либо Индивидуальный предприниматель - контрагнет - резидент	 */
	@XmlElement
	public PrivateEntrepreneur flPrivateEntrepreneur;

	/**Либо Физическое лицо -  контрагнет - резидент	 */
	//@XmlElement
	//public PersonRUS fl;

	/** Либо Иностр. компания  */
	@XmlElement
	public CompanyForeign companyForeign;


	@XmlElement
	public List<BankDetail> bankDetails;

	/** Представитель Контрагента на этапах регистрации, начала и окончания конкурсной процедуры
      Для Договора не заполняется */
//	@XmlElement
	public List<Contact> contacts;

	/** Документ, подтверждающий местонахождение. Это только в рамках начала конкурентной процедуры	 */
	@XmlElement
	public Attachment confirmLocation;

	/** Документ (Справка контрагента), подтверждающий способность выполнить контракт без привлечения субподрядчиков (или о планируемом привлечении таковых?) 	 */
	@XmlElement
	public Attachment confirmAbility;

	/** Ссылка на xml с налоговой отчетностью	 */
//	@XmlElement
//	public String taxReportingUrl;

}
