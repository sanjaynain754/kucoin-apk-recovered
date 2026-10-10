package yb0;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: yb0.m */
/* JADX INFO: compiled from: DatabaseTask.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C46445m {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final InterfaceC46444l f104158a;

    /* JADX INFO: renamed from: b */
    public final Runnable f104159b;

    /* JADX INFO: renamed from: a */
    public Integer m102482a() {
        InterfaceC46444l interfaceC46444l = this.f104158a;
        if (interfaceC46444l != null) {
            return Integer.valueOf(interfaceC46444l.mo102480a());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m102483b() {
        InterfaceC46444l interfaceC46444l = this.f104158a;
        return interfaceC46444l != null && interfaceC46444l.mo102481b();
    }

    public C46445m(InterfaceC46444l interfaceC46444l, Runnable runnable) {
        this.f104158a = interfaceC46444l;
        this.f104159b = runnable;
    }
}
