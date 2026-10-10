package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27039d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginCouponConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/margin/api/entity/CouponsOverview;", "Landroid/os/Parcelable;", "couponNotUseNum", "", "usingCoupon", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "<init>", "(Ljava/lang/Integer;Lcom/kubi/margin/api/entity/MarginCouponConfig;)V", "getCouponNotUseNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsingCoupon", "()Lcom/kubi/margin/api/entity/MarginCouponConfig;", "hasCoupons", "", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/kubi/margin/api/entity/MarginCouponConfig;)Lcom/kubi/margin/api/entity/CouponsOverview;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CouponsOverview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CouponsOverview> CREATOR = new C17478a();

    @Nullable
    private final Integer couponNotUseNum;

    @Nullable
    private final MarginCouponConfig usingCoupon;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.CouponsOverview$a */
    /* JADX INFO: compiled from: MarginCouponConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17478a implements Parcelable.Creator<CouponsOverview> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponsOverview createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CouponsOverview(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? MarginCouponConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponsOverview[] newArray(int i11) {
            return new CouponsOverview[i11];
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
        if (!(other instanceof CouponsOverview)) {
            return false;
        }
        CouponsOverview couponsOverview = (CouponsOverview) other;
        return Intrinsics.areEqual(this.couponNotUseNum, couponsOverview.couponNotUseNum) && Intrinsics.areEqual(this.usingCoupon, couponsOverview.usingCoupon);
    }

    public static /* synthetic */ CouponsOverview copy$default(CouponsOverview couponsOverview, Integer num, MarginCouponConfig marginCouponConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = couponsOverview.couponNotUseNum;
        }
        if ((i11 & 2) != 0) {
            marginCouponConfig = couponsOverview.usingCoupon;
        }
        return couponsOverview.copy(num, marginCouponConfig);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCouponNotUseNum() {
        return this.couponNotUseNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarginCouponConfig getUsingCoupon() {
        return this.usingCoupon;
    }

    @NotNull
    public final CouponsOverview copy(@Nullable Integer couponNotUseNum, @Nullable MarginCouponConfig usingCoupon) {
        return new CouponsOverview(couponNotUseNum, usingCoupon);
    }

    @Nullable
    public final Integer getCouponNotUseNum() {
        return this.couponNotUseNum;
    }

    @Nullable
    public final MarginCouponConfig getUsingCoupon() {
        return this.usingCoupon;
    }

    public final boolean hasCoupons() {
        return C27039d.m66650j(this.couponNotUseNum) > 0 || this.usingCoupon != null;
    }

    public int hashCode() {
        Integer num = this.couponNotUseNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        MarginCouponConfig marginCouponConfig = this.usingCoupon;
        return iHashCode + (marginCouponConfig != null ? marginCouponConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CouponsOverview(couponNotUseNum=" + this.couponNotUseNum + ", usingCoupon=" + this.usingCoupon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.couponNotUseNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        MarginCouponConfig marginCouponConfig = this.usingCoupon;
        if (marginCouponConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marginCouponConfig.writeToParcel(dest, flags);
        }
    }

    public CouponsOverview(@Nullable Integer num, @Nullable MarginCouponConfig marginCouponConfig) {
        this.couponNotUseNum = num;
        this.usingCoupon = marginCouponConfig;
    }
}
