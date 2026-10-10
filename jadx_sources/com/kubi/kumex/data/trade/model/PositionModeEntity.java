package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionModeEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "Landroid/os/Parcelable;", "positionMode", "", "<init>", "(I)V", "getPositionMode", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionModeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PositionModeEntity> CREATOR = new C15838a();
    private final int positionMode;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.PositionModeEntity$a */
    /* JADX INFO: compiled from: PositionModeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15838a implements Parcelable.Creator<PositionModeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PositionModeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PositionModeEntity(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PositionModeEntity[] newArray(int i11) {
            return new PositionModeEntity[i11];
        }
    }

    public PositionModeEntity() {
        this(0, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PositionModeEntity) && this.positionMode == ((PositionModeEntity) other).positionMode;
    }

    public PositionModeEntity(int i11) {
        this.positionMode = i11;
    }

    public static /* synthetic */ PositionModeEntity copy$default(PositionModeEntity positionModeEntity, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = positionModeEntity.positionMode;
        }
        return positionModeEntity.copy(i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPositionMode() {
        return this.positionMode;
    }

    @NotNull
    public final PositionModeEntity copy(int positionMode) {
        return new PositionModeEntity(positionMode);
    }

    public final int getPositionMode() {
        return this.positionMode;
    }

    public int hashCode() {
        return Integer.hashCode(this.positionMode);
    }

    @NotNull
    public String toString() {
        return "PositionModeEntity(positionMode=" + this.positionMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.positionMode);
    }

    public /* synthetic */ PositionModeEntity(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
