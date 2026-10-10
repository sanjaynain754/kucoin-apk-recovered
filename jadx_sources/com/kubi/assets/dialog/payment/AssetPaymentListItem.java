package com.kubi.assets.dialog.payment;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetPaymentListConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetPaymentListItem;", "Landroid/os/Parcelable;", "paymentMethodCode", "", "paymentMethodName", "displayType", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "redirectUrl", "iconUrl", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getPaymentMethodName", "getDisplayType", "getDescription", "getRedirectUrl", "getIconUrl", "getTradeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetPaymentListItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetPaymentListItem> CREATOR = new C9825a();

    @Nullable
    private final String description;

    @Nullable
    private final String displayType;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String paymentMethodName;

    @Nullable
    private final String redirectUrl;

    @Nullable
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetPaymentListItem$a */
    /* JADX INFO: compiled from: AssetPaymentListConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9825a implements Parcelable.Creator<AssetPaymentListItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssetPaymentListItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetPaymentListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AssetPaymentListItem[] newArray(int i11) {
            return new AssetPaymentListItem[i11];
        }
    }

    public AssetPaymentListItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.paymentMethodCode = str;
        this.paymentMethodName = str2;
        this.displayType = str3;
        this.description = str4;
        this.redirectUrl = str5;
        this.iconUrl = str6;
        this.tradeType = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetPaymentListItem)) {
            return false;
        }
        AssetPaymentListItem assetPaymentListItem = (AssetPaymentListItem) other;
        return Intrinsics.areEqual(this.paymentMethodCode, assetPaymentListItem.paymentMethodCode) && Intrinsics.areEqual(this.paymentMethodName, assetPaymentListItem.paymentMethodName) && Intrinsics.areEqual(this.displayType, assetPaymentListItem.displayType) && Intrinsics.areEqual(this.description, assetPaymentListItem.description) && Intrinsics.areEqual(this.redirectUrl, assetPaymentListItem.redirectUrl) && Intrinsics.areEqual(this.iconUrl, assetPaymentListItem.iconUrl) && Intrinsics.areEqual(this.tradeType, assetPaymentListItem.tradeType);
    }

    public static /* synthetic */ AssetPaymentListItem copy$default(AssetPaymentListItem assetPaymentListItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assetPaymentListItem.paymentMethodCode;
        }
        if ((i11 & 2) != 0) {
            str2 = assetPaymentListItem.paymentMethodName;
        }
        if ((i11 & 4) != 0) {
            str3 = assetPaymentListItem.displayType;
        }
        if ((i11 & 8) != 0) {
            str4 = assetPaymentListItem.description;
        }
        if ((i11 & 16) != 0) {
            str5 = assetPaymentListItem.redirectUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = assetPaymentListItem.iconUrl;
        }
        if ((i11 & 64) != 0) {
            str7 = assetPaymentListItem.tradeType;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return assetPaymentListItem.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    public final AssetPaymentListItem copy(@Nullable String paymentMethodCode, @Nullable String paymentMethodName, @Nullable String displayType, @Nullable String description, @Nullable String redirectUrl, @Nullable String iconUrl, @Nullable String tradeType) {
        return new AssetPaymentListItem(paymentMethodCode, paymentMethodName, displayType, description, redirectUrl, iconUrl, tradeType);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.paymentMethodCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redirectUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tradeType;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetPaymentListItem(paymentMethodCode=" + this.paymentMethodCode + ", paymentMethodName=" + this.paymentMethodName + ", displayType=" + this.displayType + ", description=" + this.description + ", redirectUrl=" + this.redirectUrl + ", iconUrl=" + this.iconUrl + ", tradeType=" + this.tradeType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.paymentMethodName);
        dest.writeString(this.displayType);
        dest.writeString(this.description);
        dest.writeString(this.redirectUrl);
        dest.writeString(this.iconUrl);
        dest.writeString(this.tradeType);
    }

    public /* synthetic */ AssetPaymentListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? null : str7);
    }
}
