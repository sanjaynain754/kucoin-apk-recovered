package com.kubi.utaspotlib.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreCalRiskRatioData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/utaspotlib/api/data/PreCalRiskRatioData;", "Landroid/os/Parcelable;", "riskRatio", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getRiskRatio", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PreCalRiskRatioData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PreCalRiskRatioData> CREATOR = new C26852a();

    @Nullable
    private final BigDecimal riskRatio;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.api.data.PreCalRiskRatioData$a */
    /* JADX INFO: compiled from: PreCalRiskRatioData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26852a implements Parcelable.Creator<PreCalRiskRatioData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PreCalRiskRatioData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PreCalRiskRatioData((BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PreCalRiskRatioData[] newArray(int i11) {
            return new PreCalRiskRatioData[i11];
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
        return (other instanceof PreCalRiskRatioData) && Intrinsics.areEqual(this.riskRatio, ((PreCalRiskRatioData) other).riskRatio);
    }

    public static /* synthetic */ PreCalRiskRatioData copy$default(PreCalRiskRatioData preCalRiskRatioData, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = preCalRiskRatioData.riskRatio;
        }
        return preCalRiskRatioData.copy(bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    @NotNull
    public final PreCalRiskRatioData copy(@Nullable BigDecimal riskRatio) {
        return new PreCalRiskRatioData(riskRatio);
    }

    @Nullable
    public final BigDecimal getRiskRatio() {
        return this.riskRatio;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.riskRatio;
        if (bigDecimal == null) {
            return 0;
        }
        return bigDecimal.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreCalRiskRatioData(riskRatio=" + this.riskRatio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.riskRatio);
    }

    public PreCalRiskRatioData(@Nullable BigDecimal bigDecimal) {
        this.riskRatio = bigDecimal;
    }
}
