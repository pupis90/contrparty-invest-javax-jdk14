package security.contrparties.investigations.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/** Вложение к Договору */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", namespace = "http://spi2.ru/jaxws/datatypes", propOrder = {"attachmentType", "attachmentName", "fileName", "attachmentExtension",
										   "attachment_body"})

public class Attachment {

	/** Тип вложения, например Справка, Скан справки */
	@XmlElement(name = "AttachmentType")
	protected String attachmentType;

	/** Наименование документа */
	@XmlElement(name = "AttachmentName")
	protected String attachmentName;

	/** Наименование файла */
	@XmlElement(name = "FileName", required = true)
	protected String fileName;

	/** Расширение файла */
	@XmlElement(name = "FileExtension", required = true)
	protected String attachmentExtension;

	/** Содержимое файла - массив байтов. Вопрос кодировки ?? */
	@XmlElement(name = "attachment_body", required = true)
	protected byte[] attachment_body;

	public String getAttachmentType() {
		return attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAttachmentExtension() {
		return attachmentExtension;
	}

	public void setAttachmentExtension(String attachmentExtension) {
		this.attachmentExtension = attachmentExtension;
	}

	public byte[] getAttachment_body() {
		return attachment_body;
	}

	public void setAttachment_body(byte[] attachment_body) {
		this.attachment_body = attachment_body;
	}
}