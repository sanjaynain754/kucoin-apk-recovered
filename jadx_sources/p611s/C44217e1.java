package p611s;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: s.e1 */
/* JADX INFO: loaded from: classes23.dex */
public class C44217e1 {

    /* JADX INFO: renamed from: a */
    public byte[] f97639a;

    /* JADX INFO: renamed from: b */
    public byte[] f97640b;

    /* JADX INFO: renamed from: c */
    public int f97641c;

    /* JADX INFO: renamed from: d */
    public int f97642d;

    /* JADX INFO: renamed from: e */
    public boolean f97643e;

    /* JADX INFO: renamed from: f */
    public String f97644f;

    /* JADX INFO: renamed from: g */
    public int f97645g;

    /* JADX INFO: renamed from: h */
    public int f97646h;

    /* JADX INFO: renamed from: i */
    public int f97647i;

    /* JADX INFO: renamed from: j */
    public C44209c f97648j;

    /* JADX INFO: renamed from: a */
    public byte[] m97502a() {
        return this.f97640b;
    }

    /* JADX INFO: renamed from: b */
    public void m97503b(byte[] bArr, byte[] bArr2) {
        this.f97639a = bArr;
        this.f97640b = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m97504c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f97641c, this.f97642d, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return bitmapCreateBitmap;
    }

    public C44217e1(int i11, int i12, boolean z11) {
        this.f97641c = i11;
        this.f97642d = i12;
        this.f97643e = z11;
    }
}
