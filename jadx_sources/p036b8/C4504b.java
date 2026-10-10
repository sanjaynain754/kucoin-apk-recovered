package p036b8;

import com.github.penfeizhou.animation.p065io.C6953b;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: b8.b */
/* JADX INFO: compiled from: APNGWriter.java */
/* JADX INFO: loaded from: classes45.dex */
public class C4504b extends C6953b {
    /* JADX INFO: renamed from: g */
    public void m4314g(int i11) {
        m12799b((byte) (i11 & 255));
        m12799b((byte) ((i11 >> 8) & 255));
        m12799b((byte) ((i11 >> 16) & 255));
        m12799b((byte) ((i11 >> 24) & 255));
    }

    /* JADX INFO: renamed from: h */
    public void m4315h(int i11) {
        m12799b((byte) ((i11 >> 24) & 255));
        m12799b((byte) ((i11 >> 16) & 255));
        m12799b((byte) ((i11 >> 8) & 255));
        m12799b((byte) (i11 & 255));
    }

    @Override // com.github.penfeizhou.animation.p065io.C6953b
    /* JADX INFO: renamed from: d */
    public void mo4313d(int i11) {
        super.mo4313d(i11);
        this.f11610a.order(ByteOrder.BIG_ENDIAN);
    }
}
