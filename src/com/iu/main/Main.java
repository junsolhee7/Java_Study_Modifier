package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Phone;
import com.iu.himart.TV;

public class Main {

	public static void main(String[] args) {
				
		Computer computer = new Computer();
		TV tv = new TV();
		Phone phone = new Phone();
		
		computer.info();
		tv.info();
		phone.info();
		
		Client client = new Client();
		client.buy(tv);
		client.buy(phone);
		client.buy(computer);
	}

}
