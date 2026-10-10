package com.facebook.common.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p712w3.C45708h;

/* JADX INFO: loaded from: classes34.dex */
public class FileUtils {

    public static class CreateDirectoryException extends IOException {
        public CreateDirectoryException(String str) {
            super(str);
        }

        public CreateDirectoryException(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    public static class RenameException extends IOException {
        public RenameException(String str) {
            super(str);
        }

        public RenameException(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    public static class FileDeleteException extends IOException {
        public FileDeleteException(String str) {
            super(str);
        }
    }

    public static class ParentDirNotFoundException extends FileNotFoundException {
        public ParentDirNotFoundException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8529a(File file) throws CreateDirectoryException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new CreateDirectoryException(file.getAbsolutePath(), new FileDeleteException(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new CreateDirectoryException(file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8530b(File file, File file2) throws RenameException {
        Throwable fileDeleteException;
        C45708h.m100896g(file);
        C45708h.m100896g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (!file2.exists()) {
            if (file.getParentFile().exists()) {
                if (!file.exists()) {
                    fileDeleteException = new FileNotFoundException(file.getAbsolutePath());
                } else {
                    fileDeleteException = null;
                }
            } else {
                fileDeleteException = new ParentDirNotFoundException(file.getAbsolutePath());
            }
        } else {
            fileDeleteException = new FileDeleteException(file2.getAbsolutePath());
        }
        throw new RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), fileDeleteException);
    }
}
