package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.Writer;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class LogWriter extends Writer {
    private StringBuilder mBuilder = new StringBuilder(128);
    private final String mTag;

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == '\n') {
                flushBuilder();
            } else {
                this.mBuilder.append(c11);
            }
        }
    }

    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            Log.d(this.mTag, this.mBuilder.toString());
            StringBuilder sb2 = this.mBuilder;
            sb2.delete(0, sb2.length());
        }
    }

    public LogWriter(String str) {
        this.mTag = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flushBuilder();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        flushBuilder();
    }
}
