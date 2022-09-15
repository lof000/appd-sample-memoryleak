package io.reflectoring.kafka;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/send")
public class HttpSend {

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	public static List<String> list = new ArrayList<String>();
	//public List<String> list = new ArrayList<String>();

	@RequestMapping(value = "/leak", method = RequestMethod.GET)
	@ResponseBody
    public String leaking() {

		for (int i = 0; i < 1024; i++) {
			list.add("aaaaaaaaaabbbbbbbbbb");
		}
		LOG.info("fill up list");

		return "leaking....?";
	}

  
        
}
