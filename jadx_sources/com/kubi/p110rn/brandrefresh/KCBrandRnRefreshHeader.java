package com.kubi.p110rn.brandrefresh;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCBrandRnRefreshHeader.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J \u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J0\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010)\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\u0014\u0010/\u001a\u00020\u000e2\n\u00100\u001a\u000201\"\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/rn/brandrefresh/KCBrandRnRefreshHeader;", "Landroid/widget/LinearLayout;", "Lcom/scwang/smart/refresh/layout/api/RefreshHeader;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getView", "Landroid/view/View;", "getSpinnerStyle", "Lcom/scwang/smart/refresh/layout/constant/SpinnerStyle;", "onStartAnimator", "", TtmlNode.TAG_LAYOUT, "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "headHeight", "", "maxDragHeight", "onStateChanged", "refreshLayout", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "onFinish", "success", "", "startAnim", "stopAnim", "dp", "value", "onInitialized", "kernel", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "height", "onMoving", "isDragging", "percent", "", TypedValues.CycleType.S_WAVE_OFFSET, "onReleased", "onHorizontalDrag", "percentX", "offsetX", "offsetMax", "isSupportHorizontalDrag", "setPrimaryColors", LinearGradientManager.PROP_COLORS, "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBrandRnRefreshHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBrandRnRefreshHeader.kt\ncom/kubi/rn/brandrefresh/KCBrandRnRefreshHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class KCBrandRnRefreshHeader extends LinearLayout implements InterfaceC38160d {
    private static final int HEADER_HEIGHT_DP = 64;
    private static final int INDICATOR_SIZE_DP = 32;

    @NotNull
    private final AppCompatImageView imageView;

    /* JADX INFO: renamed from: dp */
    private final int m55683dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density);
    }

    @Override // hb0.InterfaceC38157a
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    /* JADX INFO: compiled from: KCBrandRnRefreshHeader.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
    public KCBrandRnRefreshHeader(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.imageView = appCompatImageView;
        setOrientation(1);
        setGravity(17);
        int iM55683dp = m55683dp(32);
        addView(appCompatImageView, new ViewGroup.LayoutParams(iM55683dp, iM55683dp));
        setMinimumHeight(m55683dp(64));
        C24277v.m58539d(context, R$drawable.kc_loading, appCompatImageView);
    }

    private final void startAnim() {
        this.imageView.setVisibility(0);
        Object drawable = this.imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (!animatable.isRunning()) {
                animatable.start();
                return;
            }
        }
        if (drawable == null) {
            C24277v.m58539d(getContext(), R$drawable.kc_loading, this.imageView);
        }
    }

    private final void stopAnim() {
        Object drawable = this.imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null || !animatable.isRunning()) {
            return;
        }
        animatable.stop();
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
    public void onReleased(@NotNull InterfaceC38162f refreshLayout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // hb0.InterfaceC38157a
    public void onStartAnimator(@NotNull InterfaceC38162f layout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        startAnim();
    }

    @Override // jb0.InterfaceC40375i
    public void onStateChanged(@NotNull InterfaceC38162f refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i11 = WhenMappings.$EnumSwitchMapping$0[newState.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            startAnim();
        } else {
            if (i11 != 4) {
                return;
            }
            stopAnim();
        }
    }

    @Override // hb0.InterfaceC38157a
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public View getView() {
        return this;
    }

    @Override // hb0.InterfaceC38157a
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override // hb0.InterfaceC38157a
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
    }
}
