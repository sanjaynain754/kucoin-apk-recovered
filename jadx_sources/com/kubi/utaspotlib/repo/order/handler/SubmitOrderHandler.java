package com.kubi.utaspotlib.repo.order.handler;

import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.order.data.SegmentItem;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utaspotlib.repo.order.data.UtaOrderRequest;
import com.kubi.utaspotlib.repo.order.data.UtaOrderResponse;
import com.kubi.utaspotlib.repo.order.data.UtaScaledItem;
import com.kubi.utaspotlib.repo.order.data.UtaScaledOrderBody;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import mr.C42597a;
import n70.InterfaceC42773c;
import org.jetbrains.annotations.NotNull;
import p311hf.C38191i;
import p793yc.InterfaceC46461c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import u70.C45129a;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.handler.q0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SubmitOrderHandler.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/handler/SubmitOrderHandler;", "Lcom/kubi/core/base/arch/api/handler/RequestObserverHandler;", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "Lcom/kubi/core/base/order/data/MakeOrderData$Response;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Lcom/kubi/core/base/TradeAccountType;)V", "utaOrderApi", "Lcom/kubi/utaspotlib/api/UtaOrderApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/utaspotlib/api/UtaOrderApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "execute", "Lio/reactivex/Observable;", "req", "executeSegmentOrder", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Segment;", "executeNormalOrder", "getTradeType", "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubmitOrderHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitOrderHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/SubmitOrderHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1563#2:84\n1634#2,3:85\n*S KotlinDebug\n*F\n+ 1 SubmitOrderHandler.kt\ncom/kubi/utaspotlib/repo/order/handler/SubmitOrderHandler\n*L\n44#1:84\n44#1:85,3\n*E\n"})
public final class SubmitOrderHandler implements InterfaceC46461c<MakeOrderData$Request, Response> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeAccountType f54226a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f54227b;

    public SubmitOrderHandler(@NotNull TradeAccountType tradeAccountType) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        this.f54226a = tradeAccountType;
        this.f54227b = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.repo.order.handler.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitOrderHandler.m66314p();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Response m66310i(UtaOrderResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Response(it.getOrderId());
    }

    /* JADX INFO: renamed from: j */
    public static final Response m66311j(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Response) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: l */
    public static final Response m66312l(UtaOrderResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Response(it.getOrderId());
    }

    /* JADX INFO: renamed from: m */
    public static final Response m66313m(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Response) function1.invoke(p11);
    }

    @Override // p793yc.InterfaceC46461c
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Observable<Response> mo66315a(@NotNull MakeOrderData$Request req) {
        Intrinsics.checkNotNullParameter(req, "req");
        return req instanceof MakeOrderData$Request.Segment ? m66318k((MakeOrderData$Request.Segment) req) : m66317h(req);
    }

    /* JADX INFO: renamed from: n */
    public final String m66319n() {
        return Intrinsics.areEqual(this.f54226a, TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT";
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC42773c m66320o() {
        return (InterfaceC42773c) this.f54227b.getValue();
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC42773c m66314p() {
        return (InterfaceC42773c) C42597a.m93386b().create(InterfaceC42773c.class);
    }

    /* JADX INFO: renamed from: h */
    public final Observable<Response> m66317h(MakeOrderData$Request makeOrderData$Request) throws Throwable {
        Observable<BaseEntity<UtaOrderResponse>> observableM93711c;
        UtaOrderRequest utaOrderRequestM99755a = C45129a.m99755a(makeOrderData$Request);
        utaOrderRequestM99755a.setTradeType(m66319n());
        String xValidationToken = makeOrderData$Request.getXValidationToken();
        if (xValidationToken != null && xValidationToken.length() != 0) {
            observableM93711c = m66320o().m93712e(utaOrderRequestM99755a, makeOrderData$Request.getXValidationToken());
        } else {
            observableM93711c = m66320o().m93711c(utaOrderRequestM99755a);
        }
        Observable<R> observableCompose = observableM93711c.compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitOrderHandler.m66310i((UtaOrderResponse) obj);
            }
        };
        Observable<Response> map = observableCompose.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.n0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SubmitOrderHandler.m66311j(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: renamed from: k */
    public final Observable<Response> m66318k(MakeOrderData$Request.Segment segment) throws Throwable {
        Observable<BaseEntity<UtaOrderResponse>> observableM93717j;
        String strM66319n = m66319n();
        String symbol = segment.getSymbol();
        String side = segment.getSide();
        List<SegmentItem> items = segment.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (SegmentItem segmentItem : items) {
            arrayList.add(new UtaScaledItem(segmentItem.getPrice(), segmentItem.getSize()));
        }
        UtaScaledOrderBody utaScaledOrderBody = new UtaScaledOrderBody(null, symbol, strM66319n, side, arrayList, 1, null);
        String xValidationToken = segment.getXValidationToken();
        if (xValidationToken != null && xValidationToken.length() != 0) {
            observableM93717j = m66320o().m93716i(C38191i.f85893a.m86174g(), utaScaledOrderBody, segment.getXValidationToken());
        } else {
            observableM93717j = m66320o().m93717j(C38191i.f85893a.m86173f(), utaScaledOrderBody);
        }
        Observable<R> observableCompose = observableM93717j.compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.utaspotlib.repo.order.handler.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitOrderHandler.m66312l((UtaOrderResponse) obj);
            }
        };
        Observable<Response> map = observableCompose.map(new Function() { // from class: com.kubi.utaspotlib.repo.order.handler.p0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SubmitOrderHandler.m66313m(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
