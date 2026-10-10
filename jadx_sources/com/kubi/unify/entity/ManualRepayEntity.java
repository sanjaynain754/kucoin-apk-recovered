package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ManualRepayEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/unify/entity/ManualRepayEntity;", "Landroid/os/Parcelable;", "assetCurrencyList", "", "", "liabilityCurrency", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAssetCurrencyList", "()Ljava/util/List;", "getLiabilityCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ManualRepayEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManualRepayEntity> CREATOR = new C26511a();

    @NotNull
    private final List<String> assetCurrencyList;

    @NotNull
    private final String liabilityCurrency;

    /* JADX INFO: renamed from: com.kubi.unify.entity.ManualRepayEntity$a */
    /* JADX INFO: compiled from: ManualRepayEntity.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26511a implements Parcelable.Creator<ManualRepayEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ManualRepayEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManualRepayEntity(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ManualRepayEntity[] newArray(int i11) {
            return new ManualRepayEntity[i11];
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
        if (!(other instanceof ManualRepayEntity)) {
            return false;
        }
        ManualRepayEntity manualRepayEntity = (ManualRepayEntity) other;
        return Intrinsics.areEqual(this.assetCurrencyList, manualRepayEntity.assetCurrencyList) && Intrinsics.areEqual(this.liabilityCurrency, manualRepayEntity.liabilityCurrency);
    }

    public ManualRepayEntity(@NotNull List<String> assetCurrencyList, @NotNull String liabilityCurrency) {
        Intrinsics.checkNotNullParameter(assetCurrencyList, "assetCurrencyList");
        Intrinsics.checkNotNullParameter(liabilityCurrency, "liabilityCurrency");
        this.assetCurrencyList = assetCurrencyList;
        this.liabilityCurrency = liabilityCurrency;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualRepayEntity copy$default(ManualRepayEntity manualRepayEntity, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = manualRepayEntity.assetCurrencyList;
        }
        if ((i11 & 2) != 0) {
            str = manualRepayEntity.liabilityCurrency;
        }
        return manualRepayEntity.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.assetCurrencyList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLiabilityCurrency() {
        return this.liabilityCurrency;
    }

    @NotNull
    public final ManualRepayEntity copy(@NotNull List<String> assetCurrencyList, @NotNull String liabilityCurrency) {
        Intrinsics.checkNotNullParameter(assetCurrencyList, "assetCurrencyList");
        Intrinsics.checkNotNullParameter(liabilityCurrency, "liabilityCurrency");
        return new ManualRepayEntity(assetCurrencyList, liabilityCurrency);
    }

    @NotNull
    public final List<String> getAssetCurrencyList() {
        return this.assetCurrencyList;
    }

    @NotNull
    public final String getLiabilityCurrency() {
        return this.liabilityCurrency;
    }

    public int hashCode() {
        return (this.assetCurrencyList.hashCode() * 31) + this.liabilityCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "ManualRepayEntity(assetCurrencyList=" + this.assetCurrencyList + ", liabilityCurrency=" + this.liabilityCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.assetCurrencyList);
        dest.writeString(this.liabilityCurrency);
    }
}
