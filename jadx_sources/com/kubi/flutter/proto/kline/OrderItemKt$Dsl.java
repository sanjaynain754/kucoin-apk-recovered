package com.kubi.flutter.proto.kline;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderItemKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u00101\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010?\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020AJ\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010#\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR$\u0010'\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00103\u001a\u0002022\u0006\u0010\b\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010:\u001a\u0002092\u0006\u0010\b\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0011\u0010H\u001a\u00020I8G¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/OrderItemKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/OrderItem$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/OrderItem$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/OrderItem;", "value", "", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "clearId", "", "", "time", "getTime", "()J", "setTime", "(J)V", "clearTime", "", "amount", "getAmount", "()D", "setAmount", "(D)V", "clearAmount", FirebaseAnalytics.Param.PRICE, "getPrice", "setPrice", "clearPrice", "symbol", "getSymbol", "setSymbol", "clearSymbol", "showSymbol", "getShowSymbol", "setShowSymbol", "clearShowSymbol", "Lcom/kubi/flutter/proto/kline/OrderItem$OrderSide;", "side", "getSide", "()Lcom/kubi/flutter/proto/kline/OrderItem$OrderSide;", "setSide", "(Lcom/kubi/flutter/proto/kline/OrderItem$OrderSide;)V", "clearSide", "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "bizType", "getBizType", "()Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "setBizType", "(Lcom/kubi/flutter/proto/kline/OrderItem$BizType;)V", "clearBizType", "Lcom/kubi/flutter/proto/kline/OrderItem$SpotPriceType;", "spotPriceType", "getSpotPriceType", "()Lcom/kubi/flutter/proto/kline/OrderItem$SpotPriceType;", "setSpotPriceType", "(Lcom/kubi/flutter/proto/kline/OrderItem$SpotPriceType;)V", "clearSpotPriceType", "hasSpotPriceType", "", "needJump", "getNeedJump", "()Z", "setNeedJump", "(Z)V", "clearNeedJump", "priceTypeCase", "Lcom/kubi/flutter/proto/kline/OrderItem$PriceTypeCase;", "getPriceTypeCase", "()Lcom/kubi/flutter/proto/kline/OrderItem$PriceTypeCase;", "clearPriceType", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderItemKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22148b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final OrderItem.C12687b f22149a;

    /* JADX INFO: compiled from: OrderItemKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/OrderItemKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/OrderItemKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/OrderItem$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ OrderItemKt$Dsl _create(OrderItem.C12687b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new OrderItemKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ OrderItemKt$Dsl(OrderItem.C12687b c12687b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12687b);
    }

    public OrderItemKt$Dsl(OrderItem.C12687b c12687b) {
        this.f22149a = c12687b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OrderItem m23974a() {
        OrderItem orderItemBuild = this.f22149a.build();
        Intrinsics.checkNotNullExpressionValue(orderItemBuild, "build(...)");
        return orderItemBuild;
    }

    @JvmName(name = "setAmount")
    /* JADX INFO: renamed from: b */
    public final void m23975b(double d11) {
        this.f22149a.m23967a(d11);
    }

    @JvmName(name = "setBizType")
    /* JADX INFO: renamed from: c */
    public final void m23976c(@NotNull OrderItem.BizType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22149a.m23968b(value);
    }

    @JvmName(name = "setNeedJump")
    /* JADX INFO: renamed from: d */
    public final void m23977d(boolean z11) {
        this.f22149a.m23969c(z11);
    }

    @JvmName(name = "setPrice")
    /* JADX INFO: renamed from: e */
    public final void m23978e(double d11) {
        this.f22149a.m23970d(d11);
    }

    @JvmName(name = "setSide")
    /* JADX INFO: renamed from: f */
    public final void m23979f(@NotNull OrderItem.OrderSide value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22149a.m23971e(value);
    }

    @JvmName(name = "setSymbol")
    /* JADX INFO: renamed from: g */
    public final void m23980g(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22149a.m23972f(value);
    }

    @JvmName(name = "setTime")
    /* JADX INFO: renamed from: h */
    public final void m23981h(long j11) {
        this.f22149a.m23973g(j11);
    }
}
