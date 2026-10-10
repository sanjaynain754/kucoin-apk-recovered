package com.kubi.utaspotlib.repo.order.handler;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.order.data.TradeSide;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import mr.C42597a;
import n70.InterfaceC42773c;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p793yc.InterfaceC46463e;
import p793yc.PageData;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ActiveOrdersPagingHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/ActiveOrdersPagingHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Request;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "getUiItemEntity", "responseItem", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nActiveOrdersPagingHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveOrdersPagingHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/ActiveOrdersPagingHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class ActiveOrdersPagingHandler implements InterfaceC46463e<Request, OrderItem, OrderItem> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54216a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54217b;

    public ActiveOrdersPagingHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54216a = tradeAccountType;
        this.f54217b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActiveOrdersPagingHandler.m66302m();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final PageData m66298h(Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<OrderItem> items = it.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        List<OrderItem> list = items;
        Integer currentPage = it.getCurrentPage();
        int iIntValue = currentPage != null ? currentPage.intValue() : 0;
        boolean z11 = C27039d.m66650j(it.getTotalPage()) > C27039d.m66650j(it.getCurrentPage());
        Integer totalPage = it.getTotalPage();
        int iIntValue2 = totalPage != null ? totalPage.intValue() : 0;
        Integer totalNum = it.getTotalNum();
        return new PageData(list, iIntValue, z11, totalNum != null ? totalNum.intValue() : 0, iIntValue2);
    }

    /* JADX INFO: renamed from: i */
    public static final PageData m66299i(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (PageData) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: j */
    public static final BasePageEntity m66300j(PageData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BasePageEntity basePageEntity = new BasePageEntity();
        basePageEntity.setItems(it.m102503a());
        basePageEntity.setHasNext(it.getIsHasNext());
        basePageEntity.setTotalNum(it.getTotalCount());
        return basePageEntity;
    }

    /* JADX INFO: renamed from: k */
    public static final BasePageEntity m66301k(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    @Override // p793yc.InterfaceC46463e
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Observable<BasePageEntity<OrderItem>> mo66265a(@NotNull Request req) {
        String str;
        String param;
        String param2;
        Intrinsics.checkNotNullParameter(req, "req");
        String str2 = Intrinsics.areEqual(this.f54216a, TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT";
        InterfaceC42773c interfaceC42773cM66304l = m66304l();
        String symbol = req.getSymbol();
        String str3 = null;
        if (symbol == null || symbol.length() == 0) {
            symbol = null;
        }
        TradeSide side = req.getSide();
        if (side == null || (param2 = side.getParam()) == null) {
            str = null;
        } else {
            if (param2.length() == 0) {
                param2 = null;
            }
            str = param2;
        }
        OrderLevelType orderFilter = req.getOrderFilter();
        if (orderFilter != null && (param = orderFilter.getParam()) != null && param.length() != 0) {
            str3 = param;
        }
        Observable<R> observableCompose = interfaceC42773cM66304l.m93714g(str2, symbol, str3, str, req.getCurrentPage(), req.getPageSize()).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActiveOrdersPagingHandler.m66298h((Response) obj);
            }
        };
        Observable map = observableCompose.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ActiveOrdersPagingHandler.m66299i(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActiveOrdersPagingHandler.m66300j((PageData) obj);
            }
        };
        Observable<BasePageEntity<OrderItem>> observableObserveOn = map.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.j
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ActiveOrdersPagingHandler.m66301k(function2, obj);
            }
        }).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC42773c m66304l() {
        return (InterfaceC42773c) this.f54217b.getValue();
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC42773c m66302m() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }
}
