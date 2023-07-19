package com.sr.sbeans;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
@XmlRootElement(name = "Signatures")
@XmlAccessorType(XmlAccessType.FIELD)
public class Signatures {
	@XmlAttribute(name = "name")
	private String name="test";
	
	@XmlElement(name = "DocSignature")
	private List<DocSignature> docSignature;


}
