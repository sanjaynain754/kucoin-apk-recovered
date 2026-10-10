package repayment;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UiData.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m90084d2 = {"Lrepayment/UnifyLiabilityData;", "Landroid/os/Parcelable;", AppsFlyerProperties.CURRENCY_CODE, "", "currencyName", "iconUrl", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCurrencyCode", "()Ljava/lang/String;", "getCurrencyName", "getIconUrl", "getAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyLiabilityData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyLiabilityData> CREATOR = new C44004a();

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final String currencyCode;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: repayment.UnifyLiabilityData$a */
    /* JADX INFO: compiled from: UiData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C44004a implements Parcelable.Creator<UnifyLiabilityData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyLiabilityData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifyLiabilityData(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyLiabilityData[] newArray(int i11) {
            return new UnifyLiabilityData[i11];
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
        if (!(other instanceof UnifyLiabilityData)) {
            return false;
        }
        UnifyLiabilityData unifyLiabilityData = (UnifyLiabilityData) other;
        return Intrinsics.areEqual(this.currencyCode, unifyLiabilityData.currencyCode) && Intrinsics.areEqual(this.currencyName, unifyLiabilityData.currencyName) && Intrinsics.areEqual(this.iconUrl, unifyLiabilityData.iconUrl) && Intrinsics.areEqual(this.amount, unifyLiabilityData.amount);
    }

    public static /* synthetic */ UnifyLiabilityData copy$default(UnifyLiabilityData unifyLiabilityData, String str, String str2, String str3, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyLiabilityData.currencyCode;
        }
        if ((i11 & 2) != 0) {
            str2 = unifyLiabilityData.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = unifyLiabilityData.iconUrl;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = unifyLiabilityData.amount;
        }
        return unifyLiabilityData.copy(str, str2, str3, bigDecimal);
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
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final UnifyLiabilityData copy(@Nullable String currencyCode, @Nullable String currencyName, @Nullable String iconUrl, @Nullable BigDecimal amount) {
        return new UnifyLiabilityData(currencyCode, currencyName, iconUrl, amount);
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

    public int hashCode() {
        String str = this.currencyCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        return iHashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyLiabilityData(currencyCode=" + this.currencyCode + ", currencyName=" + this.currencyName + ", iconUrl=" + this.iconUrl + ", amount=" + this.amount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currencyCode);
        dest.writeString(this.currencyName);
        dest.writeString(this.iconUrl);
        dest.writeSerializable(this.amount);
    }

    public UnifyLiabilityData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal) {
        this.currencyCode = str;
        this.currencyName = str2;
        this.iconUrl = str3;
        this.amount = bigDecimal;
    }
}
