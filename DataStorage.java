package com.spendwise.util;

import java.io.IOException;
import java.util.List;

/** Abstraction for saving and loading application records. */
public interface DataStorage {
    void saveLines(String fileName, List<String> lines) throws IOException;
    List<String> readLines(String fileName) throws IOException;
}
