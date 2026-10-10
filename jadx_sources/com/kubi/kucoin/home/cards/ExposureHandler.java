package com.kubi.kucoin.home.cards;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.cards.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ExposureHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0007J\b\u0010#\u001a\u00020\u0007H\u0016J\u0006\u0010$\u001a\u00020\u0007J\u0010\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u0012J\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0018J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/ExposureHandler;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mAttachedToWindow", "", "getMAttachedToWindow", "()Z", "setMAttachedToWindow", "(Z)V", "mHasWindowFocus", "mVisibilityAggregated", "mExposure", "getMExposure", "setMExposure", "mExposureCallback", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", "mStartExposureTime", "", "mShowRatio", "", "mTimeLimit", "", "mRect", "Landroid/graphics/Rect;", "onAttachedToWindow", "", "onDetachedFromWindow", "release", "onWindowFocusChanged", "hasWindowFocus", "onVisibilityAggregated", "isVisible", "onPreDraw", "checkExpose", "setExposureCallback", TUIConstants.TUIChat.CALL_BACK, "setShowRatio", "area", "setTimeLimit", "index", "tryExposure", "tryStopExposure", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExposureHandler implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f27896b;

    /* JADX INFO: renamed from: c */
    public boolean f27897c;

    /* JADX INFO: renamed from: d */
    public boolean f27898d;

    /* JADX INFO: renamed from: e */
    public boolean f27899e;

    /* JADX INFO: renamed from: f */
    public boolean f27900f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public IExposureCallback f27901g;

    /* JADX INFO: renamed from: h */
    public long f27902h;

    /* JADX INFO: renamed from: i */
    public float f27903i;

    /* JADX INFO: renamed from: j */
    public int f27904j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Rect f27905k;

    /* JADX INFO: renamed from: d */
    public final void m32223d() {
        this.f27897c = false;
        m32224e();
    }

    public ExposureHandler(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f27896b = view;
        this.f27898d = true;
        this.f27899e = true;
        this.f27905k = new Rect();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX INFO: renamed from: a */
    public final boolean m32220a() {
        if (!this.f27896b.getLocalVisibleRect(this.f27905k) || !this.f27896b.isShown()) {
            m32229j();
            return true;
        }
        if (this.f27903i > 0.0f) {
            Rect rect = this.f27905k;
            if (Math.abs(rect.bottom - rect.top) > this.f27896b.getHeight() * this.f27903i) {
                Rect rect2 = this.f27905k;
                if (Math.abs(rect2.right - rect2.left) > this.f27896b.getWidth() * this.f27903i) {
                    m32228i();
                } else {
                    m32229j();
                }
            } else {
                m32229j();
            }
        } else {
            m32228i();
        }
        return true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF27897c() {
        return this.f27897c;
    }

    /* JADX INFO: renamed from: c */
    public final void m32222c() {
        if (this.f27897c) {
            return;
        }
        this.f27896b.getViewTreeObserver().addOnPreDrawListener(this);
        this.f27897c = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m32224e() {
        this.f27896b.getViewTreeObserver().removeOnPreDrawListener(this);
        m32229j();
        this.f27901g = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m32225f(@Nullable IExposureCallback iExposureCallback) {
        this.f27901g = iExposureCallback;
    }

    /* JADX INFO: renamed from: g */
    public final void m32226g(float f11) {
        this.f27903i = f11;
    }

    /* JADX INFO: renamed from: h */
    public final void m32227h(int i11) {
        this.f27904j = i11;
    }

    /* JADX INFO: renamed from: i */
    public final void m32228i() {
        IExposureCallback iExposureCallback;
        if (this.f27897c && this.f27898d && this.f27899e && !this.f27900f) {
            this.f27900f = true;
            this.f27902h = System.currentTimeMillis();
            if (this.f27904j != 0 || (iExposureCallback = this.f27901g) == null) {
                return;
            }
            iExposureCallback.show();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m32229j() {
        IExposureCallback iExposureCallback;
        if (!(this.f27897c && this.f27898d && this.f27899e) && this.f27900f) {
            this.f27900f = false;
            if (this.f27904j <= 0 || System.currentTimeMillis() - this.f27902h <= this.f27904j || (iExposureCallback = this.f27901g) == null) {
                return;
            }
            iExposureCallback.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return m32220a();
    }
}
