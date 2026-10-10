package p819z3;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;
import p712w3.C45713m;

/* JADX INFO: renamed from: z3.j */
/* JADX INFO: compiled from: PooledByteBufferOutputStream.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC46681j extends OutputStream {
    /* JADX INFO: renamed from: a */
    public abstract PooledByteBuffer mo9487a();

    public abstract int size();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e11) {
            C45713m.m100908a(e11);
        }
    }
}
