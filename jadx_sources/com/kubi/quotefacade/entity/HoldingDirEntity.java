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
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingDirEntity;", "Landroid/os/Parcelable;", "dirName", "", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getDirName", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/HoldingDirEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingDirEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingDirEntity> CREATOR = new C21897a();

    @Nullable
    private final String dirName;

    @Nullable
    private final Integer size;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingDirEntity$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21897a implements Parcelable.Creator<HoldingDirEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingDirEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoldingDirEntity(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingDirEntity[] newArray(int i11) {
            return new HoldingDirEntity[i11];
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
        if (!(other instanceof HoldingDirEntity)) {
            return false;
        }
        HoldingDirEntity holdingDirEntity = (HoldingDirEntity) other;
        return Intrinsics.areEqual(this.dirName, holdingDirEntity.dirName) && Intrinsics.areEqual(this.size, holdingDirEntity.size);
    }

    public static /* synthetic */ HoldingDirEntity copy$default(HoldingDirEntity holdingDirEntity, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = holdingDirEntity.dirName;
        }
        if ((i11 & 2) != 0) {
            num = holdingDirEntity.size;
        }
        return holdingDirEntity.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDirName() {
        return this.dirName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @NotNull
    public final HoldingDirEntity copy(@Nullable String dirName, @Nullable Integer size) {
        return new HoldingDirEntity(dirName, size);
    }

    @Nullable
    public final String getDirName() {
        return this.dirName;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.dirName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.size;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldingDirEntity(dirName=" + this.dirName + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.dirName);
        Integer num = this.size;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public HoldingDirEntity(@Nullable String str, @Nullable Integer num) {
        this.dirName = str;
        this.size = num;
    }
}
