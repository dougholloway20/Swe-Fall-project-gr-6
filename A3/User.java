package Emppackage;

public class User {
		  private String fname;
		  private String lname;
		  private int Id;
		  private String password;
		  private String email;
		  private String company;
		  private String pos; 
		  
		  
		  public User( String fname, String lname, int Id, String password ) {
		    this.setFname(fname);
		    this.setLname(lname);
		    this.setId(Id);
		    this.setPassword(password);
		  }

		public String getFname() {
			return fname;
		}


		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getPos() {
			return pos;
		}

		public void setPos(String pos) {
			this.pos = pos;
		}
		  
}
