package com.kubi.futures.trade.welfare.airdrop;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AirDropDialogManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropPopData;", "Landroid/os/Parcelable;", "key", "", "showCount", "", "<init>", "(Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getShowCount", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AirdropPopData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirdropPopData> CREATOR = new C14201a();

    @NotNull
    private final String key;
    private final int showCount;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.airdrop.AirdropPopData$a */
    /* JADX INFO: compiled from: AirDropDialogManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14201a implements Parcelable.Creator<AirdropPopData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AirdropPopData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirdropPopData(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AirdropPopData[] newArray(int i11) {
            return new AirdropPopData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AirdropPopData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirdropPopData)) {
            return false;
        }
        AirdropPopData airdropPopData = (AirdropPopData) other;
        return Intrinsics.areEqual(this.key, airdropPopData.key) && this.showCount == airdropPopData.showCount;
    }

    public AirdropPopData(@NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.showCount = i11;
    }

    public static /* synthetic */ AirdropPopData copy$default(AirdropPopData airdropPopData, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = airdropPopData.key;
        }
        if ((i12 & 2) != 0) {
            i11 = airdropPopData.showCount;
        }
        return airdropPopData.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getShowCount() {
        return this.showCount;
    }

    @NotNull
    public final AirdropPopData copy(@NotNull String key, int showCount) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new AirdropPopData(key, showCount);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getShowCount() {
        return this.showCount;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + Integer.hashCode(this.showCount);
    }

    @NotNull
    public String toString() {
        return "AirdropPopData(key=" + this.key + ", showCount=" + this.showCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.key);
        dest.writeInt(this.showCount);
    }

    public /* synthetic */ AirdropPopData(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11);
    }
}
