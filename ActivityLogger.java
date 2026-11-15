package com.spendwise.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/** Writes simple timestamped application activity to a text log. */
public class ActivityLogger {
    public synchronized void log(String activity) {
        File directory = new File("logs");
        if (!directory.exists()) directory.mkdirs();
        File file = new File(directory, "spendwise-activity.log");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.println(LocalDateTime.now() + " | " + activity);
        } catch (IOException ex) {
            System.out.println("Could not write activity log: " + ex.getMessage());
        }
    }
}
