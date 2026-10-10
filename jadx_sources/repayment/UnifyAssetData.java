package repayment;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UiData.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006%"}, m90084d2 = {"Lrepayment/UnifyAssetData;", "Landroid/os/Parcelable;", AppsFlyerProperties.CURRENCY_CODE, "", "currencyName", "iconUrl", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrencyCode", "()Ljava/lang/String;", "getCurrencyName", "getIconUrl", "getPrice", "()Ljava/math/BigDecimal;", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyAssetData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyAssetData> CREATOR = new C44003a();

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final String currencyCode;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final BigDecimal price;

    /* JADX INFO: renamed from: repayment.UnifyAssetData$a */
    /* JADX INFO: compiled from: UiData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C44003a implements Parcelable.Creator<UnifyAssetData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyAssetData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifyAssetData(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyAssetData[] newArray(int i11) {
            return new UnifyAssetData[i11];
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
        if (!(other instanceof UnifyAssetData)) {
            return false;
        }
        UnifyAssetData unifyAssetData = (UnifyAssetData) other;
        return Intrinsics.areEqual(this.currencyCode, unifyAssetData.currencyCode) && Intrinsics.areEqual(this.currencyName, unifyAssetData.currencyName) && Intrinsics.areEqual(this.iconUrl, unifyAssetData.iconUrl) && Intrinsics.areEqual(this.price, unifyAssetData.price) && Intrinsics.areEqual(this.amount, unifyAssetData.amount);
    }

    public static /* synthetic */ UnifyAssetData copy$default(UnifyAssetData unifyAssetData, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyAssetData.currencyCode;
        }
        if ((i11 & 2) != 0) {
            str2 = unifyAssetData.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = unifyAssetData.iconUrl;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = unifyAssetData.price;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = unifyAssetData.amount;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        String str4 = str3;
        return unifyAssetData.copy(str, str2, str4, bigDecimal, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final UnifyAssetData copy(@Nullable String currencyCode, @Nullable String currencyName, @Nullable String iconUrl, @Nullable BigDecimal price, @Nullable BigDecimal amount) {
        return new UnifyAssetData(currencyCode, currencyName, iconUrl, price, amount);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.currencyCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.amount;
        return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyAssetData(currencyCode=" + this.currencyCode + ", currencyName=" + this.currencyName + ", iconUrl=" + this.iconUrl + ", price=" + this.price + ", amount=" + this.amount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currencyCode);
        dest.writeString(this.currencyName);
        dest.writeString(this.iconUrl);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.amount);
    }

    public UnifyAssetData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.currencyCode = str;
        this.currencyName = str2;
        this.iconUrl = str3;
        this.price = bigDecimal;
        this.amount = bigDecimal2;
    }
}
