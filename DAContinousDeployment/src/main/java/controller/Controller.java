package controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Review;
import model.Service;

@RestController
public class Controller {
	private Service service = new Service();
    
    @CrossOrigin
    @RequestMapping(value="/getReview/{zip}", method=RequestMethod.GET)
    public ArrayList<Review> getData(@PathVariable String zip) {
    	System.out.println(zip);
    	return service.getData(zip);
    }
    
    @CrossOrigin
    @RequestMapping(value="/addReview/{zip}", method=RequestMethod.POST)
    public void addData(@RequestBody String s, @PathVariable String zip){
    	System.out.println(s);
        String code = s.substring(9, s.indexOf(",\"score\"")-1);
      	String score = s.substring(s.indexOf(",\"score\"")+10, s.indexOf(",\"content\"")-1);
      	String content = s.substring(s.indexOf(",\"content\"")+12, s.indexOf(",\"author\"")-1);
      	String author = s.substring(s.indexOf(",\"author\"")+11, s.indexOf("}")-1);
      	System.out.println(code);
      	System.out.println(score);
      	System.out.println(content);
      	System.out.println(author);
    	Review r = new Review(code, score, content, author);
    	service.addExample(zip, r);
    	System.out.println("added" + zip);
	}	
}
