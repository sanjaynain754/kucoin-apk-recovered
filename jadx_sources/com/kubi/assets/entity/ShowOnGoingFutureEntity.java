package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0005J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, m90084d2 = {"Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;", "Landroid/os/Parcelable;", "isShowOngoingFuture", "", "futureSize", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "setShowOngoingFuture", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFutureSize", "()Ljava/lang/Integer;", "setFutureSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ShowOnGoingFutureEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShowOnGoingFutureEntity> CREATOR = new Creator();

    @Nullable
    private Integer futureSize;

    @Nullable
    private Boolean isShowOngoingFuture;

    /* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ShowOnGoingFutureEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowOnGoingFutureEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShowOnGoingFutureEntity(boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowOnGoingFutureEntity[] newArray(int i11) {
            return new ShowOnGoingFutureEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShowOnGoingFutureEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowOnGoingFutureEntity)) {
            return false;
        }
        ShowOnGoingFutureEntity showOnGoingFutureEntity = (ShowOnGoingFutureEntity) other;
        return Intrinsics.areEqual(this.isShowOngoingFuture, showOnGoingFutureEntity.isShowOngoingFuture) && Intrinsics.areEqual(this.futureSize, showOnGoingFutureEntity.futureSize);
    }

    public ShowOnGoingFutureEntity(@Nullable Boolean bool, @Nullable Integer num) {
        this.isShowOngoingFuture = bool;
        this.futureSize = num;
    }

    public static /* synthetic */ ShowOnGoingFutureEntity copy$default(ShowOnGoingFutureEntity showOnGoingFutureEntity, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = showOnGoingFutureEntity.isShowOngoingFuture;
        }
        if ((i11 & 2) != 0) {
            num = showOnGoingFutureEntity.futureSize;
        }
        return showOnGoingFutureEntity.copy(bool, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsShowOngoingFuture() {
        return this.isShowOngoingFuture;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFutureSize() {
        return this.futureSize;
    }

    @NotNull
    public final ShowOnGoingFutureEntity copy(@Nullable Boolean isShowOngoingFuture, @Nullable Integer futureSize) {
        return new ShowOnGoingFutureEntity(isShowOngoingFuture, futureSize);
    }

    @Nullable
    public final Integer getFutureSize() {
        return this.futureSize;
    }

    public int hashCode() {
        Boolean bool = this.isShowOngoingFuture;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.futureSize;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Nullable
    public final Boolean isShowOngoingFuture() {
        return this.isShowOngoingFuture;
    }

    public final void setFutureSize(@Nullable Integer num) {
        this.futureSize = num;
    }

    public final void setShowOngoingFuture(@Nullable Boolean bool) {
        this.isShowOngoingFuture = bool;
    }

    @NotNull
    public String toString() {
        return "ShowOnGoingFutureEntity(isShowOngoingFuture=" + this.isShowOngoingFuture + ", futureSize=" + this.futureSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isShowOngoingFuture;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.futureSize;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ ShowOnGoingFutureEntity(Boolean bool, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : num);
    }
}
