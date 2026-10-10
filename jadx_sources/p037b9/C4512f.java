package p037b9;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;

/* JADX INFO: renamed from: b9.f */
/* JADX INFO: compiled from: DecoderResultPointCallback.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4512f implements ResultPointCallback {

    /* JADX INFO: renamed from: a */
    public C4510d f3925a;

    /* JADX INFO: renamed from: a */
    public void m4329a(C4510d c4510d) {
        this.f3925a = c4510d;
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        C4510d c4510d = this.f3925a;
        if (c4510d != null) {
            c4510d.foundPossibleResultPoint(resultPoint);
        }
    }
}
