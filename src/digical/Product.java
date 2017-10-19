package digical;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Product {
	@WebMethod
	public String saveproduct(int proId){
		return "saved with Id";
	}

}
