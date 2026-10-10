package p298h2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p048c2.C4788e;
import p280g2.C37790c;
import p628t1.C44613e;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: h2.c */
/* JADX INFO: compiled from: DrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C38082c implements InterfaceC38084e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45686d f85728a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38084e<Bitmap, byte[]> f85729b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38084e<C37790c, byte[]> f85730c;

    public C38082c(@NonNull InterfaceC45686d interfaceC45686d, @NonNull InterfaceC38084e<Bitmap, byte[]> interfaceC38084e, @NonNull InterfaceC38084e<C37790c, byte[]> interfaceC38084e2) {
        this.f85728a = interfaceC45686d;
        this.f85729b = interfaceC38084e;
        this.f85730c = interfaceC38084e2;
    }

    @Override // p298h2.InterfaceC38084e
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC45359j<byte[]> mo85980a(@NonNull InterfaceC45359j<Drawable> interfaceC45359j, @NonNull C44613e c44613e) {
        Drawable drawable = interfaceC45359j.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f85729b.mo85980a(C4788e.m4879c(((BitmapDrawable) drawable).getBitmap(), this.f85728a), c44613e);
        }
        if (drawable instanceof C37790c) {
            return this.f85730c.mo85980a(m85981b(interfaceC45359j), c44613e);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: b */
    public static InterfaceC45359j<C37790c> m85981b(@NonNull InterfaceC45359j<Drawable> interfaceC45359j) {
        return interfaceC45359j;
    }
}
