package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddrValidError;", "Landroid/os/Parcelable;", "index", "", "validationCode", "", "isInterruptSubmit", "", "<init>", "(ILjava/lang/String;Z)V", "getIndex", "()I", "setIndex", "(I)V", "getValidationCode", "()Ljava/lang/String;", "setValidationCode", "(Ljava/lang/String;)V", "()Z", "setInterruptSubmit", "(Z)V", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddrValidError implements Parcelable {

    @NotNull
    public static final String TYPE_ADDR = "ADDRESS_EXISTED";

    @NotNull
    public static final String TYPE_REMARK = "REMARK_EXISTED";
    private int index;
    private boolean isInterruptSubmit;

    @NotNull
    private String validationCode;

    @NotNull
    public static final Parcelable.Creator<WithdrawAddrValidError> CREATOR = new Creator();

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddrValidError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValidError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawAddrValidError(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddrValidError[] newArray(int i11) {
            return new WithdrawAddrValidError[i11];
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
        if (!(other instanceof WithdrawAddrValidError)) {
            return false;
        }
        WithdrawAddrValidError withdrawAddrValidError = (WithdrawAddrValidError) other;
        return this.index == withdrawAddrValidError.index && Intrinsics.areEqual(this.validationCode, withdrawAddrValidError.validationCode) && this.isInterruptSubmit == withdrawAddrValidError.isInterruptSubmit;
    }

    public WithdrawAddrValidError(int i11, @NotNull String validationCode, boolean z11) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        this.index = i11;
        this.validationCode = validationCode;
        this.isInterruptSubmit = z11;
    }

    public static /* synthetic */ WithdrawAddrValidError copy$default(WithdrawAddrValidError withdrawAddrValidError, int i11, String str, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = withdrawAddrValidError.index;
        }
        if ((i12 & 2) != 0) {
            str = withdrawAddrValidError.validationCode;
        }
        if ((i12 & 4) != 0) {
            z11 = withdrawAddrValidError.isInterruptSubmit;
        }
        return withdrawAddrValidError.copy(i11, str, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValidationCode() {
        return this.validationCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsInterruptSubmit() {
        return this.isInterruptSubmit;
    }

    @NotNull
    public final WithdrawAddrValidError copy(int index, @NotNull String validationCode, boolean isInterruptSubmit) {
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        return new WithdrawAddrValidError(index, validationCode, isInterruptSubmit);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getValidationCode() {
        return this.validationCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.index) * 31) + this.validationCode.hashCode()) * 31) + Boolean.hashCode(this.isInterruptSubmit);
    }

    public final boolean isInterruptSubmit() {
        return this.isInterruptSubmit;
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    public final void setInterruptSubmit(boolean z11) {
        this.isInterruptSubmit = z11;
    }

    public final void setValidationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validationCode = str;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddrValidError(index=" + this.index + ", validationCode=" + this.validationCode + ", isInterruptSubmit=" + this.isInterruptSubmit + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.index);
        dest.writeString(this.validationCode);
        dest.writeInt(this.isInterruptSubmit ? 1 : 0);
    }
}
