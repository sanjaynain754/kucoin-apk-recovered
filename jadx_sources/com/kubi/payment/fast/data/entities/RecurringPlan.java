package com.kubi.payment.fast.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecurringPlan.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010 J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u000fJ\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000fHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u0006<"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/RecurringPlan;", "Landroid/os/Parcelable;", "recurringId", "", "channelId", "paymentMethodCode", "fiatCurrency", "cryptoCurrency", "status", "totalFiatAmount", "displayRecurringFrequency", "nextPaymentDescription", TUIConstantDefine.CREATE_TIME, "", "totalTimes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getRecurringId", "()Ljava/lang/String;", "getChannelId", "getPaymentMethodCode", "getFiatCurrency", "getCryptoCurrency", "getStatus", "getTotalFiatAmount", "getDisplayRecurringFrequency", "getNextPaymentDescription", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalTimes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/kubi/payment/fast/data/entities/RecurringPlan;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecurringPlan implements Parcelable {

    @NotNull
    public static final String CANCELLED = "CANCELLED";

    @NotNull
    public static final String CREATED = "CREATED";

    @NotNull
    public static final String FAILED = "FAILED";

    @NotNull
    public static final String PROCESSING = "AVAILABLE";

    @NotNull
    public static final String SUSPENDED = "SUSPEND";

    @SerializedName("channelId")
    @Nullable
    private final String channelId;

    @SerializedName(TUIConstantDefine.CREATE_TIME)
    @Nullable
    private final Long createTime;

    @SerializedName("cryptoCurrency")
    @Nullable
    private final String cryptoCurrency;

    @SerializedName("frequencyDesc")
    @Nullable
    private final String displayRecurringFrequency;

    @SerializedName("fiatCurrency")
    @Nullable
    private final String fiatCurrency;

    @SerializedName("nextPaymentDesc")
    @Nullable
    private final String nextPaymentDescription;

    @SerializedName("paymentMethodCode")
    @Nullable
    private final String paymentMethodCode;

    @SerializedName("recurringId")
    @Nullable
    private final String recurringId;

    @SerializedName("status")
    @Nullable
    private final String status;

    @SerializedName("totalFiatAmount")
    @Nullable
    private final String totalFiatAmount;

    @SerializedName("totalTimes")
    @Nullable
    private final Integer totalTimes;

    @NotNull
    public static final Parcelable.Creator<RecurringPlan> CREATOR = new C20503a();

    /* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.RecurringPlan$a */
    /* JADX INFO: compiled from: RecurringPlan.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20503a implements Parcelable.Creator<RecurringPlan> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecurringPlan createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringPlan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RecurringPlan[] newArray(int i11) {
            return new RecurringPlan[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPlan)) {
            return false;
        }
        RecurringPlan recurringPlan = (RecurringPlan) other;
        return Intrinsics.areEqual(this.recurringId, recurringPlan.recurringId) && Intrinsics.areEqual(this.channelId, recurringPlan.channelId) && Intrinsics.areEqual(this.paymentMethodCode, recurringPlan.paymentMethodCode) && Intrinsics.areEqual(this.fiatCurrency, recurringPlan.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, recurringPlan.cryptoCurrency) && Intrinsics.areEqual(this.status, recurringPlan.status) && Intrinsics.areEqual(this.totalFiatAmount, recurringPlan.totalFiatAmount) && Intrinsics.areEqual(this.displayRecurringFrequency, recurringPlan.displayRecurringFrequency) && Intrinsics.areEqual(this.nextPaymentDescription, recurringPlan.nextPaymentDescription) && Intrinsics.areEqual(this.createTime, recurringPlan.createTime) && Intrinsics.areEqual(this.totalTimes, recurringPlan.totalTimes);
    }

    public static /* synthetic */ RecurringPlan copy$default(RecurringPlan recurringPlan, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l11, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recurringPlan.recurringId;
        }
        if ((i11 & 2) != 0) {
            str2 = recurringPlan.channelId;
        }
        if ((i11 & 4) != 0) {
            str3 = recurringPlan.paymentMethodCode;
        }
        if ((i11 & 8) != 0) {
            str4 = recurringPlan.fiatCurrency;
        }
        if ((i11 & 16) != 0) {
            str5 = recurringPlan.cryptoCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = recurringPlan.status;
        }
        if ((i11 & 64) != 0) {
            str7 = recurringPlan.totalFiatAmount;
        }
        if ((i11 & 128) != 0) {
            str8 = recurringPlan.displayRecurringFrequency;
        }
        if ((i11 & 256) != 0) {
            str9 = recurringPlan.nextPaymentDescription;
        }
        if ((i11 & 512) != 0) {
            l11 = recurringPlan.createTime;
        }
        if ((i11 & 1024) != 0) {
            num = recurringPlan.totalTimes;
        }
        Long l12 = l11;
        Integer num2 = num;
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return recurringPlan.copy(str, str2, str15, str4, str14, str12, str13, str10, str11, l12, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecurringId() {
        return this.recurringId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getTotalTimes() {
        return this.totalTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalFiatAmount() {
        return this.totalFiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayRecurringFrequency() {
        return this.displayRecurringFrequency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    @NotNull
    public final RecurringPlan copy(@Nullable String recurringId, @Nullable String channelId, @Nullable String paymentMethodCode, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String status, @Nullable String totalFiatAmount, @Nullable String displayRecurringFrequency, @Nullable String nextPaymentDescription, @Nullable Long createTime, @Nullable Integer totalTimes) {
        return new RecurringPlan(recurringId, channelId, paymentMethodCode, fiatCurrency, cryptoCurrency, status, totalFiatAmount, displayRecurringFrequency, nextPaymentDescription, createTime, totalTimes);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final String getDisplayRecurringFrequency() {
        return this.displayRecurringFrequency;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getRecurringId() {
        return this.recurringId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTotalFiatAmount() {
        return this.totalFiatAmount;
    }

    @Nullable
    public final Integer getTotalTimes() {
        return this.totalTimes;
    }

    public int hashCode() {
        String str = this.recurringId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fiatCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cryptoCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.totalFiatAmount;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayRecurringFrequency;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.nextPaymentDescription;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l11 = this.createTime;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.totalTimes;
        return iHashCode10 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecurringPlan(recurringId=" + this.recurringId + ", channelId=" + this.channelId + ", paymentMethodCode=" + this.paymentMethodCode + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", status=" + this.status + ", totalFiatAmount=" + this.totalFiatAmount + ", displayRecurringFrequency=" + this.displayRecurringFrequency + ", nextPaymentDescription=" + this.nextPaymentDescription + ", createTime=" + this.createTime + ", totalTimes=" + this.totalTimes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.recurringId);
        dest.writeString(this.channelId);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.status);
        dest.writeString(this.totalFiatAmount);
        dest.writeString(this.displayRecurringFrequency);
        dest.writeString(this.nextPaymentDescription);
        Long l11 = this.createTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Integer num = this.totalTimes;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public RecurringPlan(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l11, @Nullable Integer num) {
        this.recurringId = str;
        this.channelId = str2;
        this.paymentMethodCode = str3;
        this.fiatCurrency = str4;
        this.cryptoCurrency = str5;
        this.status = str6;
        this.totalFiatAmount = str7;
        this.displayRecurringFrequency = str8;
        this.nextPaymentDescription = str9;
        this.createTime = l11;
        this.totalTimes = num;
    }
}
