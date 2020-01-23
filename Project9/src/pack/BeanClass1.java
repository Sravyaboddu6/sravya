package pack;

public class BeanClass1 {
	private String message;
	

	public void getMessage() {
     System.out.println("Message"+message);
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void init () {
		System.out.println("Init method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}
}


