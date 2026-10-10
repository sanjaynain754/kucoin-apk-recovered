package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JD\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyConfig;", "Landroid/os/Parcelable;", "vipLevel", "", "serviceLines", "", "", "riskGrade", "avgCostPriceTime", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getVipLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServiceLines", "()Ljava/util/List;", "getRiskGrade", "()Ljava/lang/String;", "getAvgCostPriceTime", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/unify/entity/UnifyConfig;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyConfig> CREATOR = new C26518a();

    @SerializedName("avgCostPriceTime")
    @Nullable
    private final String avgCostPriceTime;

    @SerializedName("riskRatio")
    @Nullable
    private final String riskGrade;

    @SerializedName("serviceLines")
    @Nullable
    private final List<String> serviceLines;

    @SerializedName("vipLevel")
    @Nullable
    private final Integer vipLevel;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifyConfig$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26518a implements Parcelable.Creator<UnifyConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifyConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyConfig[] newArray(int i11) {
            return new UnifyConfig[i11];
        }
    }

    public UnifyConfig() {
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
        if (!(other instanceof UnifyConfig)) {
            return false;
        }
        UnifyConfig unifyConfig = (UnifyConfig) other;
        return Intrinsics.areEqual(this.vipLevel, unifyConfig.vipLevel) && Intrinsics.areEqual(this.serviceLines, unifyConfig.serviceLines) && Intrinsics.areEqual(this.riskGrade, unifyConfig.riskGrade) && Intrinsics.areEqual(this.avgCostPriceTime, unifyConfig.avgCostPriceTime);
    }

    public UnifyConfig(@Nullable Integer num, @Nullable List<String> list, @Nullable String str, @Nullable String str2) {
        this.vipLevel = num;
        this.serviceLines = list;
        this.riskGrade = str;
        this.avgCostPriceTime = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifyConfig copy$default(UnifyConfig unifyConfig, Integer num, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = unifyConfig.vipLevel;
        }
        if ((i11 & 2) != 0) {
            list = unifyConfig.serviceLines;
        }
        if ((i11 & 4) != 0) {
            str = unifyConfig.riskGrade;
        }
        if ((i11 & 8) != 0) {
            str2 = unifyConfig.avgCostPriceTime;
        }
        return unifyConfig.copy(num, list, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getVipLevel() {
        return this.vipLevel;
    }

    @Nullable
    public final List<String> component2() {
        return this.serviceLines;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvgCostPriceTime() {
        return this.avgCostPriceTime;
    }

    @NotNull
    public final UnifyConfig copy(@Nullable Integer vipLevel, @Nullable List<String> serviceLines, @Nullable String riskGrade, @Nullable String avgCostPriceTime) {
        return new UnifyConfig(vipLevel, serviceLines, riskGrade, avgCostPriceTime);
    }

    @Nullable
    public final String getAvgCostPriceTime() {
        return this.avgCostPriceTime;
    }

    @Nullable
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    public final List<String> getServiceLines() {
        return this.serviceLines;
    }

    @Nullable
    public final Integer getVipLevel() {
        return this.vipLevel;
    }

    public int hashCode() {
        Integer num = this.vipLevel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.serviceLines;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.riskGrade;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avgCostPriceTime;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyConfig(vipLevel=" + this.vipLevel + ", serviceLines=" + this.serviceLines + ", riskGrade=" + this.riskGrade + ", avgCostPriceTime=" + this.avgCostPriceTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.vipLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeStringList(this.serviceLines);
        dest.writeString(this.riskGrade);
        dest.writeString(this.avgCostPriceTime);
    }

    public /* synthetic */ UnifyConfig(Integer num, List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : num, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? "0.6,0.8" : str, (i11 & 8) != 0 ? null : str2);
    }
}
