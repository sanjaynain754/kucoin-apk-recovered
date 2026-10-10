package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedAccountData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/entity/UnifiedAccountData;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "equity", "Ljava/math/BigDecimal;", "balance", "available", "hold", "locked", "liability", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getEquity", "()Ljava/math/BigDecimal;", "getBalance", "getAvailable", "getHold", "getLocked", "getLiability", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedAccountData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedAccountData> CREATOR = new Creator();

    @Nullable
    private final BigDecimal available;

    @Nullable
    private final BigDecimal balance;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal equity;

    @Nullable
    private final BigDecimal hold;

    @Nullable
    private final BigDecimal liability;

    @Nullable
    private final BigDecimal locked;

    /* JADX INFO: compiled from: UnifiedAccountData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<UnifiedAccountData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAccountData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedAccountData(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAccountData[] newArray(int i11) {
            return new UnifiedAccountData[i11];
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
        if (!(other instanceof UnifiedAccountData)) {
            return false;
        }
        UnifiedAccountData unifiedAccountData = (UnifiedAccountData) other;
        return Intrinsics.areEqual(this.currency, unifiedAccountData.currency) && Intrinsics.areEqual(this.equity, unifiedAccountData.equity) && Intrinsics.areEqual(this.balance, unifiedAccountData.balance) && Intrinsics.areEqual(this.available, unifiedAccountData.available) && Intrinsics.areEqual(this.hold, unifiedAccountData.hold) && Intrinsics.areEqual(this.locked, unifiedAccountData.locked) && Intrinsics.areEqual(this.liability, unifiedAccountData.liability);
    }

    public static /* synthetic */ UnifiedAccountData copy$default(UnifiedAccountData unifiedAccountData, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifiedAccountData.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = unifiedAccountData.equity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = unifiedAccountData.balance;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = unifiedAccountData.available;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = unifiedAccountData.hold;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = unifiedAccountData.locked;
        }
        if ((i11 & 64) != 0) {
            bigDecimal6 = unifiedAccountData.liability;
        }
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal4;
        BigDecimal bigDecimal10 = bigDecimal2;
        return unifiedAccountData.copy(str, bigDecimal, bigDecimal10, bigDecimal3, bigDecimal9, bigDecimal7, bigDecimal8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLocked() {
        return this.locked;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @NotNull
    public final UnifiedAccountData copy(@Nullable String currency, @Nullable BigDecimal equity, @Nullable BigDecimal balance, @Nullable BigDecimal available, @Nullable BigDecimal hold, @Nullable BigDecimal locked, @Nullable BigDecimal liability) {
        return new UnifiedAccountData(currency, equity, balance, available, hold, locked, liability);
    }

    @Nullable
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLocked() {
        return this.locked;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.equity;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.balance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.available;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.hold;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.locked;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liability;
        return iHashCode6 + (bigDecimal6 != null ? bigDecimal6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedAccountData(currency=" + this.currency + ", equity=" + this.equity + ", balance=" + this.balance + ", available=" + this.available + ", hold=" + this.hold + ", locked=" + this.locked + ", liability=" + this.liability + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeSerializable(this.equity);
        dest.writeSerializable(this.balance);
        dest.writeSerializable(this.available);
        dest.writeSerializable(this.hold);
        dest.writeSerializable(this.locked);
        dest.writeSerializable(this.liability);
    }

    public UnifiedAccountData(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6) {
        this.currency = str;
        this.equity = bigDecimal;
        this.balance = bigDecimal2;
        this.available = bigDecimal3;
        this.hold = bigDecimal4;
        this.locked = bigDecimal5;
        this.liability = bigDecimal6;
    }
}
