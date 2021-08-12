package ProjectDemo;

public class Encapsulations {

// private Data Variables
//	
	private int emp;
	private String empname;
	private int empage;

	public static void main(String[] args) {
		Encapsulations emp = new Encapsulations();
		emp.setEmp(11);
		emp.setEmpname("SAURABH");
		emp.setEmpage(34);
		
		System.out.println("EMP ID: "+emp.getEmp());
		System.out.println("Empname: "+ emp.getEmpname());
		System.out.println("Empage: "+ emp.getEmpage());
	}
	
	// Getter and Setter Methods

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
