package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33616e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.base.order.data.HistoryOrderList$ResponseItemEntity, reason: from toString */
/* JADX INFO: compiled from: HistoryOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b^\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÇ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010'J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010X\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u008e\u0003\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010nJ\u0006\u0010o\u001a\u00020pJ\u0013\u0010q\u001a\u00020\u00112\b\u0010r\u001a\u0004\u0018\u00010sHÖ\u0003J\t\u0010t\u001a\u00020pHÖ\u0001J\t\u0010u\u001a\u00020\u0004HÖ\u0001J\u0016\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020pR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00103\u001a\u0004\b5\u00102R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0013\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0013\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0013\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)R\u0013\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010)R\u0013\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010)¨\u0006{"}, m90084d2 = {"Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;", "Landroid/os/Parcelable;", "Lcom/kubi/core/base/arch/api/IResponse;", "orderId", "", "symbol", "orderType", "orderDisplayType", "side", FirebaseAnalytics.Param.PRICE, "timeInForce", C33616e0.f69644s, "orderTime", "", "stp", "cancelAfter", "postOnly", "", ViewProps.HIDDEN, "iceberg", "visibleSize", "matchOrderId", "clientTimestamp", "triggerDirection", "triggerPrice", "triggerPriceType", "status", "pnl", "filledFunds", "funds", "filledSize", "size", "avgPrice", "fee", "feeCurrency", FirebaseAnalytics.Param.TAX, "taxCurrency", "cancelReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "getOrderType", "getOrderDisplayType", "getSide", "getPrice", "getTimeInForce", "getTags", "getOrderTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStp", "getCancelAfter", "getPostOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHidden", "getIceberg", "getVisibleSize", "getMatchOrderId", "getClientTimestamp", "getTriggerDirection", "getTriggerPrice", "getTriggerPriceType", "getStatus", "getPnl", "getFilledFunds", "getFunds", "getFilledSize", "getSize", "getAvgPrice", "getFee", "getFeeCurrency", "getTax", "getTaxCurrency", "getCancelReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ResponseItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ResponseItemEntity> CREATOR = new C11604a();

    @Nullable
    private final String avgPrice;

    @Nullable
    private final Long cancelAfter;

    @Nullable
    private final String cancelReason;

    @Nullable
    private final String clientTimestamp;

    @Nullable
    private final String fee;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final String filledFunds;

    @Nullable
    private final String filledSize;

    @Nullable
    private final String funds;

    @Nullable
    private final Boolean hidden;

    @Nullable
    private final Boolean iceberg;

    @Nullable
    private final String matchOrderId;

    @Nullable
    private final String orderDisplayType;

    @Nullable
    private final String orderId;

    @Nullable
    private final Long orderTime;

    @Nullable
    private final String orderType;

    @Nullable
    private final String pnl;

    @Nullable
    private final Boolean postOnly;

    @Nullable
    private final String price;

    @Nullable
    private final String side;

    @Nullable
    private final String size;

    @Nullable
    private final String status;

    @Nullable
    private final String stp;

    @Nullable
    private final String symbol;

    @Nullable
    private final String tags;

    @Nullable
    private final String tax;

    @Nullable
    private final String taxCurrency;

    @Nullable
    private final String timeInForce;

    @Nullable
    private final String triggerDirection;

    @Nullable
    private final String triggerPrice;

    @Nullable
    private final String triggerPriceType;

    @Nullable
    private final String visibleSize;

    /* JADX INFO: renamed from: com.kubi.core.base.order.data.HistoryOrderList$ResponseItemEntity$a */
    /* JADX INFO: compiled from: HistoryOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11604a implements Parcelable.Creator<ResponseItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ResponseItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Boolean boolValueOf3 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string9 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ResponseItemEntity(string, string2, string3, string4, string5, string6, string7, string8, lValueOf, string9, lValueOf2, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ResponseItemEntity[] newArray(int i11) {
            return new ResponseItemEntity[i11];
        }
    }

    public static /* synthetic */ ResponseItemEntity copy$default(ResponseItemEntity responseItemEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, String str9, Long l12, Boolean bool, Boolean bool2, Boolean bool3, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i11, Object obj) {
        String str28;
        String str29;
        String str30 = (i11 & 1) != 0 ? responseItemEntity.orderId : str;
        String str31 = (i11 & 2) != 0 ? responseItemEntity.symbol : str2;
        String str32 = (i11 & 4) != 0 ? responseItemEntity.orderType : str3;
        String str33 = (i11 & 8) != 0 ? responseItemEntity.orderDisplayType : str4;
        String str34 = (i11 & 16) != 0 ? responseItemEntity.side : str5;
        String str35 = (i11 & 32) != 0 ? responseItemEntity.price : str6;
        String str36 = (i11 & 64) != 0 ? responseItemEntity.timeInForce : str7;
        String str37 = (i11 & 128) != 0 ? responseItemEntity.tags : str8;
        Long l13 = (i11 & 256) != 0 ? responseItemEntity.orderTime : l11;
        String str38 = (i11 & 512) != 0 ? responseItemEntity.stp : str9;
        Long l14 = (i11 & 1024) != 0 ? responseItemEntity.cancelAfter : l12;
        Boolean bool4 = (i11 & 2048) != 0 ? responseItemEntity.postOnly : bool;
        Boolean bool5 = (i11 & 4096) != 0 ? responseItemEntity.hidden : bool2;
        Boolean bool6 = (i11 & 8192) != 0 ? responseItemEntity.iceberg : bool3;
        String str39 = str30;
        String str40 = (i11 & 16384) != 0 ? responseItemEntity.visibleSize : str10;
        String str41 = (i11 & 32768) != 0 ? responseItemEntity.matchOrderId : str11;
        String str42 = (i11 & 65536) != 0 ? responseItemEntity.clientTimestamp : str12;
        String str43 = (i11 & 131072) != 0 ? responseItemEntity.triggerDirection : str13;
        String str44 = (i11 & 262144) != 0 ? responseItemEntity.triggerPrice : str14;
        String str45 = (i11 & 524288) != 0 ? responseItemEntity.triggerPriceType : str15;
        String str46 = (i11 & 1048576) != 0 ? responseItemEntity.status : str16;
        String str47 = (i11 & 2097152) != 0 ? responseItemEntity.pnl : str17;
        String str48 = (i11 & 4194304) != 0 ? responseItemEntity.filledFunds : str18;
        String str49 = (i11 & 8388608) != 0 ? responseItemEntity.funds : str19;
        String str50 = (i11 & 16777216) != 0 ? responseItemEntity.filledSize : str20;
        String str51 = (i11 & 33554432) != 0 ? responseItemEntity.size : str21;
        String str52 = (i11 & 67108864) != 0 ? responseItemEntity.avgPrice : str22;
        String str53 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? responseItemEntity.fee : str23;
        String str54 = (i11 & 268435456) != 0 ? responseItemEntity.feeCurrency : str24;
        String str55 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? responseItemEntity.tax : str25;
        String str56 = (i11 & 1073741824) != 0 ? responseItemEntity.taxCurrency : str26;
        if ((i11 & Integer.MIN_VALUE) != 0) {
            str29 = str56;
            str28 = responseItemEntity.cancelReason;
        } else {
            str28 = str27;
            str29 = str56;
        }
        return responseItemEntity.copy(str39, str31, str32, str33, str34, str35, str36, str37, l13, str38, l14, bool4, bool5, bool6, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str29, str28);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseItemEntity)) {
            return false;
        }
        ResponseItemEntity responseItemEntity = (ResponseItemEntity) other;
        return Intrinsics.areEqual(this.orderId, responseItemEntity.orderId) && Intrinsics.areEqual(this.symbol, responseItemEntity.symbol) && Intrinsics.areEqual(this.orderType, responseItemEntity.orderType) && Intrinsics.areEqual(this.orderDisplayType, responseItemEntity.orderDisplayType) && Intrinsics.areEqual(this.side, responseItemEntity.side) && Intrinsics.areEqual(this.price, responseItemEntity.price) && Intrinsics.areEqual(this.timeInForce, responseItemEntity.timeInForce) && Intrinsics.areEqual(this.tags, responseItemEntity.tags) && Intrinsics.areEqual(this.orderTime, responseItemEntity.orderTime) && Intrinsics.areEqual(this.stp, responseItemEntity.stp) && Intrinsics.areEqual(this.cancelAfter, responseItemEntity.cancelAfter) && Intrinsics.areEqual(this.postOnly, responseItemEntity.postOnly) && Intrinsics.areEqual(this.hidden, responseItemEntity.hidden) && Intrinsics.areEqual(this.iceberg, responseItemEntity.iceberg) && Intrinsics.areEqual(this.visibleSize, responseItemEntity.visibleSize) && Intrinsics.areEqual(this.matchOrderId, responseItemEntity.matchOrderId) && Intrinsics.areEqual(this.clientTimestamp, responseItemEntity.clientTimestamp) && Intrinsics.areEqual(this.triggerDirection, responseItemEntity.triggerDirection) && Intrinsics.areEqual(this.triggerPrice, responseItemEntity.triggerPrice) && Intrinsics.areEqual(this.triggerPriceType, responseItemEntity.triggerPriceType) && Intrinsics.areEqual(this.status, responseItemEntity.status) && Intrinsics.areEqual(this.pnl, responseItemEntity.pnl) && Intrinsics.areEqual(this.filledFunds, responseItemEntity.filledFunds) && Intrinsics.areEqual(this.funds, responseItemEntity.funds) && Intrinsics.areEqual(this.filledSize, responseItemEntity.filledSize) && Intrinsics.areEqual(this.size, responseItemEntity.size) && Intrinsics.areEqual(this.avgPrice, responseItemEntity.avgPrice) && Intrinsics.areEqual(this.fee, responseItemEntity.fee) && Intrinsics.areEqual(this.feeCurrency, responseItemEntity.feeCurrency) && Intrinsics.areEqual(this.tax, responseItemEntity.tax) && Intrinsics.areEqual(this.taxCurrency, responseItemEntity.taxCurrency) && Intrinsics.areEqual(this.cancelReason, responseItemEntity.cancelReason);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStp() {
        return this.stp;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getCancelAfter() {
        return this.cancelAfter;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMatchOrderId() {
        return this.matchOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getClientTimestamp() {
        return this.clientTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getFilledFunds() {
        return this.filledFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFunds() {
        return this.funds;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getFilledSize() {
        return this.filledSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @NotNull
    public final ResponseItemEntity copy(@Nullable String orderId, @Nullable String symbol, @Nullable String orderType, @Nullable String orderDisplayType, @Nullable String side, @Nullable String price, @Nullable String timeInForce, @Nullable String tags, @Nullable Long orderTime, @Nullable String stp, @Nullable Long cancelAfter, @Nullable Boolean postOnly, @Nullable Boolean hidden, @Nullable Boolean iceberg, @Nullable String visibleSize, @Nullable String matchOrderId, @Nullable String clientTimestamp, @Nullable String triggerDirection, @Nullable String triggerPrice, @Nullable String triggerPriceType, @Nullable String status, @Nullable String pnl, @Nullable String filledFunds, @Nullable String funds, @Nullable String filledSize, @Nullable String size, @Nullable String avgPrice, @Nullable String fee, @Nullable String feeCurrency, @Nullable String tax, @Nullable String taxCurrency, @Nullable String cancelReason) {
        return new ResponseItemEntity(orderId, symbol, orderType, orderDisplayType, side, price, timeInForce, tags, orderTime, stp, cancelAfter, postOnly, hidden, iceberg, visibleSize, matchOrderId, clientTimestamp, triggerDirection, triggerPrice, triggerPriceType, status, pnl, filledFunds, funds, filledSize, size, avgPrice, fee, feeCurrency, tax, taxCurrency, cancelReason);
    }

    @Nullable
    public final String getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    public final Long getCancelAfter() {
        return this.cancelAfter;
    }

    @Nullable
    public final String getCancelReason() {
        return this.cancelReason;
    }

    @Nullable
    public final String getClientTimestamp() {
        return this.clientTimestamp;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final String getFilledFunds() {
        return this.filledFunds;
    }

    @Nullable
    public final String getFilledSize() {
        return this.filledSize;
    }

    @Nullable
    public final String getFunds() {
        return this.funds;
    }

    @Nullable
    public final Boolean getHidden() {
        return this.hidden;
    }

    @Nullable
    public final Boolean getIceberg() {
        return this.iceberg;
    }

    @Nullable
    public final String getMatchOrderId() {
        return this.matchOrderId;
    }

    @Nullable
    public final String getOrderDisplayType() {
        return this.orderDisplayType;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Long getOrderTime() {
        return this.orderTime;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    public final Boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStp() {
        return this.stp;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
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

    @Nullable
    public final String getVisibleSize() {
        return this.visibleSize;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderDisplayType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.price;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timeInForce;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tags;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.orderTime;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.stp;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l12 = this.cancelAfter;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool = this.postOnly;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hidden;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.iceberg;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str10 = this.visibleSize;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.matchOrderId;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.clientTimestamp;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.triggerDirection;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.triggerPrice;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.triggerPriceType;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.status;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.pnl;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.filledFunds;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.funds;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.filledSize;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.size;
        int iHashCode26 = (iHashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.avgPrice;
        int iHashCode27 = (iHashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.fee;
        int iHashCode28 = (iHashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.feeCurrency;
        int iHashCode29 = (iHashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.tax;
        int iHashCode30 = (iHashCode29 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.taxCurrency;
        int iHashCode31 = (iHashCode30 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.cancelReason;
        return iHashCode31 + (str27 != null ? str27.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResponseItemEntity(orderId=" + this.orderId + ", symbol=" + this.symbol + ", orderType=" + this.orderType + ", orderDisplayType=" + this.orderDisplayType + ", side=" + this.side + ", price=" + this.price + ", timeInForce=" + this.timeInForce + ", tags=" + this.tags + ", orderTime=" + this.orderTime + ", stp=" + this.stp + ", cancelAfter=" + this.cancelAfter + ", postOnly=" + this.postOnly + ", hidden=" + this.hidden + ", iceberg=" + this.iceberg + ", visibleSize=" + this.visibleSize + ", matchOrderId=" + this.matchOrderId + ", clientTimestamp=" + this.clientTimestamp + ", triggerDirection=" + this.triggerDirection + ", triggerPrice=" + this.triggerPrice + ", triggerPriceType=" + this.triggerPriceType + ", status=" + this.status + ", pnl=" + this.pnl + ", filledFunds=" + this.filledFunds + ", funds=" + this.funds + ", filledSize=" + this.filledSize + ", size=" + this.size + ", avgPrice=" + this.avgPrice + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", cancelReason=" + this.cancelReason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.symbol);
        dest.writeString(this.orderType);
        dest.writeString(this.orderDisplayType);
        dest.writeString(this.side);
        dest.writeString(this.price);
        dest.writeString(this.timeInForce);
        dest.writeString(this.tags);
        Long l11 = this.orderTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.stp);
        Long l12 = this.cancelAfter;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Boolean bool = this.postOnly;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hidden;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.iceberg;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.visibleSize);
        dest.writeString(this.matchOrderId);
        dest.writeString(this.clientTimestamp);
        dest.writeString(this.triggerDirection);
        dest.writeString(this.triggerPrice);
        dest.writeString(this.triggerPriceType);
        dest.writeString(this.status);
        dest.writeString(this.pnl);
        dest.writeString(this.filledFunds);
        dest.writeString(this.funds);
        dest.writeString(this.filledSize);
        dest.writeString(this.size);
        dest.writeString(this.avgPrice);
        dest.writeString(this.fee);
        dest.writeString(this.feeCurrency);
        dest.writeString(this.tax);
        dest.writeString(this.taxCurrency);
        dest.writeString(this.cancelReason);
    }

    public ResponseItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l11, @Nullable String str9, @Nullable Long l12, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27) {
        this.orderId = str;
        this.symbol = str2;
        this.orderType = str3;
        this.orderDisplayType = str4;
        this.side = str5;
        this.price = str6;
        this.timeInForce = str7;
        this.tags = str8;
        this.orderTime = l11;
        this.stp = str9;
        this.cancelAfter = l12;
        this.postOnly = bool;
        this.hidden = bool2;
        this.iceberg = bool3;
        this.visibleSize = str10;
        this.matchOrderId = str11;
        this.clientTimestamp = str12;
        this.triggerDirection = str13;
        this.triggerPrice = str14;
        this.triggerPriceType = str15;
        this.status = str16;
        this.pnl = str17;
        this.filledFunds = str18;
        this.funds = str19;
        this.filledSize = str20;
        this.size = str21;
        this.avgPrice = str22;
        this.fee = str23;
        this.feeCurrency = str24;
        this.tax = str25;
        this.taxCurrency = str26;
        this.cancelReason = str27;
    }
}
