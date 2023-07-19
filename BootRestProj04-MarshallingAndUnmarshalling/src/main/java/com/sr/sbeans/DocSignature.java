package com.sr.sbeans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement(name = "DocSignature")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class DocSignature {
	@XmlAttribute(name = "id")
	private String id;
	@XmlAttribute(name = "sigHashAlgorithm")
	private String sigHashAlgorithm;
	@XmlAttribute(name = "error")
	private String error;
	

}
