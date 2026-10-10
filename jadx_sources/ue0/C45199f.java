package ue0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: ue0.f */
/* JADX INFO: compiled from: PreDrawBlurController.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45199f implements InterfaceC45195b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC45194a f101701b;

    /* JADX INFO: renamed from: c */
    public C45196c f101702c;

    /* JADX INFO: renamed from: d */
    public Bitmap f101703d;

    /* JADX INFO: renamed from: e */
    public final View f101704e;

    /* JADX INFO: renamed from: f */
    public int f101705f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f101706g;

    /* JADX INFO: renamed from: l */
    public boolean f101711l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Drawable f101712m;

    /* JADX INFO: renamed from: a */
    public float f101700a = 16.0f;

    /* JADX INFO: renamed from: h */
    public final int[] f101707h = new int[2];

    /* JADX INFO: renamed from: i */
    public final int[] f101708i = new int[2];

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserver.OnPreDrawListener f101709j = new a();

    /* JADX INFO: renamed from: k */
    public boolean f101710k = true;

    /* JADX INFO: renamed from: ue0.f$a */
    /* JADX INFO: compiled from: PreDrawBlurController.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C45199f.this.m99871j();
            return true;
        }
    }

    @Override // ue0.InterfaceC45195b
    public void destroy() {
        mo99866e(false);
        this.f101701b.destroy();
        this.f101711l = false;
    }

    /* JADX INFO: renamed from: h */
    public void m99869h(int i11, int i12) {
        mo99866e(true);
        C45209p c45209p = new C45209p(this.f101701b.mo99859c());
        if (c45209p.m99882b(i11, i12)) {
            this.f101704e.setWillNotDraw(true);
            return;
        }
        this.f101704e.setWillNotDraw(false);
        C45209p.a aVarM99884d = c45209p.m99884d(i11, i12);
        this.f101703d = Bitmap.createBitmap(aVarM99884d.f101727a, aVarM99884d.f101728b, this.f101701b.mo99857a());
        this.f101702c = new C45196c(this.f101703d);
        this.f101711l = true;
        m99871j();
    }

    @Override // ue0.InterfaceC45197d
    /* JADX INFO: renamed from: a */
    public InterfaceC45197d mo99863a(boolean z11) {
        this.f101710k = z11;
        mo99866e(z11);
        this.f101704e.invalidate();
        return this;
    }

    @Override // ue0.InterfaceC45195b
    /* JADX INFO: renamed from: b */
    public void mo99862b() {
        m99869h(this.f101704e.getMeasuredWidth(), this.f101704e.getMeasuredHeight());
    }

    @Override // ue0.InterfaceC45197d
    /* JADX INFO: renamed from: c */
    public InterfaceC45197d mo99864c(float f11) {
        this.f101700a = f11;
        return this;
    }

    @Override // ue0.InterfaceC45197d
    /* JADX INFO: renamed from: d */
    public InterfaceC45197d mo99865d(int i11) {
        if (this.f101705f != i11) {
            this.f101705f = i11;
            this.f101704e.invalidate();
        }
        return this;
    }

    @Override // ue0.InterfaceC45195b
    public boolean draw(Canvas canvas) {
        if (this.f101710k && this.f101711l) {
            if (canvas instanceof C45196c) {
                return false;
            }
            float height = this.f101704e.getHeight() / this.f101703d.getHeight();
            float width = this.f101704e.getWidth() / this.f101703d.getWidth();
            canvas.save();
            canvas.scale(width, height);
            this.f101701b.mo99860d(canvas, this.f101703d);
            canvas.restore();
            int i11 = this.f101705f;
            if (i11 != 0) {
                canvas.drawColor(i11);
            }
        }
        return true;
    }

    @Override // ue0.InterfaceC45197d
    /* JADX INFO: renamed from: e */
    public InterfaceC45197d mo99866e(boolean z11) {
        this.f101706g.getViewTreeObserver().removeOnPreDrawListener(this.f101709j);
        if (z11) {
            this.f101706g.getViewTreeObserver().addOnPreDrawListener(this.f101709j);
        }
        return this;
    }

    @Override // ue0.InterfaceC45197d
    /* JADX INFO: renamed from: f */
    public InterfaceC45197d mo99867f(@Nullable Drawable drawable) {
        this.f101712m = drawable;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m99868g() {
        this.f101703d = this.f101701b.mo99861e(this.f101703d, this.f101700a);
        if (this.f101701b.mo99858b()) {
            return;
        }
        this.f101702c.setBitmap(this.f101703d);
    }

    /* JADX INFO: renamed from: i */
    public final void m99870i() {
        this.f101706g.getLocationOnScreen(this.f101707h);
        this.f101704e.getLocationOnScreen(this.f101708i);
        int[] iArr = this.f101708i;
        int i11 = iArr[0];
        int[] iArr2 = this.f101707h;
        int i12 = i11 - iArr2[0];
        int i13 = iArr[1] - iArr2[1];
        float height = this.f101704e.getHeight() / this.f101703d.getHeight();
        float width = this.f101704e.getWidth() / this.f101703d.getWidth();
        this.f101702c.translate((-i12) / width, (-i13) / height);
        this.f101702c.scale(1.0f / width, 1.0f / height);
    }

    /* JADX INFO: renamed from: j */
    public void m99871j() {
        if (this.f101710k && this.f101711l) {
            Drawable drawable = this.f101712m;
            if (drawable == null) {
                this.f101703d.eraseColor(0);
            } else {
                drawable.draw(this.f101702c);
            }
            this.f101702c.save();
            m99870i();
            this.f101706g.draw(this.f101702c);
            this.f101702c.restore();
            m99868g();
        }
    }

    public C45199f(@NonNull View view, @NonNull ViewGroup viewGroup, @ColorInt int i11, InterfaceC45194a interfaceC45194a) {
        this.f101706g = viewGroup;
        this.f101704e = view;
        this.f101705f = i11;
        this.f101701b = interfaceC45194a;
        if (interfaceC45194a instanceof C45207n) {
            ((C45207n) interfaceC45194a).m99879f(view.getContext());
        }
        m99869h(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
