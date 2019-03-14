package bot.main;

import javax.security.auth.login.LoginException;

import bot.listener.CustomListenerAdapter;

public class Main{
	
	public static void main(String[] args){
		
		try {
			new CustomListenerAdapter(args);
		} catch (LoginException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}