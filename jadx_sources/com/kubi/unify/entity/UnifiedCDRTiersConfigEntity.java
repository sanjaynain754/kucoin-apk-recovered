package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0003J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifiedCDRTiersConfigEntity;", "Landroid/os/Parcelable;", "tier", "", "cdr", "Ljava/math/BigDecimal;", "min", "max", "cdrEquity", "<init>", "(Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getTier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCdr", "()Ljava/math/BigDecimal;", "getMin", "getMax", "getCdrEquity", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifiedCDRTiersConfigEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedCDRTiersConfigEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedCDRTiersConfigEntity> CREATOR = new C26513a();

    @Nullable
    private final BigDecimal cdr;

    @Nullable
    private final BigDecimal cdrEquity;

    @Nullable
    private final BigDecimal max;

    @Nullable
    private final BigDecimal min;

    @Nullable
    private final Integer tier;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifiedCDRTiersConfigEntity$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26513a implements Parcelable.Creator<UnifiedCDRTiersConfigEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifiedCDRTiersConfigEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedCDRTiersConfigEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifiedCDRTiersConfigEntity[] newArray(int i11) {
            return new UnifiedCDRTiersConfigEntity[i11];
        }
    }

    public UnifiedCDRTiersConfigEntity(@Nullable Integer num, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.tier = num;
        this.cdr = bigDecimal;
        this.min = bigDecimal2;
        this.max = bigDecimal3;
        this.cdrEquity = bigDecimal4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedCDRTiersConfigEntity)) {
            return false;
        }
        UnifiedCDRTiersConfigEntity unifiedCDRTiersConfigEntity = (UnifiedCDRTiersConfigEntity) other;
        return Intrinsics.areEqual(this.tier, unifiedCDRTiersConfigEntity.tier) && Intrinsics.areEqual(this.cdr, unifiedCDRTiersConfigEntity.cdr) && Intrinsics.areEqual(this.min, unifiedCDRTiersConfigEntity.min) && Intrinsics.areEqual(this.max, unifiedCDRTiersConfigEntity.max) && Intrinsics.areEqual(this.cdrEquity, unifiedCDRTiersConfigEntity.cdrEquity);
    }

    public static /* synthetic */ UnifiedCDRTiersConfigEntity copy$default(UnifiedCDRTiersConfigEntity unifiedCDRTiersConfigEntity, Integer num, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = unifiedCDRTiersConfigEntity.tier;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = unifiedCDRTiersConfigEntity.cdr;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = unifiedCDRTiersConfigEntity.min;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = unifiedCDRTiersConfigEntity.max;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = unifiedCDRTiersConfigEntity.cdrEquity;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        BigDecimal bigDecimal6 = bigDecimal2;
        return unifiedCDRTiersConfigEntity.copy(num, bigDecimal, bigDecimal6, bigDecimal3, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTier() {
        return this.tier;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getCdr() {
        return this.cdr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMin() {
        return this.min;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMax() {
        return this.max;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getCdrEquity() {
        return this.cdrEquity;
    }

    @NotNull
    public final UnifiedCDRTiersConfigEntity copy(@Nullable Integer tier, @Nullable BigDecimal cdr, @Nullable BigDecimal min, @Nullable BigDecimal max, @Nullable BigDecimal cdrEquity) {
        return new UnifiedCDRTiersConfigEntity(tier, cdr, min, max, cdrEquity);
    }

    @Nullable
    public final BigDecimal getCdr() {
        return this.cdr;
    }

    @Nullable
    public final BigDecimal getCdrEquity() {
        return this.cdrEquity;
    }

    @Nullable
    public final BigDecimal getMax() {
        return this.max;
    }

    @Nullable
    public final BigDecimal getMin() {
        return this.min;
    }

    @Nullable
    public final Integer getTier() {
        return this.tier;
    }

    public int hashCode() {
        Integer num = this.tier;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BigDecimal bigDecimal = this.cdr;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.min;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.max;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.cdrEquity;
        return iHashCode4 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedCDRTiersConfigEntity(tier=" + this.tier + ", cdr=" + this.cdr + ", min=" + this.min + ", max=" + this.max + ", cdrEquity=" + this.cdrEquity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.tier;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeSerializable(this.cdr);
        dest.writeSerializable(this.min);
        dest.writeSerializable(this.max);
        dest.writeSerializable(this.cdrEquity);
    }

    public /* synthetic */ UnifiedCDRTiersConfigEntity(Integer num, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1 : num, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4);
    }
}
