package Messages;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlElements;

import Attributes.*;
import Enum.EnumTag;
import Objects.XMLTag;

@XmlRootElement(name = "RequestPayload")
@XmlSeeAlso({Attribute.class, XMLTag.class})
@XmlAccessorType(XmlAccessType.PROPERTY)
public class RequestPayload {
	
	XMLTag objectType;
	XMLTag UniqueIdentifier;
	XMLTag KeyFormatType;
	//Attribute[] attributes;

	//@XmlElementWrapper(name = "Attributes")
	//@XmlElement(name="Attribute")
	//@XmlElement(name = "Attributes")
	//@XmlElementRef
	//@XmlVariableNode("name")

	//trial
	List<JAXBElement<Object>> attributes;


	//original --> List<Object> attributes;

	public RequestPayload(){
		
	}

	public RequestPayload(XMLTag objectType, List<JAXBElement<Object>> attributes) {
		this.attributes =  new ArrayList<JAXBElement<Object>>();
		this.objectType = objectType;
		this.attributes = attributes;
	}

	@XmlElement(name = "ObjectType")
	public XMLTag getObjectType() {
		return objectType;
	}

	public void setObjectType(XMLTag objectType) {
		this.objectType = objectType;
	}
	
	/*
	@XmlElements({
		@XmlElement(type=Attribute.class)
		@XmlElement(type = XMLTag.class)
	})*/
	//@XmlElementRef()
	//@XmlAnyElement(lax = true)
	//@XmlElement(name = "Attribute")

	/* original -->
	@XmlElementWrapper(name= "Attributes")
	
	@XmlElements({
		@XmlElement(name="Attribute", type=Attribute.class),
		@XmlElement(name="CryptographicAlgorithm", type=XMLTag.class),
		@XmlElement(name="CryptographicLength", type=XMLTag.class),
		@XmlElement(name= "CryptographicUsageMask",type=XMLTag.class)
	})*/
	@XmlElementWrapper(name = "Attributes")
	@XmlAnyElement
	public List<JAXBElement<Object>> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<JAXBElement<Object>> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "RequestPayload [attributes=" + attributes + ", objectType=" + objectType + "]";
	}

	@XmlElement(name="UniqueIdentifier")
	public XMLTag getUniqueIdentifier() {
		return UniqueIdentifier;
	}

	public void setUniqueIdentifier(XMLTag uniqueIdentifier) {
		UniqueIdentifier = uniqueIdentifier;
	}

	@XmlElement(name="KeyFormatType")
	public XMLTag getKeyFormatType() {
		return KeyFormatType;
	}

	public void setKeyFormatType(XMLTag keyFormatType) {
		KeyFormatType = keyFormatType;
	}

	public RequestPayload(XMLTag uniqueIdentifier, XMLTag keyFormatType) {
		UniqueIdentifier = uniqueIdentifier;
		KeyFormatType = keyFormatType;
	}

	public RequestPayload(XMLTag uniqueIdentifier) {
		UniqueIdentifier = uniqueIdentifier;
	}

}
