package main;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class Send {
	
	static Logger logger = Logger.getLogger(Send.class);
	
	public static void main(String[] args) throws Exception {
		logger.info("Send test");
		System.out.println("String Utils Test: "+ StringUtils.isEmpty("String"));
	}

}
