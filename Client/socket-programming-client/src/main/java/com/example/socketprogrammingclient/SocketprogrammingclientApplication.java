package com.example.socketprogrammingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketprogrammingclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocketprogrammingclientApplication.class, args);

		new Client("127.0.0.1", 5000);
	}

}
