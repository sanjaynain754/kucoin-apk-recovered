package com.kubi.core.base.order.uidata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryOrdersUiData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u000556789R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0006\u0082\u0001\u0005:;<=>ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006?À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData;", "Landroid/os/Parcelable;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "symbol", "getSymbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "side", "getSide", "time", "", "getTime", "()Ljava/lang/Long;", ViewProps.HIDDEN, "", "getHidden", "()Ljava/lang/Boolean;", "iceberg", "getIceberg", "averagePrice", "getAveragePrice", "dealSize", "getDealSize", "size", "getSize", "orderType", "getOrderType", "stp", "getStp", "funds", "getFunds", "filledFunds", "getFilledFunds", "sizeUnit", "getSizeUnit", "fee", "getFee", "feeCurrency", "getFeeCurrency", FirebaseAnalytics.Param.TAX, "getTax", "taxCurrency", "getTaxCurrency", "status", "getStatus", "cancelReason", "getCancelReason", "Limit", "StopLimit", "AdvancedLimit", "Market", "StopMarket", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface HistoryOrdersUiData$ItemEntity extends Parcelable {

    /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J¢\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010UJ\u0006\u0010V\u001a\u00020WJ\u0013\u0010X\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020WHÖ\u0001J\t\u0010\\\u001a\u00020\u0004HÖ\u0001J\u0016\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020WR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!¨\u0006b"}, m90084d2 = {"Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "timeInForce", "orderId", "symbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", ViewProps.HIDDEN, "", "iceberg", "side", "time", "", "averagePrice", "dealSize", "size", "orderType", "stp", "status", "funds", "filledFunds", "sizeUnit", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "cancelReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getTimeInForce", "getOrderId", "getSymbol", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIceberg", "getSide", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAveragePrice", "getDealSize", "getSize", "getOrderType", "getStp", "getStatus", "getFunds", "getFilledFunds", "getSizeUnit", "getFee", "getFeeCurrency", "getTax", "getTaxCurrency", "getCancelReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AdvancedLimit implements HistoryOrdersUiData$ItemEntity, Parcelable {

        @NotNull
        public static final Parcelable.Creator<AdvancedLimit> CREATOR = new C11624a();

        @Nullable
        private final String averagePrice;

        @Nullable
        private final String cancelReason;

        @Nullable
        private final String dealSize;

        @Nullable
        private final String fee;

        @Nullable
        private final String feeCurrency;

        @Nullable
        private final String filledFunds;

        @Nullable
        private final String funds;

        @Nullable
        private final Boolean hidden;

        @Nullable
        private final Boolean iceberg;

        @Nullable
        private final String orderId;

        @Nullable
        private final String orderType;

        @Nullable
        private final String price;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String sizeUnit;

        @Nullable
        private final String status;

        @Nullable
        private final String stp;

        @Nullable
        private final String symbol;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        @Nullable
        private final String tax;

        @Nullable
        private final String taxCurrency;

        @Nullable
        private final Long time;

        @Nullable
        private final String timeInForce;

        /* JADX INFO: renamed from: com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity$AdvancedLimit$a */
        /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11624a implements Parcelable.Creator<AdvancedLimit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AdvancedLimit createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Long lValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(AdvancedLimit.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    lValueOf = null;
                }
                String string5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new AdvancedLimit(string, string2, string3, string4, symbolInfoEntity, boolValueOf, boolValueOf2, string5, lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AdvancedLimit[] newArray(int i11) {
                return new AdvancedLimit[i11];
            }
        }

        public static /* synthetic */ AdvancedLimit copy$default(AdvancedLimit advancedLimit, String str, String str2, String str3, String str4, SymbolInfoEntity symbolInfoEntity, Boolean bool, Boolean bool2, String str5, Long l11, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i11, Object obj) {
            String str20;
            String str21;
            String str22 = (i11 & 1) != 0 ? advancedLimit.price : str;
            String str23 = (i11 & 2) != 0 ? advancedLimit.timeInForce : str2;
            String str24 = (i11 & 4) != 0 ? advancedLimit.orderId : str3;
            String str25 = (i11 & 8) != 0 ? advancedLimit.symbol : str4;
            SymbolInfoEntity symbolInfoEntity2 = (i11 & 16) != 0 ? advancedLimit.symbolInfo : symbolInfoEntity;
            Boolean bool3 = (i11 & 32) != 0 ? advancedLimit.hidden : bool;
            Boolean bool4 = (i11 & 64) != 0 ? advancedLimit.iceberg : bool2;
            String str26 = (i11 & 128) != 0 ? advancedLimit.side : str5;
            Long l12 = (i11 & 256) != 0 ? advancedLimit.time : l11;
            String str27 = (i11 & 512) != 0 ? advancedLimit.averagePrice : str6;
            String str28 = (i11 & 1024) != 0 ? advancedLimit.dealSize : str7;
            String str29 = (i11 & 2048) != 0 ? advancedLimit.size : str8;
            String str30 = (i11 & 4096) != 0 ? advancedLimit.orderType : str9;
            String str31 = (i11 & 8192) != 0 ? advancedLimit.stp : str10;
            String str32 = str22;
            String str33 = (i11 & 16384) != 0 ? advancedLimit.status : str11;
            String str34 = (i11 & 32768) != 0 ? advancedLimit.funds : str12;
            String str35 = (i11 & 65536) != 0 ? advancedLimit.filledFunds : str13;
            String str36 = (i11 & 131072) != 0 ? advancedLimit.sizeUnit : str14;
            String str37 = (i11 & 262144) != 0 ? advancedLimit.fee : str15;
            String str38 = (i11 & 524288) != 0 ? advancedLimit.feeCurrency : str16;
            String str39 = (i11 & 1048576) != 0 ? advancedLimit.tax : str17;
            String str40 = (i11 & 2097152) != 0 ? advancedLimit.taxCurrency : str18;
            if ((i11 & 4194304) != 0) {
                str21 = str40;
                str20 = advancedLimit.cancelReason;
            } else {
                str20 = str19;
                str21 = str40;
            }
            return advancedLimit.copy(str32, str23, str24, str25, symbolInfoEntity2, bool3, bool4, str26, l12, str27, str28, str29, str30, str31, str33, str34, str35, str36, str37, str38, str39, str21, str20);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvancedLimit)) {
                return false;
            }
            AdvancedLimit advancedLimit = (AdvancedLimit) other;
            return Intrinsics.areEqual(this.price, advancedLimit.price) && Intrinsics.areEqual(this.timeInForce, advancedLimit.timeInForce) && Intrinsics.areEqual(this.orderId, advancedLimit.orderId) && Intrinsics.areEqual(this.symbol, advancedLimit.symbol) && Intrinsics.areEqual(this.symbolInfo, advancedLimit.symbolInfo) && Intrinsics.areEqual(this.hidden, advancedLimit.hidden) && Intrinsics.areEqual(this.iceberg, advancedLimit.iceberg) && Intrinsics.areEqual(this.side, advancedLimit.side) && Intrinsics.areEqual(this.time, advancedLimit.time) && Intrinsics.areEqual(this.averagePrice, advancedLimit.averagePrice) && Intrinsics.areEqual(this.dealSize, advancedLimit.dealSize) && Intrinsics.areEqual(this.size, advancedLimit.size) && Intrinsics.areEqual(this.orderType, advancedLimit.orderType) && Intrinsics.areEqual(this.stp, advancedLimit.stp) && Intrinsics.areEqual(this.status, advancedLimit.status) && Intrinsics.areEqual(this.funds, advancedLimit.funds) && Intrinsics.areEqual(this.filledFunds, advancedLimit.filledFunds) && Intrinsics.areEqual(this.sizeUnit, advancedLimit.sizeUnit) && Intrinsics.areEqual(this.fee, advancedLimit.fee) && Intrinsics.areEqual(this.feeCurrency, advancedLimit.feeCurrency) && Intrinsics.areEqual(this.tax, advancedLimit.tax) && Intrinsics.areEqual(this.taxCurrency, advancedLimit.taxCurrency) && Intrinsics.areEqual(this.cancelReason, advancedLimit.cancelReason);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getAveragePrice() {
            return this.averagePrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getDealSize() {
            return this.dealSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getStp() {
            return this.stp;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getFilledFunds() {
            return this.filledFunds;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getSizeUnit() {
            return this.sizeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getFee() {
            return this.fee;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTimeInForce() {
            return this.timeInForce;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getTax() {
            return this.tax;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getCancelReason() {
            return this.cancelReason;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getHidden() {
            return this.hidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getIceberg() {
            return this.iceberg;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @NotNull
        public final AdvancedLimit copy(@Nullable String price, @Nullable String timeInForce, @Nullable String orderId, @Nullable String symbol, @Nullable SymbolInfoEntity symbolInfo, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String side, @Nullable Long time, @Nullable String averagePrice, @Nullable String dealSize, @Nullable String size, @Nullable String orderType, @Nullable String stp, @Nullable String status, @Nullable String funds, @Nullable String filledFunds, @Nullable String sizeUnit, @Nullable String fee, @Nullable String feeCurrency, @Nullable String tax, @Nullable String taxCurrency, @Nullable String cancelReason) {
            return new AdvancedLimit(price, timeInForce, orderId, symbol, symbolInfo, hidden, iceberg, side, time, averagePrice, dealSize, size, orderType, stp, status, funds, filledFunds, sizeUnit, fee, feeCurrency, tax, taxCurrency, cancelReason);
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getAveragePrice() {
            return this.averagePrice;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getCancelReason() {
            return this.cancelReason;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getDealSize() {
            return this.dealSize;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFee() {
            return this.fee;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFilledFunds() {
            return this.filledFunds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFunds() {
            return this.funds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getHidden() {
            return this.hidden;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getIceberg() {
            return this.iceberg;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSide() {
            return this.side;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSize() {
            return this.size;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSizeUnit() {
            return this.sizeUnit;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStatus() {
            return this.status;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStp() {
            return this.stp;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTax() {
            return this.tax;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Long getTime() {
            return this.time;
        }

        @Nullable
        public final String getTimeInForce() {
            return this.timeInForce;
        }

        public int hashCode() {
            String str = this.price;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.timeInForce;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.orderId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.symbol;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            int iHashCode5 = (iHashCode4 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
            Boolean bool = this.hidden;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.iceberg;
            int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.side;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l11 = this.time;
            int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str6 = this.averagePrice;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.dealSize;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.size;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.orderType;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.stp;
            int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.status;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.funds;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.filledFunds;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.sizeUnit;
            int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.fee;
            int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.feeCurrency;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.tax;
            int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.taxCurrency;
            int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.cancelReason;
            return iHashCode22 + (str19 != null ? str19.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdvancedLimit(price=" + this.price + ", timeInForce=" + this.timeInForce + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", side=" + this.side + ", time=" + this.time + ", averagePrice=" + this.averagePrice + ", dealSize=" + this.dealSize + ", size=" + this.size + ", orderType=" + this.orderType + ", stp=" + this.stp + ", status=" + this.status + ", funds=" + this.funds + ", filledFunds=" + this.filledFunds + ", sizeUnit=" + this.sizeUnit + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", cancelReason=" + this.cancelReason + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.price);
            dest.writeString(this.timeInForce);
            dest.writeString(this.orderId);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.symbolInfo, flags);
            Boolean bool = this.hidden;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.iceberg;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.side);
            Long l11 = this.time;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeString(this.averagePrice);
            dest.writeString(this.dealSize);
            dest.writeString(this.size);
            dest.writeString(this.orderType);
            dest.writeString(this.stp);
            dest.writeString(this.status);
            dest.writeString(this.funds);
            dest.writeString(this.filledFunds);
            dest.writeString(this.sizeUnit);
            dest.writeString(this.fee);
            dest.writeString(this.feeCurrency);
            dest.writeString(this.tax);
            dest.writeString(this.taxCurrency);
            dest.writeString(this.cancelReason);
        }

        public AdvancedLimit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, @Nullable Long l11, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19) {
            this.price = str;
            this.timeInForce = str2;
            this.orderId = str3;
            this.symbol = str4;
            this.symbolInfo = symbolInfoEntity;
            this.hidden = bool;
            this.iceberg = bool2;
            this.side = str5;
            this.time = l11;
            this.averagePrice = str6;
            this.dealSize = str7;
            this.size = str8;
            this.orderType = str9;
            this.stp = str10;
            this.status = str11;
            this.funds = str12;
            this.filledFunds = str13;
            this.sizeUnit = str14;
            this.fee = str15;
            this.feeCurrency = str16;
            this.tax = str17;
            this.taxCurrency = str18;
            this.cancelReason = str19;
        }
    }

    /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bE\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0096\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010RJ\u0006\u0010S\u001a\u00020TJ\u0013\u0010U\u001a\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020THÖ\u0001J\t\u0010Y\u001a\u00020\u0004HÖ\u0001J\u0016\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020TR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 ¨\u0006_"}, m90084d2 = {"Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "orderId", "symbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", ViewProps.HIDDEN, "", "iceberg", "side", "time", "", "averagePrice", "dealSize", "size", "orderType", "stp", "status", "funds", "filledFunds", "sizeUnit", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "cancelReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getOrderId", "getSymbol", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIceberg", "getSide", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAveragePrice", "getDealSize", "getSize", "getOrderType", "getStp", "getStatus", "getFunds", "getFilledFunds", "getSizeUnit", "getFee", "getFeeCurrency", "getTax", "getTaxCurrency", "getCancelReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Limit implements HistoryOrdersUiData$ItemEntity, Parcelable {

        @NotNull
        public static final Parcelable.Creator<Limit> CREATOR = new C11625a();

        @Nullable
        private final String averagePrice;

        @Nullable
        private final String cancelReason;

        @Nullable
        private final String dealSize;

        @Nullable
        private final String fee;

        @Nullable
        private final String feeCurrency;

        @Nullable
        private final String filledFunds;

        @Nullable
        private final String funds;

        @Nullable
        private final Boolean hidden;

        @Nullable
        private final Boolean iceberg;

        @Nullable
        private final String orderId;

        @Nullable
        private final String orderType;

        @Nullable
        private final String price;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String sizeUnit;

        @Nullable
        private final String status;

        @Nullable
        private final String stp;

        @Nullable
        private final String symbol;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        @Nullable
        private final String tax;

        @Nullable
        private final String taxCurrency;

        @Nullable
        private final Long time;

        /* JADX INFO: renamed from: com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity$Limit$a */
        /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11625a implements Parcelable.Creator<Limit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Limit createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Long lValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(Limit.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    lValueOf = null;
                }
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new Limit(string, string2, string3, symbolInfoEntity, boolValueOf, boolValueOf2, string4, lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Limit[] newArray(int i11) {
                return new Limit[i11];
            }
        }

        public static /* synthetic */ Limit copy$default(Limit limit, String str, String str2, String str3, SymbolInfoEntity symbolInfoEntity, Boolean bool, Boolean bool2, String str4, Long l11, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i11, Object obj) {
            String str19;
            String str20;
            String str21 = (i11 & 1) != 0 ? limit.price : str;
            String str22 = (i11 & 2) != 0 ? limit.orderId : str2;
            String str23 = (i11 & 4) != 0 ? limit.symbol : str3;
            SymbolInfoEntity symbolInfoEntity2 = (i11 & 8) != 0 ? limit.symbolInfo : symbolInfoEntity;
            Boolean bool3 = (i11 & 16) != 0 ? limit.hidden : bool;
            Boolean bool4 = (i11 & 32) != 0 ? limit.iceberg : bool2;
            String str24 = (i11 & 64) != 0 ? limit.side : str4;
            Long l12 = (i11 & 128) != 0 ? limit.time : l11;
            String str25 = (i11 & 256) != 0 ? limit.averagePrice : str5;
            String str26 = (i11 & 512) != 0 ? limit.dealSize : str6;
            String str27 = (i11 & 1024) != 0 ? limit.size : str7;
            String str28 = (i11 & 2048) != 0 ? limit.orderType : str8;
            String str29 = (i11 & 4096) != 0 ? limit.stp : str9;
            String str30 = (i11 & 8192) != 0 ? limit.status : str10;
            String str31 = str21;
            String str32 = (i11 & 16384) != 0 ? limit.funds : str11;
            String str33 = (i11 & 32768) != 0 ? limit.filledFunds : str12;
            String str34 = (i11 & 65536) != 0 ? limit.sizeUnit : str13;
            String str35 = (i11 & 131072) != 0 ? limit.fee : str14;
            String str36 = (i11 & 262144) != 0 ? limit.feeCurrency : str15;
            String str37 = (i11 & 524288) != 0 ? limit.tax : str16;
            String str38 = (i11 & 1048576) != 0 ? limit.taxCurrency : str17;
            if ((i11 & 2097152) != 0) {
                str20 = str38;
                str19 = limit.cancelReason;
            } else {
                str19 = str18;
                str20 = str38;
            }
            return limit.copy(str31, str22, str23, symbolInfoEntity2, bool3, bool4, str24, l12, str25, str26, str27, str28, str29, str30, str32, str33, str34, str35, str36, str37, str20, str19);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return Intrinsics.areEqual(this.price, limit.price) && Intrinsics.areEqual(this.orderId, limit.orderId) && Intrinsics.areEqual(this.symbol, limit.symbol) && Intrinsics.areEqual(this.symbolInfo, limit.symbolInfo) && Intrinsics.areEqual(this.hidden, limit.hidden) && Intrinsics.areEqual(this.iceberg, limit.iceberg) && Intrinsics.areEqual(this.side, limit.side) && Intrinsics.areEqual(this.time, limit.time) && Intrinsics.areEqual(this.averagePrice, limit.averagePrice) && Intrinsics.areEqual(this.dealSize, limit.dealSize) && Intrinsics.areEqual(this.size, limit.size) && Intrinsics.areEqual(this.orderType, limit.orderType) && Intrinsics.areEqual(this.stp, limit.stp) && Intrinsics.areEqual(this.status, limit.status) && Intrinsics.areEqual(this.funds, limit.funds) && Intrinsics.areEqual(this.filledFunds, limit.filledFunds) && Intrinsics.areEqual(this.sizeUnit, limit.sizeUnit) && Intrinsics.areEqual(this.fee, limit.fee) && Intrinsics.areEqual(this.feeCurrency, limit.feeCurrency) && Intrinsics.areEqual(this.tax, limit.tax) && Intrinsics.areEqual(this.taxCurrency, limit.taxCurrency) && Intrinsics.areEqual(this.cancelReason, limit.cancelReason);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getDealSize() {
            return this.dealSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getStp() {
            return this.stp;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getFilledFunds() {
            return this.filledFunds;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getSizeUnit() {
            return this.sizeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getFee() {
            return this.fee;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getTax() {
            return this.tax;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getCancelReason() {
            return this.cancelReason;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getHidden() {
            return this.hidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIceberg() {
            return this.iceberg;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getAveragePrice() {
            return this.averagePrice;
        }

        @NotNull
        public final Limit copy(@Nullable String price, @Nullable String orderId, @Nullable String symbol, @Nullable SymbolInfoEntity symbolInfo, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String side, @Nullable Long time, @Nullable String averagePrice, @Nullable String dealSize, @Nullable String size, @Nullable String orderType, @Nullable String stp, @Nullable String status, @Nullable String funds, @Nullable String filledFunds, @Nullable String sizeUnit, @Nullable String fee, @Nullable String feeCurrency, @Nullable String tax, @Nullable String taxCurrency, @Nullable String cancelReason) {
            return new Limit(price, orderId, symbol, symbolInfo, hidden, iceberg, side, time, averagePrice, dealSize, size, orderType, stp, status, funds, filledFunds, sizeUnit, fee, feeCurrency, tax, taxCurrency, cancelReason);
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getAveragePrice() {
            return this.averagePrice;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getCancelReason() {
            return this.cancelReason;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getDealSize() {
            return this.dealSize;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFee() {
            return this.fee;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFilledFunds() {
            return this.filledFunds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFunds() {
            return this.funds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getHidden() {
            return this.hidden;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getIceberg() {
            return this.iceberg;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSide() {
            return this.side;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSize() {
            return this.size;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSizeUnit() {
            return this.sizeUnit;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStatus() {
            return this.status;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStp() {
            return this.stp;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTax() {
            return this.tax;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Long getTime() {
            return this.time;
        }

        public int hashCode() {
            String str = this.price;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.orderId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            int iHashCode4 = (iHashCode3 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
            Boolean bool = this.hidden;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.iceberg;
            int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str4 = this.side;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l11 = this.time;
            int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str5 = this.averagePrice;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.dealSize;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.size;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.orderType;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.stp;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.status;
            int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.funds;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.filledFunds;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.sizeUnit;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.fee;
            int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.feeCurrency;
            int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.tax;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.taxCurrency;
            int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.cancelReason;
            return iHashCode21 + (str18 != null ? str18.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Limit(price=" + this.price + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", side=" + this.side + ", time=" + this.time + ", averagePrice=" + this.averagePrice + ", dealSize=" + this.dealSize + ", size=" + this.size + ", orderType=" + this.orderType + ", stp=" + this.stp + ", status=" + this.status + ", funds=" + this.funds + ", filledFunds=" + this.filledFunds + ", sizeUnit=" + this.sizeUnit + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", cancelReason=" + this.cancelReason + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.price);
            dest.writeString(this.orderId);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.symbolInfo, flags);
            Boolean bool = this.hidden;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.iceberg;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.side);
            Long l11 = this.time;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeString(this.averagePrice);
            dest.writeString(this.dealSize);
            dest.writeString(this.size);
            dest.writeString(this.orderType);
            dest.writeString(this.stp);
            dest.writeString(this.status);
            dest.writeString(this.funds);
            dest.writeString(this.filledFunds);
            dest.writeString(this.sizeUnit);
            dest.writeString(this.fee);
            dest.writeString(this.feeCurrency);
            dest.writeString(this.tax);
            dest.writeString(this.taxCurrency);
            dest.writeString(this.cancelReason);
        }

        public Limit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable Long l11, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
            this.price = str;
            this.orderId = str2;
            this.symbol = str3;
            this.symbolInfo = symbolInfoEntity;
            this.hidden = bool;
            this.iceberg = bool2;
            this.side = str4;
            this.time = l11;
            this.averagePrice = str5;
            this.dealSize = str6;
            this.size = str7;
            this.orderType = str8;
            this.stp = str9;
            this.status = str10;
            this.funds = str11;
            this.filledFunds = str12;
            this.sizeUnit = str13;
            this.fee = str14;
            this.feeCurrency = str15;
            this.tax = str16;
            this.taxCurrency = str17;
            this.cancelReason = str18;
        }
    }

    /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bC\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u008a\u0002\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010OJ\u0006\u0010P\u001a\u00020QJ\u0013\u0010R\u001a\u00020\t2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020QHÖ\u0001J\t\u0010V\u001a\u00020\u0004HÖ\u0001J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020QR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f¨\u0006\\"}, m90084d2 = {"Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Landroid/os/Parcelable;", "orderId", "", "symbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", ViewProps.HIDDEN, "", "iceberg", "side", "time", "", "averagePrice", "dealSize", "size", "orderType", "stp", "status", "funds", "filledFunds", "sizeUnit", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "cancelReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIceberg", "getSide", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAveragePrice", "getDealSize", "getSize", "getOrderType", "getStp", "getStatus", "getFunds", "getFilledFunds", "getSizeUnit", "getFee", "getFeeCurrency", "getTax", "getTaxCurrency", "getCancelReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Market implements HistoryOrdersUiData$ItemEntity, Parcelable {

        @NotNull
        public static final Parcelable.Creator<Market> CREATOR = new C11626a();

        @Nullable
        private final String averagePrice;

        @Nullable
        private final String cancelReason;

        @Nullable
        private final String dealSize;

        @Nullable
        private final String fee;

        @Nullable
        private final String feeCurrency;

        @Nullable
        private final String filledFunds;

        @Nullable
        private final String funds;

        @Nullable
        private final Boolean hidden;

        @Nullable
        private final Boolean iceberg;

        @Nullable
        private final String orderId;

        @Nullable
        private final String orderType;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String sizeUnit;

        @Nullable
        private final String status;

        @Nullable
        private final String stp;

        @Nullable
        private final String symbol;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        @Nullable
        private final String tax;

        @Nullable
        private final String taxCurrency;

        @Nullable
        private final Long time;

        /* JADX INFO: renamed from: com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity$Market$a */
        /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11626a implements Parcelable.Creator<Market> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Market createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Long lValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(Market.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    lValueOf = null;
                }
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new Market(string, string2, symbolInfoEntity, boolValueOf, boolValueOf2, string3, lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Market[] newArray(int i11) {
                return new Market[i11];
            }
        }

        public static /* synthetic */ Market copy$default(Market market, String str, String str2, SymbolInfoEntity symbolInfoEntity, Boolean bool, Boolean bool2, String str3, Long l11, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11, Object obj) {
            String str18;
            String str19;
            String str20 = (i11 & 1) != 0 ? market.orderId : str;
            String str21 = (i11 & 2) != 0 ? market.symbol : str2;
            SymbolInfoEntity symbolInfoEntity2 = (i11 & 4) != 0 ? market.symbolInfo : symbolInfoEntity;
            Boolean bool3 = (i11 & 8) != 0 ? market.hidden : bool;
            Boolean bool4 = (i11 & 16) != 0 ? market.iceberg : bool2;
            String str22 = (i11 & 32) != 0 ? market.side : str3;
            Long l12 = (i11 & 64) != 0 ? market.time : l11;
            String str23 = (i11 & 128) != 0 ? market.averagePrice : str4;
            String str24 = (i11 & 256) != 0 ? market.dealSize : str5;
            String str25 = (i11 & 512) != 0 ? market.size : str6;
            String str26 = (i11 & 1024) != 0 ? market.orderType : str7;
            String str27 = (i11 & 2048) != 0 ? market.stp : str8;
            String str28 = (i11 & 4096) != 0 ? market.status : str9;
            String str29 = (i11 & 8192) != 0 ? market.funds : str10;
            String str30 = str20;
            String str31 = (i11 & 16384) != 0 ? market.filledFunds : str11;
            String str32 = (i11 & 32768) != 0 ? market.sizeUnit : str12;
            String str33 = (i11 & 65536) != 0 ? market.fee : str13;
            String str34 = (i11 & 131072) != 0 ? market.feeCurrency : str14;
            String str35 = (i11 & 262144) != 0 ? market.tax : str15;
            String str36 = (i11 & 524288) != 0 ? market.taxCurrency : str16;
            if ((i11 & 1048576) != 0) {
                str19 = str36;
                str18 = market.cancelReason;
            } else {
                str18 = str17;
                str19 = str36;
            }
            return market.copy(str30, str21, symbolInfoEntity2, bool3, bool4, str22, l12, str23, str24, str25, str26, str27, str28, str29, str31, str32, str33, str34, str35, str19, str18);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Market)) {
                return false;
            }
            Market market = (Market) other;
            return Intrinsics.areEqual(this.orderId, market.orderId) && Intrinsics.areEqual(this.symbol, market.symbol) && Intrinsics.areEqual(this.symbolInfo, market.symbolInfo) && Intrinsics.areEqual(this.hidden, market.hidden) && Intrinsics.areEqual(this.iceberg, market.iceberg) && Intrinsics.areEqual(this.side, market.side) && Intrinsics.areEqual(this.time, market.time) && Intrinsics.areEqual(this.averagePrice, market.averagePrice) && Intrinsics.areEqual(this.dealSize, market.dealSize) && Intrinsics.areEqual(this.size, market.size) && Intrinsics.areEqual(this.orderType, market.orderType) && Intrinsics.areEqual(this.stp, market.stp) && Intrinsics.areEqual(this.status, market.status) && Intrinsics.areEqual(this.funds, market.funds) && Intrinsics.areEqual(this.filledFunds, market.filledFunds) && Intrinsics.areEqual(this.sizeUnit, market.sizeUnit) && Intrinsics.areEqual(this.fee, market.fee) && Intrinsics.areEqual(this.feeCurrency, market.feeCurrency) && Intrinsics.areEqual(this.tax, market.tax) && Intrinsics.areEqual(this.taxCurrency, market.taxCurrency) && Intrinsics.areEqual(this.cancelReason, market.cancelReason);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getStp() {
            return this.stp;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getFilledFunds() {
            return this.filledFunds;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getSizeUnit() {
            return this.sizeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getFee() {
            return this.fee;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getTax() {
            return this.tax;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getCancelReason() {
            return this.cancelReason;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getHidden() {
            return this.hidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getIceberg() {
            return this.iceberg;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAveragePrice() {
            return this.averagePrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getDealSize() {
            return this.dealSize;
        }

        @NotNull
        public final Market copy(@Nullable String orderId, @Nullable String symbol, @Nullable SymbolInfoEntity symbolInfo, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String side, @Nullable Long time, @Nullable String averagePrice, @Nullable String dealSize, @Nullable String size, @Nullable String orderType, @Nullable String stp, @Nullable String status, @Nullable String funds, @Nullable String filledFunds, @Nullable String sizeUnit, @Nullable String fee, @Nullable String feeCurrency, @Nullable String tax, @Nullable String taxCurrency, @Nullable String cancelReason) {
            return new Market(orderId, symbol, symbolInfo, hidden, iceberg, side, time, averagePrice, dealSize, size, orderType, stp, status, funds, filledFunds, sizeUnit, fee, feeCurrency, tax, taxCurrency, cancelReason);
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getAveragePrice() {
            return this.averagePrice;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getCancelReason() {
            return this.cancelReason;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getDealSize() {
            return this.dealSize;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFee() {
            return this.fee;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFilledFunds() {
            return this.filledFunds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFunds() {
            return this.funds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getHidden() {
            return this.hidden;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getIceberg() {
            return this.iceberg;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderType() {
            return this.orderType;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSide() {
            return this.side;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSize() {
            return this.size;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSizeUnit() {
            return this.sizeUnit;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStatus() {
            return this.status;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStp() {
            return this.stp;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTax() {
            return this.tax;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Long getTime() {
            return this.time;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.symbol;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            int iHashCode3 = (iHashCode2 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
            Boolean bool = this.hidden;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.iceberg;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.side;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l11 = this.time;
            int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str4 = this.averagePrice;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.dealSize;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.size;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.orderType;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.stp;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.status;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.funds;
            int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.filledFunds;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.sizeUnit;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.fee;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.feeCurrency;
            int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.tax;
            int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.taxCurrency;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.cancelReason;
            return iHashCode20 + (str17 != null ? str17.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Market(orderId=" + this.orderId + ", symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", side=" + this.side + ", time=" + this.time + ", averagePrice=" + this.averagePrice + ", dealSize=" + this.dealSize + ", size=" + this.size + ", orderType=" + this.orderType + ", stp=" + this.stp + ", status=" + this.status + ", funds=" + this.funds + ", filledFunds=" + this.filledFunds + ", sizeUnit=" + this.sizeUnit + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", cancelReason=" + this.cancelReason + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.orderId);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.symbolInfo, flags);
            Boolean bool = this.hidden;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.iceberg;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.side);
            Long l11 = this.time;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeString(this.averagePrice);
            dest.writeString(this.dealSize);
            dest.writeString(this.size);
            dest.writeString(this.orderType);
            dest.writeString(this.stp);
            dest.writeString(this.status);
            dest.writeString(this.funds);
            dest.writeString(this.filledFunds);
            dest.writeString(this.sizeUnit);
            dest.writeString(this.fee);
            dest.writeString(this.feeCurrency);
            dest.writeString(this.tax);
            dest.writeString(this.taxCurrency);
            dest.writeString(this.cancelReason);
        }

        public Market(@Nullable String str, @Nullable String str2, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
            this.orderId = str;
            this.symbol = str2;
            this.symbolInfo = symbolInfoEntity;
            this.hidden = bool;
            this.iceberg = bool2;
            this.side = str3;
            this.time = l11;
            this.averagePrice = str4;
            this.dealSize = str5;
            this.size = str6;
            this.orderType = str7;
            this.stp = str8;
            this.status = str9;
            this.funds = str10;
            this.filledFunds = str11;
            this.sizeUnit = str12;
            this.fee = str13;
            this.feeCurrency = str14;
            this.tax = str15;
            this.taxCurrency = str16;
            this.cancelReason = str17;
        }
    }

    /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bK\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jº\u0002\u0010Z\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010[J\u0006\u0010\\\u001a\u00020]J\u0013\u0010^\u001a\u00020\r2\b\u0010_\u001a\u0004\u0018\u00010`HÖ\u0003J\t\u0010a\u001a\u00020]HÖ\u0001J\t\u0010b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020]R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#¨\u0006h"}, m90084d2 = {"Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "triggerDirection", "triggerPrice", "triggerPriceType", "orderId", "symbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", ViewProps.HIDDEN, "", "iceberg", "side", "time", "", "averagePrice", "dealSize", "size", "orderType", "stp", "status", "funds", "filledFunds", "sizeUnit", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "cancelReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getTriggerDirection", "getTriggerPrice", "getTriggerPriceType", "getOrderId", "getSymbol", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIceberg", "getSide", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAveragePrice", "getDealSize", "getSize", "getOrderType", "getStp", "getStatus", "getFunds", "getFilledFunds", "getSizeUnit", "getFee", "getFeeCurrency", "getTax", "getTaxCurrency", "getCancelReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopLimit implements HistoryOrdersUiData$ItemEntity, Parcelable {

        @NotNull
        public static final Parcelable.Creator<StopLimit> CREATOR = new C11627a();

        @Nullable
        private final String averagePrice;

        @Nullable
        private final String cancelReason;

        @Nullable
        private final String dealSize;

        @Nullable
        private final String fee;

        @Nullable
        private final String feeCurrency;

        @Nullable
        private final String filledFunds;

        @Nullable
        private final String funds;

        @Nullable
        private final Boolean hidden;

        @Nullable
        private final Boolean iceberg;

        @Nullable
        private final String orderId;

        @Nullable
        private final String orderType;

        @Nullable
        private final String price;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String sizeUnit;

        @Nullable
        private final String status;

        @Nullable
        private final String stp;

        @Nullable
        private final String symbol;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        @Nullable
        private final String tax;

        @Nullable
        private final String taxCurrency;

        @Nullable
        private final Long time;

        @Nullable
        private final String triggerDirection;

        @Nullable
        private final String triggerPrice;

        @Nullable
        private final String triggerPriceType;

        /* JADX INFO: renamed from: com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity$StopLimit$a */
        /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11627a implements Parcelable.Creator<StopLimit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StopLimit createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Long lValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(StopLimit.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    lValueOf = null;
                }
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new StopLimit(string, string2, string3, string4, string5, string6, symbolInfoEntity, boolValueOf, boolValueOf2, string7, lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StopLimit[] newArray(int i11) {
                return new StopLimit[i11];
            }
        }

        public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, String str, String str2, String str3, String str4, String str5, String str6, SymbolInfoEntity symbolInfoEntity, Boolean bool, Boolean bool2, String str7, Long l11, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i11, Object obj) {
            String str22;
            String str23;
            String str24 = (i11 & 1) != 0 ? stopLimit.price : str;
            String str25 = (i11 & 2) != 0 ? stopLimit.triggerDirection : str2;
            String str26 = (i11 & 4) != 0 ? stopLimit.triggerPrice : str3;
            String str27 = (i11 & 8) != 0 ? stopLimit.triggerPriceType : str4;
            String str28 = (i11 & 16) != 0 ? stopLimit.orderId : str5;
            String str29 = (i11 & 32) != 0 ? stopLimit.symbol : str6;
            SymbolInfoEntity symbolInfoEntity2 = (i11 & 64) != 0 ? stopLimit.symbolInfo : symbolInfoEntity;
            Boolean bool3 = (i11 & 128) != 0 ? stopLimit.hidden : bool;
            Boolean bool4 = (i11 & 256) != 0 ? stopLimit.iceberg : bool2;
            String str30 = (i11 & 512) != 0 ? stopLimit.side : str7;
            Long l12 = (i11 & 1024) != 0 ? stopLimit.time : l11;
            String str31 = (i11 & 2048) != 0 ? stopLimit.averagePrice : str8;
            String str32 = (i11 & 4096) != 0 ? stopLimit.dealSize : str9;
            String str33 = (i11 & 8192) != 0 ? stopLimit.size : str10;
            String str34 = str24;
            String str35 = (i11 & 16384) != 0 ? stopLimit.orderType : str11;
            String str36 = (i11 & 32768) != 0 ? stopLimit.stp : str12;
            String str37 = (i11 & 65536) != 0 ? stopLimit.status : str13;
            String str38 = (i11 & 131072) != 0 ? stopLimit.funds : str14;
            String str39 = (i11 & 262144) != 0 ? stopLimit.filledFunds : str15;
            String str40 = (i11 & 524288) != 0 ? stopLimit.sizeUnit : str16;
            String str41 = (i11 & 1048576) != 0 ? stopLimit.fee : str17;
            String str42 = (i11 & 2097152) != 0 ? stopLimit.feeCurrency : str18;
            String str43 = (i11 & 4194304) != 0 ? stopLimit.tax : str19;
            String str44 = (i11 & 8388608) != 0 ? stopLimit.taxCurrency : str20;
            if ((i11 & 16777216) != 0) {
                str23 = str44;
                str22 = stopLimit.cancelReason;
            } else {
                str22 = str21;
                str23 = str44;
            }
            return stopLimit.copy(str34, str25, str26, str27, str28, str29, symbolInfoEntity2, bool3, bool4, str30, l12, str31, str32, str33, str35, str36, str37, str38, str39, str40, str41, str42, str43, str23, str22);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopLimit)) {
                return false;
            }
            StopLimit stopLimit = (StopLimit) other;
            return Intrinsics.areEqual(this.price, stopLimit.price) && Intrinsics.areEqual(this.triggerDirection, stopLimit.triggerDirection) && Intrinsics.areEqual(this.triggerPrice, stopLimit.triggerPrice) && Intrinsics.areEqual(this.triggerPriceType, stopLimit.triggerPriceType) && Intrinsics.areEqual(this.orderId, stopLimit.orderId) && Intrinsics.areEqual(this.symbol, stopLimit.symbol) && Intrinsics.areEqual(this.symbolInfo, stopLimit.symbolInfo) && Intrinsics.areEqual(this.hidden, stopLimit.hidden) && Intrinsics.areEqual(this.iceberg, stopLimit.iceberg) && Intrinsics.areEqual(this.side, stopLimit.side) && Intrinsics.areEqual(this.time, stopLimit.time) && Intrinsics.areEqual(this.averagePrice, stopLimit.averagePrice) && Intrinsics.areEqual(this.dealSize, stopLimit.dealSize) && Intrinsics.areEqual(this.size, stopLimit.size) && Intrinsics.areEqual(this.orderType, stopLimit.orderType) && Intrinsics.areEqual(this.stp, stopLimit.stp) && Intrinsics.areEqual(this.status, stopLimit.status) && Intrinsics.areEqual(this.funds, stopLimit.funds) && Intrinsics.areEqual(this.filledFunds, stopLimit.filledFunds) && Intrinsics.areEqual(this.sizeUnit, stopLimit.sizeUnit) && Intrinsics.areEqual(this.fee, stopLimit.fee) && Intrinsics.areEqual(this.feeCurrency, stopLimit.feeCurrency) && Intrinsics.areEqual(this.tax, stopLimit.tax) && Intrinsics.areEqual(this.taxCurrency, stopLimit.taxCurrency) && Intrinsics.areEqual(this.cancelReason, stopLimit.cancelReason);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getAveragePrice() {
            return this.averagePrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getDealSize() {
            return this.dealSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getStp() {
            return this.stp;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getFilledFunds() {
            return this.filledFunds;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getSizeUnit() {
            return this.sizeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getFee() {
            return this.fee;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getTax() {
            return this.tax;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final String getCancelReason() {
            return this.cancelReason;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTriggerPriceType() {
            return this.triggerPriceType;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getHidden() {
            return this.hidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getIceberg() {
            return this.iceberg;
        }

        @NotNull
        public final StopLimit copy(@Nullable String price, @Nullable String triggerDirection, @Nullable String triggerPrice, @Nullable String triggerPriceType, @Nullable String orderId, @Nullable String symbol, @Nullable SymbolInfoEntity symbolInfo, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String side, @Nullable Long time, @Nullable String averagePrice, @Nullable String dealSize, @Nullable String size, @Nullable String orderType, @Nullable String stp, @Nullable String status, @Nullable String funds, @Nullable String filledFunds, @Nullable String sizeUnit, @Nullable String fee, @Nullable String feeCurrency, @Nullable String tax, @Nullable String taxCurrency, @Nullable String cancelReason) {
            return new StopLimit(price, triggerDirection, triggerPrice, triggerPriceType, orderId, symbol, symbolInfo, hidden, iceberg, side, time, averagePrice, dealSize, size, orderType, stp, status, funds, filledFunds, sizeUnit, fee, feeCurrency, tax, taxCurrency, cancelReason);
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getAveragePrice() {
            return this.averagePrice;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getCancelReason() {
            return this.cancelReason;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getDealSize() {
            return this.dealSize;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFee() {
            return this.fee;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFilledFunds() {
            return this.filledFunds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFunds() {
            return this.funds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getHidden() {
            return this.hidden;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getIceberg() {
            return this.iceberg;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final String getPrice() {
            return this.price;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSide() {
            return this.side;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSize() {
            return this.size;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSizeUnit() {
            return this.sizeUnit;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStatus() {
            return this.status;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStp() {
            return this.stp;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTax() {
            return this.tax;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Long getTime() {
            return this.time;
        }

        @Nullable
        public final String getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @Nullable
        public final String getTriggerPriceType() {
            return this.triggerPriceType;
        }

        public int hashCode() {
            String str = this.price;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.triggerDirection;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.triggerPrice;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.triggerPriceType;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.orderId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.symbol;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            int iHashCode7 = (iHashCode6 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
            Boolean bool = this.hidden;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.iceberg;
            int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str7 = this.side;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Long l11 = this.time;
            int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str8 = this.averagePrice;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.dealSize;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.size;
            int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.orderType;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.stp;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.status;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.funds;
            int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.filledFunds;
            int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.sizeUnit;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.fee;
            int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.feeCurrency;
            int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.tax;
            int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.taxCurrency;
            int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.cancelReason;
            return iHashCode24 + (str21 != null ? str21.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "StopLimit(price=" + this.price + ", triggerDirection=" + this.triggerDirection + ", triggerPrice=" + this.triggerPrice + ", triggerPriceType=" + this.triggerPriceType + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", side=" + this.side + ", time=" + this.time + ", averagePrice=" + this.averagePrice + ", dealSize=" + this.dealSize + ", size=" + this.size + ", orderType=" + this.orderType + ", stp=" + this.stp + ", status=" + this.status + ", funds=" + this.funds + ", filledFunds=" + this.filledFunds + ", sizeUnit=" + this.sizeUnit + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", cancelReason=" + this.cancelReason + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.price);
            dest.writeString(this.triggerDirection);
            dest.writeString(this.triggerPrice);
            dest.writeString(this.triggerPriceType);
            dest.writeString(this.orderId);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.symbolInfo, flags);
            Boolean bool = this.hidden;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.iceberg;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.side);
            Long l11 = this.time;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeString(this.averagePrice);
            dest.writeString(this.dealSize);
            dest.writeString(this.size);
            dest.writeString(this.orderType);
            dest.writeString(this.stp);
            dest.writeString(this.status);
            dest.writeString(this.funds);
            dest.writeString(this.filledFunds);
            dest.writeString(this.sizeUnit);
            dest.writeString(this.fee);
            dest.writeString(this.feeCurrency);
            dest.writeString(this.tax);
            dest.writeString(this.taxCurrency);
            dest.writeString(this.cancelReason);
        }

        public StopLimit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str7, @Nullable Long l11, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21) {
            this.price = str;
            this.triggerDirection = str2;
            this.triggerPrice = str3;
            this.triggerPriceType = str4;
            this.orderId = str5;
            this.symbol = str6;
            this.symbolInfo = symbolInfoEntity;
            this.hidden = bool;
            this.iceberg = bool2;
            this.side = str7;
            this.time = l11;
            this.averagePrice = str8;
            this.dealSize = str9;
            this.size = str10;
            this.orderType = str11;
            this.stp = str12;
            this.status = str13;
            this.funds = str14;
            this.filledFunds = str15;
            this.sizeUnit = str16;
            this.fee = str17;
            this.feeCurrency = str18;
            this.tax = str19;
            this.taxCurrency = str20;
            this.cancelReason = str21;
        }
    }

    /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bI\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B÷\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J®\u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010XJ\u0006\u0010Y\u001a\u00020ZJ\u0013\u0010[\u001a\u00020\f2\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020ZHÖ\u0001J\t\u0010_\u001a\u00020\u0004HÖ\u0001J\u0016\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020ZR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\"R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\"¨\u0006e"}, m90084d2 = {"Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "Landroid/os/Parcelable;", "triggerDirection", "", "triggerPrice", "triggerPriceType", "orderId", "symbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", ViewProps.HIDDEN, "", "iceberg", "side", "time", "", "averagePrice", "dealSize", "size", "orderType", "stp", "status", "funds", "filledFunds", "sizeUnit", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "cancelReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTriggerDirection", "()Ljava/lang/String;", "getTriggerPrice", "getTriggerPriceType", "getOrderId", "getSymbol", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIceberg", "getSide", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAveragePrice", "getDealSize", "getSize", "getOrderType", "getStp", "getStatus", "getFunds", "getFilledFunds", "getSizeUnit", "getFee", "getFeeCurrency", "getTax", "getTaxCurrency", "getCancelReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopMarket implements HistoryOrdersUiData$ItemEntity, Parcelable {

        @NotNull
        public static final Parcelable.Creator<StopMarket> CREATOR = new C11628a();

        @Nullable
        private final String averagePrice;

        @Nullable
        private final String cancelReason;

        @Nullable
        private final String dealSize;

        @Nullable
        private final String fee;

        @Nullable
        private final String feeCurrency;

        @Nullable
        private final String filledFunds;

        @Nullable
        private final String funds;

        @Nullable
        private final Boolean hidden;

        @Nullable
        private final Boolean iceberg;

        @Nullable
        private final String orderId;

        @Nullable
        private final String orderType;

        @Nullable
        private final String side;

        @Nullable
        private final String size;

        @Nullable
        private final String sizeUnit;

        @Nullable
        private final String status;

        @Nullable
        private final String stp;

        @Nullable
        private final String symbol;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        @Nullable
        private final String tax;

        @Nullable
        private final String taxCurrency;

        @Nullable
        private final Long time;

        @Nullable
        private final String triggerDirection;

        @Nullable
        private final String triggerPrice;

        @Nullable
        private final String triggerPriceType;

        /* JADX INFO: renamed from: com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity$StopMarket$a */
        /* JADX INFO: compiled from: HistoryOrdersUiData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C11628a implements Parcelable.Creator<StopMarket> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StopMarket createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Long lValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(StopMarket.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    lValueOf = null;
                }
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new StopMarket(string, string2, string3, string4, string5, symbolInfoEntity, boolValueOf, boolValueOf2, string6, lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StopMarket[] newArray(int i11) {
                return new StopMarket[i11];
            }
        }

        public static /* synthetic */ StopMarket copy$default(StopMarket stopMarket, String str, String str2, String str3, String str4, String str5, SymbolInfoEntity symbolInfoEntity, Boolean bool, Boolean bool2, String str6, Long l11, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i11, Object obj) {
            String str21;
            String str22;
            String str23 = (i11 & 1) != 0 ? stopMarket.triggerDirection : str;
            String str24 = (i11 & 2) != 0 ? stopMarket.triggerPrice : str2;
            String str25 = (i11 & 4) != 0 ? stopMarket.triggerPriceType : str3;
            String str26 = (i11 & 8) != 0 ? stopMarket.orderId : str4;
            String str27 = (i11 & 16) != 0 ? stopMarket.symbol : str5;
            SymbolInfoEntity symbolInfoEntity2 = (i11 & 32) != 0 ? stopMarket.symbolInfo : symbolInfoEntity;
            Boolean bool3 = (i11 & 64) != 0 ? stopMarket.hidden : bool;
            Boolean bool4 = (i11 & 128) != 0 ? stopMarket.iceberg : bool2;
            String str28 = (i11 & 256) != 0 ? stopMarket.side : str6;
            Long l12 = (i11 & 512) != 0 ? stopMarket.time : l11;
            String str29 = (i11 & 1024) != 0 ? stopMarket.averagePrice : str7;
            String str30 = (i11 & 2048) != 0 ? stopMarket.dealSize : str8;
            String str31 = (i11 & 4096) != 0 ? stopMarket.size : str9;
            String str32 = (i11 & 8192) != 0 ? stopMarket.orderType : str10;
            String str33 = str23;
            String str34 = (i11 & 16384) != 0 ? stopMarket.stp : str11;
            String str35 = (i11 & 32768) != 0 ? stopMarket.status : str12;
            String str36 = (i11 & 65536) != 0 ? stopMarket.funds : str13;
            String str37 = (i11 & 131072) != 0 ? stopMarket.filledFunds : str14;
            String str38 = (i11 & 262144) != 0 ? stopMarket.sizeUnit : str15;
            String str39 = (i11 & 524288) != 0 ? stopMarket.fee : str16;
            String str40 = (i11 & 1048576) != 0 ? stopMarket.feeCurrency : str17;
            String str41 = (i11 & 2097152) != 0 ? stopMarket.tax : str18;
            String str42 = (i11 & 4194304) != 0 ? stopMarket.taxCurrency : str19;
            if ((i11 & 8388608) != 0) {
                str22 = str42;
                str21 = stopMarket.cancelReason;
            } else {
                str21 = str20;
                str22 = str42;
            }
            return stopMarket.copy(str33, str24, str25, str26, str27, symbolInfoEntity2, bool3, bool4, str28, l12, str29, str30, str31, str32, str34, str35, str36, str37, str38, str39, str40, str41, str22, str21);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopMarket)) {
                return false;
            }
            StopMarket stopMarket = (StopMarket) other;
            return Intrinsics.areEqual(this.triggerDirection, stopMarket.triggerDirection) && Intrinsics.areEqual(this.triggerPrice, stopMarket.triggerPrice) && Intrinsics.areEqual(this.triggerPriceType, stopMarket.triggerPriceType) && Intrinsics.areEqual(this.orderId, stopMarket.orderId) && Intrinsics.areEqual(this.symbol, stopMarket.symbol) && Intrinsics.areEqual(this.symbolInfo, stopMarket.symbolInfo) && Intrinsics.areEqual(this.hidden, stopMarket.hidden) && Intrinsics.areEqual(this.iceberg, stopMarket.iceberg) && Intrinsics.areEqual(this.side, stopMarket.side) && Intrinsics.areEqual(this.time, stopMarket.time) && Intrinsics.areEqual(this.averagePrice, stopMarket.averagePrice) && Intrinsics.areEqual(this.dealSize, stopMarket.dealSize) && Intrinsics.areEqual(this.size, stopMarket.size) && Intrinsics.areEqual(this.orderType, stopMarket.orderType) && Intrinsics.areEqual(this.stp, stopMarket.stp) && Intrinsics.areEqual(this.status, stopMarket.status) && Intrinsics.areEqual(this.funds, stopMarket.funds) && Intrinsics.areEqual(this.filledFunds, stopMarket.filledFunds) && Intrinsics.areEqual(this.sizeUnit, stopMarket.sizeUnit) && Intrinsics.areEqual(this.fee, stopMarket.fee) && Intrinsics.areEqual(this.feeCurrency, stopMarket.feeCurrency) && Intrinsics.areEqual(this.tax, stopMarket.tax) && Intrinsics.areEqual(this.taxCurrency, stopMarket.taxCurrency) && Intrinsics.areEqual(this.cancelReason, stopMarket.cancelReason);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getAveragePrice() {
            return this.averagePrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getDealSize() {
            return this.dealSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getStp() {
            return this.stp;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getFunds() {
            return this.funds;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getFilledFunds() {
            return this.filledFunds;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getSizeUnit() {
            return this.sizeUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getFee() {
            return this.fee;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getTax() {
            return this.tax;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getCancelReason() {
            return this.cancelReason;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTriggerPriceType() {
            return this.triggerPriceType;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getHidden() {
            return this.hidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getIceberg() {
            return this.iceberg;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @NotNull
        public final StopMarket copy(@Nullable String triggerDirection, @Nullable String triggerPrice, @Nullable String triggerPriceType, @Nullable String orderId, @Nullable String symbol, @Nullable SymbolInfoEntity symbolInfo, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String side, @Nullable Long time, @Nullable String averagePrice, @Nullable String dealSize, @Nullable String size, @Nullable String orderType, @Nullable String stp, @Nullable String status, @Nullable String funds, @Nullable String filledFunds, @Nullable String sizeUnit, @Nullable String fee, @Nullable String feeCurrency, @Nullable String tax, @Nullable String taxCurrency, @Nullable String cancelReason) {
            return new StopMarket(triggerDirection, triggerPrice, triggerPriceType, orderId, symbol, symbolInfo, hidden, iceberg, side, time, averagePrice, dealSize, size, orderType, stp, status, funds, filledFunds, sizeUnit, fee, feeCurrency, tax, taxCurrency, cancelReason);
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getAveragePrice() {
            return this.averagePrice;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getCancelReason() {
            return this.cancelReason;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getDealSize() {
            return this.dealSize;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFee() {
            return this.fee;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFeeCurrency() {
            return this.feeCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFilledFunds() {
            return this.filledFunds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getFunds() {
            return this.funds;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getHidden() {
            return this.hidden;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Boolean getIceberg() {
            return this.iceberg;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getOrderType() {
            return this.orderType;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSide() {
            return this.side;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSize() {
            return this.size;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSizeUnit() {
            return this.sizeUnit;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStatus() {
            return this.status;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getStp() {
            return this.stp;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTax() {
            return this.tax;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public String getTaxCurrency() {
            return this.taxCurrency;
        }

        @Override // com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity
        @Nullable
        public Long getTime() {
            return this.time;
        }

        @Nullable
        public final String getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        public final String getTriggerPrice() {
            return this.triggerPrice;
        }

        @Nullable
        public final String getTriggerPriceType() {
            return this.triggerPriceType;
        }

        public int hashCode() {
            String str = this.triggerDirection;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.triggerPrice;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.triggerPriceType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.orderId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.symbol;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            int iHashCode6 = (iHashCode5 + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
            Boolean bool = this.hidden;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.iceberg;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str6 = this.side;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.time;
            int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str7 = this.averagePrice;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.dealSize;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.size;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.orderType;
            int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.stp;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.status;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.funds;
            int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.filledFunds;
            int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.sizeUnit;
            int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.fee;
            int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.feeCurrency;
            int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.tax;
            int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.taxCurrency;
            int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.cancelReason;
            return iHashCode23 + (str20 != null ? str20.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "StopMarket(triggerDirection=" + this.triggerDirection + ", triggerPrice=" + this.triggerPrice + ", triggerPriceType=" + this.triggerPriceType + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", side=" + this.side + ", time=" + this.time + ", averagePrice=" + this.averagePrice + ", dealSize=" + this.dealSize + ", size=" + this.size + ", orderType=" + this.orderType + ", stp=" + this.stp + ", status=" + this.status + ", funds=" + this.funds + ", filledFunds=" + this.filledFunds + ", sizeUnit=" + this.sizeUnit + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", cancelReason=" + this.cancelReason + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.triggerDirection);
            dest.writeString(this.triggerPrice);
            dest.writeString(this.triggerPriceType);
            dest.writeString(this.orderId);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.symbolInfo, flags);
            Boolean bool = this.hidden;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.iceberg;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.side);
            Long l11 = this.time;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l11.longValue());
            }
            dest.writeString(this.averagePrice);
            dest.writeString(this.dealSize);
            dest.writeString(this.size);
            dest.writeString(this.orderType);
            dest.writeString(this.stp);
            dest.writeString(this.status);
            dest.writeString(this.funds);
            dest.writeString(this.filledFunds);
            dest.writeString(this.sizeUnit);
            dest.writeString(this.fee);
            dest.writeString(this.feeCurrency);
            dest.writeString(this.tax);
            dest.writeString(this.taxCurrency);
            dest.writeString(this.cancelReason);
        }

        public StopMarket(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str6, @Nullable Long l11, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20) {
            this.triggerDirection = str;
            this.triggerPrice = str2;
            this.triggerPriceType = str3;
            this.orderId = str4;
            this.symbol = str5;
            this.symbolInfo = symbolInfoEntity;
            this.hidden = bool;
            this.iceberg = bool2;
            this.side = str6;
            this.time = l11;
            this.averagePrice = str7;
            this.dealSize = str8;
            this.size = str9;
            this.orderType = str10;
            this.stp = str11;
            this.status = str12;
            this.funds = str13;
            this.filledFunds = str14;
            this.sizeUnit = str15;
            this.fee = str16;
            this.feeCurrency = str17;
            this.tax = str18;
            this.taxCurrency = str19;
            this.cancelReason = str20;
        }
    }

    @Nullable
    String getAveragePrice();

    @Nullable
    String getCancelReason();

    @Nullable
    String getDealSize();

    @Nullable
    String getFee();

    @Nullable
    String getFeeCurrency();

    @Nullable
    String getFilledFunds();

    @Nullable
    String getFunds();

    @Nullable
    Boolean getHidden();

    @Nullable
    Boolean getIceberg();

    @Nullable
    String getOrderId();

    @Nullable
    String getOrderType();

    @Nullable
    String getSide();

    @Nullable
    String getSize();

    @Nullable
    String getSizeUnit();

    @Nullable
    String getStatus();

    @Nullable
    String getStp();

    @Nullable
    String getSymbol();

    @Nullable
    SymbolInfoEntity getSymbolInfo();

    @Nullable
    String getTax();

    @Nullable
    String getTaxCurrency();

    @Nullable
    Long getTime();
}
