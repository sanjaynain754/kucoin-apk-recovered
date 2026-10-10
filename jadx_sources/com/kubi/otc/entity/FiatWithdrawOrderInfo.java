package com.kubi.otc.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.R$color;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.data.entities.ErrorInfoEntity;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0001eBÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010?\u001a\u00020\u0016J\u000e\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020DJ\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010R\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001cHÆ\u0003Jò\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010YJ\u0006\u0010Z\u001a\u00020DJ\u0013\u0010[\u001a\u00020\u00162\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020DHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001J\u0016\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020DR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b\u0015\u00105\"\u0004\b6\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006f"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;", "Landroid/os/Parcelable;", "paymentMethodCode", "", "channelId", "payoutTrxnId", "withdrawType", "withdrawAmount", "Lcom/kubi/otc/entity/WithdrawAmount;", "feeAmount", "Lcom/kubi/otc/entity/FeeAmount;", "status", "ibanLast4", "bankName", "discription", "payoutAccountInfo", "statusMessage", "created", "", "accountExtra", "Lcom/kubi/otc/entity/FiatAccountExtraInfo;", "isShowProSuccess", "", "reversedAmount", "estimateReceiveAmount", "errorInfo", "Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;", "taxAmount", "Lcom/kubi/otc/entity/TaxAmount;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/otc/entity/FeeAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/otc/entity/FiatAccountExtraInfo;Ljava/lang/Boolean;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;Lcom/kubi/otc/entity/TaxAmount;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getPayoutTrxnId", "setPayoutTrxnId", "(Ljava/lang/String;)V", "getWithdrawType", "getWithdrawAmount", "()Lcom/kubi/otc/entity/WithdrawAmount;", "getFeeAmount", "()Lcom/kubi/otc/entity/FeeAmount;", "getStatus", "getIbanLast4", "getBankName", "getDiscription", "getPayoutAccountInfo", "getStatusMessage", "getCreated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAccountExtra", "()Lcom/kubi/otc/entity/FiatAccountExtraInfo;", "()Ljava/lang/Boolean;", "setShowProSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getReversedAmount", "getEstimateReceiveAmount", "getErrorInfo", "()Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;", "getTaxAmount", "()Lcom/kubi/otc/entity/TaxAmount;", "isShowProcess", "getStatusString", "context", "Landroid/content/Context;", "getStatusColor", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/otc/entity/FeeAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/otc/entity/FiatAccountExtraInfo;Ljava/lang/Boolean;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/otc/entity/WithdrawAmount;Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;Lcom/kubi/otc/entity/TaxAmount;)Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatWithdrawOrderInfo implements Parcelable {

    @NotNull
    private static final String CHANNEL_CAPITUAL = "capitual";

    @NotNull
    public static final String STATUS_FAILED = "2";

    @NotNull
    public static final String STATUS_PROCESSING = "0";

    @NotNull
    public static final String STATUS_REJECTED = "4";

    @NotNull
    public static final String STATUS_REVERSED = "3";

    @NotNull
    public static final String STATUS_REVIEW = "5";

    @NotNull
    public static final String STATUS_SUCCESSFUL = "1";

    @Nullable
    private final FiatAccountExtraInfo accountExtra;

    @Nullable
    private final String bankName;

    @Nullable
    private final String channelId;

    @Nullable
    private final Long created;

    @Nullable
    private final String discription;

    @SerializedName("errorReason")
    @Nullable
    private final ErrorInfoEntity errorInfo;

    @Nullable
    private final WithdrawAmount estimateReceiveAmount;

    @Nullable
    private final FeeAmount feeAmount;

    @Nullable
    private final String ibanLast4;

    @Nullable
    private Boolean isShowProSuccess;

    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String payoutAccountInfo;

    @Nullable
    private String payoutTrxnId;

    @Nullable
    private final WithdrawAmount reversedAmount;

    @Nullable
    private final String status;

    @Nullable
    private final String statusMessage;

    @SerializedName("taxAmount")
    @Nullable
    private final TaxAmount taxAmount;

    @Nullable
    private final WithdrawAmount withdrawAmount;

    @Nullable
    private final String withdrawType;

    @NotNull
    public static final Parcelable.Creator<FiatWithdrawOrderInfo> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatWithdrawOrderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawOrderInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            WithdrawAmount withdrawAmountCreateFromParcel = parcel.readInt() == 0 ? null : WithdrawAmount.CREATOR.createFromParcel(parcel);
            FeeAmount feeAmountCreateFromParcel = parcel.readInt() == 0 ? null : FeeAmount.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            FiatAccountExtraInfo fiatAccountExtraInfoCreateFromParcel = parcel.readInt() == 0 ? null : FiatAccountExtraInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FiatWithdrawOrderInfo(string, string2, string3, string4, withdrawAmountCreateFromParcel, feeAmountCreateFromParcel, string5, string6, string7, string8, string9, string10, lValueOf, fiatAccountExtraInfoCreateFromParcel, boolValueOf, parcel.readInt() == 0 ? null : WithdrawAmount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WithdrawAmount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ErrorInfoEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TaxAmount.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawOrderInfo[] newArray(int i11) {
            return new FiatWithdrawOrderInfo[i11];
        }
    }

    public static /* synthetic */ FiatWithdrawOrderInfo copy$default(FiatWithdrawOrderInfo fiatWithdrawOrderInfo, String str, String str2, String str3, String str4, WithdrawAmount withdrawAmount, FeeAmount feeAmount, String str5, String str6, String str7, String str8, String str9, String str10, Long l11, FiatAccountExtraInfo fiatAccountExtraInfo, Boolean bool, WithdrawAmount withdrawAmount2, WithdrawAmount withdrawAmount3, ErrorInfoEntity errorInfoEntity, TaxAmount taxAmount, int i11, Object obj) {
        TaxAmount taxAmount2;
        ErrorInfoEntity errorInfoEntity2;
        String str11 = (i11 & 1) != 0 ? fiatWithdrawOrderInfo.paymentMethodCode : str;
        String str12 = (i11 & 2) != 0 ? fiatWithdrawOrderInfo.channelId : str2;
        String str13 = (i11 & 4) != 0 ? fiatWithdrawOrderInfo.payoutTrxnId : str3;
        String str14 = (i11 & 8) != 0 ? fiatWithdrawOrderInfo.withdrawType : str4;
        WithdrawAmount withdrawAmount4 = (i11 & 16) != 0 ? fiatWithdrawOrderInfo.withdrawAmount : withdrawAmount;
        FeeAmount feeAmount2 = (i11 & 32) != 0 ? fiatWithdrawOrderInfo.feeAmount : feeAmount;
        String str15 = (i11 & 64) != 0 ? fiatWithdrawOrderInfo.status : str5;
        String str16 = (i11 & 128) != 0 ? fiatWithdrawOrderInfo.ibanLast4 : str6;
        String str17 = (i11 & 256) != 0 ? fiatWithdrawOrderInfo.bankName : str7;
        String str18 = (i11 & 512) != 0 ? fiatWithdrawOrderInfo.discription : str8;
        String str19 = (i11 & 1024) != 0 ? fiatWithdrawOrderInfo.payoutAccountInfo : str9;
        String str20 = (i11 & 2048) != 0 ? fiatWithdrawOrderInfo.statusMessage : str10;
        Long l12 = (i11 & 4096) != 0 ? fiatWithdrawOrderInfo.created : l11;
        FiatAccountExtraInfo fiatAccountExtraInfo2 = (i11 & 8192) != 0 ? fiatWithdrawOrderInfo.accountExtra : fiatAccountExtraInfo;
        String str21 = str11;
        Boolean bool2 = (i11 & 16384) != 0 ? fiatWithdrawOrderInfo.isShowProSuccess : bool;
        WithdrawAmount withdrawAmount5 = (i11 & 32768) != 0 ? fiatWithdrawOrderInfo.reversedAmount : withdrawAmount2;
        WithdrawAmount withdrawAmount6 = (i11 & 65536) != 0 ? fiatWithdrawOrderInfo.estimateReceiveAmount : withdrawAmount3;
        ErrorInfoEntity errorInfoEntity3 = (i11 & 131072) != 0 ? fiatWithdrawOrderInfo.errorInfo : errorInfoEntity;
        if ((i11 & 262144) != 0) {
            errorInfoEntity2 = errorInfoEntity3;
            taxAmount2 = fiatWithdrawOrderInfo.taxAmount;
        } else {
            taxAmount2 = taxAmount;
            errorInfoEntity2 = errorInfoEntity3;
        }
        return fiatWithdrawOrderInfo.copy(str21, str12, str13, str14, withdrawAmount4, feeAmount2, str15, str16, str17, str18, str19, str20, l12, fiatAccountExtraInfo2, bool2, withdrawAmount5, withdrawAmount6, errorInfoEntity2, taxAmount2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatWithdrawOrderInfo)) {
            return false;
        }
        FiatWithdrawOrderInfo fiatWithdrawOrderInfo = (FiatWithdrawOrderInfo) other;
        return Intrinsics.areEqual(this.paymentMethodCode, fiatWithdrawOrderInfo.paymentMethodCode) && Intrinsics.areEqual(this.channelId, fiatWithdrawOrderInfo.channelId) && Intrinsics.areEqual(this.payoutTrxnId, fiatWithdrawOrderInfo.payoutTrxnId) && Intrinsics.areEqual(this.withdrawType, fiatWithdrawOrderInfo.withdrawType) && Intrinsics.areEqual(this.withdrawAmount, fiatWithdrawOrderInfo.withdrawAmount) && Intrinsics.areEqual(this.feeAmount, fiatWithdrawOrderInfo.feeAmount) && Intrinsics.areEqual(this.status, fiatWithdrawOrderInfo.status) && Intrinsics.areEqual(this.ibanLast4, fiatWithdrawOrderInfo.ibanLast4) && Intrinsics.areEqual(this.bankName, fiatWithdrawOrderInfo.bankName) && Intrinsics.areEqual(this.discription, fiatWithdrawOrderInfo.discription) && Intrinsics.areEqual(this.payoutAccountInfo, fiatWithdrawOrderInfo.payoutAccountInfo) && Intrinsics.areEqual(this.statusMessage, fiatWithdrawOrderInfo.statusMessage) && Intrinsics.areEqual(this.created, fiatWithdrawOrderInfo.created) && Intrinsics.areEqual(this.accountExtra, fiatWithdrawOrderInfo.accountExtra) && Intrinsics.areEqual(this.isShowProSuccess, fiatWithdrawOrderInfo.isShowProSuccess) && Intrinsics.areEqual(this.reversedAmount, fiatWithdrawOrderInfo.reversedAmount) && Intrinsics.areEqual(this.estimateReceiveAmount, fiatWithdrawOrderInfo.estimateReceiveAmount) && Intrinsics.areEqual(this.errorInfo, fiatWithdrawOrderInfo.errorInfo) && Intrinsics.areEqual(this.taxAmount, fiatWithdrawOrderInfo.taxAmount);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayoutAccountInfo() {
        return this.payoutAccountInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getCreated() {
        return this.created;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final FiatAccountExtraInfo getAccountExtra() {
        return this.accountExtra;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsShowProSuccess() {
        return this.isShowProSuccess;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final WithdrawAmount getReversedAmount() {
        return this.reversedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final WithdrawAmount getEstimateReceiveAmount() {
        return this.estimateReceiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final ErrorInfoEntity getErrorInfo() {
        return this.errorInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final TaxAmount getTaxAmount() {
        return this.taxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayoutTrxnId() {
        return this.payoutTrxnId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWithdrawType() {
        return this.withdrawType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final WithdrawAmount getWithdrawAmount() {
        return this.withdrawAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FeeAmount getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIbanLast4() {
        return this.ibanLast4;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final FiatWithdrawOrderInfo copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String payoutTrxnId, @Nullable String withdrawType, @Nullable WithdrawAmount withdrawAmount, @Nullable FeeAmount feeAmount, @Nullable String status, @Nullable String ibanLast4, @Nullable String bankName, @Nullable String discription, @Nullable String payoutAccountInfo, @Nullable String statusMessage, @Nullable Long created, @Nullable FiatAccountExtraInfo accountExtra, @Nullable Boolean isShowProSuccess, @Nullable WithdrawAmount reversedAmount, @Nullable WithdrawAmount estimateReceiveAmount, @Nullable ErrorInfoEntity errorInfo, @Nullable TaxAmount taxAmount) {
        return new FiatWithdrawOrderInfo(paymentMethodCode, channelId, payoutTrxnId, withdrawType, withdrawAmount, feeAmount, status, ibanLast4, bankName, discription, payoutAccountInfo, statusMessage, created, accountExtra, isShowProSuccess, reversedAmount, estimateReceiveAmount, errorInfo, taxAmount);
    }

    @Nullable
    public final FiatAccountExtraInfo getAccountExtra() {
        return this.accountExtra;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final Long getCreated() {
        return this.created;
    }

    @Nullable
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    public final ErrorInfoEntity getErrorInfo() {
        return this.errorInfo;
    }

    @Nullable
    public final WithdrawAmount getEstimateReceiveAmount() {
        return this.estimateReceiveAmount;
    }

    @Nullable
    public final FeeAmount getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    public final String getIbanLast4() {
        return this.ibanLast4;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPayoutAccountInfo() {
        return this.payoutAccountInfo;
    }

    @Nullable
    public final String getPayoutTrxnId() {
        return this.payoutTrxnId;
    }

    @Nullable
    public final WithdrawAmount getReversedAmount() {
        return this.reversedAmount;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0.equals("3") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r0.equals("2") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        return com.kubi.otc.R$color.secondary;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0.equals("4") == false) goto L23;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getStatusColor() {
        String str = this.status;
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return R$color.primary;
                    }
                    break;
                case 50:
                    break;
                case 51:
                    break;
                case 52:
                    break;
            }
        }
        return R$color.complementary;
    }

    @Nullable
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @NotNull
    public final String getStatusString(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.status;
        if (str != null) {
            switch (str) {
                case "1":
                    string = context.getString(R$string.completed);
                    break;
                case "2":
                    string = context.getString(R$string.failed);
                    break;
                case "3":
                    string = context.getString(R$string.fiat_withdraw_order_detail_reversed_title);
                    break;
                case "4":
                    string = context.getString(R$string.fiat_withdraw_order_detail_rejected_title);
                    break;
                default:
                    string = context.getString(R$string.in_progress);
                    break;
            }
        } else {
            string = context.getString(R$string.in_progress);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Nullable
    public final TaxAmount getTaxAmount() {
        return this.taxAmount;
    }

    @Nullable
    public final WithdrawAmount getWithdrawAmount() {
        return this.withdrawAmount;
    }

    @Nullable
    public final String getWithdrawType() {
        return this.withdrawType;
    }

    public int hashCode() {
        String str = this.paymentMethodCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payoutTrxnId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.withdrawType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WithdrawAmount withdrawAmount = this.withdrawAmount;
        int iHashCode5 = (iHashCode4 + (withdrawAmount == null ? 0 : withdrawAmount.hashCode())) * 31;
        FeeAmount feeAmount = this.feeAmount;
        int iHashCode6 = (iHashCode5 + (feeAmount == null ? 0 : feeAmount.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ibanLast4;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bankName;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discription;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.payoutAccountInfo;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.statusMessage;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l11 = this.created;
        int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
        FiatAccountExtraInfo fiatAccountExtraInfo = this.accountExtra;
        int iHashCode14 = (iHashCode13 + (fiatAccountExtraInfo == null ? 0 : fiatAccountExtraInfo.hashCode())) * 31;
        Boolean bool = this.isShowProSuccess;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        WithdrawAmount withdrawAmount2 = this.reversedAmount;
        int iHashCode16 = (iHashCode15 + (withdrawAmount2 == null ? 0 : withdrawAmount2.hashCode())) * 31;
        WithdrawAmount withdrawAmount3 = this.estimateReceiveAmount;
        int iHashCode17 = (iHashCode16 + (withdrawAmount3 == null ? 0 : withdrawAmount3.hashCode())) * 31;
        ErrorInfoEntity errorInfoEntity = this.errorInfo;
        int iHashCode18 = (iHashCode17 + (errorInfoEntity == null ? 0 : errorInfoEntity.hashCode())) * 31;
        TaxAmount taxAmount = this.taxAmount;
        return iHashCode18 + (taxAmount != null ? taxAmount.hashCode() : 0);
    }

    @Nullable
    public final Boolean isShowProSuccess() {
        return this.isShowProSuccess;
    }

    public final boolean isShowProcess() {
        return Intrinsics.areEqual(this.status, "0") && CollectionsKt.arrayListOf(CHANNEL_CAPITUAL).contains(C27041f.m66668h(this.paymentMethodCode));
    }

    public final void setPayoutTrxnId(@Nullable String str) {
        this.payoutTrxnId = str;
    }

    public final void setShowProSuccess(@Nullable Boolean bool) {
        this.isShowProSuccess = bool;
    }

    @NotNull
    public String toString() {
        return "FiatWithdrawOrderInfo(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", payoutTrxnId=" + this.payoutTrxnId + ", withdrawType=" + this.withdrawType + ", withdrawAmount=" + this.withdrawAmount + ", feeAmount=" + this.feeAmount + ", status=" + this.status + ", ibanLast4=" + this.ibanLast4 + ", bankName=" + this.bankName + ", discription=" + this.discription + ", payoutAccountInfo=" + this.payoutAccountInfo + ", statusMessage=" + this.statusMessage + ", created=" + this.created + ", accountExtra=" + this.accountExtra + ", isShowProSuccess=" + this.isShowProSuccess + ", reversedAmount=" + this.reversedAmount + ", estimateReceiveAmount=" + this.estimateReceiveAmount + ", errorInfo=" + this.errorInfo + ", taxAmount=" + this.taxAmount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.channelId);
        dest.writeString(this.payoutTrxnId);
        dest.writeString(this.withdrawType);
        WithdrawAmount withdrawAmount = this.withdrawAmount;
        if (withdrawAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            withdrawAmount.writeToParcel(dest, flags);
        }
        FeeAmount feeAmount = this.feeAmount;
        if (feeAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            feeAmount.writeToParcel(dest, flags);
        }
        dest.writeString(this.status);
        dest.writeString(this.ibanLast4);
        dest.writeString(this.bankName);
        dest.writeString(this.discription);
        dest.writeString(this.payoutAccountInfo);
        dest.writeString(this.statusMessage);
        Long l11 = this.created;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        FiatAccountExtraInfo fiatAccountExtraInfo = this.accountExtra;
        if (fiatAccountExtraInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatAccountExtraInfo.writeToParcel(dest, flags);
        }
        Boolean bool = this.isShowProSuccess;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        WithdrawAmount withdrawAmount2 = this.reversedAmount;
        if (withdrawAmount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            withdrawAmount2.writeToParcel(dest, flags);
        }
        WithdrawAmount withdrawAmount3 = this.estimateReceiveAmount;
        if (withdrawAmount3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            withdrawAmount3.writeToParcel(dest, flags);
        }
        ErrorInfoEntity errorInfoEntity = this.errorInfo;
        if (errorInfoEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            errorInfoEntity.writeToParcel(dest, flags);
        }
        TaxAmount taxAmount = this.taxAmount;
        if (taxAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            taxAmount.writeToParcel(dest, flags);
        }
    }

    public FiatWithdrawOrderInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable WithdrawAmount withdrawAmount, @Nullable FeeAmount feeAmount, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Long l11, @Nullable FiatAccountExtraInfo fiatAccountExtraInfo, @Nullable Boolean bool, @Nullable WithdrawAmount withdrawAmount2, @Nullable WithdrawAmount withdrawAmount3, @Nullable ErrorInfoEntity errorInfoEntity, @Nullable TaxAmount taxAmount) {
        this.paymentMethodCode = str;
        this.channelId = str2;
        this.payoutTrxnId = str3;
        this.withdrawType = str4;
        this.withdrawAmount = withdrawAmount;
        this.feeAmount = feeAmount;
        this.status = str5;
        this.ibanLast4 = str6;
        this.bankName = str7;
        this.discription = str8;
        this.payoutAccountInfo = str9;
        this.statusMessage = str10;
        this.created = l11;
        this.accountExtra = fiatAccountExtraInfo;
        this.isShowProSuccess = bool;
        this.reversedAmount = withdrawAmount2;
        this.estimateReceiveAmount = withdrawAmount3;
        this.errorInfo = errorInfoEntity;
        this.taxAmount = taxAmount;
    }
}
