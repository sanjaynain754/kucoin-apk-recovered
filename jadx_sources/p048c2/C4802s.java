package p048c2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import java.security.MessageDigest;
import p628t1.InterfaceC44616h;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.s */
/* JADX INFO: compiled from: DrawableTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class C4802s implements InterfaceC44616h<Drawable> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC44616h<Bitmap> f4815b;

    /* JADX INFO: renamed from: c */
    public final boolean f4816c;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        this.f4815b.mo4268a(messageDigest);
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C4802s) {
            return this.f4815b.equals(((C4802s) obj).f4815b);
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return this.f4815b.hashCode();
    }

    public C4802s(InterfaceC44616h<Bitmap> interfaceC44616h, boolean z11) {
        this.f4815b = interfaceC44616h;
        this.f4816c = z11;
    }

    @Override // p628t1.InterfaceC44616h
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45359j<Drawable> mo4269b(@NonNull Context context, @NonNull InterfaceC45359j<Drawable> interfaceC45359j, int i11, int i12) {
        InterfaceC45686d interfaceC45686dM6562f = ComponentCallbacks2C5309c.m6550c(context).m6562f();
        Drawable drawable = interfaceC45359j.get();
        InterfaceC45359j<Bitmap> interfaceC45359jM4891a = C4801r.m4891a(interfaceC45686dM6562f, drawable, i11, i12);
        if (interfaceC45359jM4891a == null) {
            if (!this.f4816c) {
                return interfaceC45359j;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        InterfaceC45359j<Bitmap> interfaceC45359jMo4269b = this.f4815b.mo4269b(context, interfaceC45359jM4891a, i11, i12);
        if (interfaceC45359jMo4269b.equals(interfaceC45359jM4891a)) {
            interfaceC45359jMo4269b.recycle();
            return interfaceC45359j;
        }
        return m4895d(context, interfaceC45359jMo4269b);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC45359j<Drawable> m4895d(Context context, InterfaceC45359j<Bitmap> interfaceC45359j) {
        return C4807x.m4910c(context.getResources(), interfaceC45359j);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC44616h<BitmapDrawable> m4894c() {
        return this;
    }
}
