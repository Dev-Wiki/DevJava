package net.devwiki.java8;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileDemo {

    public static void main(String[] args) {
        File[] hideFiles = new File(".").listFiles(File::isHidden);
    }
}
