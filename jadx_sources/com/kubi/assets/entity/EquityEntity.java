package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.entity.BalanceEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EquityEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJN\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/entity/EquityEntity;", "Landroid/os/Parcelable;", "totalEquity", "Ljava/math/BigDecimal;", "trialTotalEquity", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/entity/BalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "", "execute", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTotalEquity", "()Ljava/math/BigDecimal;", "setTotalEquity", "(Ljava/math/BigDecimal;)V", "getTrialTotalEquity", "setTrialTotalEquity", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/EquityEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EquityEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EquityEntity> CREATOR = new Creator();

    @Nullable
    private String currency;

    @Nullable
    private final Boolean execute;

    @NotNull
    private List<BalanceEntity> items;

    @Nullable
    private BigDecimal totalEquity;

    @Nullable
    private BigDecimal trialTotalEquity;

    /* JADX INFO: compiled from: EquityEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EquityEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(EquityEntity.class.getClassLoader()));
            }
            return new EquityEntity(bigDecimal, bigDecimal2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityEntity[] newArray(int i11) {
            return new EquityEntity[i11];
        }
    }

    public EquityEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull List<BalanceEntity> items, @Nullable String str, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.totalEquity = bigDecimal;
        this.trialTotalEquity = bigDecimal2;
        this.items = items;
        this.currency = str;
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
        if (!(other instanceof EquityEntity)) {
            return false;
        }
        EquityEntity equityEntity = (EquityEntity) other;
        return Intrinsics.areEqual(this.totalEquity, equityEntity.totalEquity) && Intrinsics.areEqual(this.trialTotalEquity, equityEntity.trialTotalEquity) && Intrinsics.areEqual(this.items, equityEntity.items) && Intrinsics.areEqual(this.currency, equityEntity.currency) && Intrinsics.areEqual(this.execute, equityEntity.execute);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EquityEntity copy$default(EquityEntity equityEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = equityEntity.totalEquity;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = equityEntity.trialTotalEquity;
        }
        if ((i11 & 4) != 0) {
            list = equityEntity.items;
        }
        if ((i11 & 8) != 0) {
            str = equityEntity.currency;
        }
        if ((i11 & 16) != 0) {
            bool = equityEntity.execute;
        }
        Boolean bool2 = bool;
        List list2 = list;
        return equityEntity.copy(bigDecimal, bigDecimal2, list2, str, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTotalEquity() {
        return this.totalEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTrialTotalEquity() {
        return this.trialTotalEquity;
    }

    @NotNull
    public final List<BalanceEntity> component3() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final EquityEntity copy(@Nullable BigDecimal totalEquity, @Nullable BigDecimal trialTotalEquity, @NotNull List<BalanceEntity> items, @Nullable String currency, @Nullable Boolean execute) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new EquityEntity(totalEquity, trialTotalEquity, items, currency, execute);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final List<BalanceEntity> getItems() {
        return this.items;
    }

    @Nullable
    public final BigDecimal getTotalEquity() {
        return this.totalEquity;
    }

    @Nullable
    public final BigDecimal getTrialTotalEquity() {
        return this.trialTotalEquity;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalEquity;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.trialTotalEquity;
        int iHashCode2 = (((iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.items.hashCode()) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.execute;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setItems(@NotNull List<BalanceEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final void setTotalEquity(@Nullable BigDecimal bigDecimal) {
        this.totalEquity = bigDecimal;
    }

    public final void setTrialTotalEquity(@Nullable BigDecimal bigDecimal) {
        this.trialTotalEquity = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "EquityEntity(totalEquity=" + this.totalEquity + ", trialTotalEquity=" + this.trialTotalEquity + ", items=" + this.items + ", currency=" + this.currency + ", execute=" + this.execute + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalEquity);
        dest.writeSerializable(this.trialTotalEquity);
        List<BalanceEntity> list = this.items;
        dest.writeInt(list.size());
        Iterator<BalanceEntity> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.currency);
        Boolean bool = this.execute;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ EquityEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, list, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? Boolean.TRUE : bool);
    }
}
