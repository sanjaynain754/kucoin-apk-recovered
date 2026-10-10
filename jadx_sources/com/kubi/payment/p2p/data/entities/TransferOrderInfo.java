package com.kubi.payment.p2p.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTypeEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2POrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010EJ\u0006\u0010F\u001a\u00020GJ\u0013\u0010H\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020GHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\u0016\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020GR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\t\u0010!R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u0010\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0018¨\u0006R"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;", "Landroid/os/Parcelable;", "id", "", "status", "legalCurrency", "legalCurrencyAmount", "requirePayVoucher", "", "isRedRemind", "autoCancelOrderExpire", "", "currentPayType", "Lcom/kubi/otc/entity/AdPayType;", "payTypeTemplate", "Lcom/kubi/otc/entity/PayTypeEntity;", "isP2PExpress", "hedgeMidCurrency", "toCurrency", "kycName", "cryptoCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/kubi/otc/entity/AdPayType;Lcom/kubi/otc/entity/PayTypeEntity;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getStatus", "setStatus", "getLegalCurrency", "getLegalCurrencyAmount", "setLegalCurrencyAmount", "getRequirePayVoucher", "()Ljava/lang/Boolean;", "setRequirePayVoucher", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAutoCancelOrderExpire", "()Ljava/lang/Long;", "setAutoCancelOrderExpire", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrentPayType", "()Lcom/kubi/otc/entity/AdPayType;", "setCurrentPayType", "(Lcom/kubi/otc/entity/AdPayType;)V", "getPayTypeTemplate", "()Lcom/kubi/otc/entity/PayTypeEntity;", "setPayTypeTemplate", "(Lcom/kubi/otc/entity/PayTypeEntity;)V", "getHedgeMidCurrency", "getToCurrency", "getKycName", "getCryptoCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/kubi/otc/entity/AdPayType;Lcom/kubi/otc/entity/PayTypeEntity;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferOrderInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferOrderInfo> CREATOR = new C21079a();

    @Nullable
    private Long autoCancelOrderExpire;

    @Nullable
    private final String cryptoCurrency;

    @Nullable
    private AdPayType currentPayType;

    @Nullable
    private final String hedgeMidCurrency;

    @Nullable
    private String id;

    @Nullable
    private final Boolean isP2PExpress;

    @Nullable
    private final Boolean isRedRemind;

    @Nullable
    private final String kycName;

    @Nullable
    private final String legalCurrency;

    @Nullable
    private String legalCurrencyAmount;

    @Nullable
    private PayTypeEntity payTypeTemplate;

    @Nullable
    private Boolean requirePayVoucher;

    @Nullable
    private String status;

    @Nullable
    private final String toCurrency;

    /* JADX INFO: renamed from: com.kubi.payment.p2p.data.entities.TransferOrderInfo$a */
    /* JADX INFO: compiled from: P2POrder.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21079a implements Parcelable.Creator<TransferOrderInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TransferOrderInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf3 = null;
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
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            AdPayType adPayTypeCreateFromParcel = parcel.readInt() == 0 ? null : AdPayType.CREATOR.createFromParcel(parcel);
            PayTypeEntity payTypeEntityCreateFromParcel = parcel.readInt() == 0 ? null : PayTypeEntity.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TransferOrderInfo(string, string2, string3, string4, boolValueOf, boolValueOf2, lValueOf, adPayTypeCreateFromParcel, payTypeEntityCreateFromParcel, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TransferOrderInfo[] newArray(int i11) {
            return new TransferOrderInfo[i11];
        }
    }

    public TransferOrderInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l11, @Nullable AdPayType adPayType, @Nullable PayTypeEntity payTypeEntity, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.id = str;
        this.status = str2;
        this.legalCurrency = str3;
        this.legalCurrencyAmount = str4;
        this.requirePayVoucher = bool;
        this.isRedRemind = bool2;
        this.autoCancelOrderExpire = l11;
        this.currentPayType = adPayType;
        this.payTypeTemplate = payTypeEntity;
        this.isP2PExpress = bool3;
        this.hedgeMidCurrency = str5;
        this.toCurrency = str6;
        this.kycName = str7;
        this.cryptoCurrency = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferOrderInfo)) {
            return false;
        }
        TransferOrderInfo transferOrderInfo = (TransferOrderInfo) other;
        return Intrinsics.areEqual(this.id, transferOrderInfo.id) && Intrinsics.areEqual(this.status, transferOrderInfo.status) && Intrinsics.areEqual(this.legalCurrency, transferOrderInfo.legalCurrency) && Intrinsics.areEqual(this.legalCurrencyAmount, transferOrderInfo.legalCurrencyAmount) && Intrinsics.areEqual(this.requirePayVoucher, transferOrderInfo.requirePayVoucher) && Intrinsics.areEqual(this.isRedRemind, transferOrderInfo.isRedRemind) && Intrinsics.areEqual(this.autoCancelOrderExpire, transferOrderInfo.autoCancelOrderExpire) && Intrinsics.areEqual(this.currentPayType, transferOrderInfo.currentPayType) && Intrinsics.areEqual(this.payTypeTemplate, transferOrderInfo.payTypeTemplate) && Intrinsics.areEqual(this.isP2PExpress, transferOrderInfo.isP2PExpress) && Intrinsics.areEqual(this.hedgeMidCurrency, transferOrderInfo.hedgeMidCurrency) && Intrinsics.areEqual(this.toCurrency, transferOrderInfo.toCurrency) && Intrinsics.areEqual(this.kycName, transferOrderInfo.kycName) && Intrinsics.areEqual(this.cryptoCurrency, transferOrderInfo.cryptoCurrency);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsP2PExpress() {
        return this.isP2PExpress;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getHedgeMidCurrency() {
        return this.hedgeMidCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getToCurrency() {
        return this.toCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getKycName() {
        return this.kycName;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegalCurrencyAmount() {
        return this.legalCurrencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getRequirePayVoucher() {
        return this.requirePayVoucher;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsRedRemind() {
        return this.isRedRemind;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getAutoCancelOrderExpire() {
        return this.autoCancelOrderExpire;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AdPayType getCurrentPayType() {
        return this.currentPayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PayTypeEntity getPayTypeTemplate() {
        return this.payTypeTemplate;
    }

    @NotNull
    public final TransferOrderInfo copy(@Nullable String id2, @Nullable String status, @Nullable String legalCurrency, @Nullable String legalCurrencyAmount, @Nullable Boolean requirePayVoucher, @Nullable Boolean isRedRemind, @Nullable Long autoCancelOrderExpire, @Nullable AdPayType currentPayType, @Nullable PayTypeEntity payTypeTemplate, @Nullable Boolean isP2PExpress, @Nullable String hedgeMidCurrency, @Nullable String toCurrency, @Nullable String kycName, @Nullable String cryptoCurrency) {
        return new TransferOrderInfo(id2, status, legalCurrency, legalCurrencyAmount, requirePayVoucher, isRedRemind, autoCancelOrderExpire, currentPayType, payTypeTemplate, isP2PExpress, hedgeMidCurrency, toCurrency, kycName, cryptoCurrency);
    }

    @Nullable
    public final Long getAutoCancelOrderExpire() {
        return this.autoCancelOrderExpire;
    }

    @Nullable
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final AdPayType getCurrentPayType() {
        return this.currentPayType;
    }

    @Nullable
    public final String getHedgeMidCurrency() {
        return this.hedgeMidCurrency;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getKycName() {
        return this.kycName;
    }

    @Nullable
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    public final String getLegalCurrencyAmount() {
        return this.legalCurrencyAmount;
    }

    @Nullable
    public final PayTypeEntity getPayTypeTemplate() {
        return this.payTypeTemplate;
    }

    @Nullable
    public final Boolean getRequirePayVoucher() {
        return this.requirePayVoucher;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getToCurrency() {
        return this.toCurrency;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.legalCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.legalCurrencyAmount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.requirePayVoucher;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRedRemind;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.autoCancelOrderExpire;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        AdPayType adPayType = this.currentPayType;
        int iHashCode8 = (iHashCode7 + (adPayType == null ? 0 : adPayType.hashCode())) * 31;
        PayTypeEntity payTypeEntity = this.payTypeTemplate;
        int iHashCode9 = (iHashCode8 + (payTypeEntity == null ? 0 : payTypeEntity.hashCode())) * 31;
        Boolean bool3 = this.isP2PExpress;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.hedgeMidCurrency;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.toCurrency;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kycName;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cryptoCurrency;
        return iHashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isP2PExpress() {
        return this.isP2PExpress;
    }

    @Nullable
    public final Boolean isRedRemind() {
        return this.isRedRemind;
    }

    public final void setAutoCancelOrderExpire(@Nullable Long l11) {
        this.autoCancelOrderExpire = l11;
    }

    public final void setCurrentPayType(@Nullable AdPayType adPayType) {
        this.currentPayType = adPayType;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLegalCurrencyAmount(@Nullable String str) {
        this.legalCurrencyAmount = str;
    }

    public final void setPayTypeTemplate(@Nullable PayTypeEntity payTypeEntity) {
        this.payTypeTemplate = payTypeEntity;
    }

    public final void setRequirePayVoucher(@Nullable Boolean bool) {
        this.requirePayVoucher = bool;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    @NotNull
    public String toString() {
        return "TransferOrderInfo(id=" + this.id + ", status=" + this.status + ", legalCurrency=" + this.legalCurrency + ", legalCurrencyAmount=" + this.legalCurrencyAmount + ", requirePayVoucher=" + this.requirePayVoucher + ", isRedRemind=" + this.isRedRemind + ", autoCancelOrderExpire=" + this.autoCancelOrderExpire + ", currentPayType=" + this.currentPayType + ", payTypeTemplate=" + this.payTypeTemplate + ", isP2PExpress=" + this.isP2PExpress + ", hedgeMidCurrency=" + this.hedgeMidCurrency + ", toCurrency=" + this.toCurrency + ", kycName=" + this.kycName + ", cryptoCurrency=" + this.cryptoCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.status);
        dest.writeString(this.legalCurrency);
        dest.writeString(this.legalCurrencyAmount);
        Boolean bool = this.requirePayVoucher;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isRedRemind;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l11 = this.autoCancelOrderExpire;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        AdPayType adPayType = this.currentPayType;
        if (adPayType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            adPayType.writeToParcel(dest, flags);
        }
        PayTypeEntity payTypeEntity = this.payTypeTemplate;
        if (payTypeEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            payTypeEntity.writeToParcel(dest, flags);
        }
        Boolean bool3 = this.isP2PExpress;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.hedgeMidCurrency);
        dest.writeString(this.toCurrency);
        dest.writeString(this.kycName);
        dest.writeString(this.cryptoCurrency);
    }

    public /* synthetic */ TransferOrderInfo(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l11, AdPayType adPayType, PayTypeEntity payTypeEntity, Boolean bool3, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, bool, bool2, l11, adPayType, payTypeEntity, (i11 & 512) != 0 ? Boolean.FALSE : bool3, (i11 & 1024) != 0 ? null : str5, (i11 & 2048) != 0 ? null : str6, (i11 & 4096) != 0 ? null : str7, (i11 & 8192) != 0 ? null : str8);
    }
}
