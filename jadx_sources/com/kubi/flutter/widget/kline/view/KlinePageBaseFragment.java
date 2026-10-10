package com.kubi.flutter.widget.kline.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.flutter.widget.R$id;
import com.kubi.flutter.widget.R$layout;
import com.kubi.flutter.widget.kline.IKLineContainer;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineContainer;
import com.kubi.flutter.widget.kline.KLineLoadingState;
import com.kubi.flutter.widget.kline.KLineViewController;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.IKlineFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlinePageBaseFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0017\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u000bH\u0004J\u0010\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u000bH\u0004J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0017J\b\u0010)\u001a\u00020\"H\u0017J\b\u0010*\u001a\u00020\"H\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u000e\u001a\u00020\u000fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006+"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/sdk/IKlineFragment;", "<init>", "()V", "value", "Lcom/kubi/flutter/widget/kline/KLineViewController;", "controller", "getController", "()Lcom/kubi/flutter/widget/kline/KLineViewController;", "requestedHistoryShow", "", "Ljava/lang/Boolean;", "requestedActiveShow", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "stateListener", "com/kubi/flutter/widget/kline/view/KlinePageBaseFragment$stateListener$1", "Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment$stateListener$1;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateHistoryShow", "isChecked", "updateActiveShow", "onDataFirstLoaded", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class KlinePageBaseFragment extends BaseFragment implements IKlineFragment {

    /* JADX INFO: renamed from: U */
    @Nullable
    public KLineViewController f22497U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public Boolean f22498V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Boolean f22499W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final C12815a f22500X = new C12815a();

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.view.KlinePageBaseFragment$a */
    /* JADX INFO: compiled from: KlinePageBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/flutter/widget/kline/view/KlinePageBaseFragment$stateListener$1", "Lcom/kubi/flutter/widget/kline/IKLineContainer$StateListener;", "onLoadStateChanged", "", "state", "Lcom/kubi/flutter/widget/kline/KLineLoadingState;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12815a implements IKLineContainer.b {

        /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.view.KlinePageBaseFragment$a$a */
        /* JADX INFO: compiled from: KlinePageBaseFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KLineLoadingState.values().length];
                try {
                    iArr[KLineLoadingState.Loading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C12815a() {
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.b
        /* JADX INFO: renamed from: a */
        public void mo24269a(KLineLoadingState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (a.$EnumSwitchMapping$0[state.ordinal()] == 1) {
                return;
            }
            KlinePageBaseFragment.this.mo24401m3();
            KLineContainer kLineContainer = (KLineContainer) KlinePageBaseFragment.this.findViewById(R$id.klineChart);
            if (kLineContainer == null) {
                return;
            }
            kLineContainer.m24142C(this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public abstract KLineViewController.InitParam mo24399k3();

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public abstract IKLineDataInteractor mo24400l3();

    @Nullable
    /* JADX INFO: renamed from: j3, reason: from getter */
    public final KLineViewController getF22497U() {
        return this.f22497U;
    }

    @Override // com.kubi.sdk.BaseFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.flutter_kline_chart_view_layout, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        KLineContainer kLineContainer = (KLineContainer) findViewById(R$id.klineChart);
        if (kLineContainer == null) {
            return;
        }
        kLineContainer.m24152w(getActivity());
        kLineContainer.m24149p(this.f22500X);
        KLineViewController.InitParam initParamMo24399k3 = mo24399k3();
        Boolean bool = this.f22498V;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : initParamMo24399k3.getShowHistory();
        Boolean bool2 = this.f22499W;
        KLineViewController kLineViewController = new KLineViewController(initParamMo24399k3.m24237a((13311 & 1) != 0 ? initParamMo24399k3.symbol : null, (13311 & 2) != 0 ? initParamMo24399k3.precision : 0, (13311 & 4) != 0 ? initParamMo24399k3.type : null, (13311 & 8) != 0 ? initParamMo24399k3.biz : null, (13311 & 16) != 0 ? initParamMo24399k3.mainIndexTypes : null, (13311 & 32) != 0 ? initParamMo24399k3.subIndexTypes : null, (13311 & 64) != 0 ? initParamMo24399k3.isLineView : false, (13311 & 128) != 0 ? initParamMo24399k3.selectPadConfig : null, (13311 & 256) != 0 ? initParamMo24399k3.volumeConfig : null, (13311 & 512) != 0 ? initParamMo24399k3.tradeType : null, (13311 & 1024) != 0 ? initParamMo24399k3.showHistory : zBooleanValue, (13311 & 2048) != 0 ? initParamMo24399k3.showActive : bool2 != null ? bool2.booleanValue() : initParamMo24399k3.getShowActive(), (13311 & 4096) != 0 ? initParamMo24399k3.enableHistory : false, (13311 & 8192) != 0 ? initParamMo24399k3.enableActive : false), kLineContainer, mo24400l3());
        this.f22497U = kLineViewController;
        kLineViewController.m24219I();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m24402n3(boolean z11) {
        this.f22499W = Boolean.valueOf(z11);
        KLineViewController kLineViewController = this.f22497U;
        if (kLineViewController != null) {
            kLineViewController.m24228s(z11);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final void m24403o3(boolean z11) {
        this.f22498V = Boolean.valueOf(z11);
        KLineViewController kLineViewController = this.f22497U;
        if (kLineViewController != null) {
            kLineViewController.m24229t(z11);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onDestroyView() {
        super.onDestroyView();
        KLineViewController kLineViewController = this.f22497U;
        if (kLineViewController != null) {
            kLineViewController.m24217G();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @CallSuper
    public void onHide() {
        super.onHide();
        KLineViewController kLineViewController = this.f22497U;
        if (kLineViewController != null) {
            kLineViewController.m24218H();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @CallSuper
    public void onShow() {
        super.onShow();
        KLineViewController kLineViewController = this.f22497U;
        if (kLineViewController != null) {
            kLineViewController.m24223M();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void mo24401m3() {
    }
}
