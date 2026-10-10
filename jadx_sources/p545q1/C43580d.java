package p545q1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: q1.d */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43580d {

    /* JADX INFO: renamed from: a */
    public static final Charset f96173a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f96174b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m95910a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m95911b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m95911b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
