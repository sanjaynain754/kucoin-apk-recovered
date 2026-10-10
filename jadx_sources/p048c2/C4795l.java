package p048c2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p628t1.InterfaceC44610b;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.l */
/* JADX INFO: compiled from: CircleCrop.java */
/* JADX INFO: loaded from: classes.dex */
public class C4795l extends AbstractC4789f {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4813b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC44610b.f98907a);

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f4813b);
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        return obj instanceof C4795l;
    }

    @Override // p048c2.AbstractC4789f
    /* JADX INFO: renamed from: c */
    public Bitmap mo4851c(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12) {
        return C4783b0.m4858d(interfaceC45686d, bitmap, i11, i12);
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return 1101716364;
    }
}
