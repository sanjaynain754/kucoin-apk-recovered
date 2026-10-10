package p048c2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p523p2.C43363j;
import p680v1.InterfaceC45356g;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: c2.x */
/* JADX INFO: compiled from: LazyBitmapDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class C4807x implements InterfaceC45359j<BitmapDrawable>, InterfaceC45356g {

    /* JADX INFO: renamed from: b */
    public final Resources f4830b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45359j<Bitmap> f4831c;

    @Nullable
    /* JADX INFO: renamed from: c */
    public static InterfaceC45359j<BitmapDrawable> m4910c(@NonNull Resources resources, @Nullable InterfaceC45359j<Bitmap> interfaceC45359j) {
        if (interfaceC45359j == null) {
            return null;
        }
        return new C4807x(resources, interfaceC45359j);
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<BitmapDrawable> mo4266a() {
        return BitmapDrawable.class;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f4830b, this.f4831c.get());
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return this.f4831c.getSize();
    }

    @Override // p680v1.InterfaceC45356g
    public void initialize() {
        InterfaceC45359j<Bitmap> interfaceC45359j = this.f4831c;
        if (interfaceC45359j instanceof InterfaceC45356g) {
            ((InterfaceC45356g) interfaceC45359j).initialize();
        }
    }

    @Override // p680v1.InterfaceC45359j
    public void recycle() {
        this.f4831c.recycle();
    }

    public C4807x(@NonNull Resources resources, @NonNull InterfaceC45359j<Bitmap> interfaceC45359j) {
        this.f4830b = (Resources) C43363j.m95506d(resources);
        this.f4831c = (InterfaceC45359j) C43363j.m95506d(interfaceC45359j);
    }
}
