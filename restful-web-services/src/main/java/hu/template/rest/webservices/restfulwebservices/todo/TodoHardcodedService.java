package hu.template.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static long idCount =0;
	
	static {
		todos.add(new Todo(++idCount,"leje96","learn to dance",new Date(),false));
		todos.add(new Todo(++idCount,"leje96","learn about Microsevices",new Date(),false));
		todos.add(new Todo(++idCount,"leje96","learn about Angular",new Date(),false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId() == 0) {
			todo.setId(++idCount);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo == null) {
			return null;
		}
		
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
		
	}
	
	public Todo findById(Long id) {
		for (Todo tmp : todos) {
			if(tmp.getId() == id) {
				return tmp;
			}
		}
		return null;

	}
	

}
