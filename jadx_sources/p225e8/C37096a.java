package p225e8;

import com.github.penfeizhou.animation.p065io.C6954c;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: e8.a */
/* JADX INFO: compiled from: AVIFReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C37096a extends C6954c {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f82365b;

    /* JADX INFO: renamed from: a */
    public ByteBuffer m83025a() throws IOException {
        if (this.f82365b == null) {
            int iAvailable = available();
            byte[] bArr = new byte[iAvailable];
            read(bArr, 0, iAvailable);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iAvailable);
            this.f82365b = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(bArr);
        }
        this.f82365b.flip();
        return this.f82365b;
    }

    public C37096a(Reader reader) {
        super(reader);
        this.f82365b = null;
    }
}
