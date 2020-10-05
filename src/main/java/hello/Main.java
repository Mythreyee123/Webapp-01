package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@RestController
public class Main {

	@RequestMapping("/")
	public String home() {
			return "Webapplication1 started";
	}
	
	@RequestMapping("f1")
	public ResponseEntity<?> listObjects() {
			  return new ResponseEntity(HttpStatus.FORBIDDEN);
		  }
		  
	@RequestMapping("un")
	public ResponseEntity<?> listObject() {
			  return new ResponseEntity(HttpStatus.UNAUTHORIZED);
		  }
	
	@RequestMapping("a1")
	public ResponseEntity<?> listObject1() {
			  return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
		  }
	
	@RequestMapping("a2")
	public ResponseEntity<?> listObject2() {
			  return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	
	@RequestMapping("a3")
	public ResponseEntity<?> listObject3() {
			  return new ResponseEntity(HttpStatus.BAD_GATEWAY);
		  }
	
	@RequestMapping("a4")
	public ResponseEntity<?> listObject4() {
			  return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
		  }
	
	@RequestMapping("a5")
	public ResponseEntity<?> listObject5() {
			  return new ResponseEntity(HttpStatus.GATEWAY_TIMEOUT);
		  }

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
