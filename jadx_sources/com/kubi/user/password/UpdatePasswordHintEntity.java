package com.kubi.user.password;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpdatePasswordHintEntity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/user/password/UpdatePasswordHintEntity;", "Landroid/os/Parcelable;", "overDue", "", "exemptionDay", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getOverDue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExemptionDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/user/password/UpdatePasswordHintEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpdatePasswordHintEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpdatePasswordHintEntity> CREATOR = new C26744a();

    @Nullable
    private final Integer exemptionDay;

    @Nullable
    private final Boolean overDue;

    /* JADX INFO: renamed from: com.kubi.user.password.UpdatePasswordHintEntity$a */
    /* JADX INFO: compiled from: UpdatePasswordHintEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26744a implements Parcelable.Creator<UpdatePasswordHintEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdatePasswordHintEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UpdatePasswordHintEntity(boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UpdatePasswordHintEntity[] newArray(int i11) {
            return new UpdatePasswordHintEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatePasswordHintEntity() {
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
        if (!(other instanceof UpdatePasswordHintEntity)) {
            return false;
        }
        UpdatePasswordHintEntity updatePasswordHintEntity = (UpdatePasswordHintEntity) other;
        return Intrinsics.areEqual(this.overDue, updatePasswordHintEntity.overDue) && Intrinsics.areEqual(this.exemptionDay, updatePasswordHintEntity.exemptionDay);
    }

    public UpdatePasswordHintEntity(@Nullable Boolean bool, @Nullable Integer num) {
        this.overDue = bool;
        this.exemptionDay = num;
    }

    public static /* synthetic */ UpdatePasswordHintEntity copy$default(UpdatePasswordHintEntity updatePasswordHintEntity, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = updatePasswordHintEntity.overDue;
        }
        if ((i11 & 2) != 0) {
            num = updatePasswordHintEntity.exemptionDay;
        }
        return updatePasswordHintEntity.copy(bool, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getOverDue() {
        return this.overDue;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getExemptionDay() {
        return this.exemptionDay;
    }

    @NotNull
    public final UpdatePasswordHintEntity copy(@Nullable Boolean overDue, @Nullable Integer exemptionDay) {
        return new UpdatePasswordHintEntity(overDue, exemptionDay);
    }

    @Nullable
    public final Integer getExemptionDay() {
        return this.exemptionDay;
    }

    @Nullable
    public final Boolean getOverDue() {
        return this.overDue;
    }

    public int hashCode() {
        Boolean bool = this.overDue;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.exemptionDay;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpdatePasswordHintEntity(overDue=" + this.overDue + ", exemptionDay=" + this.exemptionDay + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.overDue;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.exemptionDay;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ UpdatePasswordHintEntity(Boolean bool, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? 0 : num);
    }
}
