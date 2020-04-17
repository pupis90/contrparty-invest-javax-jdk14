package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlType(name = "ConcurrentProcedure", namespace = "http://spi2.ru/jaxws/datatypes")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "concurrentProcedure", namespace = "http://spi2.ru/jaxws/datatypes")
public class ConcurrentProcedure {

	/** Номер КП  - Номер тендерной процедуры уникален*/
	@XmlElement (namespace = "http://spi2.ru/jaxws/datatypes", required = true)
	public String procedureNumber;

	/** Номер этапа КП */
	@XmlElement (namespace = "http://spi2.ru/jaxws/datatypes",  required = true)
	public String procedureStepNumber;

	/**Статус процедуры*/
	public String status;

	@XmlElement(name = "status_date")
	@XmlSchemaType(name = "dateTime")
	public javax.xml.datatype.XMLGregorianCalendar statusDate;


	// Дата окончания приема заявок
	// Статус (Открыта, Закрыта)
	// Дата статуса
	// Победитель (sap_srm_id)
	// Ид. договора в КИС (Системный Ид уникальный в рамках всего репозитория, varchar2(16))

    // ФЛ - сотрудник копании (табельные номера)
	// Роль:
	// 1. Инициатор (кто иницииирует начало процедуры - закупщик, как правило представитель функции)
	// 2. Организатор КП (представитель тендерного подразделения)
	// 3. Эксперт
	// 4. Член конкурсной комииссии
	// 5. Председатель конкурсной комиссии
    //

	@XmlElement(namespace = "http://spi2.ru/jaxws/datatypes", required = true)
	public List<Offer> participatorsOffers;



}
