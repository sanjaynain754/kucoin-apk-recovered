package com.kubi.utaspotlib.repo.order.handler;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.order.data.ResponseItemEntity;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mr.C42597a;
import n70.InterfaceC42773c;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p199dd.C36661a;
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

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HistoryDelegationPageHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/HistoryDelegationPageHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Lcom/kubi/core/base/order/data/HistoryOrderList$Request;", "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "mapStatus", "", "status", "getUiItemEntity", "responseItem", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryDelegationPageHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDelegationPageHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/HistoryDelegationPageHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1#2:93\n1563#3:94\n1634#3,3:95\n*S KotlinDebug\n*F\n+ 1 HistoryDelegationPageHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/HistoryDelegationPageHandler\n*L\n55#1:94\n55#1:95,3\n*E\n"})
public final class HistoryDelegationPageHandler implements InterfaceC46463e<Request, ResponseItemEntity, HistoryOrdersUiData$ItemEntity> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54233a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54234b;

    public HistoryDelegationPageHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54233a = tradeAccountType;
        this.f54234b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryDelegationPageHandler.m66344o();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final BasePageEntity m66339h(PageData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BasePageEntity basePageEntity = new BasePageEntity();
        basePageEntity.setItems(it.m102503a());
        basePageEntity.setHasNext(it.getIsHasNext());
        basePageEntity.setTotalNum(it.getTotalCount());
        return basePageEntity;
    }

    /* JADX INFO: renamed from: i */
    public static final BasePageEntity m66340i(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: j */
    public static final PageData m66341j(HistoryDelegationPageHandler historyDelegationPageHandler, Response it) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(it, "it");
        List<ResponseItemEntity> items = it.getItems();
        if (items != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                listEmptyList.add(historyDelegationPageHandler.m66346l((ResponseItemEntity) it2.next()));
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

    /* JADX INFO: renamed from: k */
    public static final PageData m66342k(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (PageData) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC42773c m66343m() {
        return (InterfaceC42773c) this.f54234b.getValue();
    }

    @Override // p793yc.InterfaceC46463e
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> mo66265a(@NotNull Request req) {
        Intrinsics.checkNotNullParameter(req, "req");
        InterfaceC42773c interfaceC42773cM66343m = m66343m();
        String tradeType = req.getTradeType();
        String symbol = req.getSymbol();
        String str = symbol.length() == 0 ? null : symbol;
        String upperCase = req.getSide().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() == 0) {
            upperCase = null;
        }
        String orderDisplayType = req.getOrderDisplayType();
        if (orderDisplayType.length() == 0) {
            orderDisplayType = null;
        }
        String strM66347n = m66347n(req.getStatus());
        if (strM66347n == null || strM66347n.length() == 0) {
            strM66347n = null;
        }
        String startAt = req.getStartAt();
        if (startAt.length() == 0) {
            startAt = null;
        }
        String endAt = req.getEndAt();
        if (endAt.length() == 0) {
            endAt = null;
        }
        Observable<R> observableCompose = interfaceC42773cM66343m.m93713f(tradeType, str, upperCase, orderDisplayType, strM66347n, startAt, endAt, req.getCurrentPage(), req.getPageSize()).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDelegationPageHandler.m66341j(this.f54230b, (Response) obj);
            }
        };
        Observable map = observableCompose.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return HistoryDelegationPageHandler.m66342k(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDelegationPageHandler.m66339h((PageData) obj);
            }
        };
        Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> observableObserveOn = map.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return HistoryDelegationPageHandler.m66340i(function2, obj);
            }
        }).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public HistoryOrdersUiData$ItemEntity m66346l(@NotNull ResponseItemEntity responseItem) {
        Intrinsics.checkNotNullParameter(responseItem, "responseItem");
        return C36661a.m82027b(responseItem);
    }

    /* JADX INFO: renamed from: n */
    public final String m66347n(String str) {
        if (StringsKt.equals("DONE", str, true)) {
            return "3";
        }
        if (StringsKt.equals("TRIGGERED", str, true)) {
            return "1";
        }
        if (StringsKt.equals(OrderDetailInfo.ORDER_STATUS_CANCELED, str, true)) {
            return "5,6";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC42773c m66344o() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }
}
