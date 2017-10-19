package digical;

import javax.xml.ws.Endpoint;

public class Dish {

	public static void main(String[] args) {
     String addr="http://localhost:9999/sample/web";
      Product pr=new Product();
      Endpoint.publish(addr, pr);
      System.out.println("succes");

	}

}
