package p335i8;

import androidx.work.Data;
import com.github.penfeizhou.animation.p065io.InterfaceC6956e;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: i8.a */
/* JADX INFO: compiled from: GifWriter.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38483a implements InterfaceC6956e {

    /* JADX INFO: renamed from: a */
    public IntBuffer f86419a;

    /* JADX INFO: renamed from: a */
    public IntBuffer m87078a() {
        return this.f86419a;
    }

    /* JADX INFO: renamed from: b */
    public int[] m87079b() {
        return this.f86419a.array();
    }

    /* JADX INFO: renamed from: c */
    public void m87080c(int i11) {
        IntBuffer intBuffer = this.f86419a;
        if (intBuffer == null || i11 > intBuffer.capacity()) {
            this.f86419a = IntBuffer.allocate(i11);
        }
        this.f86419a.clear();
        this.f86419a.limit(i11);
        this.f86419a.position(0);
    }

    public C38483a() {
        m87080c(Data.MAX_DATA_BYTES);
    }

    @Override // com.github.penfeizhou.animation.p065io.InterfaceC6956e
    public void close() {
    }
}
