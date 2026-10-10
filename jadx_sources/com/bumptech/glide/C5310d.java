package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C5346f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p329i2.C38414f;
import p329i2.C38424p;
import p329i2.InterfaceC38412d;
import p419l2.C42032f;
import p419l2.InterfaceC42031e;
import p523p2.C43363j;
import p710w1.C45687e;
import p710w1.C45691i;
import p710w1.C45692j;
import p710w1.InterfaceC45684b;
import p710w1.InterfaceC45686d;
import p745x1.C45986f;
import p745x1.C45987g;
import p745x1.C45989i;
import p745x1.InterfaceC45981a;
import p745x1.InterfaceC45988h;
import p782y1.ExecutorServiceC46362a;

/* JADX INFO: renamed from: com.bumptech.glide.d */
/* JADX INFO: compiled from: GlideBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5310d {

    /* JADX INFO: renamed from: c */
    public C5346f f6663c;

    /* JADX INFO: renamed from: d */
    public InterfaceC45686d f6664d;

    /* JADX INFO: renamed from: e */
    public InterfaceC45684b f6665e;

    /* JADX INFO: renamed from: f */
    public InterfaceC45988h f6666f;

    /* JADX INFO: renamed from: g */
    public ExecutorServiceC46362a f6667g;

    /* JADX INFO: renamed from: h */
    public ExecutorServiceC46362a f6668h;

    /* JADX INFO: renamed from: i */
    public InterfaceC45981a.a f6669i;

    /* JADX INFO: renamed from: j */
    public C45989i f6670j;

    /* JADX INFO: renamed from: k */
    public InterfaceC38412d f6671k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public C38424p.b f6674n;

    /* JADX INFO: renamed from: o */
    public ExecutorServiceC46362a f6675o;

    /* JADX INFO: renamed from: p */
    public boolean f6676p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public List<InterfaceC42031e<Object>> f6677q;

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, AbstractC5315i<?, ?>> f6661a = new ArrayMap();

    /* JADX INFO: renamed from: b */
    public final C5312f.a f6662b = new C5312f.a();

    /* JADX INFO: renamed from: l */
    public int f6672l = 4;

    /* JADX INFO: renamed from: m */
    public ComponentCallbacks2C5309c.a f6673m = new a();

    /* JADX INFO: renamed from: com.bumptech.glide.d$a */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public class a implements ComponentCallbacks2C5309c.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C5309c.a
        @NonNull
        public C42032f build() {
            return new C42032f();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$b */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public class b implements ComponentCallbacks2C5309c.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C42032f f6679a;

        public b(C42032f c42032f) {
            this.f6679a = c42032f;
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C5309c.a
        @NonNull
        public C42032f build() {
            C42032f c42032f = this.f6679a;
            return c42032f != null ? c42032f : new C42032f();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$c */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class c {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$d */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class d {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$e */
    /* JADX INFO: compiled from: GlideBuilder.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class e {
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C5310d m6575d(int i11) {
        if (i11 < 2 || i11 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f6672l = i11;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public ComponentCallbacks2C5309c m6572a(@NonNull Context context) {
        if (this.f6667g == null) {
            this.f6667g = ExecutorServiceC46362a.m102243g();
        }
        if (this.f6668h == null) {
            this.f6668h = ExecutorServiceC46362a.m102241e();
        }
        if (this.f6675o == null) {
            this.f6675o = ExecutorServiceC46362a.m102239c();
        }
        if (this.f6670j == null) {
            this.f6670j = new C45989i.a(context).m101460a();
        }
        if (this.f6671k == null) {
            this.f6671k = new C38414f();
        }
        if (this.f6664d == null) {
            int iM101457b = this.f6670j.m101457b();
            if (iM101457b > 0) {
                this.f6664d = new C45692j(iM101457b);
            } else {
                this.f6664d = new C45687e();
            }
        }
        if (this.f6665e == null) {
            this.f6665e = new C45691i(this.f6670j.m101456a());
        }
        if (this.f6666f == null) {
            this.f6666f = new C45987g(this.f6670j.m101458d());
        }
        if (this.f6669i == null) {
            this.f6669i = new C45986f(context);
        }
        if (this.f6663c == null) {
            this.f6663c = new C5346f(this.f6666f, this.f6669i, this.f6668h, this.f6667g, ExecutorServiceC46362a.m102244h(), this.f6675o, this.f6676p);
        }
        List<InterfaceC42031e<Object>> list = this.f6677q;
        if (list == null) {
            this.f6677q = Collections.EMPTY_LIST;
        } else {
            this.f6677q = Collections.unmodifiableList(list);
        }
        C5312f c5312fM6589b = this.f6662b.m6589b();
        return new ComponentCallbacks2C5309c(context, this.f6663c, this.f6666f, this.f6664d, this.f6665e, new C38424p(this.f6674n, c5312fM6589b), this.f6671k, this.f6672l, this.f6673m, this.f6661a, this.f6677q, c5312fM6589b);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C5310d m6574c(@Nullable C42032f c42032f) {
        return m6573b(new b(c42032f));
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C5310d m6576e(@Nullable InterfaceC45988h interfaceC45988h) {
        this.f6666f = interfaceC45988h;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m6577f(@Nullable C38424p.b bVar) {
        this.f6674n = bVar;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public C5310d m6573b(@NonNull ComponentCallbacks2C5309c.a aVar) {
        this.f6673m = (ComponentCallbacks2C5309c.a) C43363j.m95506d(aVar);
        return this;
    }
}
