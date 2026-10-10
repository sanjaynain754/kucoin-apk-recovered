package com.kubi.quotefacade.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airbnb.lottie.LottieAnimationView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38510b;
import lb0.InterpolatorC42155b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingsRefreshHeader.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00122\n\u0010\u001d\u001a\u00020\u001e\"\u00020\u001fH\u0017J \u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0017J0\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0017J \u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0017J \u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0017J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010.\u001a\u00020'H\u0017J \u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001fH\u0017J\b\u00103\u001a\u00020'H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u00065"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/HoldingsRefreshHeader;", "Landroid/widget/LinearLayout;", "Lcom/scwang/smart/refresh/layout/api/RefreshHeader;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "updateTimeView", "Lcom/kubi/resources/widget/BaseTextView;", "getUpdateTimeView", "()Lcom/kubi/resources/widget/BaseTextView;", "setUpdateTimeView", "(Lcom/kubi/resources/widget/BaseTextView;)V", "onStateChanged", "", "refreshLayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "getView", "Landroid/view/View;", "getSpinnerStyle", "Lcom/scwang/smart/refresh/layout/constant/SpinnerStyle;", "setPrimaryColors", LinearGradientManager.PROP_COLORS, "", "", "onInitialized", "kernel", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "height", "maxDragHeight", "onMoving", "isDragging", "", "percent", "", TypedValues.CycleType.S_WAVE_OFFSET, "onReleased", "onStartAnimator", "onFinish", "success", "onHorizontalDrag", "percentX", "offsetX", "offsetMax", "isSupportHorizontalDrag", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HoldingsRefreshHeader extends LinearLayout implements InterfaceC38160d {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f41054d = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public LottieAnimationView f41055b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BaseTextView f41056c;

    /* JADX INFO: compiled from: HoldingsRefreshHeader.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/HoldingsRefreshHeader$Companion;", "", "<init>", "()V", "REFRESH_OVER_TIME_MS", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ HoldingsRefreshHeader(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Override // hb0.InterfaceC38157a
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.adapter.HoldingsRefreshHeader$a */
    /* JADX INFO: compiled from: HoldingsRefreshHeader.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C21570a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefreshState.ReleaseToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RefreshState.LoadFinish.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RefreshState.RefreshFinish.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingsRefreshHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(17);
        addView(new View(context), 0, InterpolatorC42155b.m92540c(10.0f));
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.f41055b = lottieAnimationView;
        lottieAnimationView.setAnimation("loading.json");
        LottieAnimationView lottieAnimationView2 = this.f41055b;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setRepeatCount(-1);
        }
        addView(this.f41055b, InterpolatorC42155b.m92540c(24.0f), InterpolatorC42155b.m92540c(24.0f));
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setTextSize(12.0f);
        Resources resources = context.getResources();
        int i11 = R$color.c_text30;
        baseTextView.setTextColor(resources.getColor(i11));
        baseTextView.setText(context.getResources().getString(R$string.quote_pull_to_refresh_time_prefix));
        baseTextView.setPadding(C5275i0.m6236a(16.0f), C5275i0.m6236a(5.0f), C5275i0.m6236a(16.0f), 0);
        baseTextView.setGravity(1);
        BaseTextView baseTextView2 = new BaseTextView(context);
        this.f41056c = baseTextView2;
        baseTextView2.setTextSize(12.0f);
        baseTextView2.setTextColor(context.getResources().getColor(i11));
        baseTextView2.setPadding(C5275i0.m6236a(16.0f), C5275i0.m6236a(5.0f), C5275i0.m6236a(16.0f), C5275i0.m6236a(10.0f));
        baseTextView2.setGravity(1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        addView(baseTextView, layoutParams);
        addView(this.f41056c, layoutParams);
        setMinimumHeight(InterpolatorC42155b.m92540c(98.0f));
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public C38510b getSpinnerStyle() {
        C38510b Translate = C38510b.f86469d;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Nullable
    /* JADX INFO: renamed from: getUpdateTimeView, reason: from getter */
    public final BaseTextView getF41056c() {
        return this.f41056c;
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public int onFinish(@NotNull InterfaceC38162f refreshLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 500;
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public void onInitialized(@NotNull InterfaceC38161e kernel, int i11, int i12) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public void onReleased(@NotNull InterfaceC38162f refreshLayout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public void onStartAnimator(@NotNull InterfaceC38162f refreshLayout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // jb0.InterfaceC40375i
    @SuppressLint({"RestrictedApi"})
    public void onStateChanged(@NotNull InterfaceC38162f refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        LottieAnimationView lottieAnimationView;
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i11 = C21570a.$EnumSwitchMapping$0[newState.ordinal()];
        if (i11 == 2) {
            LottieAnimationView lottieAnimationView2 = this.f41055b;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.playAnimation();
                return;
            }
            return;
        }
        if (i11 != 5) {
            if (i11 == 6 && (lottieAnimationView = this.f41055b) != null) {
                lottieAnimationView.cancelAnimation();
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView3 = this.f41055b;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.cancelAnimation();
        }
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    public final void setUpdateTimeView(@Nullable BaseTextView baseTextView) {
        this.f41056c = baseTextView;
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public View getView() {
        return this;
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override // hb0.InterfaceC38157a
    @SuppressLint({"RestrictedApi"})
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
    }
}
