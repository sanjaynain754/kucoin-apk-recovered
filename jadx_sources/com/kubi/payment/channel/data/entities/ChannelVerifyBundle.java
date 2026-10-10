package com.kubi.payment.channel.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006."}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/ChannelVerifyBundle;", "Landroid/os/Parcelable;", "channelId", "", "paymentMethodCode", "fiatCurrency", "limitMin", "limitMax", "feeMsg", "isWithdraw", "", "transferChannelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getPaymentMethodCode", "getFiatCurrency", "getLimitMin", "getLimitMax", "getFeeMsg", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTransferChannelId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/channel/data/entities/ChannelVerifyBundle;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChannelVerifyBundle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChannelVerifyBundle> CREATOR = new C20322a();

    @Nullable
    private final String channelId;

    @Nullable
    private final String feeMsg;

    @Nullable
    private final String fiatCurrency;

    @Nullable
    private final Boolean isWithdraw;

    @Nullable
    private final String limitMax;

    @Nullable
    private final String limitMin;

    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String transferChannelId;

    /* JADX INFO: renamed from: com.kubi.payment.channel.data.entities.ChannelVerifyBundle$a */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20322a implements Parcelable.Creator<ChannelVerifyBundle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChannelVerifyBundle createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChannelVerifyBundle(string, string2, string3, string4, string5, string6, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChannelVerifyBundle[] newArray(int i11) {
            return new ChannelVerifyBundle[i11];
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
        if (!(other instanceof ChannelVerifyBundle)) {
            return false;
        }
        ChannelVerifyBundle channelVerifyBundle = (ChannelVerifyBundle) other;
        return Intrinsics.areEqual(this.channelId, channelVerifyBundle.channelId) && Intrinsics.areEqual(this.paymentMethodCode, channelVerifyBundle.paymentMethodCode) && Intrinsics.areEqual(this.fiatCurrency, channelVerifyBundle.fiatCurrency) && Intrinsics.areEqual(this.limitMin, channelVerifyBundle.limitMin) && Intrinsics.areEqual(this.limitMax, channelVerifyBundle.limitMax) && Intrinsics.areEqual(this.feeMsg, channelVerifyBundle.feeMsg) && Intrinsics.areEqual(this.isWithdraw, channelVerifyBundle.isWithdraw) && Intrinsics.areEqual(this.transferChannelId, channelVerifyBundle.transferChannelId);
    }

    public static /* synthetic */ ChannelVerifyBundle copy$default(ChannelVerifyBundle channelVerifyBundle, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = channelVerifyBundle.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = channelVerifyBundle.paymentMethodCode;
        }
        if ((i11 & 4) != 0) {
            str3 = channelVerifyBundle.fiatCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = channelVerifyBundle.limitMin;
        }
        if ((i11 & 16) != 0) {
            str5 = channelVerifyBundle.limitMax;
        }
        if ((i11 & 32) != 0) {
            str6 = channelVerifyBundle.feeMsg;
        }
        if ((i11 & 64) != 0) {
            bool = channelVerifyBundle.isWithdraw;
        }
        if ((i11 & 128) != 0) {
            str7 = channelVerifyBundle.transferChannelId;
        }
        Boolean bool2 = bool;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        return channelVerifyBundle.copy(str, str2, str3, str4, str9, str10, bool2, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLimitMin() {
        return this.limitMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLimitMax() {
        return this.limitMax;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsWithdraw() {
        return this.isWithdraw;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTransferChannelId() {
        return this.transferChannelId;
    }

    @NotNull
    public final ChannelVerifyBundle copy(@Nullable String channelId, @Nullable String paymentMethodCode, @Nullable String fiatCurrency, @Nullable String limitMin, @Nullable String limitMax, @Nullable String feeMsg, @Nullable Boolean isWithdraw, @Nullable String transferChannelId) {
        return new ChannelVerifyBundle(channelId, paymentMethodCode, fiatCurrency, limitMin, limitMax, feeMsg, isWithdraw, transferChannelId);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getLimitMax() {
        return this.limitMax;
    }

    @Nullable
    public final String getLimitMin() {
        return this.limitMin;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getTransferChannelId() {
        return this.transferChannelId;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fiatCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.limitMin;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.limitMax;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feeMsg;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isWithdraw;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.transferChannelId;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isWithdraw() {
        return this.isWithdraw;
    }

    @NotNull
    public String toString() {
        return "ChannelVerifyBundle(channelId=" + this.channelId + ", paymentMethodCode=" + this.paymentMethodCode + ", fiatCurrency=" + this.fiatCurrency + ", limitMin=" + this.limitMin + ", limitMax=" + this.limitMax + ", feeMsg=" + this.feeMsg + ", isWithdraw=" + this.isWithdraw + ", transferChannelId=" + this.transferChannelId + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.limitMin);
        dest.writeString(this.limitMax);
        dest.writeString(this.feeMsg);
        Boolean bool = this.isWithdraw;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.transferChannelId);
    }

    public ChannelVerifyBundle(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable String str7) {
        this.channelId = str;
        this.paymentMethodCode = str2;
        this.fiatCurrency = str3;
        this.limitMin = str4;
        this.limitMax = str5;
        this.feeMsg = str6;
        this.isWithdraw = bool;
        this.transferChannelId = str7;
    }
}
