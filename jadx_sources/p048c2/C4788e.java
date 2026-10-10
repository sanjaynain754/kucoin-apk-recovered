package p048c2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p523p2.C43363j;
import p523p2.C43364k;
import p680v1.InterfaceC45356g;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.e */
/* JADX INFO: compiled from: BitmapResource.java */
/* JADX INFO: loaded from: classes.dex */
public class C4788e implements InterfaceC45359j<Bitmap>, InterfaceC45356g {

    /* JADX INFO: renamed from: b */
    public final Bitmap f4807b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45686d f4808c;

    @Nullable
    /* JADX INFO: renamed from: c */
    public static C4788e m4879c(@Nullable Bitmap bitmap, @NonNull InterfaceC45686d interfaceC45686d) {
        if (bitmap == null) {
            return null;
        }
        return new C4788e(bitmap, interfaceC45686d);
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<Bitmap> mo4266a() {
        return Bitmap.class;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f4807b;
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return C43364k.m95515h(this.f4807b);
    }

    @Override // p680v1.InterfaceC45356g
    public void initialize() {
        this.f4807b.prepareToDraw();
    }

    @Override // p680v1.InterfaceC45359j
    public void recycle() {
        this.f4808c.mo4893b(this.f4807b);
    }

    public C4788e(@NonNull Bitmap bitmap, @NonNull InterfaceC45686d interfaceC45686d) {
        this.f4807b = (Bitmap) C43363j.m95507e(bitmap, "Bitmap must not be null");
        this.f4808c = (InterfaceC45686d) C43363j.m95507e(interfaceC45686d, "BitmapPool must not be null");
    }
}
