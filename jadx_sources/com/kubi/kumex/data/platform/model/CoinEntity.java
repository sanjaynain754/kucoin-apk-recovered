package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoinEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010I\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010J\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010M\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010N\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010O\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010S\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010T\u001a\u0004\u0018\u00010\u001fHÆ\u0003J®\u0002\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010VJ\u0006\u0010W\u001a\u00020\nJ\u0013\u0010X\u001a\u00020\u00172\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020\nHÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001J\u0016\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00100\u001a\u0004\b1\u0010/R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b6\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b7\u00103R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00104\u001a\u0004\b8\u00103R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0016\u00109R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0018\u00109R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0019\u00109R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001a\u00109R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001b\u00109R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001c\u00109R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001d\u00109R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006b"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/CoinEntity;", "Landroid/os/Parcelable;", "code", "", FirebaseAnalytics.Param.CURRENCY, "name", "iconUrl", "withdrawDisabledTip", "depositDisabledTip", "type", "", "precision", "status", "withdrawEnableAt", "", "depositEnableAt", "withdrawMinFee", "", "withdrawMinSize", "innerWithdrawMinFee", "availableBalance", "totalBalance", "isDepositEnabled", "", "isWithdrawEnabled", "isDisplayWithdraw", "isDisplayDeposit", "isMarginEnabled", "isDebitEnabled", "isPoolXEnabled", "properties", "Lcom/kubi/kumex/data/platform/model/PropertyEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/kumex/data/platform/model/PropertyEntity;)V", "getCode", "()Ljava/lang/String;", "getCurrency", "getName", "getIconUrl", "getWithdrawDisabledTip", "getDepositDisabledTip", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrecision", "getStatus", "getWithdrawEnableAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDepositEnableAt", "getWithdrawMinFee", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWithdrawMinSize", "getInnerWithdrawMinFee", "getAvailableBalance", "getTotalBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProperties", "()Lcom/kubi/kumex/data/platform/model/PropertyEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/kumex/data/platform/model/PropertyEntity;)Lcom/kubi/kumex/data/platform/model/CoinEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CoinEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CoinEntity> CREATOR = new C15795a();

    @Nullable
    private final Double availableBalance;

    @Nullable
    private final String code;

    @Nullable
    private final String currency;

    @Nullable
    private final String depositDisabledTip;

    @Nullable
    private final Long depositEnableAt;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final Double innerWithdrawMinFee;

    @Nullable
    private final Boolean isDebitEnabled;

    @Nullable
    private final Boolean isDepositEnabled;

    @Nullable
    private final Boolean isDisplayDeposit;

    @Nullable
    private final Boolean isDisplayWithdraw;

    @Nullable
    private final Boolean isMarginEnabled;

    @Nullable
    private final Boolean isPoolXEnabled;

    @Nullable
    private final Boolean isWithdrawEnabled;

    @Nullable
    private final String name;

    @Nullable
    private final Integer precision;

    @Nullable
    private final PropertyEntity properties;

    @Nullable
    private final Integer status;

    @Nullable
    private final Double totalBalance;

    @Nullable
    private final Integer type;

    @Nullable
    private final String withdrawDisabledTip;

    @Nullable
    private final Long withdrawEnableAt;

    @Nullable
    private final Double withdrawMinFee;

    @Nullable
    private final Double withdrawMinSize;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.CoinEntity$a */
    /* JADX INFO: compiled from: CoinEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15795a implements Parcelable.Creator<CoinEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoinEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CoinEntity(string, string2, string3, string4, string5, string6, numValueOf, numValueOf2, numValueOf3, lValueOf, lValueOf2, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, parcel.readInt() != 0 ? PropertyEntity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoinEntity[] newArray(int i11) {
            return new CoinEntity[i11];
        }
    }

    public CoinEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public static /* synthetic */ CoinEntity copy$default(CoinEntity coinEntity, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Long l11, Long l12, Double d11, Double d12, Double d13, Double d14, Double d15, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, PropertyEntity propertyEntity, int i11, Object obj) {
        PropertyEntity propertyEntity2;
        Boolean bool8;
        String str7 = (i11 & 1) != 0 ? coinEntity.code : str;
        String str8 = (i11 & 2) != 0 ? coinEntity.currency : str2;
        String str9 = (i11 & 4) != 0 ? coinEntity.name : str3;
        String str10 = (i11 & 8) != 0 ? coinEntity.iconUrl : str4;
        String str11 = (i11 & 16) != 0 ? coinEntity.withdrawDisabledTip : str5;
        String str12 = (i11 & 32) != 0 ? coinEntity.depositDisabledTip : str6;
        Integer num4 = (i11 & 64) != 0 ? coinEntity.type : num;
        Integer num5 = (i11 & 128) != 0 ? coinEntity.precision : num2;
        Integer num6 = (i11 & 256) != 0 ? coinEntity.status : num3;
        Long l13 = (i11 & 512) != 0 ? coinEntity.withdrawEnableAt : l11;
        Long l14 = (i11 & 1024) != 0 ? coinEntity.depositEnableAt : l12;
        Double d16 = (i11 & 2048) != 0 ? coinEntity.withdrawMinFee : d11;
        Double d17 = (i11 & 4096) != 0 ? coinEntity.withdrawMinSize : d12;
        Double d18 = (i11 & 8192) != 0 ? coinEntity.innerWithdrawMinFee : d13;
        String str13 = str7;
        Double d19 = (i11 & 16384) != 0 ? coinEntity.availableBalance : d14;
        Double d21 = (i11 & 32768) != 0 ? coinEntity.totalBalance : d15;
        Boolean bool9 = (i11 & 65536) != 0 ? coinEntity.isDepositEnabled : bool;
        Boolean bool10 = (i11 & 131072) != 0 ? coinEntity.isWithdrawEnabled : bool2;
        Boolean bool11 = (i11 & 262144) != 0 ? coinEntity.isDisplayWithdraw : bool3;
        Boolean bool12 = (i11 & 524288) != 0 ? coinEntity.isDisplayDeposit : bool4;
        Boolean bool13 = (i11 & 1048576) != 0 ? coinEntity.isMarginEnabled : bool5;
        Boolean bool14 = (i11 & 2097152) != 0 ? coinEntity.isDebitEnabled : bool6;
        Boolean bool15 = (i11 & 4194304) != 0 ? coinEntity.isPoolXEnabled : bool7;
        if ((i11 & 8388608) != 0) {
            bool8 = bool15;
            propertyEntity2 = coinEntity.properties;
        } else {
            propertyEntity2 = propertyEntity;
            bool8 = bool15;
        }
        return coinEntity.copy(str13, str8, str9, str10, str11, str12, num4, num5, num6, l13, l14, d16, d17, d18, d19, d21, bool9, bool10, bool11, bool12, bool13, bool14, bool8, propertyEntity2);
    }

    @NotNull
    public final CoinEntity copy(@Nullable String code, @Nullable String currency, @Nullable String name, @Nullable String iconUrl, @Nullable String withdrawDisabledTip, @Nullable String depositDisabledTip, @Nullable Integer type, @Nullable Integer precision, @Nullable Integer status, @Nullable Long withdrawEnableAt, @Nullable Long depositEnableAt, @Nullable Double withdrawMinFee, @Nullable Double withdrawMinSize, @Nullable Double innerWithdrawMinFee, @Nullable Double availableBalance, @Nullable Double totalBalance, @Nullable Boolean isDepositEnabled, @Nullable Boolean isWithdrawEnabled, @Nullable Boolean isDisplayWithdraw, @Nullable Boolean isDisplayDeposit, @Nullable Boolean isMarginEnabled, @Nullable Boolean isDebitEnabled, @Nullable Boolean isPoolXEnabled, @Nullable PropertyEntity properties) {
        return new CoinEntity(code, currency, name, iconUrl, withdrawDisabledTip, depositDisabledTip, type, precision, status, withdrawEnableAt, depositEnableAt, withdrawMinFee, withdrawMinSize, innerWithdrawMinFee, availableBalance, totalBalance, isDepositEnabled, isWithdrawEnabled, isDisplayWithdraw, isDisplayDeposit, isMarginEnabled, isDebitEnabled, isPoolXEnabled, properties);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoinEntity)) {
            return false;
        }
        CoinEntity coinEntity = (CoinEntity) other;
        return Intrinsics.areEqual(this.code, coinEntity.code) && Intrinsics.areEqual(this.currency, coinEntity.currency) && Intrinsics.areEqual(this.name, coinEntity.name) && Intrinsics.areEqual(this.iconUrl, coinEntity.iconUrl) && Intrinsics.areEqual(this.withdrawDisabledTip, coinEntity.withdrawDisabledTip) && Intrinsics.areEqual(this.depositDisabledTip, coinEntity.depositDisabledTip) && Intrinsics.areEqual(this.type, coinEntity.type) && Intrinsics.areEqual(this.precision, coinEntity.precision) && Intrinsics.areEqual(this.status, coinEntity.status) && Intrinsics.areEqual(this.withdrawEnableAt, coinEntity.withdrawEnableAt) && Intrinsics.areEqual(this.depositEnableAt, coinEntity.depositEnableAt) && Intrinsics.areEqual((Object) this.withdrawMinFee, (Object) coinEntity.withdrawMinFee) && Intrinsics.areEqual((Object) this.withdrawMinSize, (Object) coinEntity.withdrawMinSize) && Intrinsics.areEqual((Object) this.innerWithdrawMinFee, (Object) coinEntity.innerWithdrawMinFee) && Intrinsics.areEqual((Object) this.availableBalance, (Object) coinEntity.availableBalance) && Intrinsics.areEqual((Object) this.totalBalance, (Object) coinEntity.totalBalance) && Intrinsics.areEqual(this.isDepositEnabled, coinEntity.isDepositEnabled) && Intrinsics.areEqual(this.isWithdrawEnabled, coinEntity.isWithdrawEnabled) && Intrinsics.areEqual(this.isDisplayWithdraw, coinEntity.isDisplayWithdraw) && Intrinsics.areEqual(this.isDisplayDeposit, coinEntity.isDisplayDeposit) && Intrinsics.areEqual(this.isMarginEnabled, coinEntity.isMarginEnabled) && Intrinsics.areEqual(this.isDebitEnabled, coinEntity.isDebitEnabled) && Intrinsics.areEqual(this.isPoolXEnabled, coinEntity.isPoolXEnabled) && Intrinsics.areEqual(this.properties, coinEntity.properties);
    }

    public CoinEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Long l11, @Nullable Long l12, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable Double d14, @Nullable Double d15, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable PropertyEntity propertyEntity) {
        this.code = str;
        this.currency = str2;
        this.name = str3;
        this.iconUrl = str4;
        this.withdrawDisabledTip = str5;
        this.depositDisabledTip = str6;
        this.type = num;
        this.precision = num2;
        this.status = num3;
        this.withdrawEnableAt = l11;
        this.depositEnableAt = l12;
        this.withdrawMinFee = d11;
        this.withdrawMinSize = d12;
        this.innerWithdrawMinFee = d13;
        this.availableBalance = d14;
        this.totalBalance = d15;
        this.isDepositEnabled = bool;
        this.isWithdrawEnabled = bool2;
        this.isDisplayWithdraw = bool3;
        this.isDisplayDeposit = bool4;
        this.isMarginEnabled = bool5;
        this.isDebitEnabled = bool6;
        this.isPoolXEnabled = bool7;
        this.properties = propertyEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Double getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsDepositEnabled() {
        return this.isDepositEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getIsWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIsDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getIsPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final PropertyEntity getProperties() {
        return this.properties;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Double getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    @Nullable
    public final Long getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Double getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final PropertyEntity getProperties() {
        return this.properties;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Double getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @Nullable
    public final Long getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @Nullable
    public final Double getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    public final Double getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.withdrawDisabledTip;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.depositDisabledTip;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.precision;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l11 = this.withdrawEnableAt;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.depositEnableAt;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d11 = this.withdrawMinFee;
        int iHashCode12 = (iHashCode11 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.withdrawMinSize;
        int iHashCode13 = (iHashCode12 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.innerWithdrawMinFee;
        int iHashCode14 = (iHashCode13 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.availableBalance;
        int iHashCode15 = (iHashCode14 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.totalBalance;
        int iHashCode16 = (iHashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Boolean bool = this.isDepositEnabled;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isWithdrawEnabled;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDisplayWithdraw;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isDisplayDeposit;
        int iHashCode20 = (iHashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isMarginEnabled;
        int iHashCode21 = (iHashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isDebitEnabled;
        int iHashCode22 = (iHashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isPoolXEnabled;
        int iHashCode23 = (iHashCode22 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        PropertyEntity propertyEntity = this.properties;
        return iHashCode23 + (propertyEntity != null ? propertyEntity.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    public final Boolean isDepositEnabled() {
        return this.isDepositEnabled;
    }

    @Nullable
    public final Boolean isDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    @Nullable
    public final Boolean isDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    @Nullable
    public final Boolean isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @Nullable
    public final Boolean isPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    @Nullable
    public final Boolean isWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    @NotNull
    public String toString() {
        return "CoinEntity(code=" + this.code + ", currency=" + this.currency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", withdrawDisabledTip=" + this.withdrawDisabledTip + ", depositDisabledTip=" + this.depositDisabledTip + ", type=" + this.type + ", precision=" + this.precision + ", status=" + this.status + ", withdrawEnableAt=" + this.withdrawEnableAt + ", depositEnableAt=" + this.depositEnableAt + ", withdrawMinFee=" + this.withdrawMinFee + ", withdrawMinSize=" + this.withdrawMinSize + ", innerWithdrawMinFee=" + this.innerWithdrawMinFee + ", availableBalance=" + this.availableBalance + ", totalBalance=" + this.totalBalance + ", isDepositEnabled=" + this.isDepositEnabled + ", isWithdrawEnabled=" + this.isWithdrawEnabled + ", isDisplayWithdraw=" + this.isDisplayWithdraw + ", isDisplayDeposit=" + this.isDisplayDeposit + ", isMarginEnabled=" + this.isMarginEnabled + ", isDebitEnabled=" + this.isDebitEnabled + ", isPoolXEnabled=" + this.isPoolXEnabled + ", properties=" + this.properties + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.currency);
        dest.writeString(this.name);
        dest.writeString(this.iconUrl);
        dest.writeString(this.withdrawDisabledTip);
        dest.writeString(this.depositDisabledTip);
        Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.precision;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.status;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Long l11 = this.withdrawEnableAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.depositEnableAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Double d11 = this.withdrawMinFee;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.withdrawMinSize;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        Double d13 = this.innerWithdrawMinFee;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Double d14 = this.availableBalance;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        Double d15 = this.totalBalance;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        Boolean bool = this.isDepositEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isWithdrawEnabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isDisplayWithdraw;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isDisplayDeposit;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isMarginEnabled;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isDebitEnabled;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.isPoolXEnabled;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        PropertyEntity propertyEntity = this.properties;
        if (propertyEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            propertyEntity.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ CoinEntity(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Long l11, Long l12, Double d11, Double d12, Double d13, Double d14, Double d15, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, PropertyEntity propertyEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : num3, (i11 & 512) != 0 ? null : l11, (i11 & 1024) != 0 ? null : l12, (i11 & 2048) != 0 ? null : d11, (i11 & 4096) != 0 ? null : d12, (i11 & 8192) != 0 ? null : d13, (i11 & 16384) != 0 ? null : d14, (i11 & 32768) != 0 ? null : d15, (i11 & 65536) != 0 ? null : bool, (i11 & 131072) != 0 ? null : bool2, (i11 & 262144) != 0 ? null : bool3, (i11 & 524288) != 0 ? null : bool4, (i11 & 1048576) != 0 ? null : bool5, (i11 & 2097152) != 0 ? null : bool6, (i11 & 4194304) != 0 ? null : bool7, (i11 & 8388608) != 0 ? null : propertyEntity);
    }
}
