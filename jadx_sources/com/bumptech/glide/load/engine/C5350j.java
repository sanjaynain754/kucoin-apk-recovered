package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.File;
import java.util.List;
import p628t1.InterfaceC44610b;
import p680v1.C45360k;
import p817z1.InterfaceC46635n;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.j */
/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class C5350j implements InterfaceC5343c, InterfaceC5323d.a<Object> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5343c.a f6936b;

    /* JADX INFO: renamed from: c */
    public final C5344d<?> f6937c;

    /* JADX INFO: renamed from: d */
    public int f6938d;

    /* JADX INFO: renamed from: e */
    public int f6939e = -1;

    /* JADX INFO: renamed from: f */
    public InterfaceC44610b f6940f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC46635n<File, ?>> f6941g;

    /* JADX INFO: renamed from: h */
    public int f6942h;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC46635n.a<?> f6943i;

    /* JADX INFO: renamed from: j */
    public File f6944j;

    /* JADX INFO: renamed from: k */
    public C45360k f6945k;

    /* JADX INFO: renamed from: b */
    private boolean m6826b() {
        return this.f6942h < this.f6941g.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c
    /* JADX INFO: renamed from: a */
    public boolean mo6753a() {
        List<InterfaceC44610b> listM6757c = this.f6937c.m6757c();
        boolean z11 = false;
        if (listM6757c.isEmpty()) {
            return false;
        }
        List<Class<?>> listM6767m = this.f6937c.m6767m();
        if (listM6767m.isEmpty()) {
            if (File.class.equals(this.f6937c.m6771q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f6937c.m6763i() + " to " + this.f6937c.m6771q());
        }
        while (true) {
            if (this.f6941g != null && m6826b()) {
                this.f6943i = null;
                while (!z11 && m6826b()) {
                    List<InterfaceC46635n<File, ?>> list = this.f6941g;
                    int i11 = this.f6942h;
                    this.f6942h = i11 + 1;
                    this.f6943i = list.get(i11).mo10a(this.f6944j, this.f6937c.m6773s(), this.f6937c.m6760f(), this.f6937c.m6765k());
                    if (this.f6943i != null && this.f6937c.m6774t(this.f6943i.f104429c.mo23a())) {
                        this.f6943i.f104429c.mo26d(this.f6937c.m6766l(), this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f6939e + 1;
            this.f6939e = i12;
            if (i12 >= listM6767m.size()) {
                int i13 = this.f6938d + 1;
                this.f6938d = i13;
                if (i13 >= listM6757c.size()) {
                    return false;
                }
                this.f6939e = 0;
            }
            InterfaceC44610b interfaceC44610b = listM6757c.get(this.f6938d);
            Class<?> cls = listM6767m.get(this.f6939e);
            this.f6945k = new C45360k(this.f6937c.m6756b(), interfaceC44610b, this.f6937c.m6769o(), this.f6937c.m6773s(), this.f6937c.m6760f(), this.f6937c.m6772r(cls), cls, this.f6937c.m6765k());
            File fileMo101438a = this.f6937c.m6758d().mo101438a(this.f6945k);
            this.f6944j = fileMo101438a;
            if (fileMo101438a != null) {
                this.f6940f = interfaceC44610b;
                this.f6941g = this.f6937c.m6764j(fileMo101438a);
                this.f6942h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c
    public void cancel() {
        InterfaceC46635n.a<?> aVar = this.f6943i;
        if (aVar != null) {
            aVar.f104429c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
    /* JADX INFO: renamed from: e */
    public void mo6674e(Object obj) {
        this.f6936b.mo6702c(this.f6940f, obj, this.f6943i.f104429c, DataSource.RESOURCE_DISK_CACHE, this.f6945k);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
    /* JADX INFO: renamed from: f */
    public void mo6675f(@NonNull Exception exc) {
        this.f6936b.mo6701b(this.f6945k, exc, this.f6943i.f104429c, DataSource.RESOURCE_DISK_CACHE);
    }

    public C5350j(C5344d<?> c5344d, InterfaceC5343c.a aVar) {
        this.f6937c = c5344d;
        this.f6936b = aVar;
    }
}
