package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Resume {

public Verdicts verdict; //Согласовано, Несогласовано, Согласовано с замеч
public String komment;

}
