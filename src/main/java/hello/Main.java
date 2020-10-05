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
	
	@RequestMapping(value = "/{bucket}", method = RequestMethod.GET)
	public ResponseEntity<?> listObjects(@PathVariable("bucket") String bucket,
		  HttpServletRequest req, HttpServletResponse response) {
			  return new ResponseEntity(HttpStatus.FORBIDDEN);
		  }
		  
	@RequestMapping(value = "/{bucket}", method = RequestMethod.PUT)
	public ResponseEntity<?> createBucket(@PathVariable("bucket") String bucket,
		  HttpServletRequest req, HttpServletResponse response) {
			  System.out.println("In Webapp put method");

			  return new ResponseEntity(HttpStatus.CREATED);
		  }

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
