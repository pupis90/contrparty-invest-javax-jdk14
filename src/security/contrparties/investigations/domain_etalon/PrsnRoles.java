package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PrsnRoles",  namespace = "http://spi2.ru/jaxws/datatypes")
public enum PrsnRoles {
	RESPONSIBLE, //Ответственный
    INITIATOR,   //Инициатор
	AUT,
	LUP,
	LCD,
	OLDBE
}
