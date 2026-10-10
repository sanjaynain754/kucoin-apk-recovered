package p219e2;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: compiled from: NonOwnedDrawableResource.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C37047c extends AbstractC37046b<Drawable> {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static InterfaceC45359j<Drawable> m82896c(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new C37047c(drawable);
        }
        return null;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<Drawable> mo4266a() {
        return this.f82301b.getClass();
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return Math.max(1, this.f82301b.getIntrinsicWidth() * this.f82301b.getIntrinsicHeight() * 4);
    }

    public C37047c(Drawable drawable) {
        super(drawable);
    }

    @Override // p680v1.InterfaceC45359j
    public void recycle() {
    }
}
