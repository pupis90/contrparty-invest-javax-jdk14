package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(name = "Offer", namespace = "http://spi2.ru/jaxws/datatypes",
		propOrder = {"sap_srm_id", "participRequestGuid", "offertaAmmount", "confirmAbility"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Offer {

	/**
	 * Уникальный код участника в системе SAP SRM
	 */
	@XmlElement(required = true)
	public BigDecimal sap_srm_id;

	/**
	 * GUID заявки на проверку участника в составе группы
	 */
	@XmlElement(name = "prtcip_request_guid", required = true)
	public String participRequestGuid;

	/**
	 * Cумма предложения с НДС - может отсутсвовать
	 */
	@XmlElement
	public BigDecimal offertaAmmount;

	/**
	 * Данные о подтверждении возможности выполнения контракта собственными силами.
	 * Представляют собой прикрепленный файл со справкой от КА о том, что он будет выполнять работы с использованием собственных мощностей и сотрудников в штате,
	 * либо обоснование привлечения соисполнителей с указанием порядка распределения функций и ролей с субподрядчиком
	 */
	@XmlElement
	public Attachment confirmAbility;


}
