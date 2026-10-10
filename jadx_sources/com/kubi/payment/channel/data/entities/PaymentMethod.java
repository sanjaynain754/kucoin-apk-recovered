package com.kubi.payment.channel.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Constants;
import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaymentMethod.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00069"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "Landroid/os/Parcelable;", "paymentMethodCode", "", "channelId", "iconUrl", "title", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "feeMessage", "eventContent", "eventHref", "minAmount", "maxAmount", "status", "fiatIconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getIconUrl", "getTitle", "getDescription", "getFeeMessage", "getEventContent", "getEventHref", "getMinAmount", "getMaxAmount", "getStatus", "getFiatIconUrl", Constants.ENABLE_DISABLE, "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PaymentMethod implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new C20324a();

    @SerializedName("channelId")
    @Nullable
    private final String channelId;

    @SerializedName("paymentDescription")
    @Nullable
    private final String description;

    @SerializedName("eventContent")
    @Nullable
    private final String eventContent;

    @SerializedName("eventHref")
    @Nullable
    private final String eventHref;

    @SerializedName("feeMsg")
    @Nullable
    private final String feeMessage;

    @SerializedName("fiatIconUrl")
    @Nullable
    private final String fiatIconUrl;

    @SerializedName("paymentIcon")
    @Nullable
    private final String iconUrl;

    @SerializedName("maxFiatAmount")
    @Nullable
    private final String maxAmount;

    @SerializedName("minFiatAmount")
    @Nullable
    private final String minAmount;

    @SerializedName("paymentMethodCode")
    @Nullable
    private final String paymentMethodCode;

    @SerializedName("paymentStatus")
    @Nullable
    private final String status;

    @SerializedName("paymentName")
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.payment.channel.data.entities.PaymentMethod$a */
    /* JADX INFO: compiled from: PaymentMethod.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20324a implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod[] newArray(int i11) {
            return new PaymentMethod[i11];
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
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.paymentMethodCode, paymentMethod.paymentMethodCode) && Intrinsics.areEqual(this.channelId, paymentMethod.channelId) && Intrinsics.areEqual(this.iconUrl, paymentMethod.iconUrl) && Intrinsics.areEqual(this.title, paymentMethod.title) && Intrinsics.areEqual(this.description, paymentMethod.description) && Intrinsics.areEqual(this.feeMessage, paymentMethod.feeMessage) && Intrinsics.areEqual(this.eventContent, paymentMethod.eventContent) && Intrinsics.areEqual(this.eventHref, paymentMethod.eventHref) && Intrinsics.areEqual(this.minAmount, paymentMethod.minAmount) && Intrinsics.areEqual(this.maxAmount, paymentMethod.maxAmount) && Intrinsics.areEqual(this.status, paymentMethod.status) && Intrinsics.areEqual(this.fiatIconUrl, paymentMethod.fiatIconUrl);
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentMethod.paymentMethodCode;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentMethod.channelId;
        }
        if ((i11 & 4) != 0) {
            str3 = paymentMethod.iconUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = paymentMethod.title;
        }
        if ((i11 & 16) != 0) {
            str5 = paymentMethod.description;
        }
        if ((i11 & 32) != 0) {
            str6 = paymentMethod.feeMessage;
        }
        if ((i11 & 64) != 0) {
            str7 = paymentMethod.eventContent;
        }
        if ((i11 & 128) != 0) {
            str8 = paymentMethod.eventHref;
        }
        if ((i11 & 256) != 0) {
            str9 = paymentMethod.minAmount;
        }
        if ((i11 & 512) != 0) {
            str10 = paymentMethod.maxAmount;
        }
        if ((i11 & 1024) != 0) {
            str11 = paymentMethod.status;
        }
        if ((i11 & 2048) != 0) {
            str12 = paymentMethod.fiatIconUrl;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return paymentMethod.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFiatIconUrl() {
        return this.fiatIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFeeMessage() {
        return this.feeMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEventContent() {
        return this.eventContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEventHref() {
        return this.eventHref;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMinAmount() {
        return this.minAmount;
    }

    @NotNull
    public final PaymentMethod copy(@Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String iconUrl, @Nullable String title, @Nullable String description, @Nullable String feeMessage, @Nullable String eventContent, @Nullable String eventHref, @Nullable String minAmount, @Nullable String maxAmount, @Nullable String status, @Nullable String fiatIconUrl) {
        return new PaymentMethod(paymentMethodCode, channelId, iconUrl, title, description, feeMessage, eventContent, eventHref, minAmount, maxAmount, status, fiatIconUrl);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getEventContent() {
        return this.eventContent;
    }

    @Nullable
    public final String getEventHref() {
        return this.eventHref;
    }

    @Nullable
    public final String getFeeMessage() {
        return this.feeMessage;
    }

    @Nullable
    public final String getFiatIconUrl() {
        return this.fiatIconUrl;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    @Nullable
    public final String getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.paymentMethodCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feeMessage;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.eventContent;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eventHref;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.minAmount;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maxAmount;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.status;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fiatIconUrl;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return Intrinsics.areEqual(this.status, "1");
    }

    @NotNull
    public String toString() {
        return "PaymentMethod(paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", description=" + this.description + ", feeMessage=" + this.feeMessage + ", eventContent=" + this.eventContent + ", eventHref=" + this.eventHref + ", minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", status=" + this.status + ", fiatIconUrl=" + this.fiatIconUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.channelId);
        dest.writeString(this.iconUrl);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.feeMessage);
        dest.writeString(this.eventContent);
        dest.writeString(this.eventHref);
        dest.writeString(this.minAmount);
        dest.writeString(this.maxAmount);
        dest.writeString(this.status);
        dest.writeString(this.fiatIconUrl);
    }

    public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.paymentMethodCode = str;
        this.channelId = str2;
        this.iconUrl = str3;
        this.title = str4;
        this.description = str5;
        this.feeMessage = str6;
        this.eventContent = str7;
        this.eventHref = str8;
        this.minAmount = str9;
        this.maxAmount = str10;
        this.status = str11;
        this.fiatIconUrl = str12;
    }
}
