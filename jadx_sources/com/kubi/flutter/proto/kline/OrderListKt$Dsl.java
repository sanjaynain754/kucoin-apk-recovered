package com.kubi.flutter.proto.kline;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderListKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J%\u0010\u0017\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0007¢\u0006\u0002\b\u0018J&\u0010\u0019\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0087\n¢\u0006\u0002\b\u001aJ+\u0010\u001b\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0007¢\u0006\u0002\b\u001eJ,\u0010\u0019\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0087\n¢\u0006\u0002\b\u001fJ.\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0013H\u0087\u0002¢\u0006\u0002\b#J\u001d\u0010$\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007¢\u0006\u0002\b%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/OrderList$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/OrderList$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/OrderList;", "value", "Lcom/kubi/flutter/proto/kline/OrderList$OrderType;", "orderType", "getOrderType", "()Lcom/kubi/flutter/proto/kline/OrderList$OrderType;", "setOrderType", "(Lcom/kubi/flutter/proto/kline/OrderList$OrderType;)V", "clearOrderType", "", FirebaseAnalytics.Param.ITEMS, "Lcom/google/protobuf/kotlin/DslList;", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl$ItemsProxy;", "getItems", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addItems", "plusAssign", "plusAssignItems", "addAll", "values", "", "addAllItems", "plusAssignAllItems", "set", "index", "", "setItems", "clear", "clearItems", "Companion", "ItemsProxy", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderListKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22154b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final OrderList.C12691b f22155a;

    /* JADX INFO: compiled from: OrderListKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/OrderList$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ OrderListKt$Dsl _create(OrderList.C12691b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new OrderListKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ OrderListKt$Dsl(OrderList.C12691b c12691b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12691b);
    }

    public OrderListKt$Dsl(OrderList.C12691b c12691b) {
        this.f22155a = c12691b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OrderList m23987a() {
        OrderList orderListBuild = this.f22155a.build();
        Intrinsics.checkNotNullExpressionValue(orderListBuild, "build(...)");
        return orderListBuild;
    }

    @JvmName(name = "addAllItems")
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m23988b(DslList dslList, Iterable values) {
        Intrinsics.checkNotNullParameter(dslList, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f22155a.m23984a(values);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DslList m23989c() {
        List<OrderItem> listM23985b = this.f22155a.m23985b();
        Intrinsics.checkNotNullExpressionValue(listM23985b, "getItemsList(...)");
        return new DslList(listM23985b);
    }

    @JvmName(name = "setOrderType")
    /* JADX INFO: renamed from: d */
    public final void m23990d(@NotNull OrderList.OrderType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22155a.m23986c(value);
    }
}
