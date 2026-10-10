package com.kubi.kumex.trade;

import cm.SubmitStopOrderParams;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.data.trade.model.TpslOrderParam;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.BaseViewModel;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import fm.C37569d;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p595rg.InterfaceC44081i;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sm.OrderRequest;

/* JADX INFO: renamed from: com.kubi.kumex.trade.c5, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ProfitLossViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2 \u0010\u000f\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00050\u0010JT\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0002J$\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\nH\u0002JR\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0010JR\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0010J6\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010$\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002JF\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0010JP\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0010¨\u0006*"}, m90084d2 = {"Lcom/kubi/kumex/trade/ProfitLossViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "submitStopMarketOrder", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "requests", "", "Lcom/kubi/kumex/request/OrderRequest;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "bizType", "Lcom/kubi/broker/MultiBizType;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lkotlin/Pair;", "", "doSubmitStopMarketOrder", "request", "validationToken", "", "trackPlusResult", "success", "failReason", "submitProfitLossOrder", "profitParam", "Lcom/kubi/kumex/data/trade/model/TpslOrderParam;", "lossParam", InterfaceC33730j9.f70350a, "submitSimpleProfitLossOrder", "trackResult", "isBuy", "symbol", "positionSide", "toTrackPositionMode", "alterPartialTpslOrder", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "alterEntirePositionTpslOrder", "orderId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProfitLossViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfitLossViewModel.kt\ncom/kubi/kumex/trade/ProfitLossViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,452:1\n1869#2,2:453\n*S KotlinDebug\n*F\n+ 1 ProfitLossViewModel.kt\ncom/kubi/kumex/trade/ProfitLossViewModel\n*L\n67#1:453,2\n*E\n"})
public final class ProfitLossViewModel extends BaseViewModel {
    /* JADX INFO: renamed from: l0 */
    public final void m36281l0(@NotNull final BaseFragment fragment, @NotNull final PositionEntity position, @Nullable final TpslOrderParam tpslOrderParam, @Nullable final TpslOrderParam tpslOrderParam2, @NotNull final MultiBizType bizType, @Nullable final String str, @NotNull final Function1<? super Boolean, Unit> callback) {
        BigDecimal tickSize;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        final int iM66651k = C27039d.m66651k((contractEntityM84661b == null || (tickSize = contractEntityM84661b.getTickSize()) == null) ? null : Integer.valueOf(C41014a.m89952z(tickSize)), 2);
        TradePwdHelperKt.m33943w(fragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.kumex.trade.a4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36261p0(position, tpslOrderParam, tpslOrderParam2, iM66651k, bizType, str, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.a5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                ProfitLossViewModel.m36258n0(callback, this, position, obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.b5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                ProfitLossViewModel.m36259o0(callback, this, position, fragment, (Throwable) obj);
            }
        }, position.isTrialFunds(), (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? new Function0() { // from class: com.kubi.kumex.helper.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePwdHelperKt.m33945y();
            }
        } : new Function0() { // from class: com.kubi.kumex.trade.b4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36271x0(callback);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m36282y0(@NotNull final BaseFragment fragment, @NotNull final PositionEntity position, @Nullable final TpslOrderParam tpslOrderParam, @Nullable final TpslOrderParam tpslOrderParam2, @NotNull final MultiBizType bizType, @Nullable final String str, @NotNull final Function1<? super Boolean, Unit> callback) {
        BigDecimal tickSize;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        final int iM66651k = C27039d.m66651k((contractEntityM84661b == null || (tickSize = contractEntityM84661b.getTickSize()) == null) ? null : Integer.valueOf(C41014a.m89952z(tickSize)), 2);
        TradePwdHelperKt.m33943w(fragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.kumex.trade.y4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36218B0(position, tpslOrderParam, iM66651k, tpslOrderParam2, bizType, str, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.w4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                ProfitLossViewModel.m36274z0(callback, this, position, obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.x4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                ProfitLossViewModel.m36216A0(callback, this, position, fragment, (Throwable) obj);
            }
        }, position.isTrialFunds(), (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? new Function0() { // from class: com.kubi.kumex.helper.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePwdHelperKt.m33945y();
            }
        } : new Function0() { // from class: com.kubi.kumex.trade.z4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36222D0(callback);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m36216A0(Function1 function1, ProfitLossViewModel profitLossViewModel, PositionEntity positionEntity, BaseFragment baseFragment, Throwable th2) throws JSONException {
        function1.invoke(Boolean.FALSE);
        if (th2 instanceof ApiException) {
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(": ");
            sb2.append(apiException.getMessage());
            profitLossViewModel.m36277L0(false, sb2.toString(), C37569d.m84685z(positionEntity), C27041f.m66668h(positionEntity.getSymbol()), positionEntity.getPositionSide());
        }
        C17058m0.m36550e(baseFragment, th2);
    }

    /* JADX INFO: renamed from: B0 */
    public static final Observable m36218B0(final PositionEntity positionEntity, final TpslOrderParam tpslOrderParam, final int i11, final TpslOrderParam tpslOrderParam2, final MultiBizType multiBizType, final String str, final String str2) {
        Observable observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.trade.h4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36220C0(positionEntity, tpslOrderParam, i11, tpslOrderParam2, multiBizType, str2, str);
            }
        }).compose(C24217a1.m58386j()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m36220C0(PositionEntity positionEntity, TpslOrderParam tpslOrderParam, int i11, TpslOrderParam tpslOrderParam2, MultiBizType multiBizType, String str, String str2) {
        BigDecimal bigDecimalAbs;
        BigDecimal price;
        BigDecimal price2;
        String strM66668h = C27041f.m66668h(positionEntity.getSymbol());
        String plainString = null;
        String priceType = tpslOrderParam != null ? tpslOrderParam.getPriceType() : null;
        BigDecimal scale = (tpslOrderParam == null || (price2 = tpslOrderParam.getPrice()) == null) ? null : price2.setScale(i11, RoundingMode.DOWN);
        String stop = tpslOrderParam != null ? tpslOrderParam.getStop() : null;
        String priceType2 = tpslOrderParam2 != null ? tpslOrderParam2.getPriceType() : null;
        BigDecimal scale2 = (tpslOrderParam2 == null || (price = tpslOrderParam2.getPrice()) == null) ? null : price.setScale(i11, RoundingMode.DOWN);
        String stop2 = tpslOrderParam2 != null ? tpslOrderParam2.getStop() : null;
        InterfaceC44081i interfaceC44081iM20275r = MultiBizFacadeManager.f19232a.m20275r(multiBizType);
        boolean zIsTrialFunds = positionEntity.isTrialFunds();
        String str3 = C37569d.m84685z(positionEntity) ? "sell" : "buy";
        String strM66668h2 = C27041f.m66668h(positionEntity.getPositionSide());
        String strM66668h3 = C27041f.m66668h(positionEntity.getMarginMode());
        BigDecimal currentQty = positionEntity.getCurrentQty();
        if (currentQty != null && (bigDecimalAbs = currentQty.abs()) != null) {
            plainString = bigDecimalAbs.toPlainString();
        }
        interfaceC44081iM20275r.mo4510l0(zIsTrialFunds, new SubmitStopOrderParams(strM66668h, str3, plainString, strM66668h2, strM66668h3, priceType, scale, priceType2, scale2, stop, stop2, str, null, null, str2, 12288, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m36222D0(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m36227G0(Function1 function1, BaseFragment baseFragment, Throwable th2) {
        function1.invoke(new Pair(null, Boolean.FALSE));
        C17058m0.m36550e(baseFragment, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static final Observable m36229H0(Ref.ObjectRef objectRef, String str) {
        objectRef.element = str;
        Observable observableJust = Observable.just("");
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m36231I0(Function1 function1) {
        function1.invoke(new Pair(null, Boolean.FALSE));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    private final String m36233J0(String str) {
        if (str == null) {
            return "none";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 2044801) {
            return !str.equals("BOTH") ? "none" : "1";
        }
        if (iHashCode != 2342524) {
            return (iHashCode == 78875740 && str.equals(SharedPositionInfo.SIDE_SHORT)) ? "2" : "none";
        }
        return !str.equals(SharedPositionInfo.SIDE_LONG) ? "none" : "2";
    }

    /* JADX INFO: renamed from: T */
    public static final void m36242T(Function1 function1, Object obj) {
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: U */
    public static final void m36243U(Function1 function1, BaseFragment baseFragment, Throwable th2) {
        function1.invoke(Boolean.FALSE);
        C17058m0.m36550e(baseFragment, th2);
    }

    /* JADX INFO: renamed from: V */
    public static final Observable m36244V(final PositionEntity positionEntity, final TpslOrderParam tpslOrderParam, final TpslOrderParam tpslOrderParam2, final int i11, final MultiBizType multiBizType, final String str, final String str2) {
        Observable observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.trade.s4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36245W(positionEntity, tpslOrderParam, tpslOrderParam2, i11, multiBizType, str2, str);
            }
        }).compose(C24217a1.m58386j()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m36245W(PositionEntity positionEntity, TpslOrderParam tpslOrderParam, TpslOrderParam tpslOrderParam2, int i11, MultiBizType multiBizType, String str, String str2) {
        BigDecimal bigDecimalAbs;
        BigDecimal price;
        BigDecimal price2;
        boolean zM84685z = C37569d.m84685z(positionEntity);
        String strM66668h = C27041f.m66668h(positionEntity.getSymbol());
        TpslOrderParam tpslOrderParam3 = zM84685z ? tpslOrderParam : tpslOrderParam2;
        String plainString = null;
        String priceType = tpslOrderParam3 != null ? tpslOrderParam3.getPriceType() : null;
        BigDecimal scale = (tpslOrderParam3 == null || (price2 = tpslOrderParam3.getPrice()) == null) ? null : price2.setScale(i11, RoundingMode.DOWN);
        String stop = tpslOrderParam3 != null ? tpslOrderParam3.getStop() : null;
        TpslOrderParam tpslOrderParam4 = zM84685z ? tpslOrderParam2 : tpslOrderParam;
        String priceType2 = tpslOrderParam4 != null ? tpslOrderParam4.getPriceType() : null;
        BigDecimal scale2 = (tpslOrderParam4 == null || (price = tpslOrderParam4.getPrice()) == null) ? null : price.setScale(i11, RoundingMode.DOWN);
        String stop2 = tpslOrderParam4 != null ? tpslOrderParam4.getStop() : null;
        InterfaceC44081i interfaceC44081iM20275r = MultiBizFacadeManager.f19232a.m20275r(multiBizType);
        boolean zIsTrialFunds = positionEntity.isTrialFunds();
        String str3 = zM84685z ? "sell" : "buy";
        String strM66668h2 = C27041f.m66668h(positionEntity.getPositionSide());
        String strM66668h3 = C27041f.m66668h(positionEntity.getMarginMode());
        BigDecimal currentQty = positionEntity.getCurrentQty();
        if (currentQty != null && (bigDecimalAbs = currentQty.abs()) != null) {
            plainString = bigDecimalAbs.toPlainString();
        }
        interfaceC44081iM20275r.mo4510l0(zIsTrialFunds, new SubmitStopOrderParams(strM66668h, str3, plainString, strM66668h2, strM66668h3, priceType, scale, priceType2, scale2, stop, stop2, str, str2, null, null, 24576, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m36246X(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m36247Z(Function1 function1, Object obj) {
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m36248a0(Function1 function1, BaseFragment baseFragment, Throwable th2) {
        function1.invoke(Boolean.FALSE);
        C17058m0.m36550e(baseFragment, th2);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Observable m36249b0(final TpslOrderParam tpslOrderParam, final TpslOrderParam tpslOrderParam2, final OrderEntity orderEntity, final MultiBizType multiBizType, final String str) {
        Observable observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.trade.t4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36250c0(tpslOrderParam, tpslOrderParam2, orderEntity, str, multiBizType);
            }
        }).compose(C24217a1.m58386j()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m36250c0(TpslOrderParam tpslOrderParam, TpslOrderParam tpslOrderParam2, OrderEntity orderEntity, String str, MultiBizType multiBizType) {
        BigDecimal size;
        TpslOrderParam tpslOrderParam3 = tpslOrderParam == null ? tpslOrderParam2 : tpslOrderParam;
        BigDecimal price = tpslOrderParam3 != null ? tpslOrderParam3.getPrice() : null;
        String priceType = tpslOrderParam3 != null ? tpslOrderParam3.getPriceType() : null;
        BigDecimal price2 = tpslOrderParam != null ? tpslOrderParam.getPrice() : null;
        BigDecimal price3 = tpslOrderParam2 != null ? tpslOrderParam2.getPrice() : null;
        String stop = tpslOrderParam3 != null ? tpslOrderParam3.getStop() : null;
        BigDecimal limitPrice = tpslOrderParam3 != null ? tpslOrderParam3.getLimitPrice() : null;
        if (tpslOrderParam3 == null || (size = tpslOrderParam3.getSize()) == null) {
            size = orderEntity.getSize();
        }
        MultiBizFacadeManager.f19232a.m20275r(multiBizType).mo4494B(new SubmitAlterTpslOrderEntity("ANDROID", limitPrice, size, priceType, orderEntity.getSymbol(), orderEntity.getId(), orderEntity.getSide(), price2, price3, (tpslOrderParam3 == null || !tpslOrderParam3.isLimit()) ? "market" : TUIConstants.TUIContact.LIMIT, stop, price, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m36251d0(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m36253g0(Function1 function1, OrderRequest orderRequest, ProfitLossViewModel profitLossViewModel, OrderResult orderResult) throws JSONException {
        function1.invoke(new Pair(orderRequest, Boolean.TRUE));
        profitLossViewModel.m36276K0(true, null, orderRequest);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m36257m0(ProfitLossViewModel profitLossViewModel, BaseFragment baseFragment, PositionEntity positionEntity, TpslOrderParam tpslOrderParam, TpslOrderParam tpslOrderParam2, MultiBizType multiBizType, String str, Function1 function1, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            str = null;
        }
        profitLossViewModel.m36281l0(baseFragment, positionEntity, tpslOrderParam, tpslOrderParam2, multiBizType, str, function1);
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m36258n0(Function1 function1, ProfitLossViewModel profitLossViewModel, PositionEntity positionEntity, Object obj) throws JSONException {
        function1.invoke(Boolean.TRUE);
        profitLossViewModel.m36277L0(true, null, C37569d.m84685z(positionEntity), C27041f.m66668h(positionEntity.getSymbol()), positionEntity.getPositionSide());
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m36259o0(Function1 function1, ProfitLossViewModel profitLossViewModel, PositionEntity positionEntity, BaseFragment baseFragment, Throwable th2) throws JSONException {
        function1.invoke(Boolean.FALSE);
        if (th2 instanceof ApiException) {
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(": ");
            sb2.append(apiException.getMessage());
            profitLossViewModel.m36277L0(false, sb2.toString(), C37569d.m84685z(positionEntity), C27041f.m66668h(positionEntity.getSymbol()), positionEntity.getPositionSide());
        }
        C17058m0.m36550e(baseFragment, th2);
    }

    /* JADX INFO: renamed from: p0 */
    public static final Observable m36261p0(final PositionEntity positionEntity, final TpslOrderParam tpslOrderParam, final TpslOrderParam tpslOrderParam2, final int i11, final MultiBizType multiBizType, final String str, final String str2) {
        Observable observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.trade.r4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36263q0(positionEntity, tpslOrderParam, tpslOrderParam2, i11, multiBizType, str2, str);
            }
        }).compose(C24217a1.m58386j()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m36263q0(PositionEntity positionEntity, TpslOrderParam tpslOrderParam, TpslOrderParam tpslOrderParam2, int i11, MultiBizType multiBizType, String str, String str2) {
        BigDecimal bigDecimalAbs;
        BigDecimal price;
        BigDecimal price2;
        boolean zM84685z = C37569d.m84685z(positionEntity);
        String strM66668h = C27041f.m66668h(positionEntity.getSymbol());
        TpslOrderParam tpslOrderParam3 = zM84685z ? tpslOrderParam : tpslOrderParam2;
        String plainString = null;
        String priceType = tpslOrderParam3 != null ? tpslOrderParam3.getPriceType() : null;
        BigDecimal scale = (tpslOrderParam3 == null || (price2 = tpslOrderParam3.getPrice()) == null) ? null : price2.setScale(i11, RoundingMode.DOWN);
        String stop = tpslOrderParam3 != null ? tpslOrderParam3.getStop() : null;
        TpslOrderParam tpslOrderParam4 = zM84685z ? tpslOrderParam2 : tpslOrderParam;
        String priceType2 = tpslOrderParam4 != null ? tpslOrderParam4.getPriceType() : null;
        BigDecimal scale2 = (tpslOrderParam4 == null || (price = tpslOrderParam4.getPrice()) == null) ? null : price.setScale(i11, RoundingMode.DOWN);
        String stop2 = tpslOrderParam4 != null ? tpslOrderParam4.getStop() : null;
        InterfaceC44081i interfaceC44081iM20275r = MultiBizFacadeManager.f19232a.m20275r(multiBizType);
        boolean zIsTrialFunds = positionEntity.isTrialFunds();
        String str3 = C37569d.m84685z(positionEntity) ? "sell" : "buy";
        String strM66668h2 = C27041f.m66668h(positionEntity.getPositionSide());
        String strM66668h3 = C27041f.m66668h(positionEntity.getMarginMode());
        BigDecimal currentQty = positionEntity.getCurrentQty();
        if (currentQty != null && (bigDecimalAbs = currentQty.abs()) != null) {
            plainString = bigDecimalAbs.toPlainString();
        }
        interfaceC44081iM20275r.mo4510l0(zIsTrialFunds, new SubmitStopOrderParams(strM66668h, str3, plainString, strM66668h2, strM66668h3, priceType, scale, priceType2, scale2, stop, stop2, str, null, null, str2, 12288, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m36271x0(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m36274z0(Function1 function1, ProfitLossViewModel profitLossViewModel, PositionEntity positionEntity, Object obj) throws JSONException {
        function1.invoke(Boolean.TRUE);
        profitLossViewModel.m36277L0(true, null, C37569d.m84685z(positionEntity), C27041f.m66668h(positionEntity.getSymbol()), positionEntity.getPositionSide());
    }

    /* JADX INFO: renamed from: E0 */
    public final void m36275E0(@NotNull final BaseFragment fragment, @NotNull final List<OrderRequest> requests, @NotNull final PositionEntity position, @NotNull final MultiBizType bizType, @NotNull final Function1<? super Pair<OrderRequest, Boolean>, Unit> callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TradePwdHelperKt.m33943w(fragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.kumex.trade.u4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36229H0(objectRef, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.z3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36225F0(fragment, requests, this, position, bizType, objectRef, callback, obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.k4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36227G0(callback, fragment, (Throwable) obj);
            }
        }, position.isTrialFunds(), (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? new Function0() { // from class: com.kubi.kumex.helper.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePwdHelperKt.m33945y();
            }
        } : new Function0() { // from class: com.kubi.kumex.trade.v4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36231I0(callback);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m36278S(@NotNull final BaseFragment fragment, @NotNull final PositionEntity position, @Nullable final String str, @Nullable final TpslOrderParam tpslOrderParam, @Nullable final TpslOrderParam tpslOrderParam2, @NotNull final MultiBizType bizType, @NotNull final Function1<? super Boolean, Unit> callback) {
        BigDecimal tickSize;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        final int iM66651k = C27039d.m66651k((contractEntityM84661b == null || (tickSize = contractEntityM84661b.getTickSize()) == null) ? null : Integer.valueOf(C41014a.m89952z(tickSize)), 2);
        TradePwdHelperKt.m33943w(fragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.kumex.trade.p4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36244V(position, tpslOrderParam, tpslOrderParam2, iM66651k, bizType, str, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.n4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36242T(callback, obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.o4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36243U(callback, fragment, (Throwable) obj);
            }
        }, position.isTrialFunds(), (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? new Function0() { // from class: com.kubi.kumex.helper.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePwdHelperKt.m33945y();
            }
        } : new Function0() { // from class: com.kubi.kumex.trade.q4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36246X(callback);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m36279Y(@NotNull final BaseFragment fragment, @NotNull final OrderEntity order, @Nullable final TpslOrderParam tpslOrderParam, @Nullable final TpslOrderParam tpslOrderParam2, @NotNull final MultiBizType bizType, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TradePwdHelperKt.m33943w(fragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.kumex.trade.l4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36249b0(tpslOrderParam, tpslOrderParam2, order, bizType, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.i4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36247Z(callback, obj);
            }
        }, new Consumer() { // from class: com.kubi.kumex.trade.j4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36248a0(callback, fragment, (Throwable) obj);
            }
        }, order.isTrialFunds(), (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? new Function0() { // from class: com.kubi.kumex.helper.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePwdHelperKt.m33945y();
            }
        } : new Function0() { // from class: com.kubi.kumex.trade.m4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36251d0(callback);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m36280e0(final BaseFragment baseFragment, final OrderRequest orderRequest, final PositionEntity positionEntity, final MultiBizType multiBizType, final String str, final Function1<? super Pair<OrderRequest, Boolean>, Unit> function1) {
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.kumex.trade.c4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitLossViewModel.m36252f0(orderRequest, positionEntity, str, multiBizType);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.trade.d4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36253g0(function1, orderRequest, this, (OrderResult) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.trade.e4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36254h0(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.trade.f4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossViewModel.m36255i0(baseFragment, this, orderRequest, function1, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.trade.g4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfitLossViewModel.m36256j0(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, baseFragment.getDestroyDisposable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    public static final void m36225F0(BaseFragment baseFragment, List list, ProfitLossViewModel profitLossViewModel, PositionEntity positionEntity, MultiBizType multiBizType, Ref.ObjectRef objectRef, Function1 function1, Object obj) {
        KcPrimaryButton kcPrimaryButtonM36482h = ViewExKt.m36482h(baseFragment);
        if (kcPrimaryButtonM36482h != null) {
            kcPrimaryButtonM36482h.m55043o();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            profitLossViewModel.m36280e0(baseFragment, (OrderRequest) it.next(), positionEntity, multiBizType, (String) objectRef.element, function1);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final OrderResult m36252f0(OrderRequest orderRequest, PositionEntity positionEntity, String str, MultiBizType multiBizType) {
        Map<String, String> mutableMap = MapsKt.toMutableMap(orderRequest.m98506c(positionEntity));
        if (str != null && str.length() != 0) {
            mutableMap.put("X-VALIDATION-TOKEN", str);
        }
        return MultiBizFacadeManager.f19232a.m20275r(multiBizType).mo4496H0(positionEntity.isTrialFunds(), mutableMap);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m36254h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m36255i0(BaseFragment baseFragment, ProfitLossViewModel profitLossViewModel, OrderRequest orderRequest, Function1 function1, Throwable th2) throws JSONException {
        C17058m0.m36550e(baseFragment, th2);
        if (th2 instanceof ApiException) {
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(": ");
            sb2.append(apiException.getMessage());
            profitLossViewModel.m36276K0(false, sb2.toString(), orderRequest);
        }
        function1.invoke(new Pair(orderRequest, Boolean.FALSE));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m36256j0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m36276K0(boolean z11, String str, OrderRequest orderRequest) throws JSONException {
        String strM36555e = C17060n0.m36555e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("order_type", "MultiTPSL");
        jSONObject.put("is_success", z11);
        if (str == null) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        jSONObject.put("trade_pair", C27041f.m66668h(orderRequest.getSymbol()));
        jSONObject.put("trade_type", C27041f.m66668h(orderRequest.getSideType()));
        jSONObject.put("platform_type", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jSONObject.put("positionMode", m36233J0(orderRequest.getPositionSide()));
        C43852m.m96605q(strM36555e, jSONObject);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m36277L0(boolean z11, String str, boolean z12, String str2, String str3) throws JSONException {
        String str4;
        String strM36555e = C17060n0.m36555e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("order_type", "PosiTPSL");
        jSONObject.put("is_success", z11);
        if (str == null) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        jSONObject.put("trade_pair", str2);
        if (z12) {
            str4 = "buy";
        } else {
            str4 = "sell";
        }
        jSONObject.put("trade_type", str4);
        jSONObject.put("platform_type", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jSONObject.put("positionMode", m36233J0(str3));
        C43852m.m96605q(strM36555e, jSONObject);
    }
}
