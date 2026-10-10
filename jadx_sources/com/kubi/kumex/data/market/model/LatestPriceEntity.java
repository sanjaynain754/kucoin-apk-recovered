package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarkPriceEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/LatestPriceEntity;", "Landroid/os/Parcelable;", "symbol", "", "lastPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "getLastPrice", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LatestPriceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatestPriceEntity> CREATOR = new C15779a();

    @Nullable
    private final BigDecimal lastPrice;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.LatestPriceEntity$a */
    /* JADX INFO: compiled from: MarkPriceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15779a implements Parcelable.Creator<LatestPriceEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LatestPriceEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LatestPriceEntity(parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LatestPriceEntity[] newArray(int i11) {
            return new LatestPriceEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LatestPriceEntity() {
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
        if (!(other instanceof LatestPriceEntity)) {
            return false;
        }
        LatestPriceEntity latestPriceEntity = (LatestPriceEntity) other;
        return Intrinsics.areEqual(this.symbol, latestPriceEntity.symbol) && Intrinsics.areEqual(this.lastPrice, latestPriceEntity.lastPrice);
    }

    public LatestPriceEntity(@Nullable String str, @Nullable BigDecimal bigDecimal) {
        this.symbol = str;
        this.lastPrice = bigDecimal;
    }

    public static /* synthetic */ LatestPriceEntity copy$default(LatestPriceEntity latestPriceEntity, String str, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = latestPriceEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = latestPriceEntity.lastPrice;
        }
        return latestPriceEntity.copy(str, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @NotNull
    public final LatestPriceEntity copy(@Nullable String symbol, @Nullable BigDecimal lastPrice) {
        return new LatestPriceEntity(symbol, lastPrice);
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.lastPrice;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LatestPriceEntity(symbol=" + this.symbol + ", lastPrice=" + this.lastPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.lastPrice);
    }

    public /* synthetic */ LatestPriceEntity(String str, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal);
    }
}
