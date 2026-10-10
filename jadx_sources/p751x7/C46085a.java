package p751x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: x7.a */
/* JADX INFO: compiled from: Dynamic32Structure.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46085a extends AbstractC46087c {
    public C46085a(C46093i c46093i, AbstractC46088d abstractC46088d, long j11, int i11) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        if (abstractC46088d.f103537a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j12 = j11 + ((long) (i11 * 8));
        this.f103535a = c46093i.m101604m(byteBufferAllocate, j12);
        this.f103536b = c46093i.m101604m(byteBufferAllocate, j12 + 4);
    }
}
