package com.kubi.utaspotlib.biz.delegation.history;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.core.biz.bottomtab.RnScrollRelayView;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$id;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnOrderHistoryFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/RnOrderHistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "rnFragment", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "addRnFragment", "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnOrderHistoryFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f54123V = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f54124U;

    /* JADX INFO: compiled from: RnOrderHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/RnOrderHistoryFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/utaspotlib/biz/delegation/history/RnOrderHistoryFragment;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final RnOrderHistoryFragment newInstance() {
            return new RnOrderHistoryFragment();
        }
    }

    /* JADX INFO: renamed from: j3 */
    private final void m66041j3() {
        Pair pair = new Pair(Constants.BIZ, "trade");
        Pair pair2 = new Pair("entry", "main");
        Pair pair3 = new Pair(Constants.COMPONENT, "kucoin_order_center");
        Pair pair4 = new Pair("route", "HistoryOrderPage");
        Boolean bool = Boolean.TRUE;
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(BundleKt.bundleOf(pair, pair2, pair3, pair4, new Pair("ignoreHandleBackPressed", bool), new Pair("isEmbedMode", bool)));
        this.f54124U = rnRootFragment;
        getChildFragmentManager().beginTransaction().add(R$id.rn_order_center_container, rnRootFragment).commitNow();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RnScrollRelayView rnScrollRelayView = new RnScrollRelayView(contextRequireContext, null, 0, 6, null);
        rnScrollRelayView.setId(R$id.rn_order_center_container);
        rnScrollRelayView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return rnScrollRelayView;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ActivityResultCaller activityResultCaller = this.f54124U;
        if (activityResultCaller == null || !(activityResultCaller instanceof SwipeRefreshLayout.OnRefreshListener)) {
            return;
        }
        ((SwipeRefreshLayout.OnRefreshListener) activityResultCaller).onRefresh();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            m66041j3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f54124U;
        if (baseFragment != null) {
            baseFragment.onHide();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        BaseFragment baseFragment = this.f54124U;
        if (baseFragment != null) {
            baseFragment.onShow();
        }
    }
}
