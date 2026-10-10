package com.kubi.spot.business.delegation.assets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/assets/SmallEntity;", "Landroid/os/Parcelable;", "quotaLimit", "Ljava/math/BigDecimal;", "baseCurrency", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SmallEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SmallEntity> CREATOR = new C24809a();

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final BigDecimal quotaLimit;

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.assets.SmallEntity$a */
    /* JADX INFO: compiled from: AssetsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24809a implements Parcelable.Creator<SmallEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmallEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SmallEntity((BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SmallEntity[] newArray(int i11) {
            return new SmallEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmallEntity() {
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
        if (!(other instanceof SmallEntity)) {
            return false;
        }
        SmallEntity smallEntity = (SmallEntity) other;
        return Intrinsics.areEqual(this.quotaLimit, smallEntity.quotaLimit) && Intrinsics.areEqual(this.baseCurrency, smallEntity.baseCurrency);
    }

    public SmallEntity(@Nullable BigDecimal bigDecimal, @Nullable String str) {
        this.quotaLimit = bigDecimal;
        this.baseCurrency = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final BigDecimal getQuotaLimit() {
        return this.quotaLimit;
    }

    public static /* synthetic */ SmallEntity copy$default(SmallEntity smallEntity, BigDecimal bigDecimal, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = smallEntity.quotaLimit;
        }
        if ((i11 & 2) != 0) {
            str = smallEntity.baseCurrency;
        }
        return smallEntity.copy(bigDecimal, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    public final SmallEntity copy(@Nullable BigDecimal quotaLimit, @Nullable String baseCurrency) {
        return new SmallEntity(quotaLimit, baseCurrency);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.quotaLimit;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.baseCurrency;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SmallEntity(quotaLimit=" + this.quotaLimit + ", baseCurrency=" + this.baseCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.quotaLimit);
        dest.writeString(this.baseCurrency);
    }

    public /* synthetic */ SmallEntity(BigDecimal bigDecimal, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new BigDecimal("5") : bigDecimal, (i11 & 2) != 0 ? "USDT" : str);
    }
}
