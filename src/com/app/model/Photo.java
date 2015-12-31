package com.app.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="photo")
public class Photo {
private String photoLink;



public Photo(String photoLink) {
	super();
	this.photoLink = photoLink;
}

@XmlElement
public String getPhotoLink() {
	return photoLink;
}

public void setPhotoLink(String photoLink) {
	this.photoLink = photoLink;
} 

}
