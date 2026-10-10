package p048c2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p523p2.C43363j;
import p523p2.C43364k;
import p628t1.InterfaceC44610b;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.a0 */
/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C4781a0 extends AbstractC4789f {

    /* JADX INFO: renamed from: c */
    public static final byte[] f4792c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC44610b.f98907a);

    /* JADX INFO: renamed from: b */
    public final int f4793b;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f4792c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f4793b).array());
    }

    @Override // p048c2.AbstractC4789f
    /* JADX INFO: renamed from: c */
    public Bitmap mo4851c(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
        return C4783b0.m4869o(interfaceC45686d, bitmap, this.f4793b);
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        return (obj instanceof C4781a0) && this.f4793b == ((C4781a0) obj).f4793b;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return C43364k.m95522o(-569625254, C43364k.m95521n(this.f4793b));
    }

    public C4781a0(int i11) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C43363j.m95503a(z11, "roundingRadius must be greater than 0.");
        this.f4793b = i11;
    }
}
