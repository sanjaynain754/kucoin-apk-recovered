package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/otc/entity/LimitDays;", "Landroid/os/Parcelable;", "lowerRegisterDays", "", "satisfyRegisterDayLimit", "", "<init>", "(IZ)V", "getLowerRegisterDays", "()I", "getSatisfyRegisterDayLimit", "()Z", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LimitDays implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LimitDays> CREATOR = new Creator();
    private final int lowerRegisterDays;
    private final boolean satisfyRegisterDayLimit;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<LimitDays> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitDays createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LimitDays(parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitDays[] newArray(int i11) {
            return new LimitDays[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitDays() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitDays)) {
            return false;
        }
        LimitDays limitDays = (LimitDays) other;
        return this.lowerRegisterDays == limitDays.lowerRegisterDays && this.satisfyRegisterDayLimit == limitDays.satisfyRegisterDayLimit;
    }

    public LimitDays(int i11, boolean z11) {
        this.lowerRegisterDays = i11;
        this.satisfyRegisterDayLimit = z11;
    }

    public static /* synthetic */ LimitDays copy$default(LimitDays limitDays, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = limitDays.lowerRegisterDays;
        }
        if ((i12 & 2) != 0) {
            z11 = limitDays.satisfyRegisterDayLimit;
        }
        return limitDays.copy(i11, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLowerRegisterDays() {
        return this.lowerRegisterDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSatisfyRegisterDayLimit() {
        return this.satisfyRegisterDayLimit;
    }

    @NotNull
    public final LimitDays copy(int lowerRegisterDays, boolean satisfyRegisterDayLimit) {
        return new LimitDays(lowerRegisterDays, satisfyRegisterDayLimit);
    }

    public final int getLowerRegisterDays() {
        return this.lowerRegisterDays;
    }

    public final boolean getSatisfyRegisterDayLimit() {
        return this.satisfyRegisterDayLimit;
    }

    public int hashCode() {
        return (Integer.hashCode(this.lowerRegisterDays) * 31) + Boolean.hashCode(this.satisfyRegisterDayLimit);
    }

    @NotNull
    public String toString() {
        return "LimitDays(lowerRegisterDays=" + this.lowerRegisterDays + ", satisfyRegisterDayLimit=" + this.satisfyRegisterDayLimit + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.lowerRegisterDays);
        dest.writeInt(this.satisfyRegisterDayLimit ? 1 : 0);
    }

    public /* synthetic */ LimitDays(int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? false : z11);
    }
}
