package com.kubi.futures.data.compliance.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EuropeComplianceDocsEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", "Landroid/os/Parcelable;", "symbol", "", "direction", "maxLeverage", "Ljava/math/BigDecimal;", "priidKIdUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getDirection", "getMaxLeverage", "()Ljava/math/BigDecimal;", "getPriidKIdUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeComplianceDocsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EuropeComplianceDocsEntity> CREATOR = new C12938a();

    @Nullable
    private final String direction;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final String priidKIdUrl;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity$a */
    /* JADX INFO: compiled from: EuropeComplianceDocsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12938a implements Parcelable.Creator<EuropeComplianceDocsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EuropeComplianceDocsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EuropeComplianceDocsEntity(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EuropeComplianceDocsEntity[] newArray(int i11) {
            return new EuropeComplianceDocsEntity[i11];
        }
    }

    public EuropeComplianceDocsEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EuropeComplianceDocsEntity)) {
            return false;
        }
        EuropeComplianceDocsEntity europeComplianceDocsEntity = (EuropeComplianceDocsEntity) other;
        return Intrinsics.areEqual(this.symbol, europeComplianceDocsEntity.symbol) && Intrinsics.areEqual(this.direction, europeComplianceDocsEntity.direction) && Intrinsics.areEqual(this.maxLeverage, europeComplianceDocsEntity.maxLeverage) && Intrinsics.areEqual(this.priidKIdUrl, europeComplianceDocsEntity.priidKIdUrl);
    }

    public EuropeComplianceDocsEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3) {
        this.symbol = str;
        this.direction = str2;
        this.maxLeverage = bigDecimal;
        this.priidKIdUrl = str3;
    }

    public static /* synthetic */ EuropeComplianceDocsEntity copy$default(EuropeComplianceDocsEntity europeComplianceDocsEntity, String str, String str2, BigDecimal bigDecimal, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = europeComplianceDocsEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = europeComplianceDocsEntity.direction;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = europeComplianceDocsEntity.maxLeverage;
        }
        if ((i11 & 8) != 0) {
            str3 = europeComplianceDocsEntity.priidKIdUrl;
        }
        return europeComplianceDocsEntity.copy(str, str2, bigDecimal, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPriidKIdUrl() {
        return this.priidKIdUrl;
    }

    @NotNull
    public final EuropeComplianceDocsEntity copy(@Nullable String symbol, @Nullable String direction, @Nullable BigDecimal maxLeverage, @Nullable String priidKIdUrl) {
        return new EuropeComplianceDocsEntity(symbol, direction, maxLeverage, priidKIdUrl);
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getPriidKIdUrl() {
        return this.priidKIdUrl;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.direction;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.maxLeverage;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.priidKIdUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EuropeComplianceDocsEntity(symbol=" + this.symbol + ", direction=" + this.direction + ", maxLeverage=" + this.maxLeverage + ", priidKIdUrl=" + this.priidKIdUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.direction);
        dest.writeSerializable(this.maxLeverage);
        dest.writeString(this.priidKIdUrl);
    }

    public /* synthetic */ EuropeComplianceDocsEntity(String str, String str2, BigDecimal bigDecimal, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : str3);
    }
}
