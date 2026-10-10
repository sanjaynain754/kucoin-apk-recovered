package p751x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: x7.k */
/* JADX INFO: compiled from: Program64Header.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46095k extends AbstractC46089e {
    public C46095k(C46093i c46093i, AbstractC46088d abstractC46088d, long j11) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (abstractC46088d.f103537a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j12 = abstractC46088d.f103539c + (j11 * ((long) abstractC46088d.f103541e));
        this.f103546a = c46093i.m101604m(byteBufferAllocate, j12);
        this.f103547b = c46093i.m101602k(byteBufferAllocate, 8 + j12);
        this.f103548c = c46093i.m101602k(byteBufferAllocate, 16 + j12);
        this.f103549d = c46093i.m101602k(byteBufferAllocate, j12 + 40);
    }
}
