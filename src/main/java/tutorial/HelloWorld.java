package tutorial;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {

	private static final long serialVersionUID = 7641460633307331299L;
	public static final String MESSAGE = "Struts is up and running ...";
	private String message;

	@Override
	public String execute() throws Exception {
		setMessage(MESSAGE);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
