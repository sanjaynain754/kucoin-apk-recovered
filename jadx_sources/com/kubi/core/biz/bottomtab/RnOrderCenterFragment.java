package com.kubi.core.biz.bottomtab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$id;
import com.tencent.qcloud.tuicore.TUIConstants;
import i60.InterfaceC38459b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnOrderCenterFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u001c\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment;", "Lcom/kubi/sdk/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/unify/api/ICurrentSymbolChanged;", "<init>", "()V", "rnFragment", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "addRnFragment", "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onCurrentSymbolChanged", "pair", "Lkotlin/Pair;", "", "symbol", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnOrderCenterFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, InterfaceC38459b {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f20166V = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public BaseFragment f20167U;

    /* JADX INFO: compiled from: RnOrderCenterFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment;", "tradeType", "", "currentSymbol", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final RnOrderCenterFragment newInstance(@NotNull String tradeType, @NotNull String currentSymbol) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
            RnOrderCenterFragment rnOrderCenterFragment = new RnOrderCenterFragment();
            Bundle bundle = new Bundle();
            bundle.putString("tradeType", tradeType);
            bundle.putString("symbol", currentSymbol);
            rnOrderCenterFragment.setArguments(bundle);
            return rnOrderCenterFragment;
        }
    }

    @Override // i60.InterfaceC38459b
    /* JADX INFO: renamed from: B2 */
    public void mo21309B2(@NotNull Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
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
        ActivityResultCaller activityResultCaller = this.f20167U;
        if (activityResultCaller != null && (activityResultCaller instanceof SwipeRefreshLayout.OnRefreshListener)) {
            ((SwipeRefreshLayout.OnRefreshListener) activityResultCaller).onRefresh();
        }
        IReactNativeService.nativeNotifyRn$default(IReactNativeService.INSTANCE.get(), "orderCenterRefresh", null, 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            m21310j3();
        }
    }

    @Override // i60.InterfaceC38459b
    /* JADX INFO: renamed from: x */
    public void mo21311x(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        Pair pairM90091to = TuplesKt.m90091to("symbol", symbol);
        Bundle arguments = getArguments();
        iReactNativeService.nativeNotifyRn("updateSymbol", MapsKt.hashMapOf(pairM90091to, TuplesKt.m90091to("tradeType", arguments != null ? arguments.getString("tradeType", "ALL") : null)));
    }

    /* JADX INFO: renamed from: j3 */
    public final void m21310j3() throws UnsupportedEncodingException {
        String string;
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("tradeType", "ALL");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("symbol", "BTC-USDT");
        }
        String strEncode = URLEncoder.encode("OpenOrderPage?tradeType=" + string + "&symbol=" + string2, "UTF-8");
        Pair pair = new Pair(Constants.BIZ, "trade");
        Pair pair2 = new Pair("entry", "main");
        Pair pair3 = new Pair(Constants.COMPONENT, "kucoin_order_center");
        Pair pair4 = new Pair("route", strEncode);
        Pair pair5 = new Pair("tradeType", string);
        Boolean bool = Boolean.TRUE;
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(BundleKt.bundleOf(pair, pair2, pair3, pair4, pair5, new Pair("ignoreHandleBackPressed", bool), new Pair("isEmbedMode", bool)));
        this.f20167U = rnRootFragment;
        getChildFragmentManager().beginTransaction().add(R$id.rn_order_center_container, rnRootFragment).commitAllowingStateLoss();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BaseFragment baseFragment = this.f20167U;
        if (baseFragment != null) {
            baseFragment.onHide();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        BaseFragment baseFragment = this.f20167U;
        if (baseFragment != null) {
            baseFragment.onShow();
        }
    }
}
