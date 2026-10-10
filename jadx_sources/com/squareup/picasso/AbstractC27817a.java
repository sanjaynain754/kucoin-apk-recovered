package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.squareup.picasso.a */
/* JADX INFO: compiled from: Action.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27817a<T> {

    /* JADX INFO: renamed from: a */
    public final Picasso f56706a;

    /* JADX INFO: renamed from: b */
    public final C27834r f56707b;

    /* JADX INFO: renamed from: c */
    public final WeakReference<T> f56708c;

    /* JADX INFO: renamed from: d */
    public final boolean f56709d;

    /* JADX INFO: renamed from: e */
    public final int f56710e;

    /* JADX INFO: renamed from: f */
    public final int f56711f;

    /* JADX INFO: renamed from: g */
    public final int f56712g;

    /* JADX INFO: renamed from: h */
    public final Drawable f56713h;

    /* JADX INFO: renamed from: i */
    public final String f56714i;

    /* JADX INFO: renamed from: j */
    public final Object f56715j;

    /* JADX INFO: renamed from: k */
    public boolean f56716k;

    /* JADX INFO: renamed from: l */
    public boolean f56717l;

    /* JADX INFO: renamed from: a */
    public void mo68806a() {
        this.f56717l = true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo68807b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    /* JADX INFO: renamed from: c */
    public abstract void mo68808c(Exception exc);

    /* JADX INFO: renamed from: com.squareup.picasso.a$a */
    /* JADX INFO: compiled from: Action.java */
    public static class a<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: a */
        public final AbstractC27817a f56718a;

        public a(AbstractC27817a abstractC27817a, M m11, ReferenceQueue<? super M> referenceQueue) {
            super(m11, referenceQueue);
            this.f56718a = abstractC27817a;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m68809d() {
        return this.f56714i;
    }

    /* JADX INFO: renamed from: e */
    public int m68810e() {
        return this.f56710e;
    }

    /* JADX INFO: renamed from: f */
    public int m68811f() {
        return this.f56711f;
    }

    /* JADX INFO: renamed from: g */
    public Picasso m68812g() {
        return this.f56706a;
    }

    /* JADX INFO: renamed from: h */
    public Picasso.Priority m68813h() {
        return this.f56707b.f56819t;
    }

    /* JADX INFO: renamed from: i */
    public C27834r m68814i() {
        return this.f56707b;
    }

    /* JADX INFO: renamed from: j */
    public Object m68815j() {
        return this.f56715j;
    }

    /* JADX INFO: renamed from: k */
    public T m68816k() {
        WeakReference<T> weakReference = this.f56708c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: l */
    public boolean m68817l() {
        return this.f56717l;
    }

    /* JADX INFO: renamed from: m */
    public boolean m68818m() {
        return this.f56716k;
    }

    public AbstractC27817a(Picasso picasso, T t11, C27834r c27834r, int i11, int i12, int i13, Drawable drawable, String str, Object obj, boolean z11) {
        a aVar;
        this.f56706a = picasso;
        this.f56707b = c27834r;
        if (t11 == null) {
            aVar = null;
        } else {
            aVar = new a(this, t11, picasso.f56684k);
        }
        this.f56708c = aVar;
        this.f56710e = i11;
        this.f56711f = i12;
        this.f56709d = z11;
        this.f56712g = i13;
        this.f56713h = drawable;
        this.f56714i = str;
        this.f56715j = obj == null ? this : obj;
    }
}
