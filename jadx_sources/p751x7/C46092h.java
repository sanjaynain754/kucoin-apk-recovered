package p751x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: x7.h */
/* JADX INFO: compiled from: Elf64Header.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46092h extends AbstractC46088d {

    /* JADX INFO: renamed from: j */
    public final C46093i f103552j;

    @Override // p751x7.AbstractC46088d
    /* JADX INFO: renamed from: a */
    public AbstractC46087c mo101593a(long j11, int i11) throws IOException {
        return new C46086b(this.f103552j, this, j11, i11);
    }

    @Override // p751x7.AbstractC46088d
    /* JADX INFO: renamed from: b */
    public AbstractC46089e mo101594b(long j11) throws IOException {
        return new C46095k(this.f103552j, this, j11);
    }

    @Override // p751x7.AbstractC46088d
    /* JADX INFO: renamed from: c */
    public AbstractC46090f mo101595c(int i11) throws IOException {
        return new C46097m(this.f103552j, this, i11);
    }

    public C46092h(boolean z11, C46093i c46093i) throws IOException {
        ByteOrder byteOrder;
        this.f103537a = z11;
        this.f103552j = c46093i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (z11) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        this.f103538b = c46093i.m101601j(byteBufferAllocate, 16L);
        this.f103539c = c46093i.m101602k(byteBufferAllocate, 32L);
        this.f103540d = c46093i.m101602k(byteBufferAllocate, 40L);
        this.f103541e = c46093i.m101601j(byteBufferAllocate, 54L);
        this.f103542f = c46093i.m101601j(byteBufferAllocate, 56L);
        this.f103543g = c46093i.m101601j(byteBufferAllocate, 58L);
        this.f103544h = c46093i.m101601j(byteBufferAllocate, 60L);
        this.f103545i = c46093i.m101601j(byteBufferAllocate, 62L);
    }
}
