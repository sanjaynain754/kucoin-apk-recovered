package p048c2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p219e2.C37048d;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.z */
/* JADX INFO: compiled from: ResourceBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C4809z implements InterfaceC44614f<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C37048d f4833a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45686d f4834b;

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        InterfaceC45359j<Drawable> interfaceC45359jMo4261a = this.f4833a.mo4261a(uri, i11, i12, c44613e);
        if (interfaceC45359jMo4261a == null) {
            return null;
        }
        return C4801r.m4891a(this.f4834b, interfaceC45359jMo4261a.get(), i11, i12);
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull Uri uri, @NonNull C44613e c44613e) {
        return "android.resource".equals(uri.getScheme());
    }

    public C4809z(C37048d c37048d, InterfaceC45686d interfaceC45686d) {
        this.f4833a = c37048d;
        this.f4834b = interfaceC45686d;
    }
}
