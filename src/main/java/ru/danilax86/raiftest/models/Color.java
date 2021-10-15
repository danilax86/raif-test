package ru.danilax86.raiftest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum Color {
	RED(0, "red"),
	YELLOW(1, "yellow"),
	GREEN(2, "green"),
	BLUE(3, "blue"),
	GRAY(4, "gray"),
	BLACK(5, "black"),
	CYAN(6, "cyan"),
	MAGENTA(7, "magenta");

	int colorCode;
	String colorName;


	public static boolean validateColor(String value) {
		// FIXME: debug and try some another implementation
		return Arrays.stream(Color.values()).map(Enum::name).collect(Collectors.toList()).contains(value);
	}
}
