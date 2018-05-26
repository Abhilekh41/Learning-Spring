package com.baja.spring.springcore.propertiesfileinjection;

public class WebServices {
	
		private String url;
		private String userName;
		private String password;
		
		public WebServices(String url,String userName, String password) {
			this.url=url;
			this.userName=userName;
			this.password=password;
		}
		@Override
		public String toString() {
			return "WebServices [url=" + url + ", userName=" + userName + ", password=" + password + "]";
		}
		
		

}
