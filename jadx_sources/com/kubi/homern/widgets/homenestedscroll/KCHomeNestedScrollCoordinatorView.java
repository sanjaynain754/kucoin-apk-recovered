package com.kubi.homern.widgets.homenestedscroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHomeNestedScrollCoordinatorView.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020&H\u0014J\u0018\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0014J\b\u0010+\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\u0010\u0010/\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/KCHomeNestedScrollCoordinatorView;", "Landroid/view/View;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "binder", "Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollBinder;", "retryCount", "", "value", "", "coordinatorEnabled", "getCoordinatorEnabled", "()Z", "setCoordinatorEnabled", "(Z)V", "bindingVersion", "getBindingVersion", "()I", "setBindingVersion", "(I)V", "", "outerScrollNativeID", "getOuterScrollNativeID", "()Ljava/lang/String;", "setOuterScrollNativeID", "(Ljava/lang/String;)V", "innerContainerNativeID", "getInnerContainerNativeID", "setInnerContainerNativeID", "innerScrollNativeIDPrefix", "getInnerScrollNativeIDPrefix", "setInnerScrollNativeIDPrefix", "stickyHeaderNativeID", "getStickyHeaderNativeID", "setStickyHeaderNativeID", "onAttachedToWindow", "", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "requestBinding", "bindRunnable", "Ljava/lang/Runnable;", "clearBinding", "dp", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHomeNestedScrollCoordinatorView extends View {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f27024k = new Companion(null);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final long[] f27025l = {50, 100, 200, 400, 800, 1600};

    /* JADX INFO: renamed from: b */
    @Nullable
    public HomeNestedScrollBinder f27026b;

    /* JADX INFO: renamed from: c */
    public int f27027c;

    /* JADX INFO: renamed from: d */
    public boolean f27028d;

    /* JADX INFO: renamed from: e */
    public int f27029e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f27030f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public String f27031g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public String f27032h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f27033i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Runnable f27034j;

    /* JADX INFO: compiled from: KCHomeNestedScrollCoordinatorView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/KCHomeNestedScrollCoordinatorView$Companion;", "", "<init>", "()V", "RETRY_DELAYS_MS", "", "getRETRY_DELAYS_MS", "()[J", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final long[] getRETRY_DELAYS_MS() {
            return KCHomeNestedScrollCoordinatorView.f27025l;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m31342e(int i11) {
        return (int) (i11 * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: f */
    public final void m31343f() {
        this.f27027c = 0;
        removeCallbacks(this.f27034j);
        if (isAttachedToWindow()) {
            post(this.f27034j);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iM31342e = m31342e(1);
        setMeasuredDimension(iM31342e, iM31342e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHomeNestedScrollCoordinatorView(@NotNull ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27028d = true;
        this.f27030f = "";
        this.f27031g = "";
        this.f27032h = "";
        this.f27033i = "";
        setBackgroundColor(0);
        setClickable(false);
        setLayoutParams(new ViewGroup.LayoutParams(m31342e(1), m31342e(1)));
        this.f27034j = new Runnable() { // from class: com.kubi.homern.widgets.homenestedscroll.c
            @Override // java.lang.Runnable
            public final void run() {
                KCHomeNestedScrollCoordinatorView.m31340c(this.f27041b);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public final void m31341d() {
        HomeNestedScrollBinder homeNestedScrollBinder = this.f27026b;
        if (homeNestedScrollBinder != null) {
            homeNestedScrollBinder.m31320u();
        }
        this.f27026b = null;
    }

    /* JADX INFO: renamed from: getBindingVersion, reason: from getter */
    public final int getF27029e() {
        return this.f27029e;
    }

    /* JADX INFO: renamed from: getCoordinatorEnabled, reason: from getter */
    public final boolean getF27028d() {
        return this.f27028d;
    }

    @NotNull
    /* JADX INFO: renamed from: getInnerContainerNativeID, reason: from getter */
    public final String getF27031g() {
        return this.f27031g;
    }

    @NotNull
    /* JADX INFO: renamed from: getInnerScrollNativeIDPrefix, reason: from getter */
    public final String getF27032h() {
        return this.f27032h;
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterScrollNativeID, reason: from getter */
    public final String getF27030f() {
        return this.f27030f;
    }

    @NotNull
    /* JADX INFO: renamed from: getStickyHeaderNativeID, reason: from getter */
    public final String getF27033i() {
        return this.f27033i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f27034j);
        m31341d();
        super.onDetachedFromWindow();
    }

    public final void setBindingVersion(int i11) {
        this.f27029e = i11;
        m31343f();
    }

    public final void setCoordinatorEnabled(boolean z11) {
        this.f27028d = z11;
        if (z11) {
            m31343f();
            return;
        }
        removeCallbacks(this.f27034j);
        this.f27027c = 0;
        m31341d();
    }

    public final void setInnerContainerNativeID(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27031g = value;
        m31343f();
    }

    public final void setInnerScrollNativeIDPrefix(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27032h = value;
        m31343f();
    }

    public final void setOuterScrollNativeID(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27030f = value;
        m31343f();
    }

    public final void setStickyHeaderNativeID(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27033i = value;
        m31343f();
    }

    /* JADX INFO: renamed from: c */
    public static final void m31340c(KCHomeNestedScrollCoordinatorView kCHomeNestedScrollCoordinatorView) {
        kCHomeNestedScrollCoordinatorView.m31341d();
        if (kCHomeNestedScrollCoordinatorView.f27028d) {
            HomeNestedScrollBinder homeNestedScrollBinder = new HomeNestedScrollBinder(kCHomeNestedScrollCoordinatorView, kCHomeNestedScrollCoordinatorView.f27030f, kCHomeNestedScrollCoordinatorView.f27031g, kCHomeNestedScrollCoordinatorView.f27032h, kCHomeNestedScrollCoordinatorView.f27033i);
            if (homeNestedScrollBinder.m31307f()) {
                kCHomeNestedScrollCoordinatorView.f27026b = homeNestedScrollBinder;
                kCHomeNestedScrollCoordinatorView.f27027c = 0;
                return;
            }
            int i11 = kCHomeNestedScrollCoordinatorView.f27027c;
            long[] jArr = f27025l;
            if (i11 < jArr.length) {
                kCHomeNestedScrollCoordinatorView.f27027c = i11 + 1;
                kCHomeNestedScrollCoordinatorView.postDelayed(kCHomeNestedScrollCoordinatorView.f27034j, jArr[i11]);
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m31343f();
    }
}
