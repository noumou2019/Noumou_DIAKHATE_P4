package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

/**
 *  @return Create a file "result.out" with all symptoms (no duplicate) with their
 * Occurrence
 *
 */
public class WriteSymptomsInAFile {
	/**
	 * Map of symptoms (no duplicate) + occurrence
	 */
	public void writeSymptomsInAFile(Map<String, Integer> counterSymptomsABC) {
		try {
			List<String> finalList = counterSymptomsABC.entrySet().stream()
					.map(entry -> entry.getKey() + " : " + entry.getValue()).collect(Collectors.toList());

			Files.write(Paths.get("result.out"), finalList);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}