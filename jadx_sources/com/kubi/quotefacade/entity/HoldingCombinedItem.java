package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingCombinedItem;", "Landroid/os/Parcelable;", "type", "", "data", "Lcom/kubi/quotefacade/entity/HoldingCombinedItemData;", "<init>", "(Ljava/lang/String;Lcom/kubi/quotefacade/entity/HoldingCombinedItemData;)V", "getType", "()Ljava/lang/String;", "getData", "()Lcom/kubi/quotefacade/entity/HoldingCombinedItemData;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingCombinedItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingCombinedItem> CREATOR = new C21893a();

    @Nullable
    private final HoldingCombinedItemData data;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingCombinedItem$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21893a implements Parcelable.Creator<HoldingCombinedItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingCombinedItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoldingCombinedItem(parcel.readString(), parcel.readInt() == 0 ? null : HoldingCombinedItemData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingCombinedItem[] newArray(int i11) {
            return new HoldingCombinedItem[i11];
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
        if (!(other instanceof HoldingCombinedItem)) {
            return false;
        }
        HoldingCombinedItem holdingCombinedItem = (HoldingCombinedItem) other;
        return Intrinsics.areEqual(this.type, holdingCombinedItem.type) && Intrinsics.areEqual(this.data, holdingCombinedItem.data);
    }

    public static /* synthetic */ HoldingCombinedItem copy$default(HoldingCombinedItem holdingCombinedItem, String str, HoldingCombinedItemData holdingCombinedItemData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = holdingCombinedItem.type;
        }
        if ((i11 & 2) != 0) {
            holdingCombinedItemData = holdingCombinedItem.data;
        }
        return holdingCombinedItem.copy(str, holdingCombinedItemData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HoldingCombinedItemData getData() {
        return this.data;
    }

    @NotNull
    public final HoldingCombinedItem copy(@Nullable String type, @Nullable HoldingCombinedItemData data) {
        return new HoldingCombinedItem(type, data);
    }

    @Nullable
    public final HoldingCombinedItemData getData() {
        return this.data;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HoldingCombinedItemData holdingCombinedItemData = this.data;
        return iHashCode + (holdingCombinedItemData != null ? holdingCombinedItemData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldingCombinedItem(type=" + this.type + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        HoldingCombinedItemData holdingCombinedItemData = this.data;
        if (holdingCombinedItemData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            holdingCombinedItemData.writeToParcel(dest, flags);
        }
    }

    public HoldingCombinedItem(@Nullable String str, @Nullable HoldingCombinedItemData holdingCombinedItemData) {
        this.type = str;
        this.data = holdingCombinedItemData;
    }
}
