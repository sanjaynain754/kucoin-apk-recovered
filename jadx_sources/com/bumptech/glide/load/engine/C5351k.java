package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.util.Collections;
import java.util.List;
import p523p2.C43359f;
import p628t1.InterfaceC44609a;
import p628t1.InterfaceC44610b;
import p680v1.AbstractC45352c;
import p680v1.C45350a;
import p680v1.C45351b;
import p817z1.InterfaceC46635n;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.k */
/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class C5351k implements InterfaceC5343c, InterfaceC5343c.a {

    /* JADX INFO: renamed from: b */
    public final C5344d<?> f6946b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5343c.a f6947c;

    /* JADX INFO: renamed from: d */
    public int f6948d;

    /* JADX INFO: renamed from: e */
    public C5342b f6949e;

    /* JADX INFO: renamed from: f */
    public Object f6950f;

    /* JADX INFO: renamed from: g */
    public volatile InterfaceC46635n.a<?> f6951g;

    /* JADX INFO: renamed from: h */
    public C45350a f6952h;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$a */
    /* JADX INFO: compiled from: SourceGenerator.java */
    public class a implements InterfaceC5323d.a<Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC46635n.a f6953b;

        public a(InterfaceC46635n.a aVar) {
            this.f6953b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
        /* JADX INFO: renamed from: e */
        public void mo6674e(@Nullable Object obj) {
            if (C5351k.this.m6829g(this.f6953b)) {
                C5351k.this.m6830h(this.f6953b, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
        /* JADX INFO: renamed from: f */
        public void mo6675f(@NonNull Exception exc) {
            if (C5351k.this.m6829g(this.f6953b)) {
                C5351k.this.m6831i(this.f6953b, exc);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m6827f() {
        return this.f6948d < this.f6946b.m6761g().size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c
    /* JADX INFO: renamed from: a */
    public boolean mo6753a() {
        Object obj = this.f6950f;
        if (obj != null) {
            this.f6950f = null;
            m6828e(obj);
        }
        C5342b c5342b = this.f6949e;
        if (c5342b != null && c5342b.mo6753a()) {
            return true;
        }
        this.f6949e = null;
        this.f6951g = null;
        boolean z11 = false;
        while (!z11 && m6827f()) {
            List<InterfaceC46635n.a<?>> listM6761g = this.f6946b.m6761g();
            int i11 = this.f6948d;
            this.f6948d = i11 + 1;
            this.f6951g = listM6761g.get(i11);
            if (this.f6951g != null && (this.f6946b.m6759e().mo100252c(this.f6951g.f104429c.mo25c()) || this.f6946b.m6774t(this.f6951g.f104429c.mo23a()))) {
                m6832j(this.f6951g);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c.a
    /* JADX INFO: renamed from: b */
    public void mo6701b(InterfaceC44610b interfaceC44610b, Exception exc, InterfaceC5323d<?> interfaceC5323d, DataSource dataSource) {
        this.f6947c.mo6701b(interfaceC44610b, exc, interfaceC5323d, this.f6951g.f104429c.mo25c());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c.a
    /* JADX INFO: renamed from: c */
    public void mo6702c(InterfaceC44610b interfaceC44610b, Object obj, InterfaceC5323d<?> interfaceC5323d, DataSource dataSource, InterfaceC44610b interfaceC44610b2) {
        this.f6947c.mo6702c(interfaceC44610b, obj, interfaceC5323d, this.f6951g.f104429c.mo25c(), interfaceC44610b);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c
    public void cancel() {
        InterfaceC46635n.a<?> aVar = this.f6951g;
        if (aVar != null) {
            aVar.f104429c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5343c.a
    /* JADX INFO: renamed from: d */
    public void mo6703d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public final void m6828e(Object obj) {
        long jM95490b = C43359f.m95490b();
        try {
            InterfaceC44609a<X> interfaceC44609aM6770p = this.f6946b.m6770p(obj);
            C45351b c45351b = new C45351b(interfaceC44609aM6770p, obj, this.f6946b.m6765k());
            this.f6952h = new C45350a(this.f6951g.f104427a, this.f6946b.m6769o());
            this.f6946b.m6758d().mo101439b(this.f6952h, c45351b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f6952h + ", data: " + obj + ", encoder: " + interfaceC44609aM6770p + ", duration: " + C43359f.m95489a(jM95490b));
            }
            this.f6951g.f104429c.mo24b();
            this.f6949e = new C5342b(Collections.singletonList(this.f6951g.f104427a), this.f6946b, this);
        } catch (Throwable th2) {
            this.f6951g.f104429c.mo24b();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m6829g(InterfaceC46635n.a<?> aVar) {
        InterfaceC46635n.a<?> aVar2 = this.f6951g;
        return aVar2 != null && aVar2 == aVar;
    }

    /* JADX INFO: renamed from: h */
    public void m6830h(InterfaceC46635n.a<?> aVar, Object obj) {
        AbstractC45352c abstractC45352cM6759e = this.f6946b.m6759e();
        if (obj != null && abstractC45352cM6759e.mo100252c(aVar.f104429c.mo25c())) {
            this.f6950f = obj;
            this.f6947c.mo6703d();
        } else {
            InterfaceC5343c.a aVar2 = this.f6947c;
            InterfaceC44610b interfaceC44610b = aVar.f104427a;
            InterfaceC5323d<?> interfaceC5323d = aVar.f104429c;
            aVar2.mo6702c(interfaceC44610b, obj, interfaceC5323d, interfaceC5323d.mo25c(), this.f6952h);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m6831i(InterfaceC46635n.a<?> aVar, @NonNull Exception exc) {
        InterfaceC5343c.a aVar2 = this.f6947c;
        C45350a c45350a = this.f6952h;
        InterfaceC5323d<?> interfaceC5323d = aVar.f104429c;
        aVar2.mo6701b(c45350a, exc, interfaceC5323d, interfaceC5323d.mo25c());
    }

    /* JADX INFO: renamed from: j */
    public final void m6832j(InterfaceC46635n.a<?> aVar) {
        this.f6951g.f104429c.mo26d(this.f6946b.m6766l(), new a(aVar));
    }

    public C5351k(C5344d<?> c5344d, InterfaceC5343c.a aVar) {
        this.f6946b = c5344d;
        this.f6947c = aVar;
    }
}
