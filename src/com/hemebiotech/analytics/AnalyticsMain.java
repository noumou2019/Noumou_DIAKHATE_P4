package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsMain {

	public static void main(String args[]) throws Exception {

		ReadSymptomsFromFile readSymptoms = new ReadSymptomsFromFile();

		List<String> nameOfSymptoms = readSymptoms.getSymptoms();

		CountSymptoms countSymptoms = new CountSymptoms();

		Map<String, Integer> counterSymptomsABC = countSymptoms.getCounterSymptomsABC(nameOfSymptoms);

		WriteSymptomsInAFile writeSymptoms = new WriteSymptomsInAFile();

		//System.out.println(writeSymptoms);

		writeSymptoms.writeSymptomsInAFile(counterSymptomsABC);

	}
}
