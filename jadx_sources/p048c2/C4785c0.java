package p048c2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p523p2.C43364k;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.c0 */
/* JADX INFO: compiled from: UnitBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C4785c0 implements InterfaceC44614f<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: c2.c0$a */
    /* JADX INFO: compiled from: UnitBitmapDecoder.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class a implements InterfaceC45359j<Bitmap> {

        /* JADX INFO: renamed from: b */
        public final Bitmap f4805b;

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
            return this.f4805b;
        }

        @Override // p680v1.InterfaceC45359j
        public int getSize() {
            return C43364k.m95515h(this.f4805b);
        }

        public a(@NonNull Bitmap bitmap) {
            this.f4805b = bitmap;
        }

        @Override // p680v1.InterfaceC45359j
        public void recycle() {
        }
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull Bitmap bitmap, @NonNull C44613e c44613e) {
        return true;
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull Bitmap bitmap, int i11, int i12, @NonNull C44613e c44613e) {
        return new a(bitmap);
    }
}
