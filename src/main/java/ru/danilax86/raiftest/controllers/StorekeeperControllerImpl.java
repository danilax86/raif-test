package ru.danilax86.raiftest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.danilax86.raiftest.models.Socks;

@RestController
@RequestMapping("/api/socks")
public class StorekeeperControllerImpl implements StorekeeperController {

	@Override
	public String addSocks(Socks socks) {
		return null;
	}

	@Override
	public String removeSocks(Socks socks) {
		return null;
	}

	@Override
	public String getSocks(String color, String operation, int cottonPart) {
		return null;
	}
}
