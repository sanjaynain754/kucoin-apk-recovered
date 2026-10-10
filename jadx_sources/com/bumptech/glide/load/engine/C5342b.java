package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.File;
import java.util.List;
import p628t1.InterfaceC44610b;
import p680v1.C45350a;
import p817z1.InterfaceC46635n;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.b */
/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class C5342b implements InterfaceC5343c, InterfaceC5323d.a<Object> {

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC44610b> f6834b;

    /* JADX INFO: renamed from: c */
    public final C5344d<?> f6835c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5343c.a f6836d;

    /* JADX INFO: renamed from: e */
    public int f6837e;

    /* JADX INFO: renamed from: f */
    public InterfaceC44610b f6838f;

    /* JADX INFO: renamed from: g */
    public List<InterfaceC46635n<File, ?>> f6839g;

    /* JADX INFO: renamed from: h */
    public int f6840h;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC46635n.a<?> f6841i;

    /* JADX INFO: renamed from: j */
    public File f6842j;

    public C5342b(C5344d<?> c5344d, InterfaceC5343c.a aVar) {
        this(c5344d.m6757c(), c5344d, aVar);
    }

    public C5342b(List<InterfaceC44610b> list, C5344d<?> c5344d, InterfaceC5343c.a aVar) {
        this.f6837e = -1;
        this.f6834b = list;
        this.f6835c = c5344d;
        this.f6836d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c
    /* JADX INFO: renamed from: a */
    public boolean mo6753a() {
        while (true) {
            boolean z11 = false;
            if (this.f6839g != null && m6754b()) {
                this.f6841i = null;
                while (!z11 && m6754b()) {
                    List<InterfaceC46635n<File, ?>> list = this.f6839g;
                    int i11 = this.f6840h;
                    this.f6840h = i11 + 1;
                    this.f6841i = list.get(i11).mo10a(this.f6842j, this.f6835c.m6773s(), this.f6835c.m6760f(), this.f6835c.m6765k());
                    if (this.f6841i != null && this.f6835c.m6774t(this.f6841i.f104429c.mo23a())) {
                        this.f6841i.f104429c.mo26d(this.f6835c.m6766l(), this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f6837e + 1;
            this.f6837e = i12;
            if (i12 >= this.f6834b.size()) {
                return false;
            }
            InterfaceC44610b interfaceC44610b = this.f6834b.get(this.f6837e);
            File fileMo101438a = this.f6835c.m6758d().mo101438a(new C45350a(interfaceC44610b, this.f6835c.m6769o()));
            this.f6842j = fileMo101438a;
            if (fileMo101438a != null) {
                this.f6838f = interfaceC44610b;
                this.f6839g = this.f6835c.m6764j(fileMo101438a);
                this.f6840h = 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6754b() {
        return this.f6840h < this.f6839g.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c
    public void cancel() {
        InterfaceC46635n.a<?> aVar = this.f6841i;
        if (aVar != null) {
            aVar.f104429c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
    /* JADX INFO: renamed from: e */
    public void mo6674e(Object obj) {
        this.f6836d.mo6702c(this.f6838f, obj, this.f6841i.f104429c, DataSource.DATA_DISK_CACHE, this.f6838f);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
    /* JADX INFO: renamed from: f */
    public void mo6675f(@NonNull Exception exc) {
        this.f6836d.mo6701b(this.f6838f, exc, this.f6841i.f104429c, DataSource.DATA_DISK_CACHE);
    }
}
