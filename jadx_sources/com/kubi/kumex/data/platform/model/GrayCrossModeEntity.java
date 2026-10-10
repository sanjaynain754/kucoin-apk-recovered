package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GrayCrossModeEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "Landroid/os/Parcelable;", "occupancyMode", "", "marginModes", "", "", "<init>", "(ZLjava/util/List;)V", "getOccupancyMode", "()Z", "getMarginModes", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GrayCrossModeEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GrayCrossModeEntity> CREATOR = new C15809a();

    @NotNull
    private final List<String> marginModes;
    private final boolean occupancyMode;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.GrayCrossModeEntity$a */
    /* JADX INFO: compiled from: GrayCrossModeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15809a implements Parcelable.Creator<GrayCrossModeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GrayCrossModeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GrayCrossModeEntity(parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GrayCrossModeEntity[] newArray(int i11) {
            return new GrayCrossModeEntity[i11];
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
        if (!(other instanceof GrayCrossModeEntity)) {
            return false;
        }
        GrayCrossModeEntity grayCrossModeEntity = (GrayCrossModeEntity) other;
        return this.occupancyMode == grayCrossModeEntity.occupancyMode && Intrinsics.areEqual(this.marginModes, grayCrossModeEntity.marginModes);
    }

    public GrayCrossModeEntity(boolean z11, @NotNull List<String> marginModes) {
        Intrinsics.checkNotNullParameter(marginModes, "marginModes");
        this.occupancyMode = z11;
        this.marginModes = marginModes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GrayCrossModeEntity copy$default(GrayCrossModeEntity grayCrossModeEntity, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = grayCrossModeEntity.occupancyMode;
        }
        if ((i11 & 2) != 0) {
            list = grayCrossModeEntity.marginModes;
        }
        return grayCrossModeEntity.copy(z11, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOccupancyMode() {
        return this.occupancyMode;
    }

    @NotNull
    public final List<String> component2() {
        return this.marginModes;
    }

    @NotNull
    public final GrayCrossModeEntity copy(boolean occupancyMode, @NotNull List<String> marginModes) {
        Intrinsics.checkNotNullParameter(marginModes, "marginModes");
        return new GrayCrossModeEntity(occupancyMode, marginModes);
    }

    @NotNull
    public final List<String> getMarginModes() {
        return this.marginModes;
    }

    public final boolean getOccupancyMode() {
        return this.occupancyMode;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.occupancyMode) * 31) + this.marginModes.hashCode();
    }

    @NotNull
    public String toString() {
        return "GrayCrossModeEntity(occupancyMode=" + this.occupancyMode + ", marginModes=" + this.marginModes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.occupancyMode ? 1 : 0);
        dest.writeStringList(this.marginModes);
    }
}
