package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AddressTypes",  namespace = "http://spi2.ru/jaxws/datatypes")
public enum AddressTypes {
	LEGALADDR, // Юридический
	POSTADDR,  // Почтовый
    ACTUAL // Фактический
 }
