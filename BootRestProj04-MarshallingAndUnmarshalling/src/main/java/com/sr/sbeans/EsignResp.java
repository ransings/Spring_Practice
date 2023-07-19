package com.sr.sbeans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
@XmlRootElement(name = "EsignResp")
@XmlAccessorType(XmlAccessType.FIELD)
public class EsignResp {
	@XmlAttribute(name = "ver")
	private String ver;	
	@XmlAttribute(name = "status")
	private String status;	
	@XmlAttribute(name = "ts")
	private String ts;	
	@XmlAttribute(name = "txn")
	private String txn;
	@XmlAttribute(name = "resCode")
	private String resCode;
	@XmlAttribute(name = "error")
	private String error;
	
	@XmlElement(name = "Signatures")
	private Signatures Signatures;
	
	
	
	
	
	
	

}
