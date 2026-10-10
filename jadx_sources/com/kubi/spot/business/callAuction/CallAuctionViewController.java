package com.kubi.spot.business.callAuction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.event.api.C12572a;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.quote.market.trade.MarketTradeFragment;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p757xd.C46148j;
import p768xo.InterfaceC46302c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import t20.C44635d0;
import t20.C44650l;

/* JADX INFO: renamed from: com.kubi.spot.business.callAuction.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CallAuctionViewController.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001c\u0010\u0004\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/CallAuctionViewController;", "", "<init>", "()V", "handleCallAuction", "", "Lcom/kubi/spot/business/BaseTradeFragment;", "symbol", "", "fromCallAuction", "", "binding", "Lcom/kubi/spot/databinding/FragmentSpotTradeBinding;", "Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeBinding;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewController.kt\ncom/kubi/spot/business/callAuction/CallAuctionViewController\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,94:1\n8#2,2:95\n8#2,2:97\n8#2,2:99\n8#2,2:101\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewController.kt\ncom/kubi/spot/business/callAuction/CallAuctionViewController\n*L\n27#1:95,2\n45#1:97,2\n67#1:99,2\n83#1:101,2\n*E\n"})
public final class CallAuctionViewController {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CallAuctionViewController f49857a = new CallAuctionViewController();

    /* JADX WARN: Code duplicated, block: B:15:0x007c  */
    /* JADX INFO: renamed from: a */
    public final void m60534a(@NotNull BaseTradeFragment baseTradeFragment, @NotNull String symbol, boolean z11, @Nullable C44635d0 c44635d0) {
        Fragment parentFragment;
        BaseTradeFragment baseTradeFragment2;
        View viewMo63564n1;
        Intrinsics.checkNotNullParameter(baseTradeFragment, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (c44635d0 == null) {
            return;
        }
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        callAuctionSwitch.m21638d(symbol);
        if (!CallAuctionSwitch.m21636i(callAuctionSwitch, false, 1, null)) {
            C44128b.m97266j("trade|Spot|CallAuctionViewController", "连续竞价状态-交易面板");
            C46148j f20881c = c44635d0.f99035v.getF20881c();
            if (f20881c != null) {
                f20881c.m101736r(symbol, null, true);
            }
            if (z11) {
                callAuctionSwitch.m21641g().onNext(Boolean.FALSE);
            }
            FrameLayout callAuctionContainer = c44635d0.f99019f;
            Intrinsics.checkNotNullExpressionValue(callAuctionContainer, "callAuctionContainer");
            ViewExtKt.m66577h(callAuctionContainer);
            if (baseTradeFragment.getF49735d0().isAdded()) {
                baseTradeFragment.m60172A5();
            }
            FragmentManager childFragmentManager = baseTradeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            if (C27032f.m66617h(childFragmentManager) || !baseTradeFragment.getF49735d0().isAdded() || (parentFragment = baseTradeFragment.getF49735d0().getParentFragment()) == null) {
                return;
            }
            C27032f.m66622m(parentFragment, baseTradeFragment.getF49735d0());
            return;
        }
        C44128b.m97266j("trade|Spot|CallAuctionViewController", "集合竞价状态-交易面板");
        if (z11) {
            callAuctionSwitch.m21641g().onNext(Boolean.TRUE);
        }
        FrameLayout callAuctionContainer2 = c44635d0.f99019f;
        Intrinsics.checkNotNullExpressionValue(callAuctionContainer2, "callAuctionContainer");
        ViewExtKt.m66594y(callAuctionContainer2);
        baseTradeFragment.m60211s6(new CallAuctionFragment());
        if (baseTradeFragment.getF49735d0().isAdded()) {
            baseTradeFragment2 = baseTradeFragment;
        } else {
            FragmentManager childFragmentManager2 = baseTradeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            if (C27032f.m66617h(childFragmentManager2)) {
                baseTradeFragment2 = baseTradeFragment;
            } else {
                baseTradeFragment2 = baseTradeFragment;
                C27032f.m66625p(baseTradeFragment2, c44635d0.f99019f.getId(), baseTradeFragment.getF49735d0(), null, 4, null);
            }
        }
        baseTradeFragment2.getF49735d0().m60392H3(symbol);
        baseTradeFragment2.m60197k6();
        LinearLayout llKline = c44635d0.f99028o;
        Intrinsics.checkNotNullExpressionValue(llKline, "llKline");
        ViewExtKt.m66577h(llKline);
        C46148j f20881c2 = c44635d0.f99035v.getF20881c();
        if (f20881c2 != null) {
            C46148j.m101730v(f20881c2, 0, false, false, 3, null);
        }
        ActivityResultCaller parentFragment2 = baseTradeFragment2.getParentFragment();
        InterfaceC46302c interfaceC46302c = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
        if (interfaceC46302c != null && (viewMo63564n1 = interfaceC46302c.mo63564n1()) != null) {
            ViewExtKt.m66577h(viewMo63564n1);
        }
        C46148j f20881c3 = c44635d0.f99035v.getF20881c();
        if (f20881c3 != null) {
            f20881c3.m101736r(symbol, null, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m60535b(@NotNull MarketTradeFragment marketTradeFragment, @NotNull String symbol, @Nullable C44650l c44650l) {
        Fragment parentFragment;
        Intrinsics.checkNotNullParameter(marketTradeFragment, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (c44650l == null) {
            return;
        }
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        callAuctionSwitch.m21638d(symbol);
        if (!CallAuctionSwitch.m21636i(callAuctionSwitch, false, 1, null)) {
            C44128b.m97266j("trade|Spot|CallAuctionViewController", "连续竞价状态-K线详情页面板");
            LinearLayout llMarketTick = c44650l.f99181g.f99383q;
            Intrinsics.checkNotNullExpressionValue(llMarketTick, "llMarketTick");
            ViewExtKt.m66594y(llMarketTick);
            FragmentContainerView fragmentKline = c44650l.f99180f;
            Intrinsics.checkNotNullExpressionValue(fragmentKline, "fragmentKline");
            ViewExtKt.m66594y(fragmentKline);
            C12572a.m23695d("reload_kline_data", Boolean.TRUE, 0L, 4, null);
            FragmentManager childFragmentManager = marketTradeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            if (!C27032f.m66617h(childFragmentManager) && marketTradeFragment.m62959M3().isAdded() && (parentFragment = marketTradeFragment.m62959M3().getParentFragment()) != null) {
                C27032f.m66622m(parentFragment, marketTradeFragment.m62959M3());
            }
            FrameLayout callAuctionProgress = c44650l.f99176b;
            Intrinsics.checkNotNullExpressionValue(callAuctionProgress, "callAuctionProgress");
            ViewExtKt.m66577h(callAuctionProgress);
            return;
        }
        C44128b.m97266j("trade|Spot|CallAuctionViewController", "集合竞价状态-K线详情页面板");
        FrameLayout callAuctionProgress2 = c44650l.f99176b;
        Intrinsics.checkNotNullExpressionValue(callAuctionProgress2, "callAuctionProgress");
        ViewExtKt.m66594y(callAuctionProgress2);
        if (!marketTradeFragment.m62959M3().isAdded()) {
            FragmentManager childFragmentManager2 = marketTradeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            if (!C27032f.m66617h(childFragmentManager2)) {
                C27032f.m66611b(marketTradeFragment, c44650l.f99176b.getId(), marketTradeFragment.m62959M3(), null, 4, null);
            }
        }
        BaseFragment baseFragmentM62959M3 = marketTradeFragment.m62959M3();
        Bundle bundle = new Bundle();
        bundle.putString("symbol", symbol);
        bundle.putString("from_page", "MarketTradeFragment");
        baseFragmentM62959M3.setArguments(bundle);
        LinearLayout llMarketTick2 = c44650l.f99181g.f99383q;
        Intrinsics.checkNotNullExpressionValue(llMarketTick2, "llMarketTick");
        ViewExtKt.m66577h(llMarketTick2);
        FragmentContainerView fragmentKline2 = c44650l.f99180f;
        Intrinsics.checkNotNullExpressionValue(fragmentKline2, "fragmentKline");
        ViewExtKt.m66577h(fragmentKline2);
        C12572a.m23695d("reload_kline_data", Boolean.FALSE, 0L, 4, null);
    }
}
