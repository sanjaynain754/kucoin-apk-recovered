package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "Landroid/os/Parcelable;", "marginMode", "", "positionSide", "size", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getMarginMode", "()Ljava/lang/String;", "getPositionSide", "getSize", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClosePositionSizeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ClosePositionSizeEntity> CREATOR = new C15832a();

    @Nullable
    private final String marginMode;

    @Nullable
    private final String positionSide;

    @Nullable
    private final BigDecimal size;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.ClosePositionSizeEntity$a */
    /* JADX INFO: compiled from: PositionEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15832a implements Parcelable.Creator<ClosePositionSizeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClosePositionSizeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClosePositionSizeEntity(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClosePositionSizeEntity[] newArray(int i11) {
            return new ClosePositionSizeEntity[i11];
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
        if (!(other instanceof ClosePositionSizeEntity)) {
            return false;
        }
        ClosePositionSizeEntity closePositionSizeEntity = (ClosePositionSizeEntity) other;
        return Intrinsics.areEqual(this.marginMode, closePositionSizeEntity.marginMode) && Intrinsics.areEqual(this.positionSide, closePositionSizeEntity.positionSide) && Intrinsics.areEqual(this.size, closePositionSizeEntity.size);
    }

    public static /* synthetic */ ClosePositionSizeEntity copy$default(ClosePositionSizeEntity closePositionSizeEntity, String str, String str2, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = closePositionSizeEntity.marginMode;
        }
        if ((i11 & 2) != 0) {
            str2 = closePositionSizeEntity.positionSide;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = closePositionSizeEntity.size;
        }
        return closePositionSizeEntity.copy(str, str2, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @NotNull
    public final ClosePositionSizeEntity copy(@Nullable String marginMode, @Nullable String positionSide, @Nullable BigDecimal size) {
        return new ClosePositionSizeEntity(marginMode, positionSide, size);
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.marginMode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.positionSide;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.size;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ClosePositionSizeEntity(marginMode=" + this.marginMode + ", positionSide=" + this.positionSide + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.marginMode);
        dest.writeString(this.positionSide);
        dest.writeSerializable(this.size);
    }

    public ClosePositionSizeEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal) {
        this.marginMode = str;
        this.positionSide = str2;
        this.size = bigDecimal;
    }
}
