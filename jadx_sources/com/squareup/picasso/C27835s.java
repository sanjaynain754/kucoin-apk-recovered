package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.squareup.picasso.s */
/* JADX INFO: compiled from: RequestCreator.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27835s {

    /* JADX INFO: renamed from: m */
    public static final AtomicInteger f56837m = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public final Picasso f56838a;

    /* JADX INFO: renamed from: b */
    public final C27834r.b f56839b;

    /* JADX INFO: renamed from: c */
    public boolean f56840c;

    /* JADX INFO: renamed from: d */
    public boolean f56841d;

    /* JADX INFO: renamed from: e */
    public boolean f56842e = true;

    /* JADX INFO: renamed from: f */
    public int f56843f;

    /* JADX INFO: renamed from: g */
    public int f56844g;

    /* JADX INFO: renamed from: h */
    public int f56845h;

    /* JADX INFO: renamed from: i */
    public int f56846i;

    /* JADX INFO: renamed from: j */
    public Drawable f56847j;

    /* JADX INFO: renamed from: k */
    public Drawable f56848k;

    /* JADX INFO: renamed from: l */
    public Object f56849l;

    /* JADX INFO: renamed from: a */
    public C27835s m68903a() {
        this.f56849l = null;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m68906d(ImageView imageView) {
        m68907e(imageView, null);
    }

    /* JADX INFO: renamed from: e */
    public void m68907e(ImageView imageView, InterfaceC27821e interfaceC27821e) {
        Bitmap bitmapM68796j;
        long jNanoTime = System.nanoTime();
        C27841y.m68937c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f56839b.m68899b()) {
            this.f56838a.m68788b(imageView);
            if (this.f56842e) {
                C27832p.m68886d(imageView, m68905c());
                return;
            }
            return;
        }
        if (this.f56841d) {
            if (this.f56839b.m68900c()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f56842e) {
                    C27832p.m68886d(imageView, m68905c());
                }
                this.f56838a.m68790d(imageView, new ViewTreeObserverOnPreDrawListenerC27824h(this, imageView, interfaceC27821e));
                return;
            }
            this.f56839b.m68901d(width, height);
        }
        C27834r c27834rM68904b = m68904b(jNanoTime);
        String strM68940f = C27841y.m68940f(c27834rM68904b);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.f56845h) || (bitmapM68796j = this.f56838a.m68796j(strM68940f)) == null) {
            if (this.f56842e) {
                C27832p.m68886d(imageView, m68905c());
            }
            this.f56838a.m68792f(new C27828l(this.f56838a, imageView, c27834rM68904b, this.f56845h, this.f56846i, this.f56844g, this.f56848k, strM68940f, this.f56849l, interfaceC27821e, this.f56840c));
            return;
        }
        this.f56838a.m68788b(imageView);
        Picasso picasso = this.f56838a;
        Context context = picasso.f56678e;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        C27832p.m68885c(imageView, context, bitmapM68796j, loadedFrom, this.f56840c, picasso.f56686m);
        if (this.f56838a.f56687n) {
            C27841y.m68954t("Main", "completed", c27834rM68904b.m68897g(), "from " + loadedFrom);
        }
        if (interfaceC27821e != null) {
            interfaceC27821e.onSuccess();
        }
    }

    /* JADX INFO: renamed from: f */
    public C27835s m68908f() {
        this.f56840c = true;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C27835s m68910h() {
        this.f56841d = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C27834r m68904b(long j11) {
        int andIncrement = f56837m.getAndIncrement();
        C27834r c27834rM68898a = this.f56839b.m68898a();
        c27834rM68898a.f56800a = andIncrement;
        c27834rM68898a.f56801b = j11;
        boolean z11 = this.f56838a.f56687n;
        if (z11) {
            C27841y.m68954t("Main", "created", c27834rM68898a.m68897g(), c27834rM68898a.toString());
        }
        C27834r c27834rM68799m = this.f56838a.m68799m(c27834rM68898a);
        if (c27834rM68799m != c27834rM68898a) {
            c27834rM68799m.f56800a = andIncrement;
            c27834rM68799m.f56801b = j11;
            if (z11) {
                C27841y.m68954t("Main", "changed", c27834rM68799m.m68894d(), "into " + c27834rM68799m);
            }
        }
        return c27834rM68799m;
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m68905c() {
        int i11 = this.f56843f;
        return i11 != 0 ? this.f56838a.f56678e.getDrawable(i11) : this.f56847j;
    }

    /* JADX INFO: renamed from: g */
    public C27835s m68909g(int i11, int i12) {
        this.f56839b.m68901d(i11, i12);
        return this;
    }

    public C27835s(Picasso picasso, Uri uri, int i11) {
        if (!picasso.f56688o) {
            this.f56838a = picasso;
            this.f56839b = new C27834r.b(uri, i11, picasso.f56685l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }
}
