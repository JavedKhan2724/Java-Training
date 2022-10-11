package infinite.BeanExample1;

public class DemoBean {

		private String greeting = "Good morning...";

		public String getGreeting() {
			return greeting;
		}

		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}

		public DemoBean(String greeting) {
			super();
			this.greeting = greeting;
		}

		public DemoBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
