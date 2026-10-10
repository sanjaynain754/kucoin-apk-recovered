package com.kubi.core.biz.callauction.action;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.exeption.SpotMessage;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.common.MviExKt;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import h30.C38104b;
import java.math.BigDecimal;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p310he.InterfaceC38175b;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import v30.C45409v;
import ye.InterfaceC46470a;

/* JADX INFO: compiled from: CallAuctionTradeSwitchAction.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016J.\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006'"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/action/CallAuctionTradeSwitchAction;", "Lcom/kubi/core/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "<init>", "()V", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "callAuctionLimitPriceLowerLimit", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getCallAuctionLimitPriceLowerLimit", "()Ljava/math/BigDecimal;", "setCallAuctionLimitPriceLowerLimit", "(Ljava/math/BigDecimal;)V", "callAuctionLimitPriceUpperLimit", "getCallAuctionLimitPriceUpperLimit", "setCallAuctionLimitPriceUpperLimit", "clickPriceType", "", "supportTradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "tradeVerticalSubmitFragment", "Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;", "mParent", "Lcom/kubi/core/spot/business/ITradeParentBehavior;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;", "checkPriceInput", "", FirebaseAnalytics.Param.PRICE, "subscriptionSocket", "fragment", "Lcom/kubi/sdk/BaseFragment;", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "auction", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionTradeSwitchAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionTradeSwitchAction.kt\ncom/kubi/core/biz/callauction/action/CallAuctionTradeSwitchAction\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,114:1\n106#2,2:115\n55#3,2:117\n*S KotlinDebug\n*F\n+ 1 CallAuctionTradeSwitchAction.kt\ncom/kubi/core/biz/callauction/action/CallAuctionTradeSwitchAction\n*L\n43#1:115,2\n68#1:117,2\n*E\n"})
public final class CallAuctionTradeSwitchAction implements InterfaceC46470a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41709m0 f20304a;

    /* JADX INFO: renamed from: b */
    public BigDecimal f20305b;

    /* JADX INFO: renamed from: c */
    public BigDecimal f20306c;

    @Override // ye.InterfaceC46470a
    /* JADX INFO: renamed from: a */
    public boolean mo21624a(@Nullable BigDecimal bigDecimal) throws JSONException {
        if (CallAuctionSwitch.f20317a.m21644k()) {
            ToastCompat.m66437C(R$string.kc_call_auction_unsupport_order);
            return false;
        }
        BigDecimal bigDecimal2 = this.f20305b;
        BigDecimal bigDecimal3 = this.f20306c;
        Boolean boolValueOf = null;
        if (C41014a.m89919D(bigDecimal2) && C41014a.m89919D(bigDecimal3)) {
            C43846g.m96568c(new SpotMessage("callAuction priceCeiling And priceFloor is zero", "CallAuctionSwitchAction", false, 4, null), null, 2, null);
            return true;
        }
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        Intrinsics.checkNotNull(bigDecimal2);
        BigDecimal bigDecimal5 = (BigDecimal) RangesKt.coerceAtLeast(bigDecimal4, bigDecimal2);
        if (bigDecimal != null) {
            Intrinsics.checkNotNull(bigDecimal5);
            Intrinsics.checkNotNull(bigDecimal3);
            boolValueOf = Boolean.valueOf(C38104b.m86031c(bigDecimal, bigDecimal5, bigDecimal3));
        }
        if (C27025c.m66566d(boolValueOf)) {
            return true;
        }
        String string = C27017c.f54310a.m66513b().getString(R$string.kc_call_auction_price_illeage);
        Intrinsics.checkNotNull(bigDecimal5);
        String strM92640e = C42180b.m92640e(bigDecimal5, null, 20, false, false, false, 0, null, 125, null);
        Intrinsics.checkNotNull(bigDecimal3);
        ToastCompat.m66441G(string, strM92640e, C42180b.m92640e(bigDecimal3, null, 20, false, false, false, 0, null, 125, null));
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_INPUT_PRICE, SpotBusinessTracker.SpotFailReason.INPUT_PRICE_ILLEGAL);
        return false;
    }

    @Override // ye.InterfaceC46470a
    /* JADX INFO: renamed from: b */
    public void mo21625b(@NotNull List<? extends TradeTypeUiData> supportTradeTypes, @Nullable TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, @NotNull InterfaceC38175b mParent, @NotNull C45409v binding) {
        Intrinsics.checkNotNullParameter(supportTradeTypes, "supportTradeTypes");
        Intrinsics.checkNotNullParameter(mParent, "mParent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        ToastCompat.m66437C(R$string.kc_call_auction_only_support_limit);
    }

    /* JADX INFO: renamed from: c */
    public final void m21626c(BigDecimal bigDecimal) {
        this.f20305b = bigDecimal;
    }

    /* JADX INFO: renamed from: d */
    public final void m21627d(BigDecimal bigDecimal) {
        this.f20306c = bigDecimal;
    }

    public CallAuctionTradeSwitchAction() {
        InterfaceC41709m0 interfaceC41709m0M42508d = MviExKt.m42508d("CallAuctionSwitchAction", null, 2, null);
        this.f20304a = interfaceC41709m0M42508d;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.f20305b = bigDecimal;
        this.f20306c = bigDecimal;
        if (C12573b.f21598a.m23696a()) {
            "call_auction_price_limit".length();
        }
        C12572a.m23693b(interfaceC41709m0M42508d, new CallAuctionTradeSwitchAction$special$$inlined$bindFlowEvent$1("call_auction_price_limit", null, this));
        C12572a.m23695d("request_call_auction_price_limit", null, 0L, 6, null);
    }
}
