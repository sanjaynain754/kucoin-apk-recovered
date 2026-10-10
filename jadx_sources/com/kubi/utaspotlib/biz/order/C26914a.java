package com.kubi.utaspotlib.biz.order;

import com.google.gson.reflect.TypeToken;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utaspotlib.api.data.PreCalRiskRatioData;
import com.kubi.utils.C27099x;
import com.kubi.utils.storage.StorageType;
import io.reactivex.Observable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import n70.InterfaceC42773c;
import ne.InterfaceC42808a;
import ne.LimitTradeInputData;
import ne.MarketTradeInputData;
import ne.SegmentTradeInputData;
import org.jetbrains.annotations.NotNull;
import p309hd.InterfaceC38169a;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.a */
/* JADX INFO: compiled from: PreRiskRatioTipHelper.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u001a\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0017\u001a\u0012\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019*\u00020\u001b\u001a\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a\u0013\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a\u0014\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019*\u00020\u001eH\u0002\u001a\u0014\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019*\u00020#H\u0002\u001a\u0014\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019*\u00020%H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"JSAPI_STORAGE_DEFAULT_CATEGORY", "", "STORAGE_VALUE_ENCODED", "STORAGE_VALUE_ENCODED_KEY", "STORAGE_VALUE_TYPE", "STORAGE_VALUE_DATA", "STORAGE_VALUE_TYPE_BOOLEAN", "NEED_SHOW_PRE_RISK_SUBMIT_CONFIRM", "NEED_SHOW_PRE_RISK_SUBMIT_CONFIRM_STORAGE_ID", "Lcom/kubi/utils/storage/StorageId;", "getNEED_SHOW_PRE_RISK_SUBMIT_CONFIRM_STORAGE_ID", "()Lcom/kubi/utils/storage/StorageId;", "storageValueMapType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "isNeedShowPreRiskSubmitConfirm", "", "defaultValue", "saveNeedShowPreRiskSubmitConfirm", "", "value", "encodeJsBridgeBoolean", "decodeJsBridgeBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getPreRiskRatioFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/utaspotlib/api/data/PreCalRiskRatioData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "getMarketPreSellPrice", "", "Lcom/kubi/core/spot/business/holder/intercept/data/MarketTradeInputData;", "(Lcom/kubi/core/spot/business/holder/intercept/data/MarketTradeInputData;)Ljava/lang/Double;", "getMarketPreBuyPrice", "getMarketPreRiskRatioFlow", "getLimitPreRiskRatioFlow", "Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "getSegmentPreRiskRatioFlow", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPreRiskRatioTipHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreRiskRatioTipHelper.kt\ncom/kubi/utaspotlib/biz/order/PreRiskRatioTipHelperKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,220:1\n32#2:221\n23#2,2:222\n*S KotlinDebug\n*F\n+ 1 PreRiskRatioTipHelper.kt\ncom/kubi/utaspotlib/biz/order/PreRiskRatioTipHelperKt\n*L\n49#1:221\n54#1:222,2\n*E\n"})
public final class C26914a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StorageId<String> f54165a = new StorageId<>("kc_jsapi_storage", "kc.uta.trade.second.check", StorageType.Shared, false, 8, null);

    /* JADX INFO: renamed from: b */
    public static final Type f54166b = new a().getType();

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.a$a */
    /* JADX INFO: compiled from: PreRiskRatioTipHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/utaspotlib/biz/order/PreRiskRatioTipHelperKt$storageValueMapType$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<Map<String, ? extends Object>> {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m66168j(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m66167i(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final InterfaceC41634e<PreCalRiskRatioData> m66165g(@NotNull InterfaceC42808a interfaceC42808a) {
        Intrinsics.checkNotNullParameter(interfaceC42808a, "<this>");
        if (interfaceC42808a instanceof MarketTradeInputData) {
            return m66163e((MarketTradeInputData) interfaceC42808a);
        }
        if (interfaceC42808a instanceof LimitTradeInputData) {
            return m66161c((LimitTradeInputData) interfaceC42808a);
        }
        return interfaceC42808a instanceof SegmentTradeInputData ? m66166h((SegmentTradeInputData) interfaceC42808a) : C41636g.m90879C();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m66167i(boolean z11) {
        Boolean boolM66159a = m66159a(C46392a.m102326h(f54165a, ""));
        return boolM66159a != null ? boolM66159a.booleanValue() : z11;
    }

    /* JADX INFO: renamed from: k */
    public static final void m66169k(boolean z11) {
        C46392a.m102333p(f54165a, m66160b(z11));
    }

    /* JADX INFO: renamed from: a */
    public static final Boolean m66159a(String str) {
        Object objM103844constructorimpl;
        Boolean bool;
        Object obj = null;
        if (StringsKt.isBlank(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj2 = ((Map) C27099x.m66915e().fromJson(str, f54166b)).get("value");
            if (obj2 instanceof Boolean) {
                bool = (Boolean) obj2;
            } else {
                bool = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(bool);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
            obj = objM103844constructorimpl;
        }
        return (Boolean) obj;
    }

    /* JADX INFO: renamed from: b */
    public static final String m66160b(boolean z11) {
        return C27099x.m66919i(MapsKt.mapOf(TuplesKt.m90091to("value", Boolean.valueOf(z11))), false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC41634e<PreCalRiskRatioData> m66161c(LimitTradeInputData limitTradeInputData) {
        String str;
        String str2;
        if (Intrinsics.areEqual(limitTradeInputData.mo93836b(), InterfaceC38169a.a.f85864a)) {
            str = "BUY";
        } else {
            str = "SELL";
        }
        String str3 = str;
        String strM93851o = limitTradeInputData.m93851o();
        if (strM93851o == null) {
            strM93851o = "";
        }
        String str4 = strM93851o;
        if (limitTradeInputData.getDiffTradeImp().mo23219f()) {
            str2 = "MARGIN";
        } else {
            str2 = "SPOT";
        }
        Observable observableCompose = InterfaceC42773c.m93709d((InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class), str4, limitTradeInputData.getInputLimitPrice().toPlainString(), limitTradeInputData.getEtNumber().toPlainString(), null, str3, "LIMIT", str2, 8, null).compose(C24217a1.m58390n());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return RxConvertKt.m91205b(observableCompose);
    }

    /* JADX INFO: renamed from: d */
    public static final Double m66162d(MarketTradeInputData marketTradeInputData) {
        double bestAsk = marketTradeInputData.getParentBehavior().getF20635f0().getBestAsk();
        if (bestAsk == 0.0d) {
            double price = marketTradeInputData.getParentBehavior().getF20635f0().getPrice();
            if (price == 0.0d) {
                return null;
            }
            return Double.valueOf(price);
        }
        return Double.valueOf(bestAsk);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC41634e<PreCalRiskRatioData> m66163e(MarketTradeInputData marketTradeInputData) {
        String str;
        BigDecimal bigDecimal;
        BigDecimal inputNumber;
        String str2;
        InterfaceC38169a interfaceC38169aMo93836b = marketTradeInputData.mo93836b();
        InterfaceC38169a.a aVar = InterfaceC38169a.a.f85864a;
        if (Intrinsics.areEqual(interfaceC38169aMo93836b, aVar)) {
            str = "BUY";
        } else {
            str = "SELL";
        }
        String str3 = str;
        String strM93864n = marketTradeInputData.m93864n();
        if (strM93864n == null) {
            strM93864n = "";
        }
        String str4 = strM93864n;
        if (Intrinsics.areEqual(marketTradeInputData.mo93836b(), aVar)) {
            Double dM66162d = m66162d(marketTradeInputData);
            if (dM66162d != null) {
                bigDecimal = new BigDecimal(String.valueOf(dM66162d.doubleValue()));
                if (C41014a.m89919D(bigDecimal)) {
                    inputNumber = BigDecimal.ZERO;
                } else {
                    inputNumber = marketTradeInputData.getInputNumber().divide(bigDecimal, 8, RoundingMode.DOWN);
                }
                Intrinsics.checkNotNull(inputNumber);
            } else {
                return C41636g.m90879C();
            }
        } else {
            Double dM66164f = m66164f(marketTradeInputData);
            if (dM66164f != null) {
                bigDecimal = new BigDecimal(String.valueOf(dM66164f.doubleValue()));
                inputNumber = marketTradeInputData.getInputNumber();
            } else {
                return C41636g.m90879C();
            }
        }
        if (marketTradeInputData.getDiffTradeImp().mo23219f()) {
            str2 = "MARGIN";
        } else {
            str2 = "SPOT";
        }
        String str5 = str2;
        if (Intrinsics.areEqual(marketTradeInputData.mo93836b(), aVar)) {
            Observable observableCompose = InterfaceC42773c.m93709d((InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class), str4, bigDecimal.toPlainString(), null, marketTradeInputData.getInputNumber().toPlainString(), str3, "MARKET", str5, 4, null).compose(C24217a1.m58390n());
            Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
            return RxConvertKt.m91205b(observableCompose);
        }
        Observable observableCompose2 = InterfaceC42773c.m93709d((InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class), str4, bigDecimal.toPlainString(), inputNumber.toPlainString(), null, str3, "MARKET", str5, 8, null).compose(C24217a1.m58390n());
        Intrinsics.checkNotNullExpressionValue(observableCompose2, "compose(...)");
        return RxConvertKt.m91205b(observableCompose2);
    }

    /* JADX INFO: renamed from: f */
    public static final Double m66164f(MarketTradeInputData marketTradeInputData) {
        double bestBid = marketTradeInputData.getParentBehavior().getF20635f0().getBestBid();
        if (bestBid == 0.0d) {
            double price = marketTradeInputData.getParentBehavior().getF20635f0().getPrice();
            if (price == 0.0d) {
                return null;
            }
            return Double.valueOf(price);
        }
        return Double.valueOf(bestBid);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC41634e<PreCalRiskRatioData> m66166h(SegmentTradeInputData segmentTradeInputData) {
        String str;
        String str2;
        if (Intrinsics.areEqual(segmentTradeInputData.mo93836b(), InterfaceC38169a.a.f85864a)) {
            str = "BUY";
        } else {
            str = "SELL";
        }
        String str3 = str;
        String strM93877o = segmentTradeInputData.m93877o();
        if (strM93877o == null) {
            strM93877o = "";
        }
        String str4 = strM93877o;
        if (segmentTradeInputData.getDiffTradeImp().mo23219f()) {
            str2 = "MARGIN";
        } else {
            str2 = "SPOT";
        }
        Observable observableCompose = InterfaceC42773c.m93709d((InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class), str4, segmentTradeInputData.getAvgPrice().toPlainString(), segmentTradeInputData.getTotalQty().toPlainString(), null, str3, "LIMIT", str2, 8, null).compose(C24217a1.m58390n());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return RxConvertKt.m91205b(observableCompose);
    }
}
