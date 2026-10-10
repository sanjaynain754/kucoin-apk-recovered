package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/unify/entity/FuturesRiskLimitsConfig;", "Landroid/os/Parcelable;", "symbol", "", "riskLimits", "", "Lcom/kubi/unify/entity/UnifiedRiskLimitEntity;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "getRiskLimits", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesRiskLimitsConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesRiskLimitsConfig> CREATOR = new C26510a();

    @Nullable
    private final List<UnifiedRiskLimitEntity> riskLimits;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.unify.entity.FuturesRiskLimitsConfig$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26510a implements Parcelable.Creator<FuturesRiskLimitsConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesRiskLimitsConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(UnifiedRiskLimitEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FuturesRiskLimitsConfig(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesRiskLimitsConfig[] newArray(int i11) {
            return new FuturesRiskLimitsConfig[i11];
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
        if (!(other instanceof FuturesRiskLimitsConfig)) {
            return false;
        }
        FuturesRiskLimitsConfig futuresRiskLimitsConfig = (FuturesRiskLimitsConfig) other;
        return Intrinsics.areEqual(this.symbol, futuresRiskLimitsConfig.symbol) && Intrinsics.areEqual(this.riskLimits, futuresRiskLimitsConfig.riskLimits);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesRiskLimitsConfig copy$default(FuturesRiskLimitsConfig futuresRiskLimitsConfig, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresRiskLimitsConfig.symbol;
        }
        if ((i11 & 2) != 0) {
            list = futuresRiskLimitsConfig.riskLimits;
        }
        return futuresRiskLimitsConfig.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final List<UnifiedRiskLimitEntity> component2() {
        return this.riskLimits;
    }

    @NotNull
    public final FuturesRiskLimitsConfig copy(@Nullable String symbol, @Nullable List<UnifiedRiskLimitEntity> riskLimits) {
        return new FuturesRiskLimitsConfig(symbol, riskLimits);
    }

    @Nullable
    public final List<UnifiedRiskLimitEntity> getRiskLimits() {
        return this.riskLimits;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UnifiedRiskLimitEntity> list = this.riskLimits;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FuturesRiskLimitsConfig(symbol=" + this.symbol + ", riskLimits=" + this.riskLimits + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        List<UnifiedRiskLimitEntity> list = this.riskLimits;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<UnifiedRiskLimitEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public FuturesRiskLimitsConfig(@Nullable String str, @Nullable List<UnifiedRiskLimitEntity> list) {
        this.symbol = str;
        this.riskLimits = list;
    }
}
