package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginTransfer.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginTransfer;", "Landroid/os/Parcelable;", "accountType", "", "availableBalance", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "holdBalance", "maxOutSize", "tag", "totalBalance", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAccountType", "()Ljava/lang/String;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "getCurrency", "getHoldBalance", "getMaxOutSize", "getTag", "getTotalBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginTransfer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginTransfer> CREATOR = new C17490a();

    @Nullable
    private final String accountType;

    @Nullable
    private final BigDecimal availableBalance;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal holdBalance;

    @Nullable
    private final BigDecimal maxOutSize;

    @Nullable
    private final String tag;

    @Nullable
    private final BigDecimal totalBalance;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginTransfer$a */
    /* JADX INFO: compiled from: MarginTransfer.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17490a implements Parcelable.Creator<MarginTransfer> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginTransfer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginTransfer(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginTransfer[] newArray(int i11) {
            return new MarginTransfer[i11];
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
        if (!(other instanceof MarginTransfer)) {
            return false;
        }
        MarginTransfer marginTransfer = (MarginTransfer) other;
        return Intrinsics.areEqual(this.accountType, marginTransfer.accountType) && Intrinsics.areEqual(this.availableBalance, marginTransfer.availableBalance) && Intrinsics.areEqual(this.currency, marginTransfer.currency) && Intrinsics.areEqual(this.holdBalance, marginTransfer.holdBalance) && Intrinsics.areEqual(this.maxOutSize, marginTransfer.maxOutSize) && Intrinsics.areEqual(this.tag, marginTransfer.tag) && Intrinsics.areEqual(this.totalBalance, marginTransfer.totalBalance);
    }

    public static /* synthetic */ MarginTransfer copy$default(MarginTransfer marginTransfer, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginTransfer.accountType;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = marginTransfer.availableBalance;
        }
        if ((i11 & 4) != 0) {
            str2 = marginTransfer.currency;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = marginTransfer.holdBalance;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = marginTransfer.maxOutSize;
        }
        if ((i11 & 32) != 0) {
            str3 = marginTransfer.tag;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = marginTransfer.totalBalance;
        }
        String str4 = str3;
        BigDecimal bigDecimal5 = bigDecimal4;
        BigDecimal bigDecimal6 = bigDecimal3;
        String str5 = str2;
        return marginTransfer.copy(str, bigDecimal, str5, bigDecimal2, bigDecimal6, str4, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMaxOutSize() {
        return this.maxOutSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final MarginTransfer copy(@Nullable String accountType, @Nullable BigDecimal availableBalance, @Nullable String currency, @Nullable BigDecimal holdBalance, @Nullable BigDecimal maxOutSize, @Nullable String tag, @Nullable BigDecimal totalBalance) {
        return new MarginTransfer(accountType, availableBalance, currency, holdBalance, maxOutSize, tag, totalBalance);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getMaxOutSize() {
        return this.maxOutSize;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.accountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.availableBalance;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxOutSize;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str3 = this.tag;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalBalance;
        return iHashCode6 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginTransfer(accountType=" + this.accountType + ", availableBalance=" + this.availableBalance + ", currency=" + this.currency + ", holdBalance=" + this.holdBalance + ", maxOutSize=" + this.maxOutSize + ", tag=" + this.tag + ", totalBalance=" + this.totalBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType);
        dest.writeSerializable(this.availableBalance);
        dest.writeString(this.currency);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.maxOutSize);
        dest.writeString(this.tag);
        dest.writeSerializable(this.totalBalance);
    }

    public MarginTransfer(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str3, @Nullable BigDecimal bigDecimal4) {
        this.accountType = str;
        this.availableBalance = bigDecimal;
        this.currency = str2;
        this.holdBalance = bigDecimal2;
        this.maxOutSize = bigDecimal3;
        this.tag = str3;
        this.totalBalance = bigDecimal4;
    }
}
