
package com.vpob.time;

import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class TimeSessionBean {
	
	public Date getCurrentDate(){		
		 return new Date();
		}

}
