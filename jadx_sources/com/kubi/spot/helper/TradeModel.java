package com.kubi.spot.helper;

import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.CheckCodeParamsEntity;
import com.kubi.data.entity.CheckCodeResultEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.business.businessTrack.DurationTrackManager;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.entity.NFTEntity;
import com.kubi.spot.entity.OrderResultEntity;
import com.kubi.spot.service.SpotDepend;
import com.kubi.utils.C27052h0;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.helper.p0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eJ(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010!\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\"0\u000bJ$\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'J\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\u000bJ\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000b2\u0006\u0010+\u001a\u00020\u000eJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ4\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020.0\u001dj\b\u0012\u0004\u0012\u00020.`/0\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u00061"}, m90084d2 = {"Lcom/kubi/spot/helper/TradeModel;", "", "<init>", "()V", "marketApi", "Lcom/kubi/spot/api/MarketApi;", "getMarketApi", "()Lcom/kubi/spot/api/MarketApi;", "setMarketApi", "(Lcom/kubi/spot/api/MarketApi;)V", "getOrderBookCenter", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "symbol", "", "requestOrder", "Lcom/kubi/spot/entity/OrderResultEntity;", "requestEntity", "", "tradeTypeRequestOrder", "Lcom/kubi/spot/helper/ITradeTypeRequestOrder;", "checkTradePwd", "bizType", "key", "it", "requestOrderWithoutCheck", "marketOderParams", "addFavorSymbol", "getSymbolsInfo", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolsEntity", "Lcom/kubi/data/entity/TradeItemBean;", "getAllDelegations", "Lkotlin/Pair;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/spot/entity/DelegationEntity;", "getDelegationsByType", "isStop", "", "getHistoryDelegationsByType", "getNftInfo", "Lcom/kubi/spot/entity/NFTEntity;", "symbolName", "getTradeTips", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "Lkotlin/collections/ArrayList;", "value", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeModel {

    /* JADX INFO: renamed from: a */
    @NotNull
    public InterfaceC37053d f50606a;

    /* JADX INFO: renamed from: f */
    public static final Pair m61847f(BasePageEntity actives, BasePageEntity stops) {
        Intrinsics.checkNotNullParameter(actives, "actives");
        Intrinsics.checkNotNullParameter(stops, "stops");
        return new Pair(actives, stops);
    }

    /* JADX INFO: renamed from: g */
    public static final Pair m61848g(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Pair) function2.invoke(p11, p12);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Observable<Object> m61849c(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable<R> observableCompose = this.f50606a.addFavorSymbol(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Observable<ArrayList<CheckCodeResultEntity>> m61850d(@NotNull String bizType, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        CheckCodeParamsEntity checkCodeParamsEntity = new CheckCodeParamsEntity();
        checkCodeParamsEntity.setBizType(bizType);
        if (Intrinsics.areEqual(bizType, "EXCHANGE")) {
            HashMap<String, String> validations = checkCodeParamsEntity.getValidations();
            Intrinsics.checkNotNullExpressionValue(validations, "getValidations(...)");
            validations.put(key, C27052h0.m66729d(value, 2));
        } else {
            HashMap<String, String> validations2 = checkCodeParamsEntity.getValidations();
            Intrinsics.checkNotNullExpressionValue(validations2, "getValidations(...)");
            validations2.put(key, value);
        }
        Observable<ArrayList<CheckCodeResultEntity>> observableCompose = InterfaceC37053d.m82911J(this.f50606a, checkCodeParamsEntity, null, "verify-validation-code-trade-spot", 2, null).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Observable<Pair<BasePageEntity<DelegationEntity>, BasePageEntity<DelegationEntity>>> m61851e() {
        if (!SpotDepend.f51244a.m63036f().c()) {
            Observable<Pair<BasePageEntity<DelegationEntity>, BasePageEntity<DelegationEntity>>> observableJust = Observable.just(new Pair(null, null));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("page", "1");
        map.put("size", "10");
        map.put("tradeType", "TRADE");
        HashMap map2 = new HashMap(map);
        map2.put("status", "active");
        Observable observableCompose = InterfaceC37053d.m82914P(this.f50606a, map2, false, false, 6, null).compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
        Observable observableCompose2 = this.f50606a.m82945m(map).compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
        final Function2 function2 = new Function2() { // from class: com.kubi.spot.helper.n0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TradeModel.m61847f((BasePageEntity) obj, (BasePageEntity) obj2);
            }
        };
        Observable<Pair<BasePageEntity<DelegationEntity>, BasePageEntity<DelegationEntity>>> observableZip = Observable.zip(observableCompose, observableCompose2, new BiFunction() { // from class: com.kubi.spot.helper.o0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TradeModel.m61848g(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "zip(...)");
        return observableZip;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Observable<BasePageEntity<DelegationEntity>> m61852h(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!SpotDepend.f51244a.m63036f().c()) {
            Observable<BasePageEntity<DelegationEntity>> observableJust = Observable.just(new BasePageEntity());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("symbol", symbol);
        map.put("page", "1");
        map.put("size", "10");
        map.put("tradeType", "TRADE");
        HashMap map2 = new HashMap(map);
        map2.put("status", "active");
        if (z11) {
            Observable<BasePageEntity<DelegationEntity>> observableCompose = this.f50606a.m82945m(map).compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
            Intrinsics.checkNotNull(observableCompose);
            return observableCompose;
        }
        Observable<BasePageEntity<DelegationEntity>> observableCompose2 = InterfaceC37053d.m82914P(this.f50606a, map2, false, false, 6, null).compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
        Intrinsics.checkNotNull(observableCompose2);
        return observableCompose2;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Observable<BasePageEntity<DelegationEntity>> m61853i() {
        if (!SpotDepend.f51244a.m63036f().c()) {
            Observable<BasePageEntity<DelegationEntity>> observableJust = Observable.just(new BasePageEntity());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        HashMap map = new HashMap();
        map.put("page", "1");
        map.put("size", "10");
        map.put("tradeType", "TRADE");
        HashMap map2 = new HashMap(map);
        map2.put("status", "done");
        Observable<BasePageEntity<DelegationEntity>> observableCompose = InterfaceC37053d.m82914P(this.f50606a, map2, false, false, 6, null).compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC37053d getF50606a() {
        return this.f50606a;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Observable<NFTEntity> m61855k(@NotNull String symbolName) {
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        Observable observableCompose = this.f50606a.m82950r(symbolName).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Observable<OrderBookCenterEntity> m61856l(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable observableCompose = this.f50606a.m82939g(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Observable<ArrayList<TradeItemBean>> m61857m(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable observableCompose = this.f50606a.m82933a(symbol, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_main_tab_trade").compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Observable<ArrayList<SymbolInfoEntity>> m61858n(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable observableCompose = this.f50606a.m82935c(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final Observable<OrderResultEntity> m61859o(@NotNull Map<String, String> requestEntity, @NotNull ITradeTypeRequestOrder tradeTypeRequestOrder) {
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        Intrinsics.checkNotNullParameter(tradeTypeRequestOrder, "tradeTypeRequestOrder");
        C43841b.m96556c("click_submit_spot_order_without_pass", "click_start_btn", DurationTrackManager.f49767c.getInstance().getF49770b());
        String str = requestEntity.get("HEADER_FINGER_EVENT");
        requestEntity.remove("HEADER_FINGER_EVENT");
        return tradeTypeRequestOrder.m61814d(this.f50606a, requestEntity, str);
    }

    public TradeModel() {
        Object objCreate = C42597a.m93386b().create(InterfaceC37053d.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f50606a = (InterfaceC37053d) objCreate;
    }
}
