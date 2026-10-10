package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.OrderList;
import com.kubi.flutter.proto.kline.OrderListKt$Dsl;
import com.kubi.utils.C27100x0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineDataSessionCache.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineDataSessionCache;", "", "<init>", "()V", "bsDataMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/flutter/proto/kline/OrderList;", "mergeBSCacheData", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "orderList", "release", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineDataSessionCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSessionCache.kt\ncom/kubi/flutter/widget/kline/KLineDataSessionCache\n+ 2 OrderListKt.kt\ncom/kubi/flutter/proto/kline/OrderListKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n8#2:45\n1#3:46\n1#3:47\n*S KotlinDebug\n*F\n+ 1 KLineDataSessionCache.kt\ncom/kubi/flutter/widget/kline/KLineDataSessionCache\n*L\n31#1:45\n31#1:46\n*E\n"})
public final class KLineDataSessionCache {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KLineDataSessionCache f22478a = new KLineDataSessionCache();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<String, OrderList> f22479b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    public static final Unit m24358d() {
        f22479b.clear();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final OrderList m24359b(@NotNull IKLineDataInteractor.OrderParam param, @NotNull OrderList orderList) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        if (!StringsKt.equals(param.getTradeType(), "TRADE", true)) {
            return orderList;
        }
        OrderList.OrderType orderType = orderList.getOrderType();
        OrderList.OrderType orderType2 = OrderList.OrderType.ORDER_HISTORY;
        if (orderType != orderType2) {
            return orderList;
        }
        String str = param.getSymbol() + '-' + param.getType().getType();
        ConcurrentHashMap<String, OrderList> concurrentHashMap = f22479b;
        OrderList orderList2 = concurrentHashMap.get(str);
        List<OrderItem> itemsList = orderList2 != null ? orderList2.getItemsList() : null;
        if (itemsList == null) {
            itemsList = CollectionsKt.emptyList();
        }
        List<OrderItem> itemsList2 = orderList.getItemsList();
        if (itemsList2 == null) {
            itemsList2 = CollectionsKt.emptyList();
        }
        Set setUnion = CollectionsKt.union(itemsList, itemsList2);
        OrderListKt$Dsl.Companion companion = OrderListKt$Dsl.f22154b;
        OrderList.C12691b c12691bNewBuilder = OrderList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12691bNewBuilder, "newBuilder(...)");
        OrderListKt$Dsl orderListKt$Dsl_create = companion._create(c12691bNewBuilder);
        orderListKt$Dsl_create.m23988b(orderListKt$Dsl_create.m23989c(), setUnion);
        orderListKt$Dsl_create.m23990d(orderType2);
        OrderList orderListM23987a = orderListKt$Dsl_create.m23987a();
        concurrentHashMap.put(str, orderListM23987a);
        return orderListM23987a;
    }

    /* JADX INFO: renamed from: c */
    public final void m24360c() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.flutter.widget.kline.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KLineDataSessionCache.m24358d();
            }
        });
    }
}
