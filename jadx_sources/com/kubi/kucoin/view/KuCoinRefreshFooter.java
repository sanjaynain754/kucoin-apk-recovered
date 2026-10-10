package com.kubi.kucoin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import hb0.InterfaceC38159c;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38510b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KuCoinRefreshFooter.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00020\u001a\"\u00020\u000bH\u0016J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J0\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J \u0010'\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\"H\u0016J \u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J\b\u0010.\u001a\u00020\"H\u0016J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"H\u0016¨\u00061"}, m90084d2 = {"Lcom/kubi/kucoin/view/KuCoinRefreshFooter;", "Landroid/widget/LinearLayout;", "Lcom/scwang/smart/refresh/layout/api/RefreshFooter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onStateChanged", "", "refreshLayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "getView", "Landroid/view/View;", "getSpinnerStyle", "Lcom/scwang/smart/refresh/layout/constant/SpinnerStyle;", "setPrimaryColors", LinearGradientManager.PROP_COLORS, "", "onInitialized", "kernel", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "height", "maxDragHeight", "onMoving", "isDragging", "", "percent", "", TypedValues.CycleType.S_WAVE_OFFSET, "onReleased", "onStartAnimator", "onFinish", "success", "onHorizontalDrag", "percentX", "offsetX", "offsetMax", "isSupportHorizontalDrag", "setNoMoreData", "noMoreData", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCoinRefreshFooter extends LinearLayout implements InterfaceC38159c {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KuCoinRefreshFooter(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // hb0.InterfaceC38157a
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.view.KuCoinRefreshFooter$a */
    /* JADX INFO: compiled from: KuCoinRefreshFooter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15758a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.LoadFinish.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KuCoinRefreshFooter(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public C38510b getSpinnerStyle() {
        C38510b Translate = C38510b.f86469d;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // hb0.InterfaceC38157a
    public int onFinish(@NotNull InterfaceC38162f refreshLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 500;
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
    public void onStartAnimator(@NotNull InterfaceC38162f refreshLayout, int i11, int i12) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // jb0.InterfaceC40375i
    public void onStateChanged(@NotNull InterfaceC38162f refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i11 = C15758a.$EnumSwitchMapping$0[newState.ordinal()];
        if (i11 == 1) {
            ProgressBar progressBar = (ProgressBar) findViewById(R$id.loading_progress);
            progressBar.setIndeterminate(true);
            C44128b.m97258b("KuCoinRefreshFooter:上啦加载动画是否播放：" + progressBar.isAnimating());
            return;
        }
        if (i11 != 2) {
            return;
        }
        ProgressBar progressBar2 = (ProgressBar) findViewById(R$id.loading_progress);
        progressBar2.setIndeterminate(false);
        C44128b.m97258b("KuCoinRefreshFooter:上啦加载动画是否播放：" + progressBar2.isAnimating());
    }

    @Override // hb0.InterfaceC38157a
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinRefreshFooter(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setGravity(1);
        LayoutInflater.from(context).inflate(R$layout.kucoin_loadmore_view, (ViewGroup) this, true);
    }

    @Override // hb0.InterfaceC38157a
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
    }

    @Override // hb0.InterfaceC38157a
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override // hb0.InterfaceC38157a
    @NotNull
    public View getView() {
        return this;
    }

    @Override // hb0.InterfaceC38159c
    /* JADX INFO: renamed from: a */
    public boolean mo33228a(boolean z11) {
        return z11;
    }
}
