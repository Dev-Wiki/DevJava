package net.devwiki.java8;

import java.io.File;

public class FileFilter {

    public boolean accept(File file) {
        return file.isHidden();
    }
}
