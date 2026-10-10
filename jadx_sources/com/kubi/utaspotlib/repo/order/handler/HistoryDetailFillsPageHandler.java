package com.kubi.utaspotlib.repo.order.handler;

import com.blankj.utilcode.util.C5298u;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.biz.order.detail.HistoryOrderFillsUiData;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HistoryDetailFillsPageHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/HistoryDetailFillsPageHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Request;", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$ResponseItemEntity;", "Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "getUiItemEntity", "responseItem", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryDetailFillsPageHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDetailFillsPageHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/HistoryDetailFillsPageHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1563#2:77\n1634#2,3:78\n*S KotlinDebug\n*F\n+ 1 HistoryDetailFillsPageHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/HistoryDetailFillsPageHandler\n*L\n59#1:77\n59#1:78,3\n*E\n"})
public final class HistoryDetailFillsPageHandler implements InterfaceC46463e<Request, ResponseItemEntity, HistoryOrderFillsUiData> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54201a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54202b;

    public HistoryDetailFillsPageHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54201a = tradeAccountType;
        this.f54202b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryDetailFillsPageHandler.m66264n();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final PageData m66259h(HistoryDetailFillsPageHandler historyDetailFillsPageHandler, Response it) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(it, "it");
        List<ResponseItemEntity> items = it.getItems();
        if (items != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                listEmptyList.add(historyDetailFillsPageHandler.m66267l((ResponseItemEntity) it2.next()));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        Integer currentPage = it.getCurrentPage();
        int iIntValue = currentPage != null ? currentPage.intValue() : 0;
        boolean z11 = C27039d.m66650j(it.getTotalPage()) > C27039d.m66650j(it.getCurrentPage());
        Integer totalPage = it.getTotalPage();
        int iIntValue2 = totalPage != null ? totalPage.intValue() : 0;
        Integer totalNum = it.getTotalNum();
        return new PageData(list, iIntValue, z11, totalNum != null ? totalNum.intValue() : 0, iIntValue2);
    }

    /* JADX INFO: renamed from: i */
    public static final PageData m66260i(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (PageData) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: j */
    public static final BasePageEntity m66261j(PageData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BasePageEntity basePageEntity = new BasePageEntity();
        basePageEntity.setItems(it.m102503a());
        basePageEntity.setHasNext(it.getIsHasNext());
        basePageEntity.setTotalNum(it.getTotalCount());
        return basePageEntity;
    }

    /* JADX INFO: renamed from: k */
    public static final BasePageEntity m66262k(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC42773c m66263m() {
        return (InterfaceC42773c) this.f54202b.getValue();
    }

    @Override // p793yc.InterfaceC46463e
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Observable<BasePageEntity<HistoryOrderFillsUiData>> mo66265a(@NotNull Request req) {
        Intrinsics.checkNotNullParameter(req, "req");
        C5298u.m6416i("tradeAccountType----->" + this.f54201a);
        Observable<R> observableCompose = m66263m().m93718k(Intrinsics.areEqual(this.f54201a, TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT", req.getSymbol(), req.getOrderId(), req.getCurrentPage(), req.getPageSize()).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDetailFillsPageHandler.m66259h(this.f54235b, (Response) obj);
            }
        };
        Observable map = observableCompose.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.a0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return HistoryDetailFillsPageHandler.m66260i(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDetailFillsPageHandler.m66261j((PageData) obj);
            }
        };
        Observable<BasePageEntity<HistoryOrderFillsUiData>> observableObserveOn = map.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.c0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return HistoryDetailFillsPageHandler.m66262k(function2, obj);
            }
        }).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public HistoryOrderFillsUiData m66267l(@NotNull ResponseItemEntity responseItem) {
        Intrinsics.checkNotNullParameter(responseItem, "responseItem");
        String price = responseItem.getPrice();
        BigDecimal bigDecimalOrNull = price != null ? StringsKt.toBigDecimalOrNull(price) : null;
        String side = responseItem.getSide();
        String size = responseItem.getSize();
        BigDecimal bigDecimalOrNull2 = size != null ? StringsKt.toBigDecimalOrNull(size) : null;
        Long executionTime = responseItem.getExecutionTime();
        String fee = responseItem.getFee();
        return new HistoryOrderFillsUiData(bigDecimalOrNull, side, bigDecimalOrNull2, executionTime, fee != null ? StringsKt.toBigDecimalOrNull(fee) : null, responseItem.getTax(), responseItem.getTaxRates(), responseItem.getTaxCurrency(), responseItem.getFeeCurrency(), responseItem.getForceTaker(), responseItem.getLiquidityRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC42773c m66264n() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }
}
