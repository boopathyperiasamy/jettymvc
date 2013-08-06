package com.cs.algo;

public class ServerMain {
	public static void main(String args[]) throws Exception {
		try {
			JettyServer server = new JettyServer(8080);
			server.start();
			server.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
