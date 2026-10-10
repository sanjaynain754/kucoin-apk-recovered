package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolateMarginPosition.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\tJ\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018JP\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u001dJ\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001dHÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001dR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u00061"}, m90084d2 = {"Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "Landroid/os/Parcelable;", "positions", "", "Lcom/kubi/margin/api/entity/MarginPosition;", "totalBalance", "Ljava/math/BigDecimal;", "totalLiability", "valuableCurrency", "", "execute", "", "<init>", "(Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPositions", "()Ljava/util/List;", "getTotalBalance", "()Ljava/math/BigDecimal;", "getTotalLiability", "getValuableCurrency", "()Ljava/lang/String;", "setValuableCurrency", "(Ljava/lang/String;)V", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRealBalanceString", "coinOrSymbol", "precision", "", "getRealBalancePriceString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolateMarginPosition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IsolateMarginPosition> CREATOR = new C17481a();

    @Nullable
    private final Boolean execute;

    @Nullable
    private final List<MarginPosition> positions;

    @Nullable
    private final BigDecimal totalBalance;

    @Nullable
    private final BigDecimal totalLiability;

    @Nullable
    private String valuableCurrency;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.IsolateMarginPosition$a */
    /* JADX INFO: compiled from: IsolateMarginPosition.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17481a implements Parcelable.Creator<IsolateMarginPosition> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IsolateMarginPosition createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(MarginPosition.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new IsolateMarginPosition(arrayList, (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IsolateMarginPosition[] newArray(int i11) {
            return new IsolateMarginPosition[i11];
        }
    }

    public IsolateMarginPosition(@Nullable List<MarginPosition> list, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable Boolean bool) {
        this.positions = list;
        this.totalBalance = bigDecimal;
        this.totalLiability = bigDecimal2;
        this.valuableCurrency = str;
        this.execute = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolateMarginPosition)) {
            return false;
        }
        IsolateMarginPosition isolateMarginPosition = (IsolateMarginPosition) other;
        return Intrinsics.areEqual(this.positions, isolateMarginPosition.positions) && Intrinsics.areEqual(this.totalBalance, isolateMarginPosition.totalBalance) && Intrinsics.areEqual(this.totalLiability, isolateMarginPosition.totalLiability) && Intrinsics.areEqual(this.valuableCurrency, isolateMarginPosition.valuableCurrency) && Intrinsics.areEqual(this.execute, isolateMarginPosition.execute);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsolateMarginPosition copy$default(IsolateMarginPosition isolateMarginPosition, List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = isolateMarginPosition.positions;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = isolateMarginPosition.totalBalance;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = isolateMarginPosition.totalLiability;
        }
        if ((i11 & 8) != 0) {
            str = isolateMarginPosition.valuableCurrency;
        }
        if ((i11 & 16) != 0) {
            bool = isolateMarginPosition.execute;
        }
        Boolean bool2 = bool;
        BigDecimal bigDecimal3 = bigDecimal2;
        return isolateMarginPosition.copy(list, bigDecimal, bigDecimal3, str, bool2);
    }

    @Nullable
    public final List<MarginPosition> component1() {
        return this.positions;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final IsolateMarginPosition copy(@Nullable List<MarginPosition> positions, @Nullable BigDecimal totalBalance, @Nullable BigDecimal totalLiability, @Nullable String valuableCurrency, @Nullable Boolean execute) {
        return new IsolateMarginPosition(positions, totalBalance, totalLiability, valuableCurrency, execute);
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final List<MarginPosition> getPositions() {
        return this.positions;
    }

    @NotNull
    public final String getRealBalancePriceString() {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal = this.totalBalance;
        String strM89950x = null;
        if (bigDecimal != null && (bigDecimalSubtract = bigDecimal.subtract(C41014a.m89922G(this.totalLiability, null, 1, null))) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalSubtract, this.valuableCurrency), null, null, 0, false, true, false, true, 47, null);
        }
        return C27041f.m66669i(strM89950x, "--");
    }

    @NotNull
    public final String getRealBalanceString(@Nullable String coinOrSymbol, int precision) {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal = this.totalBalance;
        String strM85562a = null;
        if (bigDecimal != null && (bigDecimalSubtract = bigDecimal.subtract(C41014a.m89922G(this.totalLiability, null, 1, null))) != null) {
            strM85562a = C37885i.m85562a(bigDecimalSubtract, coinOrSymbol, precision);
        }
        return C27041f.m66669i(strM85562a, "--");
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    public final String getValuableCurrency() {
        return this.valuableCurrency;
    }

    public int hashCode() {
        List<MarginPosition> list = this.positions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalLiability;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.valuableCurrency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.execute;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setValuableCurrency(@Nullable String str) {
        this.valuableCurrency = str;
    }

    @NotNull
    public String toString() {
        return "IsolateMarginPosition(positions=" + this.positions + ", totalBalance=" + this.totalBalance + ", totalLiability=" + this.totalLiability + ", valuableCurrency=" + this.valuableCurrency + ", execute=" + this.execute + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<MarginPosition> list = this.positions;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<MarginPosition> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.totalLiability);
        dest.writeString(this.valuableCurrency);
        Boolean bool = this.execute;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ IsolateMarginPosition(List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, bigDecimal, bigDecimal2, str, (i11 & 16) != 0 ? Boolean.TRUE : bool);
    }
}
