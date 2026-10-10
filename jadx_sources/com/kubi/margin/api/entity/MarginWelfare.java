package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginWelfare.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginWelfare;", "Landroid/os/Parcelable;", "lend", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "bonus", "Lcom/kubi/margin/api/entity/MarginBonusConfig;", "<init>", "(Lcom/kubi/margin/api/entity/MarginCouponConfig;Lcom/kubi/margin/api/entity/MarginBonusConfig;)V", "getLend", "()Lcom/kubi/margin/api/entity/MarginCouponConfig;", "setLend", "(Lcom/kubi/margin/api/entity/MarginCouponConfig;)V", "getBonus", "()Lcom/kubi/margin/api/entity/MarginBonusConfig;", "setBonus", "(Lcom/kubi/margin/api/entity/MarginBonusConfig;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginWelfare implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginWelfare> CREATOR = new C17491a();

    @Nullable
    private MarginBonusConfig bonus;

    @Nullable
    private MarginCouponConfig lend;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginWelfare$a */
    /* JADX INFO: compiled from: MarginWelfare.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17491a implements Parcelable.Creator<MarginWelfare> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginWelfare createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginWelfare(parcel.readInt() == 0 ? null : MarginCouponConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarginBonusConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginWelfare[] newArray(int i11) {
            return new MarginWelfare[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarginWelfare() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginWelfare)) {
            return false;
        }
        MarginWelfare marginWelfare = (MarginWelfare) other;
        return Intrinsics.areEqual(this.lend, marginWelfare.lend) && Intrinsics.areEqual(this.bonus, marginWelfare.bonus);
    }

    public MarginWelfare(@Nullable MarginCouponConfig marginCouponConfig, @Nullable MarginBonusConfig marginBonusConfig) {
        this.lend = marginCouponConfig;
        this.bonus = marginBonusConfig;
    }

    public static /* synthetic */ MarginWelfare copy$default(MarginWelfare marginWelfare, MarginCouponConfig marginCouponConfig, MarginBonusConfig marginBonusConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marginCouponConfig = marginWelfare.lend;
        }
        if ((i11 & 2) != 0) {
            marginBonusConfig = marginWelfare.bonus;
        }
        return marginWelfare.copy(marginCouponConfig, marginBonusConfig);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MarginCouponConfig getLend() {
        return this.lend;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarginBonusConfig getBonus() {
        return this.bonus;
    }

    @NotNull
    public final MarginWelfare copy(@Nullable MarginCouponConfig lend, @Nullable MarginBonusConfig bonus) {
        return new MarginWelfare(lend, bonus);
    }

    @Nullable
    public final MarginBonusConfig getBonus() {
        return this.bonus;
    }

    @Nullable
    public final MarginCouponConfig getLend() {
        return this.lend;
    }

    public int hashCode() {
        MarginCouponConfig marginCouponConfig = this.lend;
        int iHashCode = (marginCouponConfig == null ? 0 : marginCouponConfig.hashCode()) * 31;
        MarginBonusConfig marginBonusConfig = this.bonus;
        return iHashCode + (marginBonusConfig != null ? marginBonusConfig.hashCode() : 0);
    }

    public final void setBonus(@Nullable MarginBonusConfig marginBonusConfig) {
        this.bonus = marginBonusConfig;
    }

    public final void setLend(@Nullable MarginCouponConfig marginCouponConfig) {
        this.lend = marginCouponConfig;
    }

    @NotNull
    public String toString() {
        return "MarginWelfare(lend=" + this.lend + ", bonus=" + this.bonus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        MarginCouponConfig marginCouponConfig = this.lend;
        if (marginCouponConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marginCouponConfig.writeToParcel(dest, flags);
        }
        MarginBonusConfig marginBonusConfig = this.bonus;
        if (marginBonusConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marginBonusConfig.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MarginWelfare(MarginCouponConfig marginCouponConfig, MarginBonusConfig marginBonusConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : marginCouponConfig, (i11 & 2) != 0 ? null : marginBonusConfig);
    }
}
