package com.kubi.spot.business.callAuction.action;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.common.MviExKt;
import com.kubi.network.websocket.model.Message;
import com.kubi.spot.R$string;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.ITradeParentBehavior;
import com.kubi.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.spot.business.submit.TradeVerticalSubmitFragment;
import com.kubi.spot.exeption.SpotMessage;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import e30.InterfaceC37055a;
import g10.C37787r;
import h30.C38104b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import v30.C45412y;

/* JADX INFO: compiled from: CallAuctionTradeSwitchAction.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J.\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006$"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/action/CallAuctionTradeSwitchAction;", "Lcom/kubi/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "<init>", "()V", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "callAuctionLimitPriceLowerLimit", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getCallAuctionLimitPriceLowerLimit", "()Ljava/math/BigDecimal;", "setCallAuctionLimitPriceLowerLimit", "(Ljava/math/BigDecimal;)V", "callAuctionLimitPriceUpperLimit", "getCallAuctionLimitPriceUpperLimit", "setCallAuctionLimitPriceUpperLimit", "clickPriceType", "", "tradeVerticalSubmitFragment", "Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;", "mParent", "Lcom/kubi/spot/business/ITradeParentBehavior;", "fragmentTradeVerticalBinding", "Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;", "checkPriceInput", "", FirebaseAnalytics.Param.PRICE, "subscriptionSocket", "fragment", "Lcom/kubi/spot/business/BaseTradeFragment;", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "auction", "Lkotlin/Function0;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionTradeSwitchAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionTradeSwitchAction.kt\ncom/kubi/spot/business/callAuction/action/CallAuctionTradeSwitchAction\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,112:1\n106#2,2:113\n52#3,2:115\n*S KotlinDebug\n*F\n+ 1 CallAuctionTradeSwitchAction.kt\ncom/kubi/spot/business/callAuction/action/CallAuctionTradeSwitchAction\n*L\n42#1:113,2\n66#1:115,2\n*E\n"})
public final class CallAuctionTradeSwitchAction implements InterfaceC37055a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41709m0 f49821a;

    /* JADX INFO: renamed from: b */
    public BigDecimal f49822b;

    /* JADX INFO: renamed from: c */
    public BigDecimal f49823c;

    /* JADX INFO: renamed from: k */
    public static final boolean m60481k(BaseTradeFragment baseTradeFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return baseTradeFragment.isVisible() && Intrinsics.areEqual("/spotCallAuction/orderChanges", it.getTopic()) && !TextUtils.isEmpty(it.getUserId());
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m60482l(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    @Override // e30.InterfaceC37055a
    /* JADX INFO: renamed from: a */
    public boolean mo60486a(@Nullable BigDecimal bigDecimal) throws JSONException {
        if (CallAuctionSwitch.f20317a.m21644k()) {
            ToastCompat.m66437C(R$string.kc_call_auction_unsupport_order);
            return false;
        }
        BigDecimal bigDecimal2 = this.f49822b;
        BigDecimal bigDecimal3 = this.f49823c;
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
        SpotBusinessTracker.f49771a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_INPUT_PRICE, SpotBusinessTracker.SpotFailReason.INPUT_PRICE_ILLEGAL);
        return false;
    }

    @Override // e30.InterfaceC37055a
    /* JADX INFO: renamed from: b */
    public void mo60487b(@Nullable TradeVerticalSubmitFragment tradeVerticalSubmitFragment, @NotNull ITradeParentBehavior mParent, @NotNull C45412y fragmentTradeVerticalBinding) {
        Intrinsics.checkNotNullParameter(mParent, "mParent");
        Intrinsics.checkNotNullParameter(fragmentTradeVerticalBinding, "fragmentTradeVerticalBinding");
        ToastCompat.m66437C(R$string.kc_call_auction_only_support_limit);
    }

    @Override // e30.InterfaceC37055a
    /* JADX INFO: renamed from: c */
    public void mo60488c(@NotNull final BaseTradeFragment fragment, @NotNull CompositeDisposable visibleDisposable, @NotNull C37787r wsDataHelper, @NotNull final Function0<Unit> auction) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(visibleDisposable, "visibleDisposable");
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        Intrinsics.checkNotNullParameter(auction, "auction");
        PublishSubject<Message> publishSubjectM85233f = wsDataHelper.m85233f("/spotCallAuction/orderChanges", "");
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.callAuction.action.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CallAuctionTradeSwitchAction.m60481k(fragment, (Message) obj));
            }
        };
        Observable<Message> observableObserveOn = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.spot.business.callAuction.action.d
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return CallAuctionTradeSwitchAction.m60482l(function1, obj);
            }
        }).debounce(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.callAuction.action.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CallAuctionTradeSwitchAction.m60483m(auction, (Message) obj);
            }
        };
        Consumer<? super Message> consumer = new Consumer() { // from class: com.kubi.spot.business.callAuction.action.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CallAuctionTradeSwitchAction.m60484n(function2, obj);
            }
        };
        final CallAuctionTradeSwitchAction$subscriptionSocket$3 callAuctionTradeSwitchAction$subscriptionSocket$3 = CallAuctionTradeSwitchAction$subscriptionSocket$3.INSTANCE;
        visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.callAuction.action.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CallAuctionTradeSwitchAction.m60485o(callAuctionTradeSwitchAction$subscriptionSocket$3, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m60489i(BigDecimal bigDecimal) {
        this.f49822b = bigDecimal;
    }

    /* JADX INFO: renamed from: j */
    public final void m60490j(BigDecimal bigDecimal) {
        this.f49823c = bigDecimal;
    }

    public CallAuctionTradeSwitchAction() {
        InterfaceC41709m0 interfaceC41709m0M42508d = MviExKt.m42508d("CallAuctionSwitchAction", null, 2, null);
        this.f49821a = interfaceC41709m0M42508d;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.f49822b = bigDecimal;
        this.f49823c = bigDecimal;
        if (C12573b.f21598a.m23696a()) {
            "call_auction_price_limit".length();
        }
        C12572a.m23693b(interfaceC41709m0M42508d, new CallAuctionTradeSwitchAction$special$$inlined$bindFlowEvent$1("call_auction_price_limit", null, this));
        C12572a.m23695d("request_call_auction_price_limit", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m60483m(Function0 function0, Message message) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m60484n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static final void m60485o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
