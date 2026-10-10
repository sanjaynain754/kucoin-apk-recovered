package p751x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: x7.m */
/* JADX INFO: compiled from: Section64Header.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46097m extends AbstractC46090f {
    public C46097m(C46093i c46093i, AbstractC46088d abstractC46088d, int i11) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (abstractC46088d.f103537a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        this.f103550a = c46093i.m101604m(byteBufferAllocate, abstractC46088d.f103540d + ((long) (i11 * abstractC46088d.f103543g)) + 44);
    }
}
