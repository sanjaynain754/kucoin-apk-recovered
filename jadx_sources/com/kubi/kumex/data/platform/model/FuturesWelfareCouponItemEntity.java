package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bm.InterfaceC4633f;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;", "Landroid/os/Parcelable;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "couponId", "", "welfareType", "effectiveTime", "", "expireTime", JAnalysisConstants.EVENT_ATTRIBUTES, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;)V", "getCouponId", "()Ljava/lang/String;", "getWelfareType", "getEffectiveTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpireTime", "getAttributes", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesWelfareCouponItemEntity implements Parcelable, InterfaceC4633f {

    @NotNull
    public static final Parcelable.Creator<FuturesWelfareCouponItemEntity> CREATOR = new C15805a();

    @NotNull
    private final FuturesWelfareCouponAttributes attributes;

    @NotNull
    private final String couponId;

    @Nullable
    private final Long effectiveTime;

    @Nullable
    private final Long expireTime;

    @NotNull
    private final String welfareType;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesWelfareCouponItemEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15805a implements Parcelable.Creator<FuturesWelfareCouponItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareCouponItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesWelfareCouponItemEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, FuturesWelfareCouponAttributes.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesWelfareCouponItemEntity[] newArray(int i11) {
            return new FuturesWelfareCouponItemEntity[i11];
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
        if (!(other instanceof FuturesWelfareCouponItemEntity)) {
            return false;
        }
        FuturesWelfareCouponItemEntity futuresWelfareCouponItemEntity = (FuturesWelfareCouponItemEntity) other;
        return Intrinsics.areEqual(this.couponId, futuresWelfareCouponItemEntity.couponId) && Intrinsics.areEqual(this.welfareType, futuresWelfareCouponItemEntity.welfareType) && Intrinsics.areEqual(this.effectiveTime, futuresWelfareCouponItemEntity.effectiveTime) && Intrinsics.areEqual(this.expireTime, futuresWelfareCouponItemEntity.expireTime) && Intrinsics.areEqual(this.attributes, futuresWelfareCouponItemEntity.attributes);
    }

    public FuturesWelfareCouponItemEntity(@NotNull String couponId, @NotNull String welfareType, @Nullable Long l11, @Nullable Long l12, @NotNull FuturesWelfareCouponAttributes attributes) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(welfareType, "welfareType");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.couponId = couponId;
        this.welfareType = welfareType;
        this.effectiveTime = l11;
        this.expireTime = l12;
        this.attributes = attributes;
    }

    public static /* synthetic */ FuturesWelfareCouponItemEntity copy$default(FuturesWelfareCouponItemEntity futuresWelfareCouponItemEntity, String str, String str2, Long l11, Long l12, FuturesWelfareCouponAttributes futuresWelfareCouponAttributes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresWelfareCouponItemEntity.couponId;
        }
        if ((i11 & 2) != 0) {
            str2 = futuresWelfareCouponItemEntity.welfareType;
        }
        if ((i11 & 4) != 0) {
            l11 = futuresWelfareCouponItemEntity.effectiveTime;
        }
        if ((i11 & 8) != 0) {
            l12 = futuresWelfareCouponItemEntity.expireTime;
        }
        if ((i11 & 16) != 0) {
            futuresWelfareCouponAttributes = futuresWelfareCouponItemEntity.attributes;
        }
        FuturesWelfareCouponAttributes futuresWelfareCouponAttributes2 = futuresWelfareCouponAttributes;
        Long l13 = l11;
        return futuresWelfareCouponItemEntity.copy(str, str2, l13, l12, futuresWelfareCouponAttributes2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWelfareType() {
        return this.welfareType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEffectiveTime() {
        return this.effectiveTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FuturesWelfareCouponAttributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final FuturesWelfareCouponItemEntity copy(@NotNull String couponId, @NotNull String welfareType, @Nullable Long effectiveTime, @Nullable Long expireTime, @NotNull FuturesWelfareCouponAttributes attributes) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(welfareType, "welfareType");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new FuturesWelfareCouponItemEntity(couponId, welfareType, effectiveTime, expireTime, attributes);
    }

    @NotNull
    public final FuturesWelfareCouponAttributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final Long getEffectiveTime() {
        return this.effectiveTime;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final String getWelfareType() {
        return this.welfareType;
    }

    public int hashCode() {
        int iHashCode = ((this.couponId.hashCode() * 31) + this.welfareType.hashCode()) * 31;
        Long l11 = this.effectiveTime;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.expireTime;
        return ((iHashCode2 + (l12 != null ? l12.hashCode() : 0)) * 31) + this.attributes.hashCode();
    }

    @NotNull
    public String toString() {
        return "FuturesWelfareCouponItemEntity(couponId=" + this.couponId + ", welfareType=" + this.welfareType + ", effectiveTime=" + this.effectiveTime + ", expireTime=" + this.expireTime + ", attributes=" + this.attributes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.couponId);
        dest.writeString(this.welfareType);
        Long l11 = this.effectiveTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.expireTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        this.attributes.writeToParcel(dest, flags);
    }
}
