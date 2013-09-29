package test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCountListener implements HttpSessionListener {
	private static int totalActiveSessions = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		totalActiveSessions++;	
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		totalActiveSessions--;
	}
	
	public static int getTotalActiveSession() {
		return totalActiveSessions;
		}

}
