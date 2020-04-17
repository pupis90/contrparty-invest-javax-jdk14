package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "IdoSrmDetails", namespace = "http://spi2.ru/jaxws/datatypes")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdoSrmDetails",  namespace = "http://spi2.ru/jaxws/datatypes")
public class IdoSrmDetails {

	/** Номер КП  - Номер тендерной процедуры уникален*/
	@XmlElement (namespace = "http://spi2.ru/jaxws/datatypes", required = true)
	public String procedureNumber;

	/** Номер этапа КП */
	@XmlElement (namespace = "http://spi2.ru/jaxws/datatypes",  required = true)
	public String procedureStepNumber;

	/** Признак того что есть Документ, подтверждающий местонахождение	 */
	@XmlElement(required = true)
	public boolean isConfirmLocation;

	/** Дата ввода документа подтверждающий местонахождение */
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	public XMLGregorianCalendar confirmLocationDocDate;

	/** Url Документа, подтверждающего местонахождение	 */
		@XmlElement
	public String confirmLocationDocUrl;

	/** Документ, подтверждающий местонахождение	 */
//	@XmlElement
//	public Attachment confirmLocationDoc;

	/** Документ (Справка контрагента), подтверждающий способность выполнить контракт без привлечения субподрядчиков (или о планируемом привлечении таковых?) 	 */
	@XmlElement(required = true)
	public boolean isConfirmAbility;

	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	public XMLGregorianCalendar confirmAbilityDocDate;

	/** Документ (Справка контрагента), подтверждающий способность выполнить контракт без привлечения субподрядчиков (или о планируемом привлечении таковых?) 	 */
	@XmlElement
	public String confirmAbilityDocUrl;

	/** Url Документа (Справка контрагента), подтверждающего способность выполнить контракт без привлечения субподрядчиков (или о планируемом привлечении таковых?) 	 */
//		@XmlElement
//		public Attachment confirmAbility;

	/** Ссылка на xml с налоговой отчетностью	- не обрабатывается */
		@XmlElement
		public String taxReportingUrl;

}
