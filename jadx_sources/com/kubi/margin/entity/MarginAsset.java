package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.tradebase.entity.CurrencyBalance;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginAsset;", "Landroid/os/Parcelable;", "fundsInfoList", "", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "totalBalance", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/List;Ljava/math/BigDecimal;)V", "getFundsInfoList", "()Ljava/util/List;", "getTotalBalance", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginAsset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginAsset> CREATOR = new C17623a();

    @Nullable
    private final List<CurrencyBalance> fundsInfoList;

    @Nullable
    private final BigDecimal totalBalance;

    /* JADX INFO: renamed from: com.kubi.margin.entity.MarginAsset$a */
    /* JADX INFO: compiled from: MarginEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17623a implements Parcelable.Creator<MarginAsset> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginAsset createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(MarginAsset.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new MarginAsset(arrayList, (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginAsset[] newArray(int i11) {
            return new MarginAsset[i11];
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
        if (!(other instanceof MarginAsset)) {
            return false;
        }
        MarginAsset marginAsset = (MarginAsset) other;
        return Intrinsics.areEqual(this.fundsInfoList, marginAsset.fundsInfoList) && Intrinsics.areEqual(this.totalBalance, marginAsset.totalBalance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginAsset copy$default(MarginAsset marginAsset, List list, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marginAsset.fundsInfoList;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = marginAsset.totalBalance;
        }
        return marginAsset.copy(list, bigDecimal);
    }

    @Nullable
    public final List<CurrencyBalance> component1() {
        return this.fundsInfoList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final MarginAsset copy(@Nullable List<CurrencyBalance> fundsInfoList, @Nullable BigDecimal totalBalance) {
        return new MarginAsset(fundsInfoList, totalBalance);
    }

    @Nullable
    public final List<CurrencyBalance> getFundsInfoList() {
        return this.fundsInfoList;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        List<CurrencyBalance> list = this.fundsInfoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BigDecimal bigDecimal = this.totalBalance;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginAsset(fundsInfoList=" + this.fundsInfoList + ", totalBalance=" + this.totalBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CurrencyBalance> list = this.fundsInfoList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CurrencyBalance> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeSerializable(this.totalBalance);
    }

    public MarginAsset(@Nullable List<CurrencyBalance> list, @Nullable BigDecimal bigDecimal) {
        this.fundsInfoList = list;
        this.totalBalance = bigDecimal;
    }
}
