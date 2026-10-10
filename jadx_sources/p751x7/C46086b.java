package p751x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: x7.b */
/* JADX INFO: compiled from: Dynamic64Structure.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46086b extends AbstractC46087c {
    public C46086b(C46093i c46093i, AbstractC46088d abstractC46088d, long j11, int i11) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (abstractC46088d.f103537a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j12 = j11 + ((long) (i11 * 16));
        this.f103535a = c46093i.m101602k(byteBufferAllocate, j12);
        this.f103536b = c46093i.m101602k(byteBufferAllocate, j12 + 8);
    }
}
