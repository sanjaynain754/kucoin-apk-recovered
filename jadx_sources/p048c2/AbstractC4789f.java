package p048c2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import p523p2.C43364k;
import p628t1.InterfaceC44616h;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.f */
/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4789f implements InterfaceC44616h<Bitmap> {
    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo4851c(@NonNull InterfaceC45686d interfaceC45686d, @NonNull Bitmap bitmap, int i11, int i12);

    @Override // p628t1.InterfaceC44616h
    @NonNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC45359j<Bitmap> mo4269b(@NonNull Context context, @NonNull InterfaceC45359j<Bitmap> interfaceC45359j, int i11, int i12) {
        if (C43364k.m95528u(i11, i12)) {
            InterfaceC45686d interfaceC45686dM6562f = ComponentCallbacks2C5309c.m6550c(context).m6562f();
            Bitmap bitmap = interfaceC45359j.get();
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getWidth();
            }
            if (i12 == Integer.MIN_VALUE) {
                i12 = bitmap.getHeight();
            }
            Bitmap bitmapMo4851c = mo4851c(interfaceC45686dM6562f, bitmap, i11, i12);
            if (bitmap.equals(bitmapMo4851c)) {
                return interfaceC45359j;
            }
            return C4788e.m4879c(bitmapMo4851c, interfaceC45686dM6562f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i11 + " or height: " + i12 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
