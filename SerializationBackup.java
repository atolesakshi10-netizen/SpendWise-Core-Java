package com.spendwise.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.spendwise.model.Transaction;

/** Creates a binary backup using Java object serialization. */
public class SerializationBackup {
    public File createBackup(List<Transaction> transactions) throws IOException {
        File directory = new File("backups");
        if (!directory.exists() && !directory.mkdirs())
            throw new IOException("Could not create backups folder.");
        File backup = new File(directory, "transactions-backup.ser");
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(backup))) {
            output.writeObject(transactions);
        }
        return backup;
    }
}
