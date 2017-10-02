package tutorial;
import com.opensymphony.xwork2.ActionSupport;

public class Welcome extends ActionSupport {

	private static final long serialVersionUID = -4780431473452125843L;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
