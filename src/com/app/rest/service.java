package com.app.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.app.model.MissingPerson;
import com.app.model.MissingPerson;
import com.app.model.Photo;
import com.app.model.Place;
import com.app.model.User;
@Path("/missingpeoples")
public class service {
	static final String api_version = "1.01A rev.18729";
	
	static String xmlString = null;
	static Map<Integer, MissingPerson> MissingPersons  = new HashMap<Integer, MissingPerson>();
	
	static {
		System.out.println("Initializing Internal DataStore/DB...");
		
		//DB transactions
		Place p = new Place(24112.2, 24112.2, "address", "2015/21/12 05:34:32");
		Place p2 = new Place(11122.2, 16412.2, "address", "2015/21/12 05:34:32");
		Place p3 = new Place(11512.2, 247512.2, "address", "2015/21/12 05:34:32");
		
		ArrayList<Place> places = new ArrayList<Place>();
		places.add(p);places.add(p2);places.add(p3);
		
		Photo ph = new Photo("image1");
		Photo ph1 = new Photo("image2");
		Photo ph2 = new Photo("image4");
		
		ArrayList<Photo> photos = new ArrayList<Photo>();
		photos.add(ph);photos.add(ph2);photos.add(ph1);
		
		User u =new User("Test", "test","email@test.com", "123456","069292929");
		MissingPerson ms = new MissingPerson("test", "test", photos, places, false, u);
		
		MissingPersons.put(1, ms);
		MissingPersons.put(2, ms);
		MissingPersons.put(3, ms);
		
		
	}
	
	//get all MissingPersons
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ArrayList<MissingPerson> getAllMissingPersons() {
		System.out.println("Getting all tasks...");
		ArrayList<MissingPerson> mslist = new ArrayList<MissingPerson>(MissingPersons.values());
		return mslist;
	}

	//get MissingPerson by id 
	
	@Path("{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public MissingPerson getMissingPerson(@PathParam("id")int id) {
		System.out.println("Getting task by id:"+id);
		return MissingPersons.get(id);
	}
	
	//create MissingPerson 
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public MissingPerson newMissingPerson(MissingPerson MissingPerson) {
		
		return MissingPerson;
	}
	
	//update MissingPerson
	@Path("{id}")
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public MissingPerson updateMissingPerson(MissingPerson MissingPerson) {
		return MissingPerson;
	}
	
	
	//delete MissingPerson
	@Path("{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public MissingPerson deleteMissingPerson(@PathParam("id") int id) {
	  System.out.println("Deleting MissingPerson with ID: " + id);
		
	  MissingPerson MissingPerson = MissingPersons.remove(id);
	  
	  return MissingPerson;
	}
}
