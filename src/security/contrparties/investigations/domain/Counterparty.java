package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty",  namespace = "http://spi2.ru/jaxws/datatypes")
public class Counterparty {

	/** Либо Компрания - контрагнет - резидент	 */
	@XmlElement
	public CompanyRus companyRus;

	/** Либо Индивидуальный предприниматель - контрагнет - резидент	 */
	@XmlElement
	public PrivateEntrepreneur flPrivateEntrepreneur;

	/**Либо Физическое лицо -  контрагнет - резидент	 */
	@XmlElement
	public PersonRUS fl;

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
