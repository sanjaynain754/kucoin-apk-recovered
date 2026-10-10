package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p280g2.C37790c;
import p329i2.C38426r;
import p329i2.C38427s;
import p329i2.InterfaceC38411c;
import p329i2.InterfaceC38412d;
import p329i2.InterfaceC38420l;
import p329i2.InterfaceC38421m;
import p329i2.InterfaceC38425q;
import p419l2.C42032f;
import p419l2.InterfaceC42029c;
import p419l2.InterfaceC42031e;
import p445m2.AbstractC42393d;
import p445m2.InterfaceC42399j;
import p460n2.InterfaceC42704b;
import p523p2.C43364k;
import p680v1.AbstractC45352c;

/* JADX INFO: renamed from: com.bumptech.glide.h */
/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C5314h implements ComponentCallbacks2, InterfaceC38421m {

    /* JADX INFO: renamed from: m */
    public static final C42032f f6711m = C42032f.m92237u0(Bitmap.class).mo92179T();

    /* JADX INFO: renamed from: n */
    public static final C42032f f6712n = C42032f.m92237u0(C37790c.class).mo92179T();

    /* JADX INFO: renamed from: o */
    public static final C42032f f6713o = C42032f.m92238v0(AbstractC45352c.f101956c).mo92192d0(Priority.LOW).mo92207l0(true);

    /* JADX INFO: renamed from: b */
    public final ComponentCallbacks2C5309c f6714b;

    /* JADX INFO: renamed from: c */
    public final Context f6715c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC38420l f6716d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public final C38426r f6717e;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public final InterfaceC38425q f6718f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public final C38427s f6719g;

    /* JADX INFO: renamed from: h */
    public final Runnable f6720h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC38411c f6721i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList<InterfaceC42031e<Object>> f6722j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("this")
    public C42032f f6723k;

    /* JADX INFO: renamed from: l */
    public boolean f6724l;

    /* JADX INFO: renamed from: com.bumptech.glide.h$a */
    /* JADX INFO: compiled from: RequestManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C5314h componentCallbacks2C5314h = ComponentCallbacks2C5314h.this;
            componentCallbacks2C5314h.f6716d.mo86603b(componentCallbacks2C5314h);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.h$c */
    /* JADX INFO: compiled from: RequestManager.java */
    public class c implements InterfaceC38411c.a {

        /* JADX INFO: renamed from: a */
        @GuardedBy("RequestManager.this")
        public final C38426r f6726a;

        public c(C38426r c38426r) {
            this.f6726a = c38426r;
        }

        @Override // p329i2.InterfaceC38411c.a
        /* JADX INFO: renamed from: a */
        public void mo6642a(boolean z11) {
            if (z11) {
                synchronized (ComponentCallbacks2C5314h.this) {
                    this.f6726a.m86639e();
                }
            }
        }
    }

    public ComponentCallbacks2C5314h(@NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull InterfaceC38420l interfaceC38420l, @NonNull InterfaceC38425q interfaceC38425q, @NonNull Context context) {
        this(componentCallbacks2C5309c, interfaceC38420l, interfaceC38425q, new C38426r(), componentCallbacks2C5309c.m6563g(), context);
    }

    /* JADX INFO: renamed from: A */
    public synchronized void mo6616A(@NonNull C42032f c42032f) {
        this.f6723k = c42032f.clone().mo92187b();
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m6617B(@NonNull InterfaceC42399j<?> interfaceC42399j, @NonNull InterfaceC42029c interfaceC42029c) {
        this.f6719g.m86644j(interfaceC42399j);
        this.f6717e.m86641g(interfaceC42029c);
    }

    /* JADX INFO: renamed from: C */
    public synchronized boolean m6618C(@NonNull InterfaceC42399j<?> interfaceC42399j) {
        InterfaceC42029c request = interfaceC42399j.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f6717e.m86635a(request)) {
            return false;
        }
        this.f6719g.m86645k(interfaceC42399j);
        interfaceC42399j.mo92230g(null);
        return true;
    }

    @Override // p329i2.InterfaceC38421m
    public synchronized void onDestroy() {
        try {
            this.f6719g.onDestroy();
            Iterator<InterfaceC42399j<?>> it = this.f6719g.m86643d().iterator();
            while (it.hasNext()) {
                m6626n(it.next());
            }
            this.f6719g.m86642b();
            this.f6717e.m86636b();
            this.f6716d.mo86602a(this);
            this.f6716d.mo86602a(this.f6721i);
            C43364k.m95530w(this.f6720h);
            this.f6714b.m6571s(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p329i2.InterfaceC38421m
    public synchronized void onStart() {
        m6638z();
        this.f6719g.onStart();
    }

    @Override // p329i2.InterfaceC38421m
    public synchronized void onStop() {
        m6637y();
        this.f6719g.onStop();
    }

    /* JADX INFO: renamed from: q */
    public synchronized C42032f m6629q() {
        return this.f6723k;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6717e + ", treeNode=" + this.f6718f + "}";
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m6635w() {
        this.f6717e.m86637c();
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m6636x() {
        m6635w();
        Iterator<ComponentCallbacks2C5314h> it = this.f6718f.mo6914a().iterator();
        while (it.hasNext()) {
            it.next().m6635w();
        }
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m6637y() {
        this.f6717e.m86638d();
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m6638z() {
        this.f6717e.m86640f();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.h$b */
    /* JADX INFO: compiled from: RequestManager.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static class b extends AbstractC42393d<View, Object> {
        public b(@NonNull View view) {
            super(view);
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(@Nullable Drawable drawable) {
        }

        @Override // p445m2.AbstractC42393d
        /* JADX INFO: renamed from: k */
        public void mo6641k(@Nullable Drawable drawable) {
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: e */
        public void mo6639e(@NonNull Object obj, @Nullable InterfaceC42704b<? super Object> interfaceC42704b) {
        }
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b */
    public <ResourceType> C5313g<ResourceType> mo6620b(@NonNull Class<ResourceType> cls) {
        return new C5313g<>(this.f6714b, this, cls, this.f6715c);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d */
    public C5313g<Bitmap> mo6621d() {
        return mo6620b(Bitmap.class).mo6606a(f6711m);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j */
    public C5313g<Drawable> mo6622j() {
        return mo6620b(Drawable.class);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: k */
    public C5313g<File> mo6623k() {
        return mo6620b(File.class).mo6606a(C42032f.m92241y0(true));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: l */
    public C5313g<C37790c> mo6624l() {
        return mo6620b(C37790c.class).mo6606a(f6712n);
    }

    /* JADX INFO: renamed from: m */
    public void m6625m(@NonNull View view) {
        m6626n(new b(view));
    }

    /* JADX INFO: renamed from: n */
    public void m6626n(@Nullable InterfaceC42399j<?> interfaceC42399j) {
        if (interfaceC42399j == null) {
            return;
        }
        m6619D(interfaceC42399j);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: o */
    public C5313g<File> mo6627o() {
        return mo6620b(File.class).mo6606a(f6713o);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        if (i11 == 60 && this.f6724l) {
            m6636x();
        }
    }

    /* JADX INFO: renamed from: p */
    public List<InterfaceC42031e<Object>> m6628p() {
        return this.f6722j;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public <T> AbstractC5315i<?, T> m6630r(Class<T> cls) {
        return this.f6714b.m6565i().m6582e(cls);
    }

    /* JADX INFO: renamed from: D */
    public final void m6619D(@NonNull InterfaceC42399j<?> interfaceC42399j) {
        boolean zM6618C = m6618C(interfaceC42399j);
        InterfaceC42029c request = interfaceC42399j.getRequest();
        if (!zM6618C && !this.f6714b.m6569p(interfaceC42399j) && request != null) {
            interfaceC42399j.mo92230g(null);
            request.clear();
        }
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: s */
    public C5313g<Drawable> mo6631s(@Nullable File file) {
        return mo6622j().mo6598I0(file);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: t */
    public C5313g<Drawable> mo6632t(@Nullable @DrawableRes @RawRes Integer num) {
        return mo6622j().mo6599J0(num);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: u */
    public C5313g<Drawable> mo6633u(@Nullable Object obj) {
        return mo6622j().mo6600K0(obj);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: v */
    public C5313g<Drawable> mo6634v(@Nullable String str) {
        return mo6622j().mo6601L0(str);
    }

    public ComponentCallbacks2C5314h(ComponentCallbacks2C5309c componentCallbacks2C5309c, InterfaceC38420l interfaceC38420l, InterfaceC38425q interfaceC38425q, C38426r c38426r, InterfaceC38412d interfaceC38412d, Context context) {
        this.f6719g = new C38427s();
        a aVar = new a();
        this.f6720h = aVar;
        this.f6714b = componentCallbacks2C5309c;
        this.f6716d = interfaceC38420l;
        this.f6718f = interfaceC38425q;
        this.f6717e = c38426r;
        this.f6715c = context;
        InterfaceC38411c interfaceC38411cMo86607a = interfaceC38412d.mo86607a(context.getApplicationContext(), new c(c38426r));
        this.f6721i = interfaceC38411cMo86607a;
        if (C43364k.m95525r()) {
            C43364k.m95529v(aVar);
        } else {
            interfaceC38420l.mo86603b(this);
        }
        interfaceC38420l.mo86603b(interfaceC38411cMo86607a);
        this.f6722j = new CopyOnWriteArrayList<>(componentCallbacks2C5309c.m6565i().m6580c());
        mo6616A(componentCallbacks2C5309c.m6565i().m6581d());
        componentCallbacks2C5309c.m6568o(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
