package p008a6;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.memory.C5658a;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import p006a4.AbstractC0110a;
import p006a4.InterfaceC0117h;
import p712w3.C45708h;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: a6.u */
/* JADX INFO: compiled from: FlexByteArrayPool.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0161u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0117h<byte[]> f543a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final b f544b;

    /* JADX INFO: renamed from: a6.u$a */
    /* JADX INFO: compiled from: FlexByteArrayPool.java */
    public class a implements InterfaceC0117h<byte[]> {
        public a() {
        }

        @Override // p006a4.InterfaceC0117h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(byte[] bArr) {
            C0161u.this.m720b(bArr);
        }
    }

    /* JADX INFO: renamed from: a6.u$b */
    /* JADX INFO: compiled from: FlexByteArrayPool.java */
    @VisibleForTesting
    public static class b extends C5658a {
        @Override // com.facebook.imagepipeline.memory.BasePool
        /* JADX INFO: renamed from: x */
        public C0150j<byte[]> mo722x(int i11) {
            return new C0138c0(mo703p(i11), this.f9150c.f520g, 0);
        }

        public b(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0, PoolStatsTracker poolStatsTracker) {
            super(interfaceC46675d, c0148h0, poolStatsTracker);
        }
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0110a<byte[]> m719a(int i11) {
        return AbstractC0110a.m560u(this.f544b.get(i11), this.f543a);
    }

    /* JADX INFO: renamed from: b */
    public void m720b(byte[] bArr) {
        this.f544b.release(bArr);
    }

    public C0161u(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0) {
        boolean z11;
        if (c0148h0.f520g > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        this.f544b = new b(interfaceC46675d, c0148h0, C0136b0.m614h());
        this.f543a = new a();
    }
}
