package p751x7;

import com.facebook.soloader.MinElf;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.p505ws.WebSocketProtocol;
import p852kotlin.UShort;

/* JADX INFO: renamed from: x7.i */
/* JADX INFO: compiled from: ElfParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C46093i implements Closeable {

    /* JADX INFO: renamed from: b */
    public final int f103553b = MinElf.ELF_MAGIC;

    /* JADX INFO: renamed from: c */
    public final FileChannel f103554c;

    /* JADX INFO: renamed from: h */
    public void m101599h(ByteBuffer byteBuffer, long j11, int i11) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        long j12 = 0;
        while (j12 < i11) {
            int i12 = this.f103554c.read(byteBuffer, j11 + j12);
            if (i12 == -1) {
                throw new EOFException();
            }
            j12 += (long) i12;
        }
        byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: i */
    public short m101600i(ByteBuffer byteBuffer, long j11) throws IOException {
        m101599h(byteBuffer, j11, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: renamed from: j */
    public int m101601j(ByteBuffer byteBuffer, long j11) throws IOException {
        m101599h(byteBuffer, j11, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: m */
    public long m101604m(ByteBuffer byteBuffer, long j11) throws IOException {
        m101599h(byteBuffer, j11, 4);
        return ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
    }

    /* JADX INFO: renamed from: a */
    public final long m101596a(AbstractC46088d abstractC46088d, long j11, long j12) throws IOException {
        for (long j13 = 0; j13 < j11; j13++) {
            AbstractC46089e abstractC46089eMo101594b = abstractC46088d.mo101594b(j13);
            if (abstractC46089eMo101594b.f103546a == 1) {
                long j14 = abstractC46089eMo101594b.f103548c;
                if (j14 <= j12 && j12 <= abstractC46089eMo101594b.f103549d + j14) {
                    return (j12 - j14) + abstractC46089eMo101594b.f103547b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* JADX INFO: renamed from: b */
    public AbstractC46088d m101597b() throws IOException {
        this.f103554c.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m101604m(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sM101600i = m101600i(byteBufferAllocate, 4L);
        boolean z11 = m101600i(byteBufferAllocate, 5L) == 2;
        if (sM101600i == 1) {
            return new C46091g(z11, this);
        }
        if (sM101600i == 2) {
            return new C46092h(z11, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f103554c.close();
    }

    /* JADX INFO: renamed from: g */
    public List<String> m101598g() throws IOException {
        long j11;
        long j12;
        this.f103554c.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC46088d abstractC46088dM101597b = m101597b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(abstractC46088dM101597b.f103537a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j13 = abstractC46088dM101597b.f103542f;
        int i11 = 0;
        if (j13 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j13 = abstractC46088dM101597b.mo101595c(0).f103550a;
        }
        long j14 = 0;
        while (true) {
            j11 = 1;
            if (j14 >= j13) {
                j12 = 0;
                break;
            }
            AbstractC46089e abstractC46089eMo101594b = abstractC46088dM101597b.mo101594b(j14);
            if (abstractC46089eMo101594b.f103546a == 2) {
                j12 = abstractC46089eMo101594b.f103547b;
                break;
            }
            j14++;
        }
        if (j12 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j15 = 0;
        while (true) {
            AbstractC46087c abstractC46087cMo101593a = abstractC46088dM101597b.mo101593a(j12, i11);
            long j16 = j11;
            long j17 = abstractC46087cMo101593a.f103535a;
            if (j17 == j16) {
                arrayList2.add(Long.valueOf(abstractC46087cMo101593a.f103536b));
            } else if (j17 == 5) {
                j15 = abstractC46087cMo101593a.f103536b;
            }
            i11++;
            if (abstractC46087cMo101593a.f103535a == 0) {
                break;
            }
            j11 = j16;
            j13 = j13;
        }
        if (j15 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jM101596a = m101596a(abstractC46088dM101597b, j13, j15);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(m101603l(byteBufferAllocate, ((Long) it.next()).longValue() + jM101596a));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public long m101602k(ByteBuffer byteBuffer, long j11) throws IOException {
        m101599h(byteBuffer, j11, 8);
        return byteBuffer.getLong();
    }

    /* JADX INFO: renamed from: l */
    public String m101603l(ByteBuffer byteBuffer, long j11) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short sM101600i = m101600i(byteBuffer, j11);
            if (sM101600i == 0) {
                return sb2.toString();
            }
            sb2.append((char) sM101600i);
            j11 = j12;
        }
    }

    public C46093i(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            this.f103554c = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }
}
