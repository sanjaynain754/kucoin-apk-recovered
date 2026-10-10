package p280g2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p048c2.C4788e;
import p581r1.InterfaceC43896a;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: g2.h */
/* JADX INFO: compiled from: GifFrameResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C37795h implements InterfaceC44614f<InterfaceC43896a, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45686d f85152a;

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull InterfaceC43896a interfaceC43896a, @NonNull C44613e c44613e) {
        return true;
    }

    public C37795h(InterfaceC45686d interfaceC45686d) {
        this.f85152a = interfaceC45686d;
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Bitmap> mo4261a(@NonNull InterfaceC43896a interfaceC43896a, int i11, int i12, @NonNull C44613e c44613e) {
        return C4788e.m4879c(interfaceC43896a.mo96676f(), this.f85152a);
    }
}
