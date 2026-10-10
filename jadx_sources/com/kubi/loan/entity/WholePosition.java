package com.kubi.loan.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarkPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoanBean.kt */
/* JADX INFO: loaded from: classes26.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/loan/entity/WholePosition;", "Landroid/os/Parcelable;", ViewProps.POSITION, "Lcom/kubi/margin/api/entity/LeverBalance;", "markPrices", "", "Lcom/kubi/margin/api/entity/MarkPrice;", "<init>", "(Lcom/kubi/margin/api/entity/LeverBalance;Ljava/util/List;)V", "getPosition", "()Lcom/kubi/margin/api/entity/LeverBalance;", "getMarkPrices", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WholePosition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WholePosition> CREATOR = new C17435a();

    @Nullable
    private final List<MarkPrice> markPrices;

    @Nullable
    private final LeverBalance position;

    /* JADX INFO: renamed from: com.kubi.loan.entity.WholePosition$a */
    /* JADX INFO: compiled from: LoanBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17435a implements Parcelable.Creator<WholePosition> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WholePosition createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LeverBalance leverBalance = (LeverBalance) parcel.readParcelable(WholePosition.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(WholePosition.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new WholePosition(leverBalance, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WholePosition[] newArray(int i11) {
            return new WholePosition[i11];
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
        if (!(other instanceof WholePosition)) {
            return false;
        }
        WholePosition wholePosition = (WholePosition) other;
        return Intrinsics.areEqual(this.position, wholePosition.position) && Intrinsics.areEqual(this.markPrices, wholePosition.markPrices);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WholePosition copy$default(WholePosition wholePosition, LeverBalance leverBalance, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            leverBalance = wholePosition.position;
        }
        if ((i11 & 2) != 0) {
            list = wholePosition.markPrices;
        }
        return wholePosition.copy(leverBalance, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LeverBalance getPosition() {
        return this.position;
    }

    @Nullable
    public final List<MarkPrice> component2() {
        return this.markPrices;
    }

    @NotNull
    public final WholePosition copy(@Nullable LeverBalance position, @Nullable List<MarkPrice> markPrices) {
        return new WholePosition(position, markPrices);
    }

    @Nullable
    public final List<MarkPrice> getMarkPrices() {
        return this.markPrices;
    }

    @Nullable
    public final LeverBalance getPosition() {
        return this.position;
    }

    public int hashCode() {
        LeverBalance leverBalance = this.position;
        int iHashCode = (leverBalance == null ? 0 : leverBalance.hashCode()) * 31;
        List<MarkPrice> list = this.markPrices;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WholePosition(position=" + this.position + ", markPrices=" + this.markPrices + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.position, flags);
        List<MarkPrice> list = this.markPrices;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<MarkPrice> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public WholePosition(@Nullable LeverBalance leverBalance, @Nullable List<MarkPrice> list) {
        this.position = leverBalance;
        this.markPrices = list;
    }
}
