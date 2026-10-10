package p280g2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p523p2.C43363j;
import p581r1.InterfaceC43896a;
import p628t1.InterfaceC44616h;

/* JADX INFO: renamed from: g2.c */
/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class C37790c extends Drawable implements C37794g.b, Animatable, Animatable2Compat {

    /* JADX INFO: renamed from: b */
    public final a f85116b;

    /* JADX INFO: renamed from: c */
    public boolean f85117c;

    /* JADX INFO: renamed from: d */
    public boolean f85118d;

    /* JADX INFO: renamed from: e */
    public boolean f85119e;

    /* JADX INFO: renamed from: f */
    public boolean f85120f;

    /* JADX INFO: renamed from: g */
    public int f85121g;

    /* JADX INFO: renamed from: h */
    public int f85122h;

    /* JADX INFO: renamed from: i */
    public boolean f85123i;

    /* JADX INFO: renamed from: j */
    public Paint f85124j;

    /* JADX INFO: renamed from: k */
    public Rect f85125k;

    /* JADX INFO: renamed from: l */
    public List<Animatable2Compat.AnimationCallback> f85126l;

    /* JADX INFO: renamed from: g2.c$a */
    /* JADX INFO: compiled from: GifDrawable.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        @VisibleForTesting
        public final C37794g f85127a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new C37790c(this);
        }

        public a(C37794g c37794g) {
            this.f85127a = c37794g;
        }
    }

    public C37790c(Context context, InterfaceC43896a interfaceC43896a, InterfaceC44616h<Bitmap> interfaceC44616h, int i11, int i12, Bitmap bitmap) {
        this(new a(new C37794g(ComponentCallbacks2C5309c.m6550c(context), interfaceC43896a, i11, i12, interfaceC44616h, bitmap)));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: k */
    public void m85262k() {
        this.f85119e = true;
        this.f85116b.f85127a.m85271a();
    }

    /* JADX INFO: renamed from: l */
    public final void m85263l() {
        this.f85121g = 0;
    }

    /* JADX INFO: renamed from: n */
    public void m85265n(int i11) {
        if (i11 <= 0 && i11 != -1 && i11 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i11 != 0) {
            this.f85122h = i11;
        } else {
            int iM85278i = this.f85116b.f85127a.m85278i();
            this.f85122h = iM85278i != 0 ? iM85278i : -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m85267p() {
        this.f85117c = false;
        this.f85116b.f85127a.m85288t(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f85118d = true;
        m85263l();
        if (this.f85120f) {
            m85266o();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f85118d = false;
        m85267p();
    }

    /* JADX INFO: renamed from: c */
    public ByteBuffer m85254c() {
        return this.f85116b.f85127a.m85272b();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.f85126l;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Rect m85255d() {
        if (this.f85125k == null) {
            this.f85125k = new Rect();
        }
        return this.f85125k;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f85119e) {
            return;
        }
        if (this.f85123i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m85255d());
            this.f85123i = false;
        }
        canvas.drawBitmap(this.f85116b.f85127a.m85273c(), (Rect) null, m85255d(), m85259h());
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m85256e() {
        return this.f85116b.f85127a.m85275e();
    }

    /* JADX INFO: renamed from: f */
    public int m85257f() {
        return this.f85116b.f85127a.m85276f();
    }

    /* JADX INFO: renamed from: g */
    public int m85258g() {
        return this.f85116b.f85127a.m85274d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f85116b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f85116b.f85127a.m85277h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f85116b.f85127a.m85280l();
    }

    /* JADX INFO: renamed from: h */
    public final Paint m85259h() {
        if (this.f85124j == null) {
            this.f85124j = new Paint(2);
        }
        return this.f85124j;
    }

    /* JADX INFO: renamed from: i */
    public int m85260i() {
        return this.f85116b.f85127a.m85279k();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f85117c;
    }

    /* JADX INFO: renamed from: j */
    public final void m85261j() {
        List<Animatable2Compat.AnimationCallback> list = this.f85126l;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f85126l.get(i11).onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m85264m(InterfaceC44616h<Bitmap> interfaceC44616h, Bitmap bitmap) {
        this.f85116b.f85127a.m85284p(interfaceC44616h, bitmap);
    }

    /* JADX INFO: renamed from: o */
    public final void m85266o() {
        C43363j.m95503a(!this.f85119e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f85116b.f85127a.m85276f() == 1) {
            invalidateSelf();
        } else {
            if (this.f85117c) {
                return;
            }
            this.f85117c = true;
            this.f85116b.f85127a.m85287s(this);
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f85126l == null) {
            this.f85126l = new ArrayList();
        }
        this.f85126l.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        C43363j.m95503a(!this.f85119e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f85120f = z11;
        if (!z11) {
            m85267p();
        } else if (this.f85118d) {
            m85266o();
        }
        return super.setVisible(z11, z12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f85126l;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    @Override // p280g2.C37794g.b
    /* JADX INFO: renamed from: a */
    public void mo85252a() {
        if (m85253b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m85258g() == m85257f() - 1) {
            this.f85121g++;
        }
        int i11 = this.f85122h;
        if (i11 != -1 && this.f85121g >= i11) {
            m85261j();
            stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Drawable.Callback m85253b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f85123i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        m85259h().setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m85259h().setColorFilter(colorFilter);
    }

    public C37790c(a aVar) {
        this.f85120f = true;
        this.f85122h = -1;
        this.f85116b = (a) C43363j.m95506d(aVar);
    }
}
