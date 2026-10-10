package com.kubi.resources.widget;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.C5267e0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.kubi.resources.widget.f */
/* JADX INFO: compiled from: BackgroundDarkPopupWindow.java */
/* JADX INFO: loaded from: classes13.dex */
public class C23040f extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public int f44561a;

    /* JADX INFO: renamed from: b */
    public int f44562b;

    /* JADX INFO: renamed from: c */
    public int f44563c;

    /* JADX INFO: renamed from: d */
    public int f44564d;

    /* JADX INFO: renamed from: e */
    public int f44565e;

    /* JADX INFO: renamed from: f */
    public int f44566f;

    /* JADX INFO: renamed from: g */
    public int[] f44567g;

    /* JADX INFO: renamed from: h */
    public WeakReference<View> f44568h;

    /* JADX INFO: renamed from: i */
    public WeakReference<View> f44569i;

    /* JADX INFO: renamed from: j */
    public WeakReference<View> f44570j;

    /* JADX INFO: renamed from: k */
    public WeakReference<View> f44571k;

    /* JADX INFO: renamed from: l */
    public WeakReference<View> f44572l;

    /* JADX INFO: renamed from: m */
    public boolean f44573m;

    /* JADX INFO: renamed from: n */
    public int f44574n;

    /* JADX INFO: renamed from: o */
    public float f44575o;

    /* JADX INFO: renamed from: i */
    public void m55182i() {
        this.f44563c = 0;
        this.f44564d = this.f44561a;
        this.f44566f = this.f44562b;
        this.f44565e = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m55175b() {
        View view;
        WeakReference<View> weakReference = this.f44571k;
        if (weakReference == null || (view = weakReference.get()) == null || this.f44566f != 0) {
            return;
        }
        m55180g(view);
    }

    /* JADX INFO: renamed from: c */
    public final void m55176c() {
        View view;
        WeakReference<View> weakReference = this.f44570j;
        if (weakReference == null || (view = weakReference.get()) == null || this.f44565e != 0) {
            return;
        }
        m55181h(view);
    }

    /* JADX INFO: renamed from: d */
    public final void m55177d() {
        View view;
        WeakReference<View> weakReference = this.f44572l;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        if (this.f44564d == 0 || this.f44566f == 0) {
            m55184k(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m55178e() {
        View view;
        WeakReference<View> weakReference = this.f44569i;
        if (weakReference == null || (view = weakReference.get()) == null || this.f44564d != 0) {
            return;
        }
        m55185l(view);
    }

    /* JADX INFO: renamed from: f */
    public final void m55179f() {
        View view;
        WeakReference<View> weakReference = this.f44568h;
        if (weakReference == null || (view = weakReference.get()) == null || this.f44563c != 0) {
            return;
        }
        m55183j(view);
    }

    /* JADX INFO: renamed from: g */
    public void m55180g(View view) {
        this.f44571k = new WeakReference<>(view);
        view.getLocationInWindow(this.f44567g);
        this.f44566f = this.f44567g[1];
    }

    /* JADX INFO: renamed from: h */
    public void m55181h(View view) {
        this.f44570j = new WeakReference<>(view);
        view.getLocationInWindow(this.f44567g);
        this.f44565e = this.f44567g[1] + view.getHeight();
    }

    /* JADX INFO: renamed from: j */
    public void m55183j(View view) {
        this.f44568h = new WeakReference<>(view);
        view.getLocationInWindow(this.f44567g);
        this.f44563c = this.f44567g[0] + view.getWidth();
    }

    /* JADX INFO: renamed from: k */
    public void m55184k(View view) {
        this.f44572l = new WeakReference<>(view);
        view.getLocationInWindow(this.f44567g);
        int i11 = this.f44567g[0];
        this.f44563c = i11;
        this.f44564d = i11 + view.getWidth();
        this.f44566f = this.f44567g[1] + view.getHeight();
        this.f44565e = this.f44567g[1];
    }

    /* JADX INFO: renamed from: l */
    public void m55185l(View view) {
        this.f44569i = new WeakReference<>(view);
        view.getLocationInWindow(this.f44567g);
        this.f44564d = this.f44567g[0];
    }

    /* JADX INFO: renamed from: m */
    public final void m55186m(View view) {
        if (this.f44573m || isShowing() || getContentView() == null) {
            return;
        }
        m55174a();
        if (view == null || view.getContext() == null || !(view.getContext() instanceof Activity)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ((Activity) view.getContext()).getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.f44574n);
        colorDrawable.setBounds(this.f44563c, this.f44565e, this.f44564d, this.f44566f);
        colorDrawable.setAlpha((int) (this.f44575o * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
        this.f44573m = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m55189p(View view) {
        if (this.f44569i != null) {
            m55185l(view);
        }
        if (this.f44568h != null) {
            m55183j(view);
        }
        if (this.f44570j != null) {
            m55181h(view);
        }
        if (this.f44571k != null) {
            m55180g(view);
        }
        if (this.f44572l != null) {
            m55184k(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m55190q(float f11) {
        this.f44575o = f11;
    }

    public C23040f(View view, int i11, int i12) {
        super(view, i11, i12);
        this.f44567g = new int[2];
        this.f44573m = false;
        this.f44574n = ViewCompat.MEASURED_STATE_MASK;
        this.f44575o = 0.2f;
        this.f44561a = C5267e0.m6183e();
        this.f44562b = C5267e0.m6182d();
    }

    /* JADX INFO: renamed from: a */
    public final void m55174a() {
        m55178e();
        m55179f();
        m55176c();
        m55175b();
        m55177d();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        if (this.f44573m) {
            if (getContentView() != null && getContentView().getContext() != null && (getContentView().getContext() instanceof Activity)) {
                ((ViewGroup) ((Activity) getContentView().getContext()).getWindow().getDecorView().getRootView()).getOverlay().clear();
            }
            this.f44573m = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m55187n() {
        m55182i();
        WeakReference<View> weakReference = this.f44568h;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<View> weakReference2 = this.f44569i;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference<View> weakReference3 = this.f44570j;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        WeakReference<View> weakReference4 = this.f44571k;
        if (weakReference4 != null) {
            weakReference4.clear();
        }
        WeakReference<View> weakReference5 = this.f44572l;
        if (weakReference5 != null) {
            weakReference5.clear();
        }
        this.f44572l = null;
        this.f44571k = null;
        this.f44570j = null;
        this.f44569i = null;
        this.f44568h = null;
    }

    /* JADX INFO: renamed from: o */
    public void m55188o(View view) {
        if (getContentView() != null) {
            m55189p(view);
            if ((this.f44573m || isShowing()) && view.getContext() != null && (view.getContext() instanceof Activity)) {
                ViewGroup viewGroup = (ViewGroup) ((Activity) view.getContext()).getWindow().getDecorView().getRootView();
                ColorDrawable colorDrawable = new ColorDrawable(this.f44574n);
                colorDrawable.setBounds(this.f44563c, this.f44565e, this.f44564d, this.f44566f);
                colorDrawable.setAlpha((int) (this.f44575o * 255.0f));
                ViewGroupOverlay overlay = viewGroup.getOverlay();
                overlay.clear();
                overlay.add(colorDrawable);
                this.f44573m = true;
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12) {
        m55186m(view);
        super.showAsDropDown(view, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i11, int i12, int i13) {
        m55186m(view);
        super.showAtLocation(view, i11, i12, i13);
    }
}
