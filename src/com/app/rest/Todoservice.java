package com.app.rest; 



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.app.model.Todo;




@Path("/todos")
public class Todoservice {
	static final String api_version = "1.01A rev.18729";
	
	static String xmlString = null;
	static Map<Integer, Todo> todos = new HashMap<Integer, Todo>();
	
	static {
		System.out.println("Initializing Internal DataStore/DB...");
		//DB transactions
		todos.put(12, new Todo(12,"tache 1",false));
		todos.put(22, new Todo(22,"tache 2",false));
		todos.put(33, new Todo(33,"tache 3",false));
		todos.put(21, new Todo(21,"tache 4",true));
	}
	
	//get all todos
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ArrayList<Todo> getAllTodos() {
		System.out.println("Getting all tasks...");
		ArrayList<Todo> todoList = new ArrayList<Todo>(todos.values());
		return todoList;
   	}

	//get todo by id 
	
	@Path("{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Todo getTodo(@PathParam("id")int id) {
		System.out.println("Getting task by id:"+id);
		return todos.get(id);
	}
	
	//create todo 
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Todo newTodo(Todo todo) {
		int id =(int)(Math.random() * 101);
        
		todo.setId(id);   
		todos.put(todo.getId(), todo);
		return todo;
	}
	
	//update todo
	@Path("{id}")
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Todo updateTodo(Todo todo) {
		System.out.println("updating todo with ID: " + todo.getId());
		todos.remove(todo.getId());
		todos.put(todo.getId(), todo);
		todos.get(todo.getId()).setTask(todo.getTask());
		todos.get(todo.getId()).setState(todo.isState());
		return todo;
	}
	
	
	//delete todo
	@Path("{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Todo deleteTodo(@PathParam("id") int id) {
	  System.out.println("Deleting todo with ID: " + id);
		
	  Todo todo = todos.remove(id);
	  
	  return todo;
	}
}

