package p280g2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import java.security.MessageDigest;
import p048c2.C4788e;
import p523p2.C43363j;
import p628t1.InterfaceC44616h;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: g2.f */
/* JADX INFO: compiled from: GifDrawableTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37793f implements InterfaceC44616h<C37790c> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC44616h<Bitmap> f85128b;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        this.f85128b.mo4268a(messageDigest);
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C37793f) {
            return this.f85128b.equals(((C37793f) obj).f85128b);
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return this.f85128b.hashCode();
    }

    public C37793f(InterfaceC44616h<Bitmap> interfaceC44616h) {
        this.f85128b = (InterfaceC44616h) C43363j.m95506d(interfaceC44616h);
    }

    @Override // p628t1.InterfaceC44616h
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45359j<C37790c> mo4269b(@NonNull Context context, @NonNull InterfaceC45359j<C37790c> interfaceC45359j, int i11, int i12) {
        C37790c c37790c = interfaceC45359j.get();
        InterfaceC45359j<Bitmap> c4788e = new C4788e(c37790c.m85256e(), ComponentCallbacks2C5309c.m6550c(context).m6562f());
        InterfaceC45359j<Bitmap> interfaceC45359jMo4269b = this.f85128b.mo4269b(context, c4788e, i11, i12);
        if (!c4788e.equals(interfaceC45359jMo4269b)) {
            c4788e.recycle();
        }
        c37790c.m85264m(this.f85128b, interfaceC45359jMo4269b.get());
        return interfaceC45359j;
    }
}
