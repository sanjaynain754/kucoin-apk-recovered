package p819z3;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p712w3.C45708h;

/* JADX INFO: renamed from: z3.k */
/* JADX INFO: compiled from: PooledByteStreams.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46682k {

    /* JADX INFO: renamed from: a */
    public final int f104518a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46672a f104519b;

    public C46682k(InterfaceC46672a interfaceC46672a) {
        this(interfaceC46672a, 16384);
    }

    @VisibleForTesting
    public C46682k(InterfaceC46672a interfaceC46672a, int i11) {
        C45708h.m100891b(Boolean.valueOf(i11 > 0));
        this.f104518a = i11;
        this.f104519b = interfaceC46672a;
    }

    /* JADX INFO: renamed from: a */
    public long m102901a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f104519b.get(this.f104518a);
        long j11 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, this.f104518a);
                if (i11 == -1) {
                    this.f104519b.release(bArr);
                    return j11;
                }
                outputStream.write(bArr, 0, i11);
                j11 += (long) i11;
            } catch (Throwable th2) {
                this.f104519b.release(bArr);
                throw th2;
            }
        }
    }
}
