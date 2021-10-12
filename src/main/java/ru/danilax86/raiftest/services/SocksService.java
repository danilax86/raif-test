package ru.danilax86.raiftest.services;

import org.springframework.stereotype.Service;
import ru.danilax86.raiftest.models.Socks;

public interface SocksService {

	void add(Socks socks);

	void remove(Socks socks);

	String getSocks(String color, String operation, int cottonPart);

}
