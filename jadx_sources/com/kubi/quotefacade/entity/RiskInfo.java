package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainFilterData.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RiskInfo;", "Landroid/os/Parcelable;", "aveRiskLevel", "", "<init>", "(Ljava/lang/Integer;)V", "getAveRiskLevel", "()Ljava/lang/Integer;", "setAveRiskLevel", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/RiskInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RiskInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RiskInfo> CREATOR = new C21909a();

    @Nullable
    private Integer aveRiskLevel;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.RiskInfo$a */
    /* JADX INFO: compiled from: ChainFilterData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21909a implements Parcelable.Creator<RiskInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RiskInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RiskInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RiskInfo[] newArray(int i11) {
            return new RiskInfo[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RiskInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RiskInfo) && Intrinsics.areEqual(this.aveRiskLevel, ((RiskInfo) other).aveRiskLevel);
    }

    public RiskInfo(@Nullable Integer num) {
        this.aveRiskLevel = num;
    }

    public static /* synthetic */ RiskInfo copy$default(RiskInfo riskInfo, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = riskInfo.aveRiskLevel;
        }
        return riskInfo.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAveRiskLevel() {
        return this.aveRiskLevel;
    }

    @NotNull
    public final RiskInfo copy(@Nullable Integer aveRiskLevel) {
        return new RiskInfo(aveRiskLevel);
    }

    @Nullable
    public final Integer getAveRiskLevel() {
        return this.aveRiskLevel;
    }

    public int hashCode() {
        Integer num = this.aveRiskLevel;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setAveRiskLevel(@Nullable Integer num) {
        this.aveRiskLevel = num;
    }

    @NotNull
    public String toString() {
        return "RiskInfo(aveRiskLevel=" + this.aveRiskLevel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.aveRiskLevel;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ RiskInfo(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num);
    }
}
