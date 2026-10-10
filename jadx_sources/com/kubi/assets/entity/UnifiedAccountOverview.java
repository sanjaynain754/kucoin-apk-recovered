package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedAccountOverview.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u000fJ\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u000fHÖ\u0001J\t\u00104\u001a\u00020\rHÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u0006:"}, m90084d2 = {"Lcom/kubi/assets/entity/UnifiedAccountOverview;", "Landroid/os/Parcelable;", "riskRatio", "Ljava/math/BigDecimal;", "equity", "marginEquity", "unrealisedPnl", "adjustedEquity", "totalLiability", "im", "mm", "availableMargin", FirebaseAnalytics.Param.CURRENCY, "", "collateralStatus", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;)V", "getRiskRatio", "()Ljava/math/BigDecimal;", "getEquity", "getMarginEquity", "getUnrealisedPnl", "getAdjustedEquity", "getTotalLiability", "getIm", "getMm", "getAvailableMargin", "getCurrency", "()Ljava/lang/String;", "getCollateralStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/assets/entity/UnifiedAccountOverview;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedAccountOverview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedAccountOverview> CREATOR = new Creator();

    @Nullable
    private final BigDecimal adjustedEquity;

    @Nullable
    private final BigDecimal availableMargin;

    @Nullable
    private final Integer collateralStatus;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal equity;

    @Nullable
    private final BigDecimal im;

    @Nullable
    private final BigDecimal marginEquity;

    @Nullable
    private final BigDecimal mm;

    @Nullable
    private final BigDecimal riskRatio;

    @Nullable
    private final BigDecimal totalLiability;

    @Nullable
    private final BigDecimal unrealisedPnl;

    /* JADX INFO: compiled from: UnifiedAccountOverview.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<UnifiedAccountOverview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAccountOverview createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedAccountOverview((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAccountOverview[] newArray(int i11) {
            return new UnifiedAccountOverview[i11];
        }
    }

    public UnifiedAccountOverview(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable String str, @Nullable Integer num) {
        this.riskRatio = bigDecimal;
        this.equity = bigDecimal2;
        this.marginEquity = bigDecimal3;
        this.unrealisedPnl = bigDecimal4;
        this.adjustedEquity = bigDecimal5;
        this.totalLiability = bigDecimal6;
        this.im = bigDecimal7;
        this.mm = bigDecimal8;
        this.availableMargin = bigDecimal9;
        this.currency = str;
        this.collateralStatus = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedAccountOverview)) {
            return false;
        }
        UnifiedAccountOverview unifiedAccountOverview = (UnifiedAccountOverview) other;
        return Intrinsics.areEqual(this.riskRatio, unifiedAccountOverview.riskRatio) && Intrinsics.areEqual(this.equity, unifiedAccountOverview.equity) && Intrinsics.areEqual(this.marginEquity, unifiedAccountOverview.marginEquity) && Intrinsics.areEqual(this.unrealisedPnl, unifiedAccountOverview.unrealisedPnl) && Intrinsics.areEqual(this.adjustedEquity, unifiedAccountOverview.adjustedEquity) && Intrinsics.areEqual(this.totalLiability, unifiedAccountOverview.totalLiability) && Intrinsics.areEqual(this.im, unifiedAccountOverview.im) && Intrinsics.areEqual(this.mm, unifiedAccountOverview.mm) && Intrinsics.areEqual(this.availableMargin, unifiedAccountOverview.availableMargin) && Intrinsics.areEqual(this.currency, unifiedAccountOverview.currency) && Intrinsics.areEqual(this.collateralStatus, unifiedAccountOverview.collateralStatus);
    }

    public static /* synthetic */ UnifiedAccountOverview copy$default(UnifiedAccountOverview unifiedAccountOverview, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = unifiedAccountOverview.riskRatio;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = unifiedAccountOverview.equity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = unifiedAccountOverview.marginEquity;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = unifiedAccountOverview.unrealisedPnl;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = unifiedAccountOverview.adjustedEquity;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = unifiedAccountOverview.totalLiability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = unifiedAccountOverview.im;
        }
        if ((i11 & 128) != 0) {
            bigDecimal8 = unifiedAccountOverview.mm;
        }
        if ((i11 & 256) != 0) {
            bigDecimal9 = unifiedAccountOverview.availableMargin;
        }
        if ((i11 & 512) != 0) {
            str = unifiedAccountOverview.currency;
        }
        if ((i11 & 1024) != 0) {
            num = unifiedAccountOverview.collateralStatus;
        }
        String str2 = str;
        Integer num2 = num;
        BigDecimal bigDecimal10 = bigDecimal8;
        BigDecimal bigDecimal11 = bigDecimal9;
        BigDecimal bigDecimal12 = bigDecimal6;
        BigDecimal bigDecimal13 = bigDecimal7;
        BigDecimal bigDecimal14 = bigDecimal5;
        BigDecimal bigDecimal15 = bigDecimal3;
        return unifiedAccountOverview.copy(bigDecimal, bigDecimal2, bigDecimal15, bigDecimal4, bigDecimal14, bigDecimal12, bigDecimal13, bigDecimal10, bigDecimal11, str2, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getCollateralStatus() {
        return this.collateralStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMarginEquity() {
        return this.marginEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAdjustedEquity() {
        return this.adjustedEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getIm() {
        return this.im;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getMm() {
        return this.mm;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @NotNull
    public final UnifiedAccountOverview copy(@Nullable BigDecimal riskRatio, @Nullable BigDecimal equity, @Nullable BigDecimal marginEquity, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal adjustedEquity, @Nullable BigDecimal totalLiability, @Nullable BigDecimal im2, @Nullable BigDecimal mm2, @Nullable BigDecimal availableMargin, @Nullable String currency, @Nullable Integer collateralStatus) {
        return new UnifiedAccountOverview(riskRatio, equity, marginEquity, unrealisedPnl, adjustedEquity, totalLiability, im2, mm2, availableMargin, currency, collateralStatus);
    }

    @Nullable
    public final BigDecimal getAdjustedEquity() {
        return this.adjustedEquity;
    }

    @Nullable
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @Nullable
    public final Integer getCollateralStatus() {
        return this.collateralStatus;
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
    public final BigDecimal getIm() {
        return this.im;
    }

    @Nullable
    public final BigDecimal getMarginEquity() {
        return this.marginEquity;
    }

    @Nullable
    public final BigDecimal getMm() {
        return this.mm;
    }

    @Nullable
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    @Nullable
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.riskRatio;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.equity;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.marginEquity;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.unrealisedPnl;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.adjustedEquity;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalLiability;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.im;
        int iHashCode7 = (iHashCode6 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.mm;
        int iHashCode8 = (iHashCode7 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.availableMargin;
        int iHashCode9 = (iHashCode8 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str = this.currency;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.collateralStatus;
        return iHashCode10 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedAccountOverview(riskRatio=" + this.riskRatio + ", equity=" + this.equity + ", marginEquity=" + this.marginEquity + ", unrealisedPnl=" + this.unrealisedPnl + ", adjustedEquity=" + this.adjustedEquity + ", totalLiability=" + this.totalLiability + ", im=" + this.im + ", mm=" + this.mm + ", availableMargin=" + this.availableMargin + ", currency=" + this.currency + ", collateralStatus=" + this.collateralStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.riskRatio);
        dest.writeSerializable(this.equity);
        dest.writeSerializable(this.marginEquity);
        dest.writeSerializable(this.unrealisedPnl);
        dest.writeSerializable(this.adjustedEquity);
        dest.writeSerializable(this.totalLiability);
        dest.writeSerializable(this.im);
        dest.writeSerializable(this.mm);
        dest.writeSerializable(this.availableMargin);
        dest.writeString(this.currency);
        Integer num = this.collateralStatus;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ UnifiedAccountOverview(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, str, (i11 & 1024) != 0 ? null : num);
    }
}
