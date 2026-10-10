package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.entity.AssetsCollateralRatio;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37885i;
import gf.C37886j;
import gf.C37890n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p838zo.C46897a;
import p838zo.C46901e;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarginPosition.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u0006\u0010B\u001a\u00020\u0003J\u0006\u0010C\u001a\u00020\nJ\u0006\u0010D\u001a\u00020\nJ\r\u0010E\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010'J\u0006\u0010F\u001a\u00020\nJ\u0006\u0010G\u001a\u00020\nJ\u0015\u0010H\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010J¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0003J\u0006\u0010M\u001a\u00020\u0003J\u0010\u0010N\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\u0003J\u0010\u0010P\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u0005J\u0006\u0010R\u001a\u00020\u0003J\b\u0010S\u001a\u0004\u0018\u00010\u0005J\b\u0010T\u001a\u0004\u0018\u00010\u0005J\u0014\u0010U\u001a\u0004\u0018\u00010\u00052\b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010V\u001a\u0004\u0018\u00010\u0005J\b\u0010W\u001a\u00020\nH\u0002J\u0006\u0010X\u001a\u00020\nJ\u0006\u0010Y\u001a\u00020ZJ\b\u0010[\u001a\u0004\u0018\u00010\u0005J\b\u0010\\\u001a\u0004\u0018\u00010\u0005J\u0006\u0010]\u001a\u00020\u0005J\u0006\u0010^\u001a\u00020\u0005J\f\u0010_\u001a\u00020\u0005*\u00020\u0007H\u0002J\f\u0010`\u001a\u00020\u0005*\u00020\u0007H\u0002J\f\u0010a\u001a\u00020\u0005*\u00020\u0007H\u0002J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010>Jæ\u0001\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010uJ\u0006\u0010v\u001a\u00020JJ\u0013\u0010w\u001a\u00020\n2\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020JHÖ\u0001J\t\u0010{\u001a\u00020\u0003HÖ\u0001J\u0016\u0010|\u001a\u00020Z2\u0006\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020JR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b\t\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006\u0080\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginPosition;", "Landroid/os/Parcelable;", "symbol", "", "accumulatedPrincipal", "Ljava/math/BigDecimal;", "baseAsset", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "id", "isAutoRepay", "", "liabilityConversionBalance", "positionPermission", "quoteAsset", "riskGrade", "status", "statusBizType", "statusRecId", "tag", "totalConversionBalance", "type", "userId", "userLeverage", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "()V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getAccumulatedPrincipal", "()Ljava/math/BigDecimal;", "setAccumulatedPrincipal", "(Ljava/math/BigDecimal;)V", "getBaseAsset", "()Lcom/kubi/tradebase/entity/CurrencyBalance;", "getId", "()Ljava/lang/Boolean;", "setAutoRepay", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLiabilityConversionBalance", "setLiabilityConversionBalance", "getPositionPermission", "getQuoteAsset", "getRiskGrade", "getStatus", "setStatus", "getStatusBizType", "setStatusBizType", "getStatusRecId", "getTag", "setTag", "getTotalConversionBalance", "setTotalConversionBalance", "getType", "getUserId", "getUserLeverage", "setUserLeverage", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "showSymbol", "isOpenStatus", "showProfitDes", "isShowDirection", "isTransferEnable", "isCloseEnable", "getProfitValueString", "pnlPrecision", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getProfitRateString", "getAssetQuoteBalanceString", "getProfitValueLegalString", "stub", "liquidationPriceString", "liqRate", "getMarkPriceString", "calculatorProfitValue", "calculatorProfitPercent", "calculatorLiqPrice", "calculatorLiabilityRate", "noValueRule", "isLiability", "updateByWs", "", "liabilityConversionCompat", "totalConversionCompat", "totalMarginConversionCoefficient", "totalConversionCoefficient", "getTotalConversionCoefficient", "marginTotalConversionCoefficient", "gradientPriceCoefficient", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lcom/kubi/margin/api/entity/MarginPosition;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginPosition.kt\ncom/kubi/margin/api/entity/MarginPosition\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,487:1\n1056#2:488\n*S KotlinDebug\n*F\n+ 1 MarginPosition.kt\ncom/kubi/margin/api/entity/MarginPosition\n*L\n462#1:488\n*E\n"})
public final /* data */ class MarginPosition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginPosition> CREATOR = new C17488a();

    @Nullable
    private BigDecimal accumulatedPrincipal;

    @Nullable
    private final CurrencyBalance baseAsset;

    @Nullable
    private final String id;

    @Nullable
    private Boolean isAutoRepay;

    @Nullable
    private BigDecimal liabilityConversionBalance;

    @Nullable
    private final String positionPermission;

    @Nullable
    private final CurrencyBalance quoteAsset;

    @Nullable
    private final String riskGrade;

    @Nullable
    private String status;

    @Nullable
    private String statusBizType;

    @Nullable
    private final String statusRecId;

    @Nullable
    private String symbol;

    @Nullable
    private String tag;

    @Nullable
    private Long timestamp;

    @Nullable
    private BigDecimal totalConversionBalance;

    @Nullable
    private final String type;

    @Nullable
    private final String userId;

    @Nullable
    private BigDecimal userLeverage;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginPosition$a */
    /* JADX INFO: compiled from: MarginPosition.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17488a implements Parcelable.Creator<MarginPosition> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginPosition createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            CurrencyBalance currencyBalance = (CurrencyBalance) parcel.readParcelable(MarginPosition.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarginPosition(string, bigDecimal, currencyBalance, string2, boolValueOf, (BigDecimal) parcel.readSerializable(), parcel.readString(), (CurrencyBalance) parcel.readParcelable(MarginPosition.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginPosition[] newArray(int i11) {
            return new MarginPosition[i11];
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginPosition$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginPosition.kt\ncom/kubi/margin/api/entity/MarginPosition\n*L\n1#1,328:1\n463#2:329\n*E\n"})
    public static final class C17489b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal minVal = ((AssetsCollateralRatio) t11).getMinVal();
            BigDecimal bigDecimalM89922G = minVal != null ? C41014a.m89922G(minVal, null, 1, null) : null;
            BigDecimal minVal2 = ((AssetsCollateralRatio) t12).getMinVal();
            return ComparisonsKt.compareValues(bigDecimalM89922G, minVal2 != null ? C41014a.m89922G(minVal2, null, 1, null) : null);
        }
    }

    public MarginPosition(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable CurrencyBalance currencyBalance, @Nullable String str2, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal2, @Nullable String str3, @Nullable CurrencyBalance currencyBalance2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal3, @Nullable String str9, @Nullable String str10, @Nullable BigDecimal bigDecimal4, @Nullable Long l11) {
        this.symbol = str;
        this.accumulatedPrincipal = bigDecimal;
        this.baseAsset = currencyBalance;
        this.id = str2;
        this.isAutoRepay = bool;
        this.liabilityConversionBalance = bigDecimal2;
        this.positionPermission = str3;
        this.quoteAsset = currencyBalance2;
        this.riskGrade = str4;
        this.status = str5;
        this.statusBizType = str6;
        this.statusRecId = str7;
        this.tag = str8;
        this.totalConversionBalance = bigDecimal3;
        this.type = str9;
        this.userId = str10;
        this.userLeverage = bigDecimal4;
        this.timestamp = l11;
    }

    public static /* synthetic */ MarginPosition copy$default(MarginPosition marginPosition, String str, BigDecimal bigDecimal, CurrencyBalance currencyBalance, String str2, Boolean bool, BigDecimal bigDecimal2, String str3, CurrencyBalance currencyBalance2, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal3, String str9, String str10, BigDecimal bigDecimal4, Long l11, int i11, Object obj) {
        Long l12;
        BigDecimal bigDecimal5;
        String str11 = (i11 & 1) != 0 ? marginPosition.symbol : str;
        BigDecimal bigDecimal6 = (i11 & 2) != 0 ? marginPosition.accumulatedPrincipal : bigDecimal;
        CurrencyBalance currencyBalance3 = (i11 & 4) != 0 ? marginPosition.baseAsset : currencyBalance;
        String str12 = (i11 & 8) != 0 ? marginPosition.id : str2;
        Boolean bool2 = (i11 & 16) != 0 ? marginPosition.isAutoRepay : bool;
        BigDecimal bigDecimal7 = (i11 & 32) != 0 ? marginPosition.liabilityConversionBalance : bigDecimal2;
        String str13 = (i11 & 64) != 0 ? marginPosition.positionPermission : str3;
        CurrencyBalance currencyBalance4 = (i11 & 128) != 0 ? marginPosition.quoteAsset : currencyBalance2;
        String str14 = (i11 & 256) != 0 ? marginPosition.riskGrade : str4;
        String str15 = (i11 & 512) != 0 ? marginPosition.status : str5;
        String str16 = (i11 & 1024) != 0 ? marginPosition.statusBizType : str6;
        String str17 = (i11 & 2048) != 0 ? marginPosition.statusRecId : str7;
        String str18 = (i11 & 4096) != 0 ? marginPosition.tag : str8;
        BigDecimal bigDecimal8 = (i11 & 8192) != 0 ? marginPosition.totalConversionBalance : bigDecimal3;
        String str19 = str11;
        String str20 = (i11 & 16384) != 0 ? marginPosition.type : str9;
        String str21 = (i11 & 32768) != 0 ? marginPosition.userId : str10;
        BigDecimal bigDecimal9 = (i11 & 65536) != 0 ? marginPosition.userLeverage : bigDecimal4;
        if ((i11 & 131072) != 0) {
            bigDecimal5 = bigDecimal9;
            l12 = marginPosition.timestamp;
        } else {
            l12 = l11;
            bigDecimal5 = bigDecimal9;
        }
        return marginPosition.copy(str19, bigDecimal6, currencyBalance3, str12, bool2, bigDecimal7, str13, currencyBalance4, str14, str15, str16, str17, str18, bigDecimal8, str20, str21, bigDecimal5, l12);
    }

    @NotNull
    public final MarginPosition copy(@Nullable String symbol, @Nullable BigDecimal accumulatedPrincipal, @Nullable CurrencyBalance baseAsset, @Nullable String id2, @Nullable Boolean isAutoRepay, @Nullable BigDecimal liabilityConversionBalance, @Nullable String positionPermission, @Nullable CurrencyBalance quoteAsset, @Nullable String riskGrade, @Nullable String status, @Nullable String statusBizType, @Nullable String statusRecId, @Nullable String tag, @Nullable BigDecimal totalConversionBalance, @Nullable String type, @Nullable String userId, @Nullable BigDecimal userLeverage, @Nullable Long timestamp) {
        return new MarginPosition(symbol, accumulatedPrincipal, baseAsset, id2, isAutoRepay, liabilityConversionBalance, positionPermission, quoteAsset, riskGrade, status, statusBizType, statusRecId, tag, totalConversionBalance, type, userId, userLeverage, timestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginPosition)) {
            return false;
        }
        MarginPosition marginPosition = (MarginPosition) other;
        return Intrinsics.areEqual(this.symbol, marginPosition.symbol) && Intrinsics.areEqual(this.accumulatedPrincipal, marginPosition.accumulatedPrincipal) && Intrinsics.areEqual(this.baseAsset, marginPosition.baseAsset) && Intrinsics.areEqual(this.id, marginPosition.id) && Intrinsics.areEqual(this.isAutoRepay, marginPosition.isAutoRepay) && Intrinsics.areEqual(this.liabilityConversionBalance, marginPosition.liabilityConversionBalance) && Intrinsics.areEqual(this.positionPermission, marginPosition.positionPermission) && Intrinsics.areEqual(this.quoteAsset, marginPosition.quoteAsset) && Intrinsics.areEqual(this.riskGrade, marginPosition.riskGrade) && Intrinsics.areEqual(this.status, marginPosition.status) && Intrinsics.areEqual(this.statusBizType, marginPosition.statusBizType) && Intrinsics.areEqual(this.statusRecId, marginPosition.statusRecId) && Intrinsics.areEqual(this.tag, marginPosition.tag) && Intrinsics.areEqual(this.totalConversionBalance, marginPosition.totalConversionBalance) && Intrinsics.areEqual(this.type, marginPosition.type) && Intrinsics.areEqual(this.userId, marginPosition.userId) && Intrinsics.areEqual(this.userLeverage, marginPosition.userLeverage) && Intrinsics.areEqual(this.timestamp, marginPosition.timestamp);
    }

    public static /* synthetic */ String getProfitValueLegalString$default(MarginPosition marginPosition, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return marginPosition.getProfitValueLegalString(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStatusRecId() {
        return this.statusRecId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getTotalConversionBalance() {
        return this.totalConversionBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getUserLeverage() {
        return this.userLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAccumulatedPrincipal() {
        return this.accumulatedPrincipal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CurrencyBalance getBaseAsset() {
        return this.baseAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsAutoRepay() {
        return this.isAutoRepay;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLiabilityConversionBalance() {
        return this.liabilityConversionBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPositionPermission() {
        return this.positionPermission;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CurrencyBalance getQuoteAsset() {
        return this.quoteAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    public final BigDecimal getAccumulatedPrincipal() {
        return this.accumulatedPrincipal;
    }

    @NotNull
    public final String getAssetQuoteBalanceString() {
        BigDecimal bigDecimal = totalConversionCompat();
        String strM85578b = null;
        if (bigDecimal != null) {
            CurrencyBalance currencyBalance = this.quoteAsset;
            BigDecimal bigDecimalDivide = bigDecimal.divide(C41014a.m89921F(currencyBalance != null ? C46897a.m103292d(currencyBalance) : null, "1"), 12, RoundingMode.DOWN);
            if (bigDecimalDivide != null) {
                CurrencyBalance currencyBalance2 = this.quoteAsset;
                strM85578b = C37886j.m85578b(bigDecimalDivide, C27041f.m66668h(currencyBalance2 != null ? currencyBalance2.getCurrency() : null), null, false, false, false, 2, null, 0, 222, null);
            }
        }
        return C27041f.m66669i(strM85578b, C33820nf.f71144W);
    }

    @Nullable
    public final CurrencyBalance getBaseAsset() {
        return this.baseAsset;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getLiabilityConversionBalance() {
        return this.liabilityConversionBalance;
    }

    @NotNull
    public final String getMarkPriceString() {
        BigDecimal markPrice;
        CurrencyBalance currencyBalance = this.quoteAsset;
        String strM92640e = null;
        if (C41014a.m89922G(currencyBalance != null ? currencyBalance.getMarkPrice() : null, null, 1, null).compareTo(BigDecimal.ZERO) == 0) {
            return "--";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(this.tag));
        int iM66651k = C27039d.m66651k(symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getPriceIncrementPrecision()) : null, 8);
        CurrencyBalance currencyBalance2 = this.baseAsset;
        if (currencyBalance2 != null && (markPrice = currencyBalance2.getMarkPrice()) != null) {
            CurrencyBalance currencyBalance3 = this.quoteAsset;
            BigDecimal bigDecimalDivide = markPrice.divide(C41014a.m89922G(currencyBalance3 != null ? currencyBalance3.getMarkPrice() : null, null, 1, null), iM66651k, RoundingMode.DOWN);
            if (bigDecimalDivide != null) {
                strM92640e = C42180b.m92640e(bigDecimalDivide, null, iM66651k, false, false, true, 0, null, 109, null);
            }
        }
        return C27041f.m66669i(strM92640e, "--");
    }

    @Nullable
    public final String getPositionPermission() {
        return this.positionPermission;
    }

    @NotNull
    public final String getProfitValueLegalString(@NotNull String stub) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        BigDecimal bigDecimalCalculatorProfitValue = calculatorProfitValue();
        String strM89933g = null;
        if (bigDecimalCalculatorProfitValue != null) {
            BigDecimal bigDecimalAbs = bigDecimalCalculatorProfitValue.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            CurrencyBalance currencyBalance = this.quoteAsset;
            strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalAbs, C27041f.m66668h(currencyBalance != null ? currencyBalance.getCurrency() : null)))), null, null, 0, false, true, false, 47, null);
        }
        return C27041f.m66669i(strM89933g, stub);
    }

    @NotNull
    public final String getProfitValueString(@Nullable Integer pnlPrecision) {
        String str;
        String strM92640e;
        if (!Intrinsics.areEqual(this.status, "BANKRUPTCY") && !Intrinsics.areEqual(this.status, "IN_LIQUIDATION")) {
            BigDecimal bigDecimalLiabilityConversionCompat = liabilityConversionCompat();
            if (C27039d.m66650j(bigDecimalLiabilityConversionCompat != null ? Integer.valueOf(bigDecimalLiabilityConversionCompat.compareTo(BigDecimal.ZERO)) : null) != 0) {
                BigDecimal bigDecimalCalculatorProfitValue = calculatorProfitValue();
                BigDecimal bigDecimalCalculatorProfitPercent = calculatorProfitPercent();
                if (bigDecimalCalculatorProfitPercent == null && bigDecimalCalculatorProfitValue == null) {
                    return "--";
                }
                String str2 = C27039d.m66646f(bigDecimalCalculatorProfitValue != null ? Double.valueOf(bigDecimalCalculatorProfitValue.doubleValue()) : null) > 0.0d ? "+" : "";
                if (pnlPrecision != null) {
                    str = str2;
                    strM92640e = bigDecimalCalculatorProfitValue != null ? C42180b.m92640e(bigDecimalCalculatorProfitValue, null, pnlPrecision.intValue(), false, true, false, 2, null, 85, null) : null;
                } else if (bigDecimalCalculatorProfitValue != null) {
                    CurrencyBalance currencyBalance = this.quoteAsset;
                    str = str2;
                    strM92640e = C37886j.m85578b(bigDecimalCalculatorProfitValue, C27041f.m66668h(currencyBalance != null ? currencyBalance.getCurrency() : null), null, false, false, false, 2, null, 0, 222, null);
                } else {
                    str = str2;
                }
                String strM66669i = C27041f.m66669i(strM92640e, "--");
                if (C27039d.m66647g(this.accumulatedPrincipal) <= 0.0d) {
                    return str + strM66669i;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(strM66669i);
                sb2.append('(');
                sb2.append(C27041f.m66669i(bigDecimalCalculatorProfitPercent != null ? C42180b.m92642g(bigDecimalCalculatorProfitPercent, null, null, 0, true, true, false, 39, null) : null, C33820nf.f71144W));
                sb2.append(')');
                return sb2.toString();
            }
        }
        return "--";
    }

    @Nullable
    public final CurrencyBalance getQuoteAsset() {
        return this.quoteAsset;
    }

    @Nullable
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    public final String getStatusRecId() {
        return this.statusRecId;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final BigDecimal getTotalConversionBalance() {
        return this.totalConversionBalance;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final BigDecimal getUserLeverage() {
        return this.userLeverage;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.accumulatedPrincipal;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        CurrencyBalance currencyBalance = this.baseAsset;
        int iHashCode3 = (iHashCode2 + (currencyBalance == null ? 0 : currencyBalance.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAutoRepay;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.liabilityConversionBalance;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.positionPermission;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CurrencyBalance currencyBalance2 = this.quoteAsset;
        int iHashCode8 = (iHashCode7 + (currencyBalance2 == null ? 0 : currencyBalance2.hashCode())) * 31;
        String str4 = this.riskGrade;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.statusBizType;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.statusRecId;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tag;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalConversionBalance;
        int iHashCode14 = (iHashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str9 = this.type;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.userId;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.userLeverage;
        int iHashCode17 = (iHashCode16 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Long l11 = this.timestamp;
        return iHashCode17 + (l11 != null ? l11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAutoRepay() {
        return this.isAutoRepay;
    }

    public final boolean isCloseEnable() {
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        if (!Intrinsics.areEqual(this.status, "IN_LIQUIDATION") && !Intrinsics.areEqual(this.status, "BANKRUPTCY") && !Intrinsics.areEqual(this.status, "IN_AUTO_RENEW")) {
            BigDecimal bigDecimalLiabilityConversionCompat = liabilityConversionCompat();
            Integer numValueOf = null;
            if (C27039d.m66650j(bigDecimalLiabilityConversionCompat != null ? Integer.valueOf(bigDecimalLiabilityConversionCompat.compareTo(BigDecimal.ZERO)) : null) > 0) {
                CurrencyBalance currencyBalance = this.baseAsset;
                if (C27039d.m66650j((currencyBalance == null || (totalBalance2 = currencyBalance.getTotalBalance()) == null) ? null : Integer.valueOf(totalBalance2.compareTo(BigDecimal.ZERO))) > 0) {
                    return true;
                }
                CurrencyBalance currencyBalance2 = this.quoteAsset;
                if (currencyBalance2 != null && (totalBalance = currencyBalance2.getTotalBalance()) != null) {
                    numValueOf = Integer.valueOf(totalBalance.compareTo(BigDecimal.ZERO));
                }
                if (C27039d.m66650j(numValueOf) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isLiability() {
        return Intrinsics.areEqual(this.status, "BANKRUPTCY");
    }

    public final boolean isTransferEnable() {
        return (Intrinsics.areEqual(this.status, "IN_LIQUIDATION") || Intrinsics.areEqual(this.status, "IN_AUTO_RENEW")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (com.kubi.utils.extensions.C27039d.m66650j((r0 == null || (r0 = p838zo.C46897a.m103299k(r0)) == null) ? null : java.lang.Integer.valueOf(r0.compareTo(java.math.BigDecimal.ZERO))) > 0) goto L24;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BigDecimal liabilityConversionCompat() {
        BigDecimal bigDecimalM103300l;
        BigDecimal bigDecimalM103299k;
        BigDecimal bigDecimal = this.liabilityConversionBalance;
        if (C27039d.m66650j(bigDecimal != null ? Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO)) : null) == 0) {
            CurrencyBalance currencyBalance = this.baseAsset;
            if (C27039d.m66650j((currencyBalance == null || (bigDecimalM103299k = C46897a.m103299k(currencyBalance)) == null) ? null : Integer.valueOf(bigDecimalM103299k.compareTo(BigDecimal.ZERO))) <= 0) {
                CurrencyBalance currencyBalance2 = this.quoteAsset;
            }
            CurrencyBalance currencyBalance3 = this.baseAsset;
            if (currencyBalance3 == null || (bigDecimalM103300l = C46897a.m103300l(currencyBalance3)) == null) {
                return null;
            }
            CurrencyBalance currencyBalance4 = this.quoteAsset;
            return bigDecimalM103300l.add(currencyBalance4 != null ? C46897a.m103300l(currencyBalance4) : null);
        }
        return this.liabilityConversionBalance;
    }

    @NotNull
    public final String liquidationPriceString(@Nullable BigDecimal liqRate) {
        String strM85563b;
        if (Intrinsics.areEqual(this.status, "BANKRUPTCY") || Intrinsics.areEqual(this.status, "IN_LIQUIDATION")) {
            return "--";
        }
        BigDecimal bigDecimalCalculatorLiqPrice = calculatorLiqPrice(liqRate);
        if (bigDecimalCalculatorLiqPrice != null) {
            CurrencyBalance currencyBalance = this.quoteAsset;
            strM85563b = C37885i.m85563b(bigDecimalCalculatorLiqPrice, C27041f.m66668h(currencyBalance != null ? currencyBalance.getCurrency() : null), 0, 2, null);
        } else {
            strM85563b = null;
        }
        String strM66669i = C27041f.m66669i(strM85563b, "--");
        return StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) "<", false, 2, (Object) null) ? "--" : strM66669i;
    }

    public final void setAccumulatedPrincipal(@Nullable BigDecimal bigDecimal) {
        this.accumulatedPrincipal = bigDecimal;
    }

    public final void setAutoRepay(@Nullable Boolean bool) {
        this.isAutoRepay = bool;
    }

    public final void setLiabilityConversionBalance(@Nullable BigDecimal bigDecimal) {
        this.liabilityConversionBalance = bigDecimal;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setStatusBizType(@Nullable String str) {
        this.statusBizType = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    public final void setTotalConversionBalance(@Nullable BigDecimal bigDecimal) {
        this.totalConversionBalance = bigDecimal;
    }

    public final void setUserLeverage(@Nullable BigDecimal bigDecimal) {
        this.userLeverage = bigDecimal;
    }

    public final boolean showProfitDes() {
        return C27039d.m66647g(this.accumulatedPrincipal) <= 0.0d && !noValueRule();
    }

    @NotNull
    public final String showSymbol() {
        String str = this.symbol;
        String strReplace$default = str != null ? StringsKt.replace$default(str, C33820nf.f71144W, "/", false, 4, (Object) null) : null;
        return strReplace$default == null ? "" : strReplace$default;
    }

    @NotNull
    public String toString() {
        return "MarginPosition(symbol=" + this.symbol + ", accumulatedPrincipal=" + this.accumulatedPrincipal + ", baseAsset=" + this.baseAsset + ", id=" + this.id + ", isAutoRepay=" + this.isAutoRepay + ", liabilityConversionBalance=" + this.liabilityConversionBalance + ", positionPermission=" + this.positionPermission + ", quoteAsset=" + this.quoteAsset + ", riskGrade=" + this.riskGrade + ", status=" + this.status + ", statusBizType=" + this.statusBizType + ", statusRecId=" + this.statusRecId + ", tag=" + this.tag + ", totalConversionBalance=" + this.totalConversionBalance + ", type=" + this.type + ", userId=" + this.userId + ", userLeverage=" + this.userLeverage + ", timestamp=" + this.timestamp + ')';
    }

    @NotNull
    public final BigDecimal totalConversionCoefficient() {
        CurrencyBalance currencyBalance = this.baseAsset;
        BigDecimal bigDecimalM89922G = C41014a.m89922G(currencyBalance != null ? getTotalConversionCoefficient(currencyBalance) : null, null, 1, null);
        CurrencyBalance currencyBalance2 = this.quoteAsset;
        BigDecimal bigDecimalAdd = bigDecimalM89922G.add(C41014a.m89922G(currencyBalance2 != null ? getTotalConversionCoefficient(currencyBalance2) : null, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (com.kubi.utils.extensions.C27039d.m66650j((r0 == null || (r0 = r0.getTotalBalance()) == null) ? null : java.lang.Integer.valueOf(r0.compareTo(java.math.BigDecimal.ZERO))) > 0) goto L24;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BigDecimal totalConversionCompat() {
        BigDecimal bigDecimalM103296h;
        BigDecimal totalBalance;
        BigDecimal bigDecimal = this.totalConversionBalance;
        if (C27039d.m66650j(bigDecimal != null ? Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO)) : null) == 0) {
            CurrencyBalance currencyBalance = this.baseAsset;
            if (C27039d.m66650j((currencyBalance == null || (totalBalance = currencyBalance.getTotalBalance()) == null) ? null : Integer.valueOf(totalBalance.compareTo(BigDecimal.ZERO))) <= 0) {
                CurrencyBalance currencyBalance2 = this.quoteAsset;
            }
            CurrencyBalance currencyBalance3 = this.baseAsset;
            if (currencyBalance3 == null || (bigDecimalM103296h = C46897a.m103296h(currencyBalance3)) == null) {
                return null;
            }
            CurrencyBalance currencyBalance4 = this.quoteAsset;
            return bigDecimalM103296h.add(currencyBalance4 != null ? C46897a.m103296h(currencyBalance4) : null);
        }
        return this.totalConversionBalance;
    }

    @NotNull
    public final BigDecimal totalMarginConversionCoefficient() {
        CurrencyBalance currencyBalance = this.baseAsset;
        BigDecimal bigDecimalM89922G = C41014a.m89922G(currencyBalance != null ? marginTotalConversionCoefficient(currencyBalance) : null, null, 1, null);
        CurrencyBalance currencyBalance2 = this.quoteAsset;
        BigDecimal bigDecimalAdd = bigDecimalM89922G.add(C41014a.m89922G(currencyBalance2 != null ? marginTotalConversionCoefficient(currencyBalance2) : null, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    public final void updateByWs() {
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalM103300l;
        BigDecimal bigDecimalM103296h;
        CurrencyBalance currencyBalance = this.baseAsset;
        BigDecimal bigDecimalAdd2 = null;
        if (currencyBalance == null || (bigDecimalM103296h = C46897a.m103296h(currencyBalance)) == null) {
            bigDecimalAdd = null;
        } else {
            CurrencyBalance currencyBalance2 = this.quoteAsset;
            bigDecimalAdd = bigDecimalM103296h.add(currencyBalance2 != null ? C46897a.m103296h(currencyBalance2) : null);
        }
        this.totalConversionBalance = bigDecimalAdd;
        CurrencyBalance currencyBalance3 = this.baseAsset;
        if (currencyBalance3 != null && (bigDecimalM103300l = C46897a.m103300l(currencyBalance3)) != null) {
            CurrencyBalance currencyBalance4 = this.quoteAsset;
            bigDecimalAdd2 = bigDecimalM103300l.add(currencyBalance4 != null ? C46897a.m103300l(currencyBalance4) : null);
        }
        this.liabilityConversionBalance = bigDecimalAdd2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.accumulatedPrincipal);
        dest.writeParcelable(this.baseAsset, flags);
        dest.writeString(this.id);
        Boolean bool = this.isAutoRepay;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.liabilityConversionBalance);
        dest.writeString(this.positionPermission);
        dest.writeParcelable(this.quoteAsset, flags);
        dest.writeString(this.riskGrade);
        dest.writeString(this.status);
        dest.writeString(this.statusBizType);
        dest.writeString(this.statusRecId);
        dest.writeString(this.tag);
        dest.writeSerializable(this.totalConversionBalance);
        dest.writeString(this.type);
        dest.writeString(this.userId);
        dest.writeSerializable(this.userLeverage);
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    private final BigDecimal calculatorLiqPrice(BigDecimal liqRate) {
        BigDecimal bigDecimalSubtract;
        Integer numValueOf;
        BigDecimal totalBalance;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2;
        BigDecimal bigDecimalSubtract2;
        BigDecimal bigDecimalDivide;
        BigDecimal bigDecimalM103299k;
        BigDecimal bigDecimalMultiply3;
        BigDecimal bigDecimalMultiply4;
        if (noValueRule()) {
            return null;
        }
        CurrencyBalance currencyBalance = this.baseAsset;
        if (currencyBalance != null && (bigDecimalM103299k = C46897a.m103299k(currencyBalance)) != null) {
            BigDecimal totalBalance2 = this.baseAsset.getTotalBalance();
            if (totalBalance2 != null && (bigDecimalMultiply4 = totalBalance2.multiply(C41014a.m89921F(this.baseAsset.getMarginCoefficient(), "1"))) != null) {
                bigDecimalMultiply3 = bigDecimalMultiply4.multiply(C41014a.m89921F(liqRate, "1"));
            } else {
                bigDecimalMultiply3 = null;
            }
            bigDecimalSubtract = bigDecimalM103299k.subtract(C41014a.m89922G(bigDecimalMultiply3, null, 1, null));
        } else {
            bigDecimalSubtract = null;
        }
        BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalSubtract, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(bigDecimal) == 0) {
            bigDecimalDivide = null;
        } else {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(this.tag));
            if (symbolInfoEntityM85601B != null) {
                numValueOf = Integer.valueOf(symbolInfoEntityM85601B.getPriceIncrementPrecision());
            } else {
                numValueOf = null;
            }
            int iM66651k = C27039d.m66651k(numValueOf, 8);
            CurrencyBalance currencyBalance2 = this.quoteAsset;
            if (currencyBalance2 == null || (totalBalance = currencyBalance2.getTotalBalance()) == null || (bigDecimalMultiply = totalBalance.multiply(C41014a.m89921F(this.quoteAsset.getMarginCoefficient(), "1"))) == null || (bigDecimalMultiply2 = bigDecimalMultiply.multiply(C41014a.m89921F(liqRate, "1"))) == null || (bigDecimalSubtract2 = bigDecimalMultiply2.subtract(C41014a.m89922G(C46897a.m103299k(this.quoteAsset), null, 1, null))) == null) {
                bigDecimalDivide = null;
            } else {
                bigDecimalDivide = bigDecimalSubtract2.divide(C41014a.m89922G(bigDecimalSubtract, null, 1, null), iM66651k, RoundingMode.DOWN);
            }
        }
        if (C41014a.m89922G(bigDecimalDivide, null, 1, null).compareTo(bigDecimal) <= 0) {
            return null;
        }
        return bigDecimalDivide;
    }

    private final BigDecimal getTotalConversionCoefficient(CurrencyBalance currencyBalance) {
        List<AssetsCollateralRatio> assetsCollateralRatios = currencyBalance.getAssetsCollateralRatios();
        if (assetsCollateralRatios != null && !assetsCollateralRatios.isEmpty()) {
            return gradientPriceCoefficient(currencyBalance);
        }
        return marginTotalConversionCoefficient(currencyBalance);
    }

    private final BigDecimal gradientPriceCoefficient(CurrencyBalance currencyBalance) {
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2;
        BigDecimal bigDecimalM89922G;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalM89922G2;
        BigDecimal bigDecimalM89922G3;
        List<AssetsCollateralRatio> assetsCollateralRatios = currencyBalance.getAssetsCollateralRatios();
        if (assetsCollateralRatios != null && !assetsCollateralRatios.isEmpty()) {
            BigDecimal bigDecimalM89922G4 = C41014a.m89922G(C46901e.f104766a.m103309a(), null, 1, null);
            BigDecimal bigDecimalM89922G5 = C41014a.m89922G(currencyBalance.getTotalBalance(), null, 1, null);
            BigDecimal latestMarkPrice = currencyBalance.getLatestMarkPrice();
            if (latestMarkPrice == null) {
                latestMarkPrice = currencyBalance.getMarkPrice();
            }
            BigDecimal bigDecimalMultiply3 = bigDecimalM89922G5.multiply(latestMarkPrice);
            BigDecimal ZERO = BigDecimal.ZERO;
            if (bigDecimalMultiply3.compareTo(ZERO) <= 0) {
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return ZERO;
            }
            List<AssetsCollateralRatio> assetsCollateralRatios2 = currencyBalance.getAssetsCollateralRatios();
            Intrinsics.checkNotNull(assetsCollateralRatios2);
            for (AssetsCollateralRatio assetsCollateralRatio : CollectionsKt.sortedWith(assetsCollateralRatios2, new C17489b())) {
                BigDecimal minVal = assetsCollateralRatio.getMinVal();
                if (minVal != null && (bigDecimalM89922G3 = C41014a.m89922G(minVal, null, 1, null)) != null) {
                    bigDecimalMultiply = bigDecimalM89922G3.multiply(bigDecimalM89922G4);
                } else {
                    bigDecimalMultiply = null;
                }
                BigDecimal maxVal = assetsCollateralRatio.getMaxVal();
                if (maxVal != null && (bigDecimalM89922G2 = C41014a.m89922G(maxVal, null, 1, null)) != null) {
                    bigDecimalMultiply2 = bigDecimalM89922G2.multiply(bigDecimalM89922G4);
                } else {
                    bigDecimalMultiply2 = null;
                }
                BigDecimal ratio = assetsCollateralRatio.getRatio();
                if (ratio != null) {
                    bigDecimalM89922G = C41014a.m89922G(ratio, null, 1, null);
                } else {
                    bigDecimalM89922G = null;
                }
                if (bigDecimalMultiply3.compareTo(bigDecimalMultiply) > 0) {
                    if (bigDecimalMultiply3.compareTo(bigDecimalMultiply2) <= 0) {
                        bigDecimalMultiply2 = bigDecimalMultiply3;
                    }
                    if (bigDecimalMultiply2 != null) {
                        bigDecimalSubtract = bigDecimalMultiply2.subtract(bigDecimalMultiply);
                    } else {
                        bigDecimalSubtract = null;
                    }
                    BigDecimal bigDecimalM89922G6 = C41014a.m89922G(bigDecimalSubtract, null, 1, null);
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    if (bigDecimalM89922G6.compareTo(ZERO2) < 0) {
                        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                        bigDecimalM89922G6 = ZERO2;
                    }
                    if (bigDecimalM89922G6.compareTo(ZERO2) > 0) {
                        ZERO = ZERO.add(bigDecimalM89922G6.multiply(bigDecimalM89922G));
                    }
                }
            }
            Intrinsics.checkNotNull(ZERO);
            return ZERO;
        }
        return marginTotalConversionCoefficient(currencyBalance);
    }

    private final BigDecimal marginTotalConversionCoefficient(CurrencyBalance currencyBalance) {
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2;
        BigDecimal totalBalance = currencyBalance.getTotalBalance();
        if (totalBalance != null && (bigDecimalMultiply2 = totalBalance.multiply(C41014a.m89922G(C46897a.m103295g(currencyBalance), null, 1, null))) != null) {
            bigDecimalMultiply = bigDecimalMultiply2.multiply(C41014a.m89921F(currencyBalance.getMarginCoefficient(), "1"));
        } else {
            bigDecimalMultiply = null;
        }
        return C41014a.m89922G(bigDecimalMultiply, null, 1, null);
    }

    private final boolean noValueRule() {
        Integer numValueOf;
        BigDecimal bigDecimal = totalConversionCompat();
        Integer numValueOf2 = null;
        if (bigDecimal != null) {
            numValueOf = Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO));
        } else {
            numValueOf = null;
        }
        if (C27039d.m66650j(numValueOf) != 0) {
            BigDecimal bigDecimalLiabilityConversionCompat = liabilityConversionCompat();
            if (bigDecimalLiabilityConversionCompat != null) {
                numValueOf2 = Integer.valueOf(bigDecimalLiabilityConversionCompat.compareTo(BigDecimal.ZERO));
            }
            if (C27039d.m66650j(numValueOf2) != 0 && !Intrinsics.areEqual(this.status, "BANKRUPTCY") && !Intrinsics.areEqual(this.status, "IN_LIQUIDATION")) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final BigDecimal calculatorLiabilityRate() {
        Integer numValueOf;
        BigDecimal bigDecimalLiabilityConversionCompat;
        BigDecimal bigDecimalLiabilityConversionCompat2;
        BigDecimal bigDecimal = totalConversionCompat();
        if (bigDecimal != null) {
            numValueOf = Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO));
        } else {
            numValueOf = null;
        }
        if (C27039d.m66650j(numValueOf) >= 0 && (bigDecimalLiabilityConversionCompat2 = liabilityConversionCompat()) != null) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimalLiabilityConversionCompat2.compareTo(bigDecimal2) == 0) {
                return bigDecimal2;
            }
        }
        if (Intrinsics.areEqual(this.status, "IN_AUTO_RENEW")) {
            return new BigDecimal(-1);
        }
        if (noValueRule()) {
            return new BigDecimal(-1);
        }
        BigDecimal bigDecimal3 = totalMarginConversionCoefficient();
        if (bigDecimal3.compareTo(BigDecimal.ZERO) == 0 || (bigDecimalLiabilityConversionCompat = liabilityConversionCompat()) == null) {
            return null;
        }
        return bigDecimalLiabilityConversionCompat.divide(bigDecimal3, 12, RoundingMode.DOWN);
    }

    @Nullable
    public final BigDecimal calculatorProfitPercent() {
        BigDecimal bigDecimalCalculatorProfitValue;
        if (noValueRule() || C27039d.m66647g(this.accumulatedPrincipal) == 0.0d || (bigDecimalCalculatorProfitValue = calculatorProfitValue()) == null) {
            return null;
        }
        return bigDecimalCalculatorProfitValue.divide(this.accumulatedPrincipal, 12, RoundingMode.DOWN);
    }

    @Nullable
    public final BigDecimal calculatorProfitValue() {
        BigDecimal bigDecimal;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalM103292d;
        if (!noValueRule() && (bigDecimal = totalConversionCompat()) != null && (bigDecimalSubtract = bigDecimal.subtract(C41014a.m89922G(liabilityConversionCompat(), null, 1, null))) != null) {
            CurrencyBalance currencyBalance = this.quoteAsset;
            if (currencyBalance != null) {
                bigDecimalM103292d = C46897a.m103292d(currencyBalance);
            } else {
                bigDecimalM103292d = null;
            }
            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(C41014a.m89921F(bigDecimalM103292d, "1"), 12, RoundingMode.DOWN);
            if (bigDecimalDivide != null) {
                return bigDecimalDivide.subtract(C41014a.m89922G(this.accumulatedPrincipal, null, 1, null));
            }
        }
        return null;
    }

    @NotNull
    public final String getProfitRateString() {
        String strM92649n;
        BigDecimal bigDecimalCalculatorProfitPercent = calculatorProfitPercent();
        if (bigDecimalCalculatorProfitPercent != null) {
            strM92649n = C42180b.m92649n(C42180b.m92642g(bigDecimalCalculatorProfitPercent, null, null, 0, true, true, false, 39, null));
        } else {
            strM92649n = null;
        }
        return C42180b.m92649n(strM92649n);
    }

    public final boolean isOpenStatus() {
        Integer numValueOf;
        BigDecimal bigDecimal = totalConversionCompat();
        Integer numValueOf2 = null;
        if (bigDecimal != null) {
            numValueOf = Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO));
        } else {
            numValueOf = null;
        }
        if (C27039d.m66650j(numValueOf) == 0) {
            BigDecimal bigDecimalLiabilityConversionCompat = liabilityConversionCompat();
            if (bigDecimalLiabilityConversionCompat != null) {
                numValueOf2 = Integer.valueOf(bigDecimalLiabilityConversionCompat.compareTo(BigDecimal.ZERO));
            }
            if (C27039d.m66650j(numValueOf2) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Nullable
    public final Boolean isShowDirection() {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        CurrencyBalance currencyBalance;
        BigDecimal bigDecimalM103292d;
        BigDecimal bigDecimalM103292d2;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalM103299k;
        BigDecimal bigDecimalM103299k2;
        BigDecimal bigDecimalM103292d3;
        BigDecimal bigDecimal = totalConversionCompat();
        if (bigDecimal != null) {
            numValueOf = Integer.valueOf(bigDecimal.compareTo(BigDecimal.ZERO));
        } else {
            numValueOf = null;
        }
        if (C27039d.m66650j(numValueOf) != 0) {
            BigDecimal bigDecimalLiabilityConversionCompat = liabilityConversionCompat();
            if (bigDecimalLiabilityConversionCompat != null) {
                numValueOf2 = Integer.valueOf(bigDecimalLiabilityConversionCompat.compareTo(BigDecimal.ZERO));
            } else {
                numValueOf2 = null;
            }
            if (C27039d.m66650j(numValueOf2) != 0) {
                CurrencyBalance currencyBalance2 = this.quoteAsset;
                if (currencyBalance2 != null && (bigDecimalM103292d3 = C46897a.m103292d(currencyBalance2)) != null) {
                    numValueOf3 = Integer.valueOf(bigDecimalM103292d3.compareTo(BigDecimal.ZERO));
                } else {
                    numValueOf3 = null;
                }
                if (C27039d.m66650j(numValueOf3) != 0 && (currencyBalance = this.baseAsset) != null && (bigDecimalM103292d = C46897a.m103292d(currencyBalance)) != null) {
                    CurrencyBalance currencyBalance3 = this.quoteAsset;
                    if (currencyBalance3 != null) {
                        bigDecimalM103292d2 = C46897a.m103292d(currencyBalance3);
                    } else {
                        bigDecimalM103292d2 = null;
                    }
                    BigDecimal bigDecimalDivide = bigDecimalM103292d.divide(C41014a.m89921F(bigDecimalM103292d2, "1"), 12, RoundingMode.DOWN);
                    if (bigDecimalDivide != null) {
                        BigDecimal bigDecimalM103299k3 = C46897a.m103299k(this.baseAsset);
                        if (bigDecimalM103299k3 != null) {
                            bigDecimalMultiply = bigDecimalM103299k3.multiply(bigDecimalDivide);
                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                        } else {
                            bigDecimalMultiply = null;
                        }
                        BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimalMultiply, null, 1, null);
                        CurrencyBalance currencyBalance4 = this.quoteAsset;
                        if (currencyBalance4 != null) {
                            bigDecimalM103299k = C46897a.m103299k(currencyBalance4);
                        } else {
                            bigDecimalM103299k = null;
                        }
                        if (bigDecimalM89922G.compareTo(C41014a.m89922G(bigDecimalM103299k, null, 1, null)) > 0) {
                            return Boolean.FALSE;
                        }
                        BigDecimal bigDecimalM89922G2 = C41014a.m89922G(bigDecimalMultiply, null, 1, null);
                        CurrencyBalance currencyBalance5 = this.quoteAsset;
                        if (currencyBalance5 != null) {
                            bigDecimalM103299k2 = C46897a.m103299k(currencyBalance5);
                        } else {
                            bigDecimalM103299k2 = null;
                        }
                        if (bigDecimalM89922G2.compareTo(C41014a.m89922G(bigDecimalM103299k2, null, 1, null)) < 0) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        }
        return null;
    }

    public /* synthetic */ MarginPosition(String str, BigDecimal bigDecimal, CurrencyBalance currencyBalance, String str2, Boolean bool, BigDecimal bigDecimal2, String str3, CurrencyBalance currencyBalance2, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal3, String str9, String str10, BigDecimal bigDecimal4, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, currencyBalance, str2, bool, bigDecimal2, str3, currencyBalance2, str4, str5, str6, str7, str8, bigDecimal3, str9, str10, bigDecimal4, (i11 & 131072) != 0 ? 0L : l11);
    }

    public MarginPosition() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131072, null);
    }
}
