package com.kubi.homern.widgets.homerefresh;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.util.C24277v;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38510b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHomeRefreshHeader.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0002J \u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J0\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010.\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0016J\b\u00103\u001a\u00020\nH\u0016J\u0014\u00104\u001a\u00020\r2\n\u00105\u001a\u000206\"\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshHeader;", "Landroid/widget/LinearLayout;", "Lcom/scwang/smart/refresh/layout/api/RefreshHeader;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "indicatorAllowed", "", "hasPullOffset", "setIndicatorVisible", "", ViewProps.VISIBLE, "updateIndicatorVisibility", "getView", "Landroid/view/View;", "getSpinnerStyle", "Lcom/scwang/smart/refresh/layout/constant/SpinnerStyle;", "onStartAnimator", TtmlNode.TAG_LAYOUT, "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "headHeight", "", "maxDragHeight", "onStateChanged", "refreshLayout", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "onFinish", "success", "startAnim", "stopAnim", "dp", "value", "onInitialized", "kernel", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "height", "onMoving", "isDragging", "percent", "", TypedValues.CycleType.S_WAVE_OFFSET, "onReleased", "onHorizontalDrag", "percentX", "offsetX", "offsetMax", "isSupportHorizontalDrag", "setPrimaryColors", LinearGradientManager.PROP_COLORS, "", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHomeRefreshHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHomeRefreshHeader.kt\ncom/kubi/homern/widgets/homerefresh/KCHomeRefreshHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class KCHomeRefreshHeader extends LinearLayout implements InterfaceC38160d {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f27042e = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AppCompatImageView f27043b;

    /* JADX INFO: renamed from: c */
    public boolean f27044c;

    /* JADX INFO: renamed from: d */
    public boolean f27045d;

    /* JADX INFO: compiled from: KCHomeRefreshHeader.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshHeader$Companion;", "", "<init>", "()V", "INDICATOR_SIZE_DP", "", "HEADER_HEIGHT_DP", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m31344b(int i11) {
        return (int) (i11 * getResources().getDisplayMetrics().density);
    }

    @Override // hb0.InterfaceC38157a
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homerefresh.KCHomeRefreshHeader$a */
    /* JADX INFO: compiled from: KCHomeRefreshHeader.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15168a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullDownToRefresh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.ReleaseToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshState.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHomeRefreshHeader(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.f27043b = appCompatImageView;
        this.f27044c = true;
        appCompatImageView.setVisibility(4);
        setOrientation(1);
        setGravity(17);
        int iM31344b = m31344b(32);
        addView(appCompatImageView, new ViewGroup.LayoutParams(iM31344b, iM31344b));
        setMinimumHeight(m31344b(64));
        C24277v.m58539d(context, R$drawable.kc_loading, appCompatImageView);
    }

    /* JADX INFO: renamed from: c */
    public final void m31345c() {
        if (this.f27043b.getVisibility() != 0) {
            return;
        }
        Object drawable = this.f27043b.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (!animatable.isRunning()) {
                animatable.start();
                return;
            }
        }
        if (drawable == null) {
            C24277v.m58539d(getContext(), R$drawable.kc_loading, this.f27043b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m31346d() {
        Object drawable = this.f27043b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null || !animatable.isRunning()) {
            return;
        }
        animatable.stop();
    }

    /* JADX INFO: renamed from: e */
    public final void m31347e() {
        int i11 = (this.f27044c && this.f27045d) ? 0 : 4;
        if (this.f27043b.getVisibility() == i11) {
            return;
        }
        this.f27043b.setVisibility(i11);
        if (i11 == 0) {
            m31345c();
        } else {
            m31346d();
        }
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public C38510b getSpinnerStyle() {
        C38510b Translate = C38510b.f86469d;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // hb0.InterfaceC38157a
    public int onFinish(@NotNull InterfaceC38162f layout, boolean z11) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return 0;
    }

    @Override // hb0.InterfaceC38157a
    public void onInitialized(@NotNull InterfaceC38161e kernel, int i11, int i12) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
    }

    @Override // hb0.InterfaceC38157a
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
        this.f27045d = offset > 0;
        m31347e();
    }

    @Override // hb0.InterfaceC38157a
    public void onReleased(@NotNull InterfaceC38162f refreshLayout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // hb0.InterfaceC38157a
    public void onStartAnimator(@NotNull InterfaceC38162f layout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        m31345c();
    }

    @Override // jb0.InterfaceC40375i
    public void onStateChanged(@NotNull InterfaceC38162f refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i11 = C15168a.$EnumSwitchMapping$0[newState.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            m31345c();
        } else {
            if (i11 != 4) {
                return;
            }
            this.f27045d = false;
            m31347e();
            m31346d();
        }
    }

    public final void setIndicatorVisible(boolean visible) {
        this.f27044c = visible;
        m31347e();
    }

    @Override // hb0.InterfaceC38157a
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // hb0.InterfaceC38157a
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public View getView() {
        return this;
    }
}
