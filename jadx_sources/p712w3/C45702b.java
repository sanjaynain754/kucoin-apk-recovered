package p712w3;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: w3.b */
/* JADX INFO: compiled from: Closeables.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45702b {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final Logger f103042a = Logger.getLogger(C45702b.class.getName());

    /* JADX INFO: renamed from: b */
    public static void m100881b(InputStream inputStream) {
        try {
            m100880a(inputStream, true);
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m100880a(Closeable closeable, boolean z11) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e11) {
            if (!z11) {
                throw e11;
            }
            f103042a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e11);
        }
    }
}
