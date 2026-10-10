package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/margin/entity/LiquidationCurrencyConfig;", "Landroid/os/Parcelable;", "targetList", "Ljava/util/ArrayList;", "Lcom/kubi/margin/entity/CurrencyEntity;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getTargetList", "()Ljava/util/ArrayList;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiquidationCurrencyConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LiquidationCurrencyConfig> CREATOR = new C17622a();

    @Nullable
    private final ArrayList<CurrencyEntity> targetList;

    /* JADX INFO: renamed from: com.kubi.margin.entity.LiquidationCurrencyConfig$a */
    /* JADX INFO: compiled from: CurrencyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17622a implements Parcelable.Creator<LiquidationCurrencyConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiquidationCurrencyConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(CurrencyEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new LiquidationCurrencyConfig(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LiquidationCurrencyConfig[] newArray(int i11) {
            return new LiquidationCurrencyConfig[i11];
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
        return (other instanceof LiquidationCurrencyConfig) && Intrinsics.areEqual(this.targetList, ((LiquidationCurrencyConfig) other).targetList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidationCurrencyConfig copy$default(LiquidationCurrencyConfig liquidationCurrencyConfig, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = liquidationCurrencyConfig.targetList;
        }
        return liquidationCurrencyConfig.copy(arrayList);
    }

    @Nullable
    public final ArrayList<CurrencyEntity> component1() {
        return this.targetList;
    }

    @NotNull
    public final LiquidationCurrencyConfig copy(@Nullable ArrayList<CurrencyEntity> targetList) {
        return new LiquidationCurrencyConfig(targetList);
    }

    @Nullable
    public final ArrayList<CurrencyEntity> getTargetList() {
        return this.targetList;
    }

    public int hashCode() {
        ArrayList<CurrencyEntity> arrayList = this.targetList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    @NotNull
    public String toString() {
        return "LiquidationCurrencyConfig(targetList=" + this.targetList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ArrayList<CurrencyEntity> arrayList = this.targetList;
        if (arrayList == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(arrayList.size());
        Iterator<CurrencyEntity> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public LiquidationCurrencyConfig(@Nullable ArrayList<CurrencyEntity> arrayList) {
        this.targetList = arrayList;
    }
}
