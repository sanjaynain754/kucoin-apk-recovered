package p751x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: x7.j */
/* JADX INFO: compiled from: Program32Header.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46094j extends AbstractC46089e {
    public C46094j(C46093i c46093i, AbstractC46088d abstractC46088d, long j11) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        if (abstractC46088d.f103537a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j12 = abstractC46088d.f103539c + (j11 * ((long) abstractC46088d.f103541e));
        this.f103546a = c46093i.m101604m(byteBufferAllocate, j12);
        this.f103547b = c46093i.m101604m(byteBufferAllocate, 4 + j12);
        this.f103548c = c46093i.m101604m(byteBufferAllocate, 8 + j12);
        this.f103549d = c46093i.m101604m(byteBufferAllocate, j12 + 20);
    }
}
