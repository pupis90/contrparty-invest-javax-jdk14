package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.*;

/**
 * Задача в КИС
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CISTask", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"taskId", "taskUrl", "taskDateTime", "contract"})
@XmlRootElement(name = "cisTask")
public class CISTask {

	/**  id задачи в КИС */
	@XmlElement(name = "task_id")
	public String taskId;

	/**  URI задачи в КИС */
	//	@XmlSchemaType(name = "anyURI")
	//	public java.net.URI taskUri;

	/** Ссылка на задачу в КИС */
	@XmlElement(name = "taskUrl")
	public String taskUrl;

	/** Дата и время задачи  */
	@XmlElement(name = "taskDateTime")
	@XmlSchemaType(name = "dateTime")
	public javax.xml.datatype.XMLGregorianCalendar taskDateTime;

	/** Контракт контрагента, для которого требуется Заключение СБ */
	@XmlElement(required = true)
	public Contract contract;


}
