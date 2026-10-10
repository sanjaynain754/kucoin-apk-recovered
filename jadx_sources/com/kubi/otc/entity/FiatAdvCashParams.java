package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatAdvCashParams;", "Landroid/os/Parcelable;", "channelId", "", "paymentAmount", "paymentCurrency", "paymentMethod", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getPaymentAmount", "getPaymentCurrency", "getPaymentMethod", "getSource", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatAdvCashParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatAdvCashParams> CREATOR = new Creator();

    @Nullable
    private final String channelId;

    @Nullable
    private final String paymentAmount;

    @Nullable
    private final String paymentCurrency;

    @Nullable
    private final String paymentMethod;

    @Nullable
    private final String source;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatAdvCashParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAdvCashParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatAdvCashParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAdvCashParams[] newArray(int i11) {
            return new FiatAdvCashParams[i11];
        }
    }

    public FiatAdvCashParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.channelId = str;
        this.paymentAmount = str2;
        this.paymentCurrency = str3;
        this.paymentMethod = str4;
        this.source = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatAdvCashParams)) {
            return false;
        }
        FiatAdvCashParams fiatAdvCashParams = (FiatAdvCashParams) other;
        return Intrinsics.areEqual(this.channelId, fiatAdvCashParams.channelId) && Intrinsics.areEqual(this.paymentAmount, fiatAdvCashParams.paymentAmount) && Intrinsics.areEqual(this.paymentCurrency, fiatAdvCashParams.paymentCurrency) && Intrinsics.areEqual(this.paymentMethod, fiatAdvCashParams.paymentMethod) && Intrinsics.areEqual(this.source, fiatAdvCashParams.source);
    }

    public static /* synthetic */ FiatAdvCashParams copy$default(FiatAdvCashParams fiatAdvCashParams, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatAdvCashParams.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatAdvCashParams.paymentAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatAdvCashParams.paymentCurrency;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatAdvCashParams.paymentMethod;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatAdvCashParams.source;
        }
        String str6 = str5;
        String str7 = str3;
        return fiatAdvCashParams.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final FiatAdvCashParams copy(@Nullable String channelId, @Nullable String paymentAmount, @Nullable String paymentCurrency, @Nullable String paymentMethod, @Nullable String source) {
        return new FiatAdvCashParams(channelId, paymentAmount, paymentCurrency, paymentMethod, source);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    public final String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    @Nullable
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentMethod;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.source;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiatAdvCashParams(channelId=" + this.channelId + ", paymentAmount=" + this.paymentAmount + ", paymentCurrency=" + this.paymentCurrency + ", paymentMethod=" + this.paymentMethod + ", source=" + this.source + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.paymentAmount);
        dest.writeString(this.paymentCurrency);
        dest.writeString(this.paymentMethod);
        dest.writeString(this.source);
    }

    public /* synthetic */ FiatAdvCashParams(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? "WALLET" : str4, (i11 & 16) != 0 ? "android" : str5);
    }
}
