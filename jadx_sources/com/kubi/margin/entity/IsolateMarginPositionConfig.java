package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bJ\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b \u0010!J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010R\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010S\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00107JÆ\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010]J\u0006\u0010^\u001a\u00020\u0016J\u0013\u0010_\u001a\u00020\u00052\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\u0016HÖ\u0001J\t\u0010c\u001a\u00020\u000eHÖ\u0001J\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b,\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b2\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b5\u0010%R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00108\u001a\u0004\bA\u00107¨\u0006i"}, m90084d2 = {"Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "Landroid/os/Parcelable;", "autoRenewMaxDebtRatio", "Ljava/math/BigDecimal;", "baseBorrowEnable", "", "baseMaxBorrowAmount", "baseMaxBuyAmount", "baseTransferInEnable", "borrowBufferRatio", "defaultLeverage", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "flDebtRatio", "id", "", "maxLeverage", "riskLeverage", "quoteBorrowEnable", "quoteMaxBorrowAmount", "quoteMaxBuyAmount", "quoteTransferInEnable", "sortWeight", "", "symbol", "transferOutBufferRatio", "transferOutMaxDebtRatio", "warnDebtRatio", "baseBorrowCoefficient", "quoteBorrowCoefficient", "baseMarginCoefficient", "quoteMarginCoefficient", "pnlPrecision", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getAutoRenewMaxDebtRatio", "()Ljava/math/BigDecimal;", "getBaseBorrowEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBaseMaxBorrowAmount", "getBaseMaxBuyAmount", "getBaseTransferInEnable", "getBorrowBufferRatio", "getDefaultLeverage", "getEnable", "getFlDebtRatio", "getId", "()Ljava/lang/String;", "getMaxLeverage", "getRiskLeverage", "getQuoteBorrowEnable", "getQuoteMaxBorrowAmount", "getQuoteMaxBuyAmount", "getQuoteTransferInEnable", "getSortWeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSymbol", "getTransferOutBufferRatio", "getTransferOutMaxDebtRatio", "getWarnDebtRatio", "getBaseBorrowCoefficient", "getQuoteBorrowCoefficient", "getBaseMarginCoefficient", "getQuoteMarginCoefficient", "getPnlPrecision", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolateMarginPositionConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IsolateMarginPositionConfig> CREATOR = new C17615a();

    @Nullable
    private final BigDecimal autoRenewMaxDebtRatio;

    @Nullable
    private final BigDecimal baseBorrowCoefficient;

    @Nullable
    private final Boolean baseBorrowEnable;

    @Nullable
    private final BigDecimal baseMarginCoefficient;

    @Nullable
    private final BigDecimal baseMaxBorrowAmount;

    @Nullable
    private final BigDecimal baseMaxBuyAmount;

    @Nullable
    private final Boolean baseTransferInEnable;

    @Nullable
    private final BigDecimal borrowBufferRatio;

    @Nullable
    private final BigDecimal defaultLeverage;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final BigDecimal flDebtRatio;

    @Nullable
    private final String id;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final Integer pnlPrecision;

    @Nullable
    private final BigDecimal quoteBorrowCoefficient;

    @Nullable
    private final Boolean quoteBorrowEnable;

    @Nullable
    private final BigDecimal quoteMarginCoefficient;

    @Nullable
    private final BigDecimal quoteMaxBorrowAmount;

    @Nullable
    private final BigDecimal quoteMaxBuyAmount;

    @Nullable
    private final Boolean quoteTransferInEnable;

    @Nullable
    private final BigDecimal riskLeverage;

    @Nullable
    private final Integer sortWeight;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal transferOutBufferRatio;

    @Nullable
    private final BigDecimal transferOutMaxDebtRatio;

    @Nullable
    private final BigDecimal warnDebtRatio;

    /* JADX INFO: renamed from: com.kubi.margin.entity.IsolateMarginPositionConfig$a */
    /* JADX INFO: compiled from: MarginEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17615a implements Parcelable.Creator<IsolateMarginPositionConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IsolateMarginPositionConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf = null;
            Boolean bool = boolValueOf3;
            String string = parcel.readString();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal15 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal16 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal17 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new IsolateMarginPositionConfig(bigDecimal, boolValueOf, bigDecimal2, bigDecimal3, boolValueOf2, bigDecimal4, bigDecimal5, bool, bigDecimal6, string, bigDecimal7, bigDecimal8, boolValueOf4, bigDecimal9, bigDecimal10, boolValueOf5, numValueOf2, string2, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IsolateMarginPositionConfig[] newArray(int i11) {
            return new IsolateMarginPositionConfig[i11];
        }
    }

    public static /* synthetic */ IsolateMarginPositionConfig copy$default(IsolateMarginPositionConfig isolateMarginPositionConfig, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool2, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Boolean bool3, BigDecimal bigDecimal6, String str, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Boolean bool4, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Boolean bool5, Integer num, String str2, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, Integer num2, int i11, Object obj) {
        Integer num3;
        BigDecimal bigDecimal18;
        BigDecimal bigDecimal19 = (i11 & 1) != 0 ? isolateMarginPositionConfig.autoRenewMaxDebtRatio : bigDecimal;
        Boolean bool6 = (i11 & 2) != 0 ? isolateMarginPositionConfig.baseBorrowEnable : bool;
        BigDecimal bigDecimal20 = (i11 & 4) != 0 ? isolateMarginPositionConfig.baseMaxBorrowAmount : bigDecimal2;
        BigDecimal bigDecimal21 = (i11 & 8) != 0 ? isolateMarginPositionConfig.baseMaxBuyAmount : bigDecimal3;
        Boolean bool7 = (i11 & 16) != 0 ? isolateMarginPositionConfig.baseTransferInEnable : bool2;
        BigDecimal bigDecimal22 = (i11 & 32) != 0 ? isolateMarginPositionConfig.borrowBufferRatio : bigDecimal4;
        BigDecimal bigDecimal23 = (i11 & 64) != 0 ? isolateMarginPositionConfig.defaultLeverage : bigDecimal5;
        Boolean bool8 = (i11 & 128) != 0 ? isolateMarginPositionConfig.enable : bool3;
        BigDecimal bigDecimal24 = (i11 & 256) != 0 ? isolateMarginPositionConfig.flDebtRatio : bigDecimal6;
        String str3 = (i11 & 512) != 0 ? isolateMarginPositionConfig.id : str;
        BigDecimal bigDecimal25 = (i11 & 1024) != 0 ? isolateMarginPositionConfig.maxLeverage : bigDecimal7;
        BigDecimal bigDecimal26 = (i11 & 2048) != 0 ? isolateMarginPositionConfig.riskLeverage : bigDecimal8;
        Boolean bool9 = (i11 & 4096) != 0 ? isolateMarginPositionConfig.quoteBorrowEnable : bool4;
        BigDecimal bigDecimal27 = (i11 & 8192) != 0 ? isolateMarginPositionConfig.quoteMaxBorrowAmount : bigDecimal9;
        BigDecimal bigDecimal28 = bigDecimal19;
        BigDecimal bigDecimal29 = (i11 & 16384) != 0 ? isolateMarginPositionConfig.quoteMaxBuyAmount : bigDecimal10;
        Boolean bool10 = (i11 & 32768) != 0 ? isolateMarginPositionConfig.quoteTransferInEnable : bool5;
        Integer num4 = (i11 & 65536) != 0 ? isolateMarginPositionConfig.sortWeight : num;
        String str4 = (i11 & 131072) != 0 ? isolateMarginPositionConfig.symbol : str2;
        BigDecimal bigDecimal30 = (i11 & 262144) != 0 ? isolateMarginPositionConfig.transferOutBufferRatio : bigDecimal11;
        BigDecimal bigDecimal31 = (i11 & 524288) != 0 ? isolateMarginPositionConfig.transferOutMaxDebtRatio : bigDecimal12;
        BigDecimal bigDecimal32 = (i11 & 1048576) != 0 ? isolateMarginPositionConfig.warnDebtRatio : bigDecimal13;
        BigDecimal bigDecimal33 = (i11 & 2097152) != 0 ? isolateMarginPositionConfig.baseBorrowCoefficient : bigDecimal14;
        BigDecimal bigDecimal34 = (i11 & 4194304) != 0 ? isolateMarginPositionConfig.quoteBorrowCoefficient : bigDecimal15;
        BigDecimal bigDecimal35 = (i11 & 8388608) != 0 ? isolateMarginPositionConfig.baseMarginCoefficient : bigDecimal16;
        BigDecimal bigDecimal36 = (i11 & 16777216) != 0 ? isolateMarginPositionConfig.quoteMarginCoefficient : bigDecimal17;
        if ((i11 & 33554432) != 0) {
            bigDecimal18 = bigDecimal36;
            num3 = isolateMarginPositionConfig.pnlPrecision;
        } else {
            num3 = num2;
            bigDecimal18 = bigDecimal36;
        }
        return isolateMarginPositionConfig.copy(bigDecimal28, bool6, bigDecimal20, bigDecimal21, bool7, bigDecimal22, bigDecimal23, bool8, bigDecimal24, str3, bigDecimal25, bigDecimal26, bool9, bigDecimal27, bigDecimal29, bool10, num4, str4, bigDecimal30, bigDecimal31, bigDecimal32, bigDecimal33, bigDecimal34, bigDecimal35, bigDecimal18, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolateMarginPositionConfig)) {
            return false;
        }
        IsolateMarginPositionConfig isolateMarginPositionConfig = (IsolateMarginPositionConfig) other;
        return Intrinsics.areEqual(this.autoRenewMaxDebtRatio, isolateMarginPositionConfig.autoRenewMaxDebtRatio) && Intrinsics.areEqual(this.baseBorrowEnable, isolateMarginPositionConfig.baseBorrowEnable) && Intrinsics.areEqual(this.baseMaxBorrowAmount, isolateMarginPositionConfig.baseMaxBorrowAmount) && Intrinsics.areEqual(this.baseMaxBuyAmount, isolateMarginPositionConfig.baseMaxBuyAmount) && Intrinsics.areEqual(this.baseTransferInEnable, isolateMarginPositionConfig.baseTransferInEnable) && Intrinsics.areEqual(this.borrowBufferRatio, isolateMarginPositionConfig.borrowBufferRatio) && Intrinsics.areEqual(this.defaultLeverage, isolateMarginPositionConfig.defaultLeverage) && Intrinsics.areEqual(this.enable, isolateMarginPositionConfig.enable) && Intrinsics.areEqual(this.flDebtRatio, isolateMarginPositionConfig.flDebtRatio) && Intrinsics.areEqual(this.id, isolateMarginPositionConfig.id) && Intrinsics.areEqual(this.maxLeverage, isolateMarginPositionConfig.maxLeverage) && Intrinsics.areEqual(this.riskLeverage, isolateMarginPositionConfig.riskLeverage) && Intrinsics.areEqual(this.quoteBorrowEnable, isolateMarginPositionConfig.quoteBorrowEnable) && Intrinsics.areEqual(this.quoteMaxBorrowAmount, isolateMarginPositionConfig.quoteMaxBorrowAmount) && Intrinsics.areEqual(this.quoteMaxBuyAmount, isolateMarginPositionConfig.quoteMaxBuyAmount) && Intrinsics.areEqual(this.quoteTransferInEnable, isolateMarginPositionConfig.quoteTransferInEnable) && Intrinsics.areEqual(this.sortWeight, isolateMarginPositionConfig.sortWeight) && Intrinsics.areEqual(this.symbol, isolateMarginPositionConfig.symbol) && Intrinsics.areEqual(this.transferOutBufferRatio, isolateMarginPositionConfig.transferOutBufferRatio) && Intrinsics.areEqual(this.transferOutMaxDebtRatio, isolateMarginPositionConfig.transferOutMaxDebtRatio) && Intrinsics.areEqual(this.warnDebtRatio, isolateMarginPositionConfig.warnDebtRatio) && Intrinsics.areEqual(this.baseBorrowCoefficient, isolateMarginPositionConfig.baseBorrowCoefficient) && Intrinsics.areEqual(this.quoteBorrowCoefficient, isolateMarginPositionConfig.quoteBorrowCoefficient) && Intrinsics.areEqual(this.baseMarginCoefficient, isolateMarginPositionConfig.baseMarginCoefficient) && Intrinsics.areEqual(this.quoteMarginCoefficient, isolateMarginPositionConfig.quoteMarginCoefficient) && Intrinsics.areEqual(this.pnlPrecision, isolateMarginPositionConfig.pnlPrecision);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getSortWeight() {
        return this.sortWeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigDecimal getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigDecimal getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BigDecimal getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getPnlPrecision() {
        return this.pnlPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @NotNull
    public final IsolateMarginPositionConfig copy(@Nullable BigDecimal autoRenewMaxDebtRatio, @Nullable Boolean baseBorrowEnable, @Nullable BigDecimal baseMaxBorrowAmount, @Nullable BigDecimal baseMaxBuyAmount, @Nullable Boolean baseTransferInEnable, @Nullable BigDecimal borrowBufferRatio, @Nullable BigDecimal defaultLeverage, @Nullable Boolean enable, @Nullable BigDecimal flDebtRatio, @Nullable String id2, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal riskLeverage, @Nullable Boolean quoteBorrowEnable, @Nullable BigDecimal quoteMaxBorrowAmount, @Nullable BigDecimal quoteMaxBuyAmount, @Nullable Boolean quoteTransferInEnable, @Nullable Integer sortWeight, @Nullable String symbol, @Nullable BigDecimal transferOutBufferRatio, @Nullable BigDecimal transferOutMaxDebtRatio, @Nullable BigDecimal warnDebtRatio, @Nullable BigDecimal baseBorrowCoefficient, @Nullable BigDecimal quoteBorrowCoefficient, @Nullable BigDecimal baseMarginCoefficient, @Nullable BigDecimal quoteMarginCoefficient, @Nullable Integer pnlPrecision) {
        return new IsolateMarginPositionConfig(autoRenewMaxDebtRatio, baseBorrowEnable, baseMaxBorrowAmount, baseMaxBuyAmount, baseTransferInEnable, borrowBufferRatio, defaultLeverage, enable, flDebtRatio, id2, maxLeverage, riskLeverage, quoteBorrowEnable, quoteMaxBorrowAmount, quoteMaxBuyAmount, quoteTransferInEnable, sortWeight, symbol, transferOutBufferRatio, transferOutMaxDebtRatio, warnDebtRatio, baseBorrowCoefficient, quoteBorrowCoefficient, baseMarginCoefficient, quoteMarginCoefficient, pnlPrecision);
    }

    @Nullable
    public final BigDecimal getAutoRenewMaxDebtRatio() {
        return this.autoRenewMaxDebtRatio;
    }

    @Nullable
    public final BigDecimal getBaseBorrowCoefficient() {
        return this.baseBorrowCoefficient;
    }

    @Nullable
    public final Boolean getBaseBorrowEnable() {
        return this.baseBorrowEnable;
    }

    @Nullable
    public final BigDecimal getBaseMarginCoefficient() {
        return this.baseMarginCoefficient;
    }

    @Nullable
    public final BigDecimal getBaseMaxBorrowAmount() {
        return this.baseMaxBorrowAmount;
    }

    @Nullable
    public final BigDecimal getBaseMaxBuyAmount() {
        return this.baseMaxBuyAmount;
    }

    @Nullable
    public final Boolean getBaseTransferInEnable() {
        return this.baseTransferInEnable;
    }

    @Nullable
    public final BigDecimal getBorrowBufferRatio() {
        return this.borrowBufferRatio;
    }

    @Nullable
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final BigDecimal getFlDebtRatio() {
        return this.flDebtRatio;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final Integer getPnlPrecision() {
        return this.pnlPrecision;
    }

    @Nullable
    public final BigDecimal getQuoteBorrowCoefficient() {
        return this.quoteBorrowCoefficient;
    }

    @Nullable
    public final Boolean getQuoteBorrowEnable() {
        return this.quoteBorrowEnable;
    }

    @Nullable
    public final BigDecimal getQuoteMarginCoefficient() {
        return this.quoteMarginCoefficient;
    }

    @Nullable
    public final BigDecimal getQuoteMaxBorrowAmount() {
        return this.quoteMaxBorrowAmount;
    }

    @Nullable
    public final BigDecimal getQuoteMaxBuyAmount() {
        return this.quoteMaxBuyAmount;
    }

    @Nullable
    public final Boolean getQuoteTransferInEnable() {
        return this.quoteTransferInEnable;
    }

    @Nullable
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    public final Integer getSortWeight() {
        return this.sortWeight;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTransferOutBufferRatio() {
        return this.transferOutBufferRatio;
    }

    @Nullable
    public final BigDecimal getTransferOutMaxDebtRatio() {
        return this.transferOutMaxDebtRatio;
    }

    @Nullable
    public final BigDecimal getWarnDebtRatio() {
        return this.warnDebtRatio;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.autoRenewMaxDebtRatio;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Boolean bool = this.baseBorrowEnable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.baseMaxBorrowAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.baseMaxBuyAmount;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Boolean bool2 = this.baseTransferInEnable;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.borrowBufferRatio;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.defaultLeverage;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Boolean bool3 = this.enable;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.flDebtRatio;
        int iHashCode9 = (iHashCode8 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str = this.id;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.maxLeverage;
        int iHashCode11 = (iHashCode10 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.riskLeverage;
        int iHashCode12 = (iHashCode11 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Boolean bool4 = this.quoteBorrowEnable;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.quoteMaxBorrowAmount;
        int iHashCode14 = (iHashCode13 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.quoteMaxBuyAmount;
        int iHashCode15 = (iHashCode14 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        Boolean bool5 = this.quoteTransferInEnable;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num = this.sortWeight;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode18 = (iHashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.transferOutBufferRatio;
        int iHashCode19 = (iHashCode18 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.transferOutMaxDebtRatio;
        int iHashCode20 = (iHashCode19 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.warnDebtRatio;
        int iHashCode21 = (iHashCode20 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.baseBorrowCoefficient;
        int iHashCode22 = (iHashCode21 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.quoteBorrowCoefficient;
        int iHashCode23 = (iHashCode22 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.baseMarginCoefficient;
        int iHashCode24 = (iHashCode23 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.quoteMarginCoefficient;
        int iHashCode25 = (iHashCode24 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        Integer num2 = this.pnlPrecision;
        return iHashCode25 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IsolateMarginPositionConfig(autoRenewMaxDebtRatio=" + this.autoRenewMaxDebtRatio + ", baseBorrowEnable=" + this.baseBorrowEnable + ", baseMaxBorrowAmount=" + this.baseMaxBorrowAmount + ", baseMaxBuyAmount=" + this.baseMaxBuyAmount + ", baseTransferInEnable=" + this.baseTransferInEnable + ", borrowBufferRatio=" + this.borrowBufferRatio + ", defaultLeverage=" + this.defaultLeverage + ", enable=" + this.enable + ", flDebtRatio=" + this.flDebtRatio + ", id=" + this.id + ", maxLeverage=" + this.maxLeverage + ", riskLeverage=" + this.riskLeverage + ", quoteBorrowEnable=" + this.quoteBorrowEnable + ", quoteMaxBorrowAmount=" + this.quoteMaxBorrowAmount + ", quoteMaxBuyAmount=" + this.quoteMaxBuyAmount + ", quoteTransferInEnable=" + this.quoteTransferInEnable + ", sortWeight=" + this.sortWeight + ", symbol=" + this.symbol + ", transferOutBufferRatio=" + this.transferOutBufferRatio + ", transferOutMaxDebtRatio=" + this.transferOutMaxDebtRatio + ", warnDebtRatio=" + this.warnDebtRatio + ", baseBorrowCoefficient=" + this.baseBorrowCoefficient + ", quoteBorrowCoefficient=" + this.quoteBorrowCoefficient + ", baseMarginCoefficient=" + this.baseMarginCoefficient + ", quoteMarginCoefficient=" + this.quoteMarginCoefficient + ", pnlPrecision=" + this.pnlPrecision + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.autoRenewMaxDebtRatio);
        Boolean bool = this.baseBorrowEnable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.baseMaxBorrowAmount);
        dest.writeSerializable(this.baseMaxBuyAmount);
        Boolean bool2 = this.baseTransferInEnable;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.borrowBufferRatio);
        dest.writeSerializable(this.defaultLeverage);
        Boolean bool3 = this.enable;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.flDebtRatio);
        dest.writeString(this.id);
        dest.writeSerializable(this.maxLeverage);
        dest.writeSerializable(this.riskLeverage);
        Boolean bool4 = this.quoteBorrowEnable;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        dest.writeSerializable(this.quoteMaxBorrowAmount);
        dest.writeSerializable(this.quoteMaxBuyAmount);
        Boolean bool5 = this.quoteTransferInEnable;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Integer num = this.sortWeight;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.symbol);
        dest.writeSerializable(this.transferOutBufferRatio);
        dest.writeSerializable(this.transferOutMaxDebtRatio);
        dest.writeSerializable(this.warnDebtRatio);
        dest.writeSerializable(this.baseBorrowCoefficient);
        dest.writeSerializable(this.quoteBorrowCoefficient);
        dest.writeSerializable(this.baseMarginCoefficient);
        dest.writeSerializable(this.quoteMarginCoefficient);
        Integer num2 = this.pnlPrecision;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public IsolateMarginPositionConfig(@Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Boolean bool3, @Nullable BigDecimal bigDecimal6, @Nullable String str, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Boolean bool4, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable Boolean bool5, @Nullable Integer num, @Nullable String str2, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable BigDecimal bigDecimal16, @Nullable BigDecimal bigDecimal17, @Nullable Integer num2) {
        this.autoRenewMaxDebtRatio = bigDecimal;
        this.baseBorrowEnable = bool;
        this.baseMaxBorrowAmount = bigDecimal2;
        this.baseMaxBuyAmount = bigDecimal3;
        this.baseTransferInEnable = bool2;
        this.borrowBufferRatio = bigDecimal4;
        this.defaultLeverage = bigDecimal5;
        this.enable = bool3;
        this.flDebtRatio = bigDecimal6;
        this.id = str;
        this.maxLeverage = bigDecimal7;
        this.riskLeverage = bigDecimal8;
        this.quoteBorrowEnable = bool4;
        this.quoteMaxBorrowAmount = bigDecimal9;
        this.quoteMaxBuyAmount = bigDecimal10;
        this.quoteTransferInEnable = bool5;
        this.sortWeight = num;
        this.symbol = str2;
        this.transferOutBufferRatio = bigDecimal11;
        this.transferOutMaxDebtRatio = bigDecimal12;
        this.warnDebtRatio = bigDecimal13;
        this.baseBorrowCoefficient = bigDecimal14;
        this.quoteBorrowCoefficient = bigDecimal15;
        this.baseMarginCoefficient = bigDecimal16;
        this.quoteMarginCoefficient = bigDecimal17;
        this.pnlPrecision = num2;
    }
}
