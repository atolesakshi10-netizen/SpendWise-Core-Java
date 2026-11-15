package com.spendwise.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/** Plain-text file storage. Data files are created in the project data folder. */
public class FileManager implements DataStorage {
    private final File dataDirectory;
    public FileManager() {
        this.dataDirectory = new File("data");
        if (!dataDirectory.exists()) dataDirectory.mkdirs();
    }
    @Override public void saveLines(String fileName, List<String> lines) throws IOException {
        File file = new File(dataDirectory, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
    @Override public List<String> readLines(String fileName) throws IOException {
        List<String> lines = new ArrayList<String>();
        File file = new File(dataDirectory, fileName);
        if (!file.exists()) return lines;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) lines.add(line);
        }
        return lines;
    }
}
