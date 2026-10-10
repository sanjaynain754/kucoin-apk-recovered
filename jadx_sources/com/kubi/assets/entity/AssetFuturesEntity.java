package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetFuturesEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetFuturesEntity;", "Landroid/os/Parcelable;", "totalEquity", "Ljava/math/BigDecimal;", "trialTotalEquity", FirebaseAnalytics.Param.CURRENCY, "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/CoinsEntity;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;)V", "getTotalEquity", "()Ljava/math/BigDecimal;", "setTotalEquity", "(Ljava/math/BigDecimal;)V", "getTrialTotalEquity", "setTrialTotalEquity", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetFuturesEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetFuturesEntity> CREATOR = new Creator();

    @Nullable
    private String currency;

    @Nullable
    private List<CoinsEntity> items;

    @Nullable
    private BigDecimal totalEquity;

    @Nullable
    private BigDecimal trialTotalEquity;

    /* JADX INFO: compiled from: AssetFuturesEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetFuturesEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetFuturesEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(CoinsEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AssetFuturesEntity(bigDecimal, bigDecimal2, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetFuturesEntity[] newArray(int i11) {
            return new AssetFuturesEntity[i11];
        }
    }

    public AssetFuturesEntity() {
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
        if (!(other instanceof AssetFuturesEntity)) {
            return false;
        }
        AssetFuturesEntity assetFuturesEntity = (AssetFuturesEntity) other;
        return Intrinsics.areEqual(this.totalEquity, assetFuturesEntity.totalEquity) && Intrinsics.areEqual(this.trialTotalEquity, assetFuturesEntity.trialTotalEquity) && Intrinsics.areEqual(this.currency, assetFuturesEntity.currency) && Intrinsics.areEqual(this.items, assetFuturesEntity.items);
    }

    public AssetFuturesEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable List<CoinsEntity> list) {
        this.totalEquity = bigDecimal;
        this.trialTotalEquity = bigDecimal2;
        this.currency = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetFuturesEntity copy$default(AssetFuturesEntity assetFuturesEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = assetFuturesEntity.totalEquity;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = assetFuturesEntity.trialTotalEquity;
        }
        if ((i11 & 4) != 0) {
            str = assetFuturesEntity.currency;
        }
        if ((i11 & 8) != 0) {
            list = assetFuturesEntity.items;
        }
        return assetFuturesEntity.copy(bigDecimal, bigDecimal2, str, list);
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

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<CoinsEntity> component4() {
        return this.items;
    }

    @NotNull
    public final AssetFuturesEntity copy(@Nullable BigDecimal totalEquity, @Nullable BigDecimal trialTotalEquity, @Nullable String currency, @Nullable List<CoinsEntity> items) {
        return new AssetFuturesEntity(totalEquity, trialTotalEquity, currency, items);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<CoinsEntity> getItems() {
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
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<CoinsEntity> list = this.items;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setItems(@Nullable List<CoinsEntity> list) {
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
        return "AssetFuturesEntity(totalEquity=" + this.totalEquity + ", trialTotalEquity=" + this.trialTotalEquity + ", currency=" + this.currency + ", items=" + this.items + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalEquity);
        dest.writeSerializable(this.trialTotalEquity);
        dest.writeString(this.currency);
        List<CoinsEntity> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<CoinsEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AssetFuturesEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : list);
    }
}
