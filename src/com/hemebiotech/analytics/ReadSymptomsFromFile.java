package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomsFromFile implements ISymptomReader {



	@Override
    public List<String> getSymptoms() {

        ArrayList<String> namesOfSymptoms = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("symptoms.txt"));
            String line = reader.readLine();

            while (line != null) {
                namesOfSymptoms.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    
                }
            }
        }

        return namesOfSymptoms;
    }

}