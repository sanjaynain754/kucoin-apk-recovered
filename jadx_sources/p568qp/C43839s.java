package p568qp;

import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.entity.OrderResultEntity;
import com.kubi.spot.helper.ITradeTypeRequestOrder;
import com.kubi.utils.extensions.C27039d;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p768xo.InterfaceC46307h;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qp.s */
/* JADX INFO: compiled from: MarginTradeModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fJ(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 0\t2\u0006\u0010\"\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/margin/trade/helper/MarginTradeModel;", "", "<init>", "()V", "marketApi", "Lcom/kubi/spot/api/MarketApi;", "marginMarketApi", "Lcom/kubi/margin/api/MarketApi;", "getOrderBookCenter", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "symbol", "", "requestOrder", "Lcom/kubi/spot/entity/OrderResultEntity;", "requestEntity", "", "tradeTypeRequestOrder", "Lcom/kubi/spot/helper/ITradeTypeRequestOrder;", "checkTradePwd", "bizType", "key", "it", "requestOrderWithoutCheck", "marketOderParams", "addFavorSymbol", "getSymbolsInfo", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolsEntity", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "fetchDelegationCount", "Lkotlin/Pair;", "", "tradeType", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginTradeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginTradeModel.kt\ncom/kubi/margin/trade/helper/MarginTradeModel\n+ 2 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,135:1\n46#2,14:136\n*S KotlinDebug\n*F\n+ 1 MarginTradeModel.kt\ncom/kubi/margin/trade/helper/MarginTradeModel\n*L\n88#1:136,14\n*E\n"})
public final class C43839s {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC37053d f96907a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC46307h f96908b;

    /* JADX INFO: renamed from: e */
    public static final Pair m96539e(HashMap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Pair(Integer.valueOf(C27039d.m66650j((Integer) it.get("activeOrderCount"))), Integer.valueOf(C27039d.m66650j((Integer) it.get("advancedOrderCount"))));
    }

    /* JADX INFO: renamed from: f */
    public static final Pair m96540f(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Pair) function1.invoke(p11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Observable<Object> m96541c(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable<R> observableCompose = this.f96907a.addFavorSymbol(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Observable<Pair<Integer, Integer>> m96542d(int i11) {
        if (!C42579a.f94275a.m93347g().c()) {
            Observable<Pair<Integer, Integer>> observableJust = Observable.just(new Pair(0, 0));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        Observable observableCompose = this.f96908b.m102133q(i11 == 2 ? "MARGIN_ISOLATED_TRADE" : "MARGIN_TRADE").compose(C24217a1.m58389m()).compose(C24217a1.m58387k());
        final Function1 function1 = new Function1() { // from class: qp.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43839s.m96539e((HashMap) obj);
            }
        };
        Observable<Pair<Integer, Integer>> map = observableCompose.map(new Function() { // from class: qp.r
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43839s.m96540f(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Observable<OrderBookCenterEntity> m96543g(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable observableCompose = this.f96907a.m82939g(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Observable<MarketListEntityItem> m96544h(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable<MarketListEntityItem> observableCompose = InterfaceC37053d.m82910D(this.f96907a, symbol, null, 2, null).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Observable<ArrayList<SymbolInfoEntity>> m96545i(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable observableCompose = this.f96907a.m82935c(symbol).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Observable<OrderResultEntity> m96546j(@NotNull Map<String, String> requestEntity, @NotNull ITradeTypeRequestOrder tradeTypeRequestOrder) {
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        Intrinsics.checkNotNullParameter(tradeTypeRequestOrder, "tradeTypeRequestOrder");
        String str = requestEntity.get("HEADER_FINGER_EVENT");
        requestEntity.remove("HEADER_FINGER_EVENT");
        return tradeTypeRequestOrder.m61814d(this.f96907a, requestEntity, str);
    }

    public C43839s() {
        Object objCreate = C42597a.m93386b().create(InterfaceC37053d.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f96907a = (InterfaceC37053d) objCreate;
        Object objCreate2 = C42597a.m93386b().create(InterfaceC46307h.class);
        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
        this.f96908b = (InterfaceC46307h) objCreate2;
    }
}
