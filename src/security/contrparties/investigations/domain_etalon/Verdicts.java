package security.contrparties.investigations.domain_etalon;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Verdicts",  namespace = "http://spi2.ru/jaxws/datatypes")
public enum Verdicts {
	AGREED,    //Согласован
	NOTAGREED, //Не согласован
	AGREED_WITH_REM //Согласован с замечаниями
}
