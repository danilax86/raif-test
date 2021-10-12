package ru.danilax86.raiftest.controllers;

import org.springframework.web.bind.annotation.*;
import ru.danilax86.raiftest.models.Socks;

public interface StorekeeperController {
	@PostMapping("/income")
	String addSocks(@RequestBody Socks socks);

	@PostMapping("/outcome")
	String removeSocks(@RequestBody Socks socks);

	@GetMapping
	String getSocks(@RequestParam String color,
	                @RequestParam String operation,
	                @RequestParam int cottonPart);
}
