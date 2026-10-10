package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.C5346f;
import java.util.List;
import java.util.Map;
import p419l2.C42032f;
import p419l2.InterfaceC42031e;
import p445m2.AbstractC42400k;
import p445m2.C42396g;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: com.bumptech.glide.e */
/* JADX INFO: compiled from: GlideContext.java */
/* JADX INFO: loaded from: classes.dex */
public class C5311e extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public static final AbstractC5315i<?, ?> f6681k = new C5308b();

    /* JADX INFO: renamed from: a */
    public final InterfaceC45684b f6682a;

    /* JADX INFO: renamed from: b */
    public final Registry f6683b;

    /* JADX INFO: renamed from: c */
    public final C42396g f6684c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C5309c.a f6685d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC42031e<Object>> f6686e;

    /* JADX INFO: renamed from: f */
    public final Map<Class<?>, AbstractC5315i<?, ?>> f6687f;

    /* JADX INFO: renamed from: g */
    public final C5346f f6688g;

    /* JADX INFO: renamed from: h */
    public final C5312f f6689h;

    /* JADX INFO: renamed from: i */
    public final int f6690i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy("this")
    public C42032f f6691j;

    /* JADX INFO: renamed from: d */
    public synchronized C42032f m6581d() {
        try {
            if (this.f6691j == null) {
                this.f6691j = this.f6685d.build().mo92179T();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6691j;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public <X> AbstractC42400k<ImageView, X> m6578a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f6684c.m93085a(imageView, cls);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45684b m6579b() {
        return this.f6682a;
    }

    /* JADX INFO: renamed from: c */
    public List<InterfaceC42031e<Object>> m6580c() {
        return this.f6686e;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <T> AbstractC5315i<?, T> m6582e(@NonNull Class<T> cls) {
        AbstractC5315i<?, T> abstractC5315i = (AbstractC5315i) this.f6687f.get(cls);
        if (abstractC5315i == null) {
            for (Map.Entry<Class<?>, AbstractC5315i<?, ?>> entry : this.f6687f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC5315i = (AbstractC5315i) entry.getValue();
                }
            }
        }
        return abstractC5315i == null ? (AbstractC5315i<?, T>) f6681k : abstractC5315i;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C5346f m6583f() {
        return this.f6688g;
    }

    /* JADX INFO: renamed from: g */
    public C5312f m6584g() {
        return this.f6689h;
    }

    /* JADX INFO: renamed from: h */
    public int m6585h() {
        return this.f6690i;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public Registry m6586i() {
        return this.f6683b;
    }

    public C5311e(@NonNull Context context, @NonNull InterfaceC45684b interfaceC45684b, @NonNull Registry registry, @NonNull C42396g c42396g, @NonNull ComponentCallbacks2C5309c.a aVar, @NonNull Map<Class<?>, AbstractC5315i<?, ?>> map, @NonNull List<InterfaceC42031e<Object>> list, @NonNull C5346f c5346f, @NonNull C5312f c5312f, int i11) {
        super(context.getApplicationContext());
        this.f6682a = interfaceC45684b;
        this.f6683b = registry;
        this.f6684c = c42396g;
        this.f6685d = aVar;
        this.f6686e = list;
        this.f6687f = map;
        this.f6688g = c5346f;
        this.f6689h = c5312f;
        this.f6690i = i11;
    }
}
